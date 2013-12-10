/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
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
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.mongobeans.jvmmodel.MongoTypes;
import org.xtext.mongobeans.lib.IMongoBean;
import org.xtext.mongobeans.lib.MongoBeanList;
import org.xtext.mongobeans.lib.WrappingUtil;
import org.xtext.mongobeans.mongoBeans.AbstractFeature;
import org.xtext.mongobeans.mongoBeans.MongoBean;
import org.xtext.mongobeans.mongoBeans.MongoFile;
import org.xtext.mongobeans.mongoBeans.MongoOperation;
import org.xtext.mongobeans.mongoBeans.MongoProperty;

/**
 * Infers a Java class for each {@link MongoBean} in the given {@link MongoFile}.
 * The class wraps a {@link DBObject}.
 */
@SuppressWarnings("all")
public class MongoBeansJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  @Extension
  private MongoTypes _mongoTypes;
  
  @Inject
  @Extension
  private Primitives _primitives;
  
  @Inject
  @Extension
  private IJvmModelAssociations associations;
  
  protected void _infer(final MongoFile file, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    List<MongoBean> _eAllOfType = EcoreUtil2.<MongoBean>eAllOfType(file, MongoBean.class);
    for (final MongoBean bean : _eAllOfType) {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(bean);
      JvmGenericType _class = this._jvmTypesBuilder.toClass(bean, _fullyQualifiedName);
      IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          String _documentation = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(bean);
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmTypeReference _newTypeRef = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(bean, IMongoBean.class);
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
          MongoBeansJvmModelInferrer.this.addConstructors(it, bean);
          MongoBeansJvmModelInferrer.this.addDbObjectProperty(it, bean);
          EList<AbstractFeature> _features = bean.getFeatures();
          for (final AbstractFeature feature : _features) {
            boolean _matched = false;
            if (!_matched) {
              if (feature instanceof MongoProperty) {
                _matched=true;
                boolean _isMany = ((MongoProperty)feature).isMany();
                if (_isMany) {
                  MongoBeansJvmModelInferrer.this.addListAccessor(it, ((MongoProperty)feature));
                } else {
                  MongoBeansJvmModelInferrer.this.addDelegateAccessors(it, ((MongoProperty)feature));
                }
              }
            }
            if (!_matched) {
              if (feature instanceof MongoOperation) {
                _matched=true;
                MongoBeansJvmModelInferrer.this.addMethod(it, ((MongoOperation)feature));
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
          _builder.append(" wrapping the given {@link ");
          String _name_1 = DBObject.class.getName();
          _builder.append(_name_1, "");
          _builder.append("}.");
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _builder.toString());
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmTypeReference _newTypeRef = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(bean, DBObject.class);
          JvmFormalParameter _parameter = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.toParameter(it, "dbObject", _newTypeRef);
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append("this._dbObject = dbObject;");
              _builder.newLine();
            }
          };
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
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
          _builder.append(" wrapping a new {@link ");
          String _name_1 = BasicDBObject.class.getName();
          _builder.append(_name_1, "");
          _builder.append("}.");
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _builder.toString());
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append("_dbObject = new ");
              _builder.append(BasicDBObject.class, "");
              _builder.append("();");
              _builder.newLineIfNotEmpty();
              _builder.append("_dbObject.put(JAVA_CLASS_KEY, \"");
              String _identifier = inferredType.getIdentifier();
              _builder.append(_identifier, "");
              _builder.append("\");");
              _builder.newLineIfNotEmpty();
            }
          };
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
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
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(bean, DBObject.class);
      JvmField _field = this._jvmTypesBuilder.toField(bean, "_dbObject", _newTypeRef);
      this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
      EList<JvmMember> _members_1 = inferredType.getMembers();
      JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(bean, DBObject.class);
      JvmOperation _getter = this._jvmTypesBuilder.toGetter(bean, "dbObject", "_dbObject", _newTypeRef_1);
      boolean _add = this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _getter);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  protected boolean addListAccessor(final JvmDeclaredType inferredType, final MongoProperty property) {
    boolean _xblockexpression = false;
    {
      JvmTypeReference _jvmType = this.getJvmType(property);
      final JvmTypeReference propertyType = this._primitives.asWrapperTypeIfPrimitive(_jvmType);
      boolean _xifexpression = false;
      boolean _isMongoPrimitiveType = this._mongoTypes.isMongoPrimitiveType(propertyType);
      if (_isMongoPrimitiveType) {
        EList<JvmMember> _members = inferredType.getMembers();
        String _name = property.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        String _plus = ("get" + _firstUpper);
        JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(property, List.class, propertyType);
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            String _documentation = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(property);
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("return (");
                _builder.append(List.class, "");
                _builder.append("<");
                _builder.append(propertyType, "");
                _builder.append(">) _dbObject.get(\"");
                String _name = property.getName();
                _builder.append(_name, "");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
              }
            };
            MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method = this._jvmTypesBuilder.toMethod(property, _plus, _newTypeRef, _function);
        boolean _add = this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        _xifexpression = _add;
      } else {
        boolean _xblockexpression_1 = false;
        {
          EList<JvmMember> _members_1 = inferredType.getMembers();
          String _name_1 = property.getName();
          String _plus_1 = ("_" + _name_1);
          JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(property, MongoBeanList.class, propertyType);
          JvmField _field = this._jvmTypesBuilder.toField(property, _plus_1, _newTypeRef_1);
          this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field);
          EList<JvmMember> _members_2 = inferredType.getMembers();
          String _name_2 = property.getName();
          String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
          String _plus_2 = ("get" + _firstUpper_1);
          JvmTypeReference _newTypeRef_2 = this._jvmTypesBuilder.newTypeRef(property, List.class, propertyType);
          final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              String _documentation = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(property);
              MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("if(_");
                  String _name = property.getName();
                  _builder.append(_name, "");
                  _builder.append("==null)");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("_");
                  String _name_1 = property.getName();
                  _builder.append(_name_1, "\t");
                  _builder.append(" = new ");
                  _builder.append(MongoBeanList.class, "\t");
                  _builder.append("<");
                  _builder.append(propertyType, "\t");
                  _builder.append(">(_dbObject, \"");
                  String _name_2 = property.getName();
                  _builder.append(_name_2, "\t");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("return _");
                  String _name_3 = property.getName();
                  _builder.append(_name_3, "");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                }
              };
              MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(property, _plus_2, _newTypeRef_2, _function_1);
          boolean _add_1 = this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_1);
          _xblockexpression_1 = (_add_1);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
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
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              {
                JvmTypeReference _jvmType = MongoBeansJvmModelInferrer.this.getJvmType(property);
                boolean _isMongoBean = MongoBeansJvmModelInferrer.this._mongoTypes.isMongoBean(_jvmType);
                if (_isMongoBean) {
                  _builder.append("return ");
                  _builder.append(WrappingUtil.class, "");
                  _builder.append(".wrapAndCast((");
                  _builder.append(DBObject.class, "");
                  _builder.append(") _dbObject.get(\"");
                  String _name = property.getName();
                  _builder.append(_name, "");
                  _builder.append("\"));");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("return (");
                  JvmTypeReference _jvmType_1 = MongoBeansJvmModelInferrer.this.getJvmType(property);
                  JvmTypeReference _asWrapperTypeIfPrimitive = MongoBeansJvmModelInferrer.this._primitives.asWrapperTypeIfPrimitive(_jvmType_1);
                  _builder.append(_asWrapperTypeIfPrimitive, "");
                  _builder.append(") _dbObject.get(\"");
                  String _name_1 = property.getName();
                  _builder.append(_name_1, "");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          };
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
        }
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(property, _plus, _jvmType, _function);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      EList<JvmMember> _members_1 = inferredType.getMembers();
      String _name_1 = property.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
      String _plus_1 = ("set" + _firstUpper_1);
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(property, Void.TYPE);
      final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          String _documentation = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(property);
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
          EList<JvmFormalParameter> _parameters = it.getParameters();
          String _name = property.getName();
          JvmTypeReference _jvmType = MongoBeansJvmModelInferrer.this.getJvmType(property);
          JvmFormalParameter _parameter = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.toParameter(it, _name, _jvmType);
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              {
                JvmTypeReference _jvmType = MongoBeansJvmModelInferrer.this.getJvmType(property);
                boolean _isMongoBean = MongoBeansJvmModelInferrer.this._mongoTypes.isMongoBean(_jvmType);
                if (_isMongoBean) {
                  _builder.append("_dbObject.put(\"");
                  String _name = property.getName();
                  _builder.append(_name, "");
                  _builder.append("\", ");
                  _builder.append(WrappingUtil.class, "");
                  _builder.append(".unwrap(");
                  String _name_1 = property.getName();
                  _builder.append(_name_1, "");
                  _builder.append("));");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("_dbObject.put(\"");
                  String _name_2 = property.getName();
                  _builder.append(_name_2, "");
                  _builder.append("\", ");
                  String _name_3 = property.getName();
                  _builder.append(_name_3, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          };
          MongoBeansJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
        }
      };
      JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(property, _plus_1, _newTypeRef, _function_1);
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
        EList<JvmFormalParameter> _parameters = it.getParameters();
        EList<JvmFormalParameter> _parameters_1 = operation.getParameters();
        final Function1<JvmFormalParameter,JvmFormalParameter> _function = new Function1<JvmFormalParameter,JvmFormalParameter>() {
          public JvmFormalParameter apply(final JvmFormalParameter it) {
            String _name = it.getName();
            JvmTypeReference _parameterType = it.getParameterType();
            JvmFormalParameter _parameter = MongoBeansJvmModelInferrer.this._jvmTypesBuilder.toParameter(it, _name, _parameterType);
            return _parameter;
          }
        };
        List<JvmFormalParameter> _map = ListExtensions.<JvmFormalParameter, JvmFormalParameter>map(_parameters_1, _function);
        MongoBeansJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _map);
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
