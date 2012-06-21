package org.xtext.guicemodules.jvmmodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer;
import org.eclipse.xtext.xbase.compiler.output.TreeAppendable;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class CodeGenerationContext {
  private final ReflectExtensions _re = new Function0<ReflectExtensions>() {
    public ReflectExtensions apply() {
      ReflectExtensions _reflectExtensions = new ReflectExtensions();
      return _reflectExtensions;
    }
  }.apply();
  
  public ReflectExtensions getRe() {
    return this._re;
  }
  
  private final EObject _ctx;
  
  public EObject getCtx() {
    return this._ctx;
  }
  
  private final TreeAppendable _appendable;
  
  public TreeAppendable getAppendable() {
    return this._appendable;
  }
  
  private final ImportManager _importManager;
  
  public ImportManager getImportManager() {
    return this._importManager;
  }
  
  private final TypeReferenceSerializer _serializer;
  
  public TypeReferenceSerializer getSerializer() {
    return this._serializer;
  }
  
  private final TypeReferences _typeReferences;
  
  public TypeReferences getTypeReferences() {
    return this._typeReferences;
  }
  
  public CodeGenerationContext(final EObject ctx, final TreeAppendable appendable, final TypeReferenceSerializer serializer, final TypeReferences typeReferences) {
    try {
      this._typeReferences = typeReferences;
      this._serializer = serializer;
      this._ctx = ctx;
      this._appendable = appendable;
      Object _get = this._re.<Object>get(appendable, "state");
      ImportManager _get_1 = this._re.<ImportManager>get(_get, "importManager");
      this._importManager = _get_1;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void addImport(final String qn) {
    final JvmTypeReference typeRef = this.type(qn);
    ImportManager _importManager = this.getImportManager();
    JvmType _type = typeRef.getType();
    _importManager.addImportFor(_type);
  }
  
  public JvmTypeReference type(final String qn, final JvmTypeReference... typeArgs) {
    TypeReferences _typeReferences = this.getTypeReferences();
    EObject _ctx = this.getCtx();
    JvmTypeReference _typeForName = _typeReferences.getTypeForName(qn, _ctx, typeArgs);
    return _typeForName;
  }
  
  public String _(final String qn) {
    final JvmTypeReference typeRef = this.type(qn);
    return this._(typeRef);
  }
  
  public String _(final JvmTypeReference typeRef) {
    ImportManager _importManager = this.getImportManager();
    StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable(_importManager);
    final StringBuilderBasedAppendable tempAppendable = _stringBuilderBasedAppendable;
    TypeReferenceSerializer _serializer = this.getSerializer();
    EObject _ctx = this.getCtx();
    _serializer.serialize(typeRef, _ctx, tempAppendable);
    return tempAppendable.toString();
  }
  
  public JvmTypeReference _extends(final JvmTypeReference upper) {
    JvmWildcardTypeReference _wildCardExtends = this._typeReferences.wildCardExtends(upper);
    return _wildCardExtends;
  }
  
  public JvmTypeReference _extends(final String upper) {
    JvmTypeReference _type = this.type(upper);
    JvmWildcardTypeReference _wildCardExtends = this._typeReferences.wildCardExtends(_type);
    return _wildCardExtends;
  }
  
  public JvmTypeReference operator_lessThan(final String left, final JvmTypeReference right) {
    JvmTypeReference _type = this.type(left);
    JvmType _type_1 = _type.getType();
    JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(_type_1, right);
    return _createTypeRef;
  }
  
  public JvmTypeReference operator_lessThan(final String left, final String right) {
    JvmTypeReference _type = this.type(left);
    JvmType _type_1 = _type.getType();
    JvmTypeReference _type_2 = this.type(right);
    JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(_type_1, _type_2);
    return _createTypeRef;
  }
  
  public JvmTypeReference operator_lessThan(final JvmTypeReference left, final String right) {
    JvmType _type = left.getType();
    JvmTypeReference _type_1 = this.type(right);
    JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(_type, _type_1);
    return _createTypeRef;
  }
  
  public JvmTypeReference operator_lessThan(final JvmTypeReference left, final JvmTypeReference right) {
    JvmType _type = left.getType();
    JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(_type, right);
    return _createTypeRef;
  }
  
  public JvmWildcardTypeReference wildcard() {
    JvmWildcardTypeReference _wildCard = this._typeReferences.wildCard();
    return _wildCard;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_re== null) ? 0 : _re.hashCode());
    result = prime * result + ((_ctx== null) ? 0 : _ctx.hashCode());
    result = prime * result + ((_appendable== null) ? 0 : _appendable.hashCode());
    result = prime * result + ((_importManager== null) ? 0 : _importManager.hashCode());
    result = prime * result + ((_serializer== null) ? 0 : _serializer.hashCode());
    result = prime * result + ((_typeReferences== null) ? 0 : _typeReferences.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CodeGenerationContext other = (CodeGenerationContext) obj;
    if (_re == null) {
      if (other._re != null)
        return false;
    } else if (!_re.equals(other._re))
      return false;
    if (_ctx == null) {
      if (other._ctx != null)
        return false;
    } else if (!_ctx.equals(other._ctx))
      return false;
    if (_appendable == null) {
      if (other._appendable != null)
        return false;
    } else if (!_appendable.equals(other._appendable))
      return false;
    if (_importManager == null) {
      if (other._importManager != null)
        return false;
    } else if (!_importManager.equals(other._importManager))
      return false;
    if (_serializer == null) {
      if (other._serializer != null)
        return false;
    } else if (!_serializer.equals(other._serializer))
      return false;
    if (_typeReferences == null) {
      if (other._typeReferences != null)
        return false;
    } else if (!_typeReferences.equals(other._typeReferences))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
