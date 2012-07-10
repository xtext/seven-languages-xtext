package org.xtext.mongobeans.jvmmodel;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.SuperTypeCollector;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

/**
 * Helper methods to decide if types are compatible with the mongoDB driver.
 */
@SuppressWarnings("all")
public class MongoTypes {
  @Inject
  private SuperTypeCollector _superTypeCollector;
  
  public final List<String> mongoPrimitiveTypes = new Function0<List<String>>() {
    public List<String> apply() {
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
        "double", 
        "java.lang.Double", 
        "java.lang.String", 
        "byte[]", 
        "boolean", 
        "java.lang.Boolean", 
        "java.util.Date", 
        "void", 
        "java.lang.Void", 
        "java.util.regex.Pattern", 
        "int", 
        "java.lang.Integer", 
        "long", 
        "java.lang.Long");
      List<String> _unmodifiableView = Collections.<String>unmodifiableList(_newArrayList);
      return _unmodifiableView;
    }
  }.apply();
  
  public boolean isMongoPrimitiveType(final JvmTypeReference typeRef) {
    String _qualifiedName = typeRef.getQualifiedName();
    boolean _contains = this.mongoPrimitiveTypes.contains(_qualifiedName);
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
