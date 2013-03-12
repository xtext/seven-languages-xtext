/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.jvmmodel;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.SuperTypeCollector;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

/**
 * Helper methods to decide if types are compatible with the mongoDB driver.
 */
@SuppressWarnings("all")
public class MongoTypes {
  @Inject
  @Extension
  private SuperTypeCollector _superTypeCollector;
  
  public final static Set<String> mongoPrimitiveTypes = new Function0<Set<String>>() {
    public Set<String> apply() {
      Set<String> _xsetliteral = null;
      Builder<String> _builder = ImmutableSet.builder();
      _builder.add("double");
      _builder.add("java.lang.Double");
      _builder.add("java.lang.String");
      _builder.add("byte[]");
      _builder.add("boolean");
      _builder.add("java.lang.Boolean");
      _builder.add("java.util.Date");
      _builder.add("void");
      _builder.add("java.lang.Void");
      _builder.add("java.util.regex.Pattern");
      _builder.add("int");
      _builder.add("java.lang.Integer");
      _builder.add("long");
      _builder.add("java.lang.Long");
      _xsetliteral = _builder.build();
      return _xsetliteral;
    }
  }.apply();
  
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
