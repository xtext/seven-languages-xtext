package org.xtext.mongobeans.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.Primitives;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.mongobeans.jvmmodel.MongoTypes;
import org.xtext.mongobeans.mongoBeans.AbstractFeature;
import org.xtext.mongobeans.mongoBeans.MongoBean;
import org.xtext.mongobeans.mongoBeans.MongoFile;
import org.xtext.mongobeans.mongoBeans.MongoOperation;
import org.xtext.mongobeans.mongoBeans.MongoProperty;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * @author Jan Koehnlein
 */
@SuppressWarnings("all")
public class MongoBeansJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TypeReferenceSerializer _typeReferenceSerializer;
  
  @Inject
  private MongoTypes _mongoTypes;
  
  @Inject
  private Primitives _primitives;
  
  @Inject
  private IJvmModelAssociations associations;
  
  protected void _infer(final MongoFile file, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    List<MongoBean> _eAllOfType = EcoreUtil2.<MongoBean>eAllOfType(file, MongoBean.class);
    for (final MongoBean bean : _eAllOfType) {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(bean);
      JvmGenericType _class = this._jvmTypesBuilder.toClass(bean, _fullyQualifiedName);
      IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            String _documentation = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(bean);
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmTypeReference _newTypeRef = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(bean, "org.xtext.mongobeans.IMongoBean");
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
            MongoBeansJvmModelInferrer.this.addConstructors(it, bean);
            MongoBeansJvmModelInferrer.this.addDbObjectProperty(it, bean);
            EList<AbstractFeature> _features = bean.getFeatures();
            for (final AbstractFeature feature : _features) {
              boolean _matched = false;
              if (!_matched) {
                if (feature instanceof MongoProperty) {
                  final MongoProperty _mongoProperty = (MongoProperty)feature;
                  _matched=true;
                  boolean _isMany = _mongoProperty.isMany();
                  if (_isMany) {
                    MongoBeansJvmModelInferrer.this.addListAccessor(it, _mongoProperty);
                  } else {
                    MongoBeansJvmModelInferrer.this.addDelegateAccessors(it, _mongoProperty);
                  }
                }
              }
              if (!_matched) {
                if (feature instanceof MongoOperation) {
                  final MongoOperation _mongoOperation = (MongoOperation)feature;
                  _matched=true;
                  MongoBeansJvmModelInferrer.this.addMethod(it, _mongoOperation);
                }
              }
            }
          }
        };
      _accept.initializeLater(_function);
    }
  }
  
  protected boolean addConstructors(final JvmDeclaredType inferredType, final MongoBean bean) {
    boolean _xblockexpression = false;
    {
      EList<JvmMember> _members = inferredType.getMembers();
      final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Creates a new ");
            String _name = bean.getName();
            _builder.append(_name, "");
            _builder.append(" wrapping the given {@link DBObject}.");
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _builder.toString());
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _newTypeRef = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(bean, "com.mongodb.DBObject");
            JvmFormalParameter _parameter = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.toParameter(it, "dbObject", _newTypeRef);
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.append("this._dbObject = dbObject;");
                }
              };
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmConstructor _constructor = this._jvmTypesBuilder.toConstructor(bean, _function);
      this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
      EList<JvmMember> _members_1 = inferredType.getMembers();
      final Procedure1<JvmConstructor> _function_1 = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Creates a new ");
            String _name = bean.getName();
            _builder.append(_name, "");
            _builder.append(" wrapping a new {@link BasicDBObject}.");
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _builder.toString());
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.append("_dbObject = new ");
                  MongoBeansJvmModelInferrer.this.appendTypeRef(it, bean, "com.mongodb.BasicDBObject");
                  ITreeAppendable _append = it.append("();");
                  _append.newLine();
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("_dbObject.put(JAVA_CLASS_KEY, \"");
                  String _identifier = inferredType.getIdentifier();
                  _builder.append(_identifier, "");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                  it.append(_builder);
                }
              };
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmConstructor _constructor_1 = this._jvmTypesBuilder.toConstructor(bean, _function_1);
      boolean _add = this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_1, _constructor_1);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  protected boolean addDbObjectProperty(final JvmDeclaredType inferredType, final MongoBean bean) {
    boolean _xblockexpression = false;
    {
      EList<JvmMember> _members = inferredType.getMembers();
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(bean, "com.mongodb.DBObject");
      JvmField _field = this._jvmTypesBuilder.toField(bean, "_dbObject", _newTypeRef);
      this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
      EList<JvmMember> _members_1 = inferredType.getMembers();
      JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(bean, "com.mongodb.DBObject");
      JvmOperation _getter = this._jvmTypesBuilder.toGetter(bean, "dbObject", "_dbObject", _newTypeRef_1);
      boolean _add = this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _getter);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  protected boolean addListAccessor(final JvmDeclaredType inferredType, final MongoProperty property) {
    boolean _xifexpression = false;
    JvmTypeReference _jvmType = this.getJvmType(property);
    boolean _isMongoPrimitiveType = this._mongoTypes.isMongoPrimitiveType(_jvmType);
    if (_isMongoPrimitiveType) {
      EList<JvmMember> _members = inferredType.getMembers();
      String _name = property.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("get" + _firstUpper);
      JvmTypeReference _jvmType_1 = this.getJvmType(property);
      JvmTypeReference _asWrapperTypeIfPrimitive = this._primitives.asWrapperTypeIfPrimitive(_jvmType_1);
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(property, "java.util.List", _asWrapperTypeIfPrimitive);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            String _documentation = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(property);
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.append("return (");
                  JvmTypeReference _jvmType = MongoBeansJvmModelInferrer.this.getJvmType(property);
                  JvmTypeReference _asWrapperTypeIfPrimitive = MongoBeansJvmModelInferrer.this._primitives.asWrapperTypeIfPrimitive(_jvmType);
                  MongoBeansJvmModelInferrer.this.appendTypeRef(it, property, "java.util.List", _asWrapperTypeIfPrimitive);
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append(") _dbObject.get(\"");
                  String _name = property.getName();
                  _builder.append(_name, "");
                  _builder.append("\");");
                  it.append(_builder);
                }
              };
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(property, _plus, _newTypeRef, _function);
      boolean _add = this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      _xifexpression = _add;
    } else {
      boolean _xblockexpression = false;
      {
        EList<JvmMember> _members_1 = inferredType.getMembers();
        String _name_1 = property.getName();
        String _plus_1 = ("_" + _name_1);
        JvmTypeReference _jvmType_2 = this.getJvmType(property);
        JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(property, 
          "org.xtext.mongobeans.MongoBeanList", _jvmType_2);
        JvmField _field = this._jvmTypesBuilder.toField(property, _plus_1, _newTypeRef_1);
        this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field);
        EList<JvmMember> _members_2 = inferredType.getMembers();
        String _name_2 = property.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
        String _plus_2 = ("get" + _firstUpper_1);
        JvmTypeReference _jvmType_3 = this.getJvmType(property);
        JvmTypeReference _newTypeRef_2 = this._jvmTypesBuilder.newTypeRef(property, "java.util.List", _jvmType_3);
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              String _documentation = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(property);
              MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
              final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                  public void apply(final ITreeAppendable it) {
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("if(_");
                    String _name = property.getName();
                    _builder.append(_name, "");
                    _builder.append("==null)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("_");
                    String _name_1 = property.getName();
                    _builder.append(_name_1, "	");
                    _builder.append(" = new ");
                    it.append(_builder);
                    JvmTypeReference _jvmType = MongoBeansJvmModelInferrer.this.getJvmType(property);
                    MongoBeansJvmModelInferrer.this.appendTypeRef(it, property, "org.xtext.mongobeans.MongoBeanList", _jvmType);
                    String _name_2 = property.getName();
                    String _plus = ("(_dbObject, \"" + _name_2);
                    String _plus_1 = (_plus + "\");");
                    ITreeAppendable _append = it.append(_plus_1);
                    _append.newLine();
                    String _name_3 = property.getName();
                    String _plus_2 = ("return _" + _name_3);
                    String _plus_3 = (_plus_2 + ";");
                    it.append(_plus_3);
                  }
                };
              MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          };
        JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(property, _plus_2, _newTypeRef_2, _function_1);
        boolean _add_1 = this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_1);
        _xblockexpression = (_add_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  protected boolean addDelegateAccessors(final JvmDeclaredType inferredType, final MongoProperty property) {
    boolean _xblockexpression = false;
    {
      EList<JvmMember> _members = inferredType.getMembers();
      String _name = property.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("get" + _firstUpper);
      JvmTypeReference _jvmType = this.getJvmType(property);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            String _documentation = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(property);
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.append("return ");
                  JvmTypeReference _jvmType = MongoBeansJvmModelInferrer.this.getJvmType(property);
                  boolean _isMongoBean = MongoBeansJvmModelInferrer.this._mongoTypes.isMongoBean(_jvmType);
                  if (_isMongoBean) {
                    MongoBeansJvmModelInferrer.this.appendTypeRef(it, property, "org.xtext.mongobeans.WrappingUtil");
                    it.append(".wrapAndCast((");
                    MongoBeansJvmModelInferrer.this.appendTypeRef(it, property, "com.mongodb.DBObject");
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append(") _dbObject.get(\"");
                    String _name = property.getName();
                    _builder.append(_name, "");
                    _builder.append("\"));");
                    it.append(_builder);
                  } else {
                    it.append("(");
                    JvmTypeReference _jvmType_1 = MongoBeansJvmModelInferrer.this.getJvmType(property);
                    JvmTypeReference _asWrapperTypeIfPrimitive = MongoBeansJvmModelInferrer.this._primitives.asWrapperTypeIfPrimitive(_jvmType_1);
                    MongoBeansJvmModelInferrer.this.appendTypeRef(it, property, _asWrapperTypeIfPrimitive);
                    StringConcatenation _builder_1 = new StringConcatenation();
                    _builder_1.append(") _dbObject.get(\"");
                    String _name_1 = property.getName();
                    _builder_1.append(_name_1, "");
                    _builder_1.append("\");");
                    it.append(_builder_1);
                  }
                }
              };
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(property, _plus, _jvmType, _function);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      EList<JvmMember> _members_1 = inferredType.getMembers();
      String _name_1 = property.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
      String _plus_1 = ("set" + _firstUpper_1);
      final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            String _documentation = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(property);
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            String _name = property.getName();
            JvmTypeReference _jvmType = MongoBeansJvmModelInferrer.this.getJvmType(property);
            JvmFormalParameter _parameter = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.toParameter(it, _name, _jvmType);
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append(" ");
                  _builder.append("_dbObject.put(\"");
                  String _name = property.getName();
                  _builder.append(_name, " ");
                  _builder.append("\", ");
                  it.append(_builder);
                  JvmTypeReference _jvmType = MongoBeansJvmModelInferrer.this.getJvmType(property);
                  boolean _isMongoBean = MongoBeansJvmModelInferrer.this._mongoTypes.isMongoBean(_jvmType);
                  if (_isMongoBean) {
                    MongoBeansJvmModelInferrer.this.appendTypeRef(it, property, "org.xtext.mongobeans.WrappingUtil");
                    it.append(".unwrap(");
                    String _name_1 = property.getName();
                    it.append(_name_1);
                    it.append(")");
                  } else {
                    String _name_2 = property.getName();
                    it.append(_name_2);
                  }
                  it.append(");");
                }
              };
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(property, _plus_1, null, _function_1);
      boolean _add = this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  protected boolean addMethod(final JvmDeclaredType inferredType, final MongoOperation operation) {
    EList<JvmMember> _members = inferredType.getMembers();
    String _name = operation.getName();
    JvmTypeReference _returnType = operation.getReturnType();
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          String _documentation = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(operation);
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
          EList<JvmFormalParameter> _parameters = operation.getParameters();
          for (final JvmFormalParameter parameter : _parameters) {
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            String _name = parameter.getName();
            JvmTypeReference _parameterType = parameter.getParameterType();
            JvmFormalParameter _parameter = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.toParameter(parameter, _name, _parameterType);
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
          }
          XExpression _body = operation.getBody();
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(operation, _name, _returnType, _function);
    boolean _add = this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    return _add;
  }
  
  protected JvmTypeReference getJvmType(final MongoProperty property) {
    JvmTypeReference _xifexpression = null;
    MongoBean _inlineType = property.getInlineType();
    boolean _notEquals = (!Objects.equal(_inlineType, null));
    if (_notEquals) {
      MongoBean _inlineType_1 = property.getInlineType();
      Set<EObject> _jvmElements = this.associations.getJvmElements(_inlineType_1);
      EObject _head = IterableExtensions.<EObject>head(_jvmElements);
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(((JvmDeclaredType) _head));
      _xifexpression = _newTypeRef;
    } else {
      JvmTypeReference _type = property.getType();
      _xifexpression = _type;
    }
    return _xifexpression;
  }
  
  protected void appendTypeRef(final IAppendable appendable, final EObject context, final String name, final JvmTypeReference... typeArguments) {
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(context, name, typeArguments);
    this._typeReferenceSerializer.serialize(_newTypeRef, context, appendable);
  }
  
  protected void appendTypeRef(final IAppendable appendable, final EObject context, final JvmTypeReference typeRef) {
    this._typeReferenceSerializer.serialize(typeRef, context, appendable);
  }
  
  public void infer(final EObject file, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (file instanceof MongoFile) {
      _infer((MongoFile)file, acceptor, isPreIndexingPhase);
      return;
    } else if (file != null) {
      _infer(file, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(file, acceptor, isPreIndexingPhase).toString());
    }
  }
}
