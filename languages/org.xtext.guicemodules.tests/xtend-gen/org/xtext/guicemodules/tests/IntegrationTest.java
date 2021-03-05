/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.guicemodules.tests;

import com.google.inject.Guice;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.guicemodules.guiceModules.ModulesAST;

@RunWith(XtextRunner.class)
@InjectWith(GuiceModulesInjectorProvider.class)
@SuppressWarnings("all")
public class IntegrationTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ParseHelper<ModulesAST> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParsing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.ArrayList");
      _builder.newLine();
      _builder.append("import java.util.Collection");
      _builder.newLine();
      _builder.append("ModuleA {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("bind List<String> to-instance newArrayList(\'one\',\'two\')");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("ModuleB {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("bind Collection to List<String>");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("ModuleC mixin ModuleA, ModuleB {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final ModulesAST it = this._parseHelper.parse(_builder);
      Assert.assertEquals(3, it.getModules().size());
      Assert.assertEquals(it.getModules().get(0), it.getModules().get(2).getMixins().get(0));
      Assert.assertEquals(it.getModules().get(1), it.getModules().get(2).getMixins().get(1));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testValidation_01() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("MyModule {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("bind @SuppressWarnings String to-instance \'foo\' ");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), XAnnotationsPackage.Literals.XANNOTATION, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testValidation_02() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("MyModule {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("bind @com.google.inject.name.Named(\'foo\') String to-instance \'foo\' ");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileAndExecute() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.Collection");
      _builder.newLine();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("import com.google.inject.name.Named");
      _builder.newLine();
      _builder.newLine();
      _builder.append("foo.bar.MyModule {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("bind List<String> to-instance newArrayList(\'one\',\'two\')");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("bind Collection<?> to List<String>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("bind @Named(\'foo-bar\') String to-instance \'hello annotation\'");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        try {
          Object _newInstance = it.getCompiledClass().newInstance();
          final com.google.inject.Module module = ((com.google.inject.Module) _newInstance);
          final InjectionTarget obj = Guice.createInjector(module).<InjectionTarget>getInstance(InjectionTarget.class);
          Assert.assertEquals("one", IterableExtensions.head(obj.col));
          Assert.assertEquals("hello annotation", obj.s);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
