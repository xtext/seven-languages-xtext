/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.jvmmodel;

import com.google.inject.Inject;
import java.util.Collections;
import java.util.Set;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.RawSuperTypes;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Helper methods to decide if types are compatible with the mongoDB driver.
 */
@SuppressWarnings("all")
public class MongoTypes {
  @Inject
  @Extension
  private RawSuperTypes _rawSuperTypes;
  
  @Inject
  private RawSuperTypes superTypes;
  
  public final static Set<String> mongoPrimitiveTypes = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("double", "java.lang.Double", "java.lang.String", "byte[]", "boolean", "java.lang.Boolean", "java.util.Date", "void", "java.lang.Void", "java.util.regex.Pattern", "int", "java.lang.Integer", "long", "java.lang.Long"));
  
  public boolean isMongoPrimitiveType(final JvmTypeReference typeRef) {
    String _qualifiedName = typeRef.getQualifiedName();
    return MongoTypes.mongoPrimitiveTypes.contains(_qualifiedName);
  }
  
  public boolean isMongoType(final JvmTypeReference typeRef) {
    boolean _or = false;
    boolean _isMongoPrimitiveType = this.isMongoPrimitiveType(typeRef);
    if (_isMongoPrimitiveType) {
      _or = true;
    } else {
      JvmType _type = typeRef.getType();
      boolean _isMongoBean = this.isMongoBean(_type);
      _or = _isMongoBean;
    }
    return _or;
  }
  
  public boolean isMongoBean(final JvmType type) {
    Set<String> _collectNames = this._rawSuperTypes.collectNames(type);
    return _collectNames.contains("org.xtext.mongobeans.lib.IMongoBean");
  }
}
