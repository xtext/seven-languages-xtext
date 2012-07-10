package org.xtext.mongobeans.tests;

import com.google.inject.Inject;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.mongobeans.MongoBeansInjectorProvider;
import org.xtext.mongobeans.lib.IMongoBean;
import org.xtext.mongobeans.lib.WrappingUtil;

@RunWith(value = XtextRunner.class)
@InjectWith(value = MongoBeansInjectorProvider.class)
@SuppressWarnings("all")
public class WrappingUtilTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  private ReflectExtensions _reflectExtensions;
  
  private Class<? extends Object> _mongoBeanClass;
  
  public Class<? extends Object> getMongoBeanClass() {
    return this._mongoBeanClass;
  }
  
  public void setMongoBeanClass(final Class<? extends Object> mongoBeanClass) {
    this._mongoBeanClass = mongoBeanClass;
  }
  
  @Before
  public void setUp() {
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
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          Class<? extends Object> _compiledClass = it.getCompiledClass();
          WrappingUtilTest.this.setMongoBeanClass(_compiledClass);
          Class<? extends Object> _compiledClass_1 = it.getCompiledClass();
          ClassLoader _classLoader = _compiledClass_1.getClassLoader();
          WrappingUtil.setClassLoader(_classLoader);
        }
      };
    this._compilationTestHelper.compile(_builder, new IAcceptor<Result>() {
        public void accept(Result t) {
          _function.apply(t);
        }
    });
  }
  
  @Test
  public void testUnwrap() {
    try {
      Class<? extends Object> _mongoBeanClass = this.getMongoBeanClass();
      final Object one = _mongoBeanClass.newInstance();
      Class<? extends Object> _mongoBeanClass_1 = this.getMongoBeanClass();
      final Object two = _mongoBeanClass_1.newInstance();
      Class<? extends Object> _mongoBeanClass_2 = this.getMongoBeanClass();
      final Object three = _mongoBeanClass_2.newInstance();
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
      final List foos = ((List) _get_2);
      Object _invoke_2 = this._reflectExtensions.invoke(two, "getDbObject");
      boolean _contains = foos.contains(_invoke_2);
      Assert.assertTrue(_contains);
      Object _invoke_3 = this._reflectExtensions.invoke(three, "getDbObject");
      boolean _contains_1 = foos.contains(_invoke_3);
      Assert.assertTrue(_contains_1);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrap() {
    try {
      final BasicDBObject oneDB = this.newFooDbObject("one");
      final BasicDBObject twoDB = this.newFooDbObject("two");
      final BasicDBObject threeDB = this.newFooDbObject("three");
      ArrayList<BasicDBObject> _newArrayList = CollectionLiterals.<BasicDBObject>newArrayList(twoDB, threeDB);
      oneDB.put("foos", _newArrayList);
      final Object oneBean = this.newFooMongoBean(oneDB);
      Class<? extends Object> _class = oneBean.getClass();
      String _name = _class.getName();
      Assert.assertEquals("Foo", _name);
      Object _invoke = this._reflectExtensions.invoke(oneBean, "getBar");
      Assert.assertEquals("one", _invoke);
      Object _invoke_1 = this._reflectExtensions.invoke(oneBean, "getFoos");
      final List foos = ((List) _invoke_1);
      Object _head = IterableExtensions.<Object>head(foos);
      DBObject _unwrap = WrappingUtil.unwrap(_head);
      Assert.assertEquals(_unwrap, twoDB);
      Object _last = IterableExtensions.<Object>last(foos);
      DBObject _unwrap_1 = WrappingUtil.unwrap(_last);
      Assert.assertEquals(_unwrap_1, threeDB);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected BasicDBObject newFooDbObject(final String bar) {
    BasicDBObject _basicDBObject = new BasicDBObject();
    final Procedure1<BasicDBObject> _function = new Procedure1<BasicDBObject>() {
        public void apply(final BasicDBObject it) {
          it.put(IMongoBean.JAVA_CLASS_KEY, "Foo");
          it.put("bar", bar);
        }
      };
    BasicDBObject _doubleArrow = ObjectExtensions.<BasicDBObject>operator_doubleArrow(_basicDBObject, _function);
    return _doubleArrow;
  }
  
  protected Object newFooMongoBean(final DBObject source) {
    try {
      Class<? extends Object> _mongoBeanClass = this.getMongoBeanClass();
      List<Class<DBObject>> _singletonList = Collections.<Class<DBObject>>singletonList(DBObject.class);
      Constructor<? extends Object> _constructor = _mongoBeanClass.getConstructor(((Class<?>[]) ((Class<?>[])Conversions.unwrapArray(_singletonList, Class.class))));
      List<DBObject> _singletonList_1 = Collections.<DBObject>singletonList(source);
      Object _newInstance = _constructor.newInstance(((Object[]) ((Object[])Conversions.unwrapArray(_singletonList_1, Object.class))));
      return _newInstance;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
