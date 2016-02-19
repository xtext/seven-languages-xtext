/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.tests;

import com.google.inject.Inject;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.mongobeans.lib.IMongoBean;
import org.xtext.mongobeans.lib.WrappingUtil;
import org.xtext.mongobeans.tests.MongoBeansInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(MongoBeansInjectorProvider.class)
@SuppressWarnings("all")
public class WrappingUtilTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  @Accessors
  private Class<?> mongoBeanClass;
  
  @Before
  public void setUp() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String bar");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Foo* foos");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        @Override
        public void accept(final CompilationTestHelper.Result it) {
          Class<?> _compiledClass = it.getCompiledClass();
          WrappingUtilTest.this.mongoBeanClass = _compiledClass;
          Class<?> _compiledClass_1 = it.getCompiledClass();
          ClassLoader _classLoader = _compiledClass_1.getClassLoader();
          WrappingUtil.setClassLoader(_classLoader);
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUnwrap() {
    try {
      final Object one = this.mongoBeanClass.newInstance();
      final Object two = this.mongoBeanClass.newInstance();
      final Object three = this.mongoBeanClass.newInstance();
      this._reflectExtensions.invoke(one, "setBar", "BAR");
      Object _invoke = this._reflectExtensions.invoke(one, "getFoos");
      ((List<Object>) _invoke).add(two);
      Object _invoke_1 = this._reflectExtensions.invoke(one, "getFoos");
      ((List<Object>) _invoke_1).add(three);
      final DBObject oneDB = WrappingUtil.unwrap(one);
      Object _get = oneDB.get(IMongoBean.JAVA_CLASS_KEY);
      Assert.assertEquals("Foo", _get);
      Object _get_1 = oneDB.get("bar");
      Assert.assertEquals("BAR", _get_1);
      Object _get_2 = oneDB.get("foos");
      final List<?> foos = ((List<?>) _get_2);
      Object _invoke_2 = this._reflectExtensions.invoke(two, "getDbObject");
      boolean _contains = foos.contains(_invoke_2);
      Assert.assertTrue(_contains);
      Object _invoke_3 = this._reflectExtensions.invoke(three, "getDbObject");
      boolean _contains_1 = foos.contains(_invoke_3);
      Assert.assertTrue(_contains_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrap() {
    try {
      final BasicDBObject oneDB = this.newFooDbObject("one");
      final BasicDBObject twoDB = this.newFooDbObject("two");
      final BasicDBObject threeDB = this.newFooDbObject("three");
      oneDB.put("foos", Collections.<BasicDBObject>unmodifiableList(CollectionLiterals.<BasicDBObject>newArrayList(twoDB, threeDB)));
      final Object oneBean = this.newFooMongoBean(oneDB);
      Class<?> _class = oneBean.getClass();
      String _name = _class.getName();
      Assert.assertEquals("Foo", _name);
      Object _invoke = this._reflectExtensions.invoke(oneBean, "getBar");
      Assert.assertEquals("one", _invoke);
      Object _invoke_1 = this._reflectExtensions.invoke(oneBean, "getFoos");
      final List<?> foos = ((List<?>) _invoke_1);
      Object _head = IterableExtensions.head(foos);
      DBObject _unwrap = WrappingUtil.unwrap(_head);
      Assert.assertEquals(_unwrap, twoDB);
      Object _last = IterableExtensions.last(foos);
      DBObject _unwrap_1 = WrappingUtil.unwrap(_last);
      Assert.assertEquals(_unwrap_1, threeDB);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected BasicDBObject newFooDbObject(final String bar) {
    BasicDBObject _basicDBObject = new BasicDBObject();
    final Procedure1<BasicDBObject> _function = new Procedure1<BasicDBObject>() {
      @Override
      public void apply(final BasicDBObject it) {
        it.put(IMongoBean.JAVA_CLASS_KEY, "Foo");
        it.put("bar", bar);
      }
    };
    return ObjectExtensions.<BasicDBObject>operator_doubleArrow(_basicDBObject, _function);
  }
  
  protected Object newFooMongoBean(final DBObject source) {
    try {
      Constructor<?> _constructor = this.mongoBeanClass.getConstructor(DBObject.class);
      return _constructor.newInstance(source);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public Class<?> getMongoBeanClass() {
    return this.mongoBeanClass;
  }
  
  public void setMongoBeanClass(final Class<?> mongoBeanClass) {
    this.mongoBeanClass = mongoBeanClass;
  }
}
