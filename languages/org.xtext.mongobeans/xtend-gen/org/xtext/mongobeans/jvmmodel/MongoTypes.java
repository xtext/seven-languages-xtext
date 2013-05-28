/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.jvmmodel;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
import java.util.Collections;
import java.util.Set;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.SuperTypeCollector;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Helper methods to decide if types are compatible with the mongoDB driver.
 */
@SuppressWarnings("all")
public class MongoTypes {
  @Inject
  @Extension
  private SuperTypeCollector _superTypeCollector;
  
  public final static Set<String> mongoPrimitiveTypes = Collections.<String>unmodifiableSet(Sets.<String>newHashSet("double", "java.lang.Double", "java.lang.String", "byte[]", "boolean", "java.lang.Boolean", "java.util.Date", "void", "java.lang.Void", "java.util.regex.Pattern", "int", "java.lang.Integer", "long", "java.lang.Long"));
  
  public boolean isMongoPrimitiveType(final JvmTypeReference typeRef) {
    String _qualifiedName = typeRef.getQualifiedName();
    boolean _contains = MongoTypes.mongoPrimitiveTypes.contains(_qualifiedName);
    return _contains;
  }
  
  public boolean isMongoType(final JvmTypeReference typeRef) {
    boolean _or = false;
    boolean _isMongoPrimitiveType = this.isMongoPrimitiveType(typeRef);
    if (_isMongoPrimitiveType) {
      _or = true;
    } else {
      boolean _isMongoBean = this.isMongoBean(typeRef);
      _or = (_isMongoPrimitiveType || _isMongoBean);
    }
    return _or;
  }
  
  public boolean isMongoBean(final JvmTypeReference typeRef) {
    Set<String> _collectSuperTypeNames = this._superTypeCollector.collectSuperTypeNames(typeRef);
    boolean _contains = _collectSuperTypeNames.contains("org.xtext.mongobeans.lib.IMongoBean");
    return _contains;
  }
}
