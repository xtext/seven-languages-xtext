package org.xtext.mongobeans.tests;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.mongobeans.MongoBeansInjectorProvider;
import org.xtext.mongobeans.mongoBeans.MongoBeansPackage.Literals;
import org.xtext.mongobeans.mongoBeans.MongoFile;
import org.xtext.mongobeans.mongoBeans.MongoProperty;
import org.xtext.mongobeans.validation.IssueCodes;

@RunWith(value = XtextRunner.class)
@InjectWith(value = MongoBeansInjectorProvider.class)
@SuppressWarnings("all")
public class ValidationTest {
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  private ParseHelper<MongoFile> _parseHelper;
  
  @Test
  public void testValidType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package pkg {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Foo {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("java.util.Date date");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("java.util.regex.Pattern pattern");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      MongoFile _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidPropertyType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("java.io.File file");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("char character");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      MongoFile _parse = this._parseHelper.parse(_builder);
      TreeIterator<EObject> _eAllContents = _parse.eAllContents();
      final Iterator<MongoProperty> properties = Iterators.<MongoProperty>filter(_eAllContents, MongoProperty.class);
      MongoProperty _head = IteratorExtensions.<MongoProperty>head(properties);
      this._validationTestHelper.assertError(_head, Literals.MONGO_PROPERTY, IssueCodes.ILLEGAL_TYPE);
      MongoProperty _last = IteratorExtensions.<MongoProperty>last(properties);
      this._validationTestHelper.assertError(_last, Literals.MONGO_PROPERTY, IssueCodes.ILLEGAL_TYPE);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidPropertyName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String _dbObject");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      MongoFile _parse = this._parseHelper.parse(_builder);
      TreeIterator<EObject> _eAllContents = _parse.eAllContents();
      Iterator<MongoProperty> _filter = Iterators.<MongoProperty>filter(_eAllContents, MongoProperty.class);
      final MongoProperty property = IteratorExtensions.<MongoProperty>head(_filter);
      this._validationTestHelper.assertError(property, Literals.MONGO_PROPERTY, IssueCodes.ILLEGAL_PROPERTY_NAME);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
