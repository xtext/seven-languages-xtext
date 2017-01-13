/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.lib;

import com.mongodb.DBObject;
import java.lang.reflect.Constructor;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.mongobeans.lib.IMongoBean;

/**
 * Mongobeans <-> DBObject conversion methods.
 */
@SuppressWarnings("all")
public class WrappingUtil {
  public static IMongoBean wrap(final DBObject dbObject) {
    try {
      IMongoBean _xblockexpression = null;
      {
        Object _get = dbObject.get(IMongoBean.JAVA_CLASS_KEY);
        String _string = null;
        if (_get!=null) {
          _string=_get.toString();
        }
        final String javaClassName = _string;
        final Class<?> javaClass = WrappingUtil.getClassLoader().loadClass(javaClassName);
        IMongoBean _xifexpression = null;
        boolean _isAssignableFrom = IMongoBean.class.isAssignableFrom(javaClass);
        if (_isAssignableFrom) {
          IMongoBean _xblockexpression_1 = null;
          {
            final Constructor<?> constructor = javaClass.getConstructor(DBObject.class);
            Object _newInstance = constructor.newInstance(dbObject);
            _xblockexpression_1 = ((IMongoBean) _newInstance);
          }
          _xifexpression = _xblockexpression_1;
        } else {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Stored javaClass \'");
          _builder.append(javaClassName);
          _builder.append("\' does not extend \'");
          String _simpleName = IMongoBean.class.getSimpleName();
          _builder.append(_simpleName);
          _builder.append("\'.");
          throw new IllegalStateException(_builder.toString());
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static <T extends IMongoBean> T wrapAndCast(final DBObject dbObject) {
    IMongoBean _wrap = WrappingUtil.wrap(dbObject);
    return ((T) _wrap);
  }
  
  public static DBObject unwrap(final Object wrapper) {
    DBObject _xifexpression = null;
    if ((!(wrapper instanceof IMongoBean))) {
      throw new IllegalArgumentException("Invalid type");
    } else {
      _xifexpression = ((IMongoBean) wrapper).getDbObject();
    }
    return _xifexpression;
  }
  
  private static ClassLoader _classLoader = WrappingUtil.class.getClassLoader();
  
  public static ClassLoader getClassLoader() {
    return WrappingUtil._classLoader;
  }
  
  public static ClassLoader setClassLoader(final ClassLoader classLoader) {
    return WrappingUtil._classLoader = classLoader;
  }
}
