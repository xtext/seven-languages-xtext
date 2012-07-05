package org.xtext.guicemodules.tests;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage.Literals;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.guicemodules.GuiceModulesInjectorProvider;
import org.xtext.guicemodules.guiceModules.ModuleAST;
import org.xtext.guicemodules.guiceModules.ModulesAST;
import org.xtext.guicemodules.tests.InjectionTarget;

@RunWith(value = XtextRunner.class)
@InjectWith(value = GuiceModulesInjectorProvider.class)
@SuppressWarnings("all")
public class IntegrationTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  private ParseHelper _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParsing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.*");
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
      EObject _parse = this._parseHelper.parse(_builder);
      final ModulesAST it = ((ModulesAST) _parse);
      EList<ModuleAST> _modules = it.getModules();
      int _size = _modules.size();
      Assert.assertEquals(3, _size);
      EList<ModuleAST> _modules_1 = it.getModules();
      ModuleAST _get = _modules_1.get(0);
      EList<ModuleAST> _modules_2 = it.getModules();
      ModuleAST _get_1 = _modules_2.get(2);
      EList<ModuleAST> _mixins = _get_1.getMixins();
      ModuleAST _get_2 = _mixins.get(0);
      Assert.assertEquals(_get, _get_2);
      EList<ModuleAST> _modules_3 = it.getModules();
      ModuleAST _get_3 = _modules_3.get(1);
      EList<ModuleAST> _modules_4 = it.getModules();
      ModuleAST _get_4 = _modules_4.get(2);
      EList<ModuleAST> _mixins_1 = _get_4.getMixins();
      ModuleAST _get_5 = _mixins_1.get(1);
      Assert.assertEquals(_get_3, _get_5);
    } catch (Exception _e) {
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
      EObject _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(_parse, Literals.XANNOTATION, null);
    } catch (Exception _e) {
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
      EObject _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileAndExecute() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
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
    _builder.append("bind Collection to List<String>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("bind @Named(\'foo-bar\') String to-instance \'hello annotation\'");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            Object _newInstance = _compiledClass.newInstance();
            final Module module = ((Module) _newInstance);
            Injector _createInjector = Guice.createInjector(module);
            final InjectionTarget obj = _createInjector.<InjectionTarget>getInstance(InjectionTarget.class);
            Object _head = IterableExtensions.<Object>head(obj.col);
            Assert.assertEquals("one", _head);
            Assert.assertEquals("hello annotation", obj.s);
          } catch (Exception _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
    this._compilationTestHelper.compile(_builder, new IAcceptor<Result>() {
        public void accept(Result t) {
          _function.apply(t);
        }
    });
  }
}
