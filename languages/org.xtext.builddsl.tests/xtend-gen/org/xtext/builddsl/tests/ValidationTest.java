package org.xtext.builddsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.builddsl.BuildDSLInjectorProvider;
import org.xtext.builddsl.build.BuildFile;
import org.xtext.builddsl.build.BuildPackage.Literals;
import org.xtext.builddsl.validation.BuildDSLValidator;

@RunWith(value = XtextRunner.class)
@InjectWith(value = BuildDSLInjectorProvider.class)
@SuppressWarnings("all")
public class ValidationTest {
  @Inject
  private ParseHelper<BuildFile> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testSelfDependency() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("task Foo depends Foo {}");
      _builder.newLine();
      BuildFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(_parse, Literals.TASK, BuildDSLValidator.CYCLIC_DEPENDENCY);
    } catch (Exception _e) {
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
      BuildFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(_parse, Literals.TASK, BuildDSLValidator.CYCLIC_DEPENDENCY);
    } catch (Exception _e) {
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
      BuildFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoError(_parse, BuildDSLValidator.CYCLIC_DEPENDENCY);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
