/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.builddsl.build.BuildFile;
import org.xtext.builddsl.build.BuildPackage;
import org.xtext.builddsl.tests.BuildDSLInjectorProvider;
import org.xtext.builddsl.validation.BuildDSLValidator;

@RunWith(XtextRunner.class)
@InjectWith(BuildDSLInjectorProvider.class)
@SuppressWarnings("all")
public class ValidationTest {
  @Inject
  @Extension
  private ParseHelper<BuildFile> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testSelfDependency() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("task Foo depends Foo {}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), BuildPackage.Literals.TASK, BuildDSLValidator.CYCLIC_DEPENDENCY);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleCyclicDependency() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("task Foo depends Bar {}");
      _builder.newLine();
      _builder.append("task Bar depends Baz {}");
      _builder.newLine();
      _builder.append("task Baz depends Foo {}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), BuildPackage.Literals.TASK, BuildDSLValidator.CYCLIC_DEPENDENCY);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNoCycle() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("task Foo depends Bar, Baz {}");
      _builder.newLine();
      _builder.append("task Bar depends Baz {}");
      _builder.newLine();
      _builder.append("task Baz {}");
      _builder.newLine();
      this._validationTestHelper.assertNoError(this._parseHelper.parse(_builder), BuildDSLValidator.CYCLIC_DEPENDENCY);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
