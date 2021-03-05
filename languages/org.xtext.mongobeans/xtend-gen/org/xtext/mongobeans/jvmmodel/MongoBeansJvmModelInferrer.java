/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.jvmmodel;

import com.google.inject.Inject;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.Arrays;
import java.util.List;
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
      final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
        this._jvmTypesBuilder.setDocumentation(it, this._jvmTypesBuilder.getDocumentation(bean));
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(IMongoBean.class);
        this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
        this.addConstructors(it, bean);
        this.addDbObjectProperty(it, bean);
        EList<AbstractFeature> _features = bean.getFeatures();
        for (final AbstractFeature feature : _features) {
          boolean _matched = false;
          if (feature instanceof MongoProperty) {
            _matched=true;
            boolean _isMany = ((MongoProperty)feature).isMany();
            if (_isMany) {
              this.addListAccessor(it, ((MongoProperty)feature));
            } else {
              this.addDelegateAccessors(it, ((MongoProperty)feature));
            }
          }
          if (!_matched) {
            if (feature instanceof MongoOperation) {
              _matched=true;
              this.addMethod(it, ((MongoOperation)feature));
            }
          }
        }
      };
      acceptor.<JvmGenericType>accept(this._jvmTypesBuilder.toClass(bean, this._iQualifiedNameProvider.getFullyQualifiedName(bean)), _function);
    }
  }
  
  protected boolean addConstructors(final JvmDeclaredType inferredType, final MongoBean bean) {
    boolean _xblockexpression = false;
    {
      final JvmTypeReference typeRef1 = this._typeReferenceBuilder.typeRef(DBObject.class);
      EList<JvmMember> _members = inferredType.getMembers();
      final Procedure1<JvmConstructor> _function = (JvmConstructor it) -> {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Creates a new ");
        String _name = bean.getName();
        _builder.append(_name);
        _builder.append(" wrapping the given {@link ");
        String _name_1 = DBObject.class.getName();
        _builder.append(_name_1);
        _builder.append("}.");
        this._jvmTypesBuilder.setDocumentation(it, _builder.toString());
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(bean, "dbObject", typeRef1);
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("this._dbObject = dbObject;");
            _builder.newLine();
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      JvmConstructor _constructor = this._jvmTypesBuilder.toConstructor(bean, _function);
      this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
      EList<JvmMember> _members_1 = inferredType.getMembers();
      final Procedure1<JvmConstructor> _function_1 = (JvmConstructor it) -> {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Creates a new ");
        String _name = bean.getName();
        _builder.append(_name);
        _builder.append(" wrapping a new {@link ");
        String _name_1 = BasicDBObject.class.getName();
        _builder.append(_name_1);
        _builder.append("}.");
        this._jvmTypesBuilder.setDocumentation(it, _builder.toString());
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("_dbObject = new ");
            _builder.append(BasicDBObject.class);
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("_dbObject.put(JAVA_CLASS_KEY, \"");
            String _identifier = inferredType.getIdentifier();
            _builder.append(_identifier);
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      JvmConstructor _constructor_1 = this._jvmTypesBuilder.toConstructor(bean, _function_1);
      _xblockexpression = this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_1, _constructor_1);
    }
    return _xblockexpression;
  }
  
  protected boolean addDbObjectProperty(final JvmDeclaredType inferredType, final MongoBean bean) {
    boolean _xblockexpression = false;
    {
      EList<JvmMember> _members = inferredType.getMembers();
      JvmField _field = this._jvmTypesBuilder.toField(bean, "_dbObject", this._typeReferenceBuilder.typeRef(DBObject.class));
      this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
      EList<JvmMember> _members_1 = inferredType.getMembers();
      JvmOperation _getter = this._jvmTypesBuilder.toGetter(bean, "dbObject", "_dbObject", this._typeReferenceBuilder.typeRef(DBObject.class));
      _xblockexpression = this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _getter);
    }
    return _xblockexpression;
  }
  
  protected boolean addListAccessor(final JvmDeclaredType inferredType, final MongoProperty property) {
    boolean _xblockexpression = false;
    {
      final JvmTypeReference propertyType = this._primitives.asWrapperTypeIfPrimitive(this.getJvmType(property));
      boolean _xifexpression = false;
      boolean _isMongoPrimitiveType = this._mongoTypes.isMongoPrimitiveType(propertyType);
      if (_isMongoPrimitiveType) {
        EList<JvmMember> _members = inferredType.getMembers();
        String _firstUpper = StringExtensions.toFirstUpper(property.getName());
        String _plus = ("get" + _firstUpper);
        final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
          this._jvmTypesBuilder.setDocumentation(it, this._jvmTypesBuilder.getDocumentation(property));
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append("return (");
              _builder.append(List.class);
              _builder.append("<");
              _builder.append(propertyType);
              _builder.append(">) _dbObject.get(\"");
              String _name = property.getName();
              _builder.append(_name);
              _builder.append("\");");
              _builder.newLineIfNotEmpty();
            }
          };
          this._jvmTypesBuilder.setBody(it, _client);
        };
        JvmOperation _method = this._jvmTypesBuilder.toMethod(property, _plus, 
          this._typeReferenceBuilder.typeRef(List.class, propertyType), _function);
        _xifexpression = this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      } else {
        boolean _xblockexpression_1 = false;
        {
          EList<JvmMember> _members_1 = inferredType.getMembers();
          String _name = property.getName();
          String _plus_1 = ("_" + _name);
          JvmField _field = this._jvmTypesBuilder.toField(property, _plus_1, 
            this._typeReferenceBuilder.typeRef(MongoBeanList.class, propertyType));
          this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field);
          EList<JvmMember> _members_2 = inferredType.getMembers();
          String _firstUpper_1 = StringExtensions.toFirstUpper(property.getName());
          String _plus_2 = ("get" + _firstUpper_1);
          final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
            this._jvmTypesBuilder.setDocumentation(it, this._jvmTypesBuilder.getDocumentation(property));
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("if(_");
                String _name = property.getName();
                _builder.append(_name);
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
                _builder.append(_name_3);
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            };
            this._jvmTypesBuilder.setBody(it, _client);
          };
          JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(property, _plus_2, 
            this._typeReferenceBuilder.typeRef(List.class, propertyType), _function_1);
          _xblockexpression_1 = this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_1);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected boolean addDelegateAccessors(final JvmDeclaredType inferredType, final MongoProperty property) {
    boolean _xblockexpression = false;
    {
      EList<JvmMember> _members = inferredType.getMembers();
      String _firstUpper = StringExtensions.toFirstUpper(property.getName());
      String _plus = ("get" + _firstUpper);
      final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
        this._jvmTypesBuilder.setDocumentation(it, this._jvmTypesBuilder.getDocumentation(property));
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            {
              boolean _isMongoBean = MongoBeansJvmModelInferrer.this._mongoTypes.isMongoBean(MongoBeansJvmModelInferrer.this.getJvmType(property).getType());
              if (_isMongoBean) {
                _builder.append("return ");
                _builder.append(WrappingUtil.class);
                _builder.append(".wrapAndCast((");
                _builder.append(DBObject.class);
                _builder.append(") _dbObject.get(\"");
                String _name = property.getName();
                _builder.append(_name);
                _builder.append("\"));");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("return (");
                JvmTypeReference _asWrapperTypeIfPrimitive = MongoBeansJvmModelInferrer.this._primitives.asWrapperTypeIfPrimitive(MongoBeansJvmModelInferrer.this.getJvmType(property));
                _builder.append(_asWrapperTypeIfPrimitive);
                _builder.append(") _dbObject.get(\"");
                String _name_1 = property.getName();
                _builder.append(_name_1);
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(property, _plus, this.getJvmType(property), _function);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      EList<JvmMember> _members_1 = inferredType.getMembers();
      String _firstUpper_1 = StringExtensions.toFirstUpper(property.getName());
      String _plus_1 = ("set" + _firstUpper_1);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        this._jvmTypesBuilder.setDocumentation(it, this._jvmTypesBuilder.getDocumentation(property));
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(property, property.getName(), this.getJvmType(property));
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            {
              boolean _isMongoBean = MongoBeansJvmModelInferrer.this._mongoTypes.isMongoBean(MongoBeansJvmModelInferrer.this.getJvmType(property).getType());
              if (_isMongoBean) {
                _builder.append("_dbObject.put(\"");
                String _name = property.getName();
                _builder.append(_name);
                _builder.append("\", ");
                _builder.append(WrappingUtil.class);
                _builder.append(".unwrap(");
                String _name_1 = property.getName();
                _builder.append(_name_1);
                _builder.append("));");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("_dbObject.put(\"");
                String _name_2 = property.getName();
                _builder.append(_name_2);
                _builder.append("\", ");
                String _name_3 = property.getName();
                _builder.append(_name_3);
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(property, _plus_1, this._typeReferenceBuilder.typeRef(Void.TYPE), _function_1);
      _xblockexpression = this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
    }
    return _xblockexpression;
  }
  
  protected boolean addMethod(final JvmDeclaredType inferredType, final MongoOperation operation) {
    EList<JvmMember> _members = inferredType.getMembers();
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      this._jvmTypesBuilder.setDocumentation(it, this._jvmTypesBuilder.getDocumentation(operation));
      EList<JvmFormalParameter> _parameters = it.getParameters();
      final Function1<JvmFormalParameter, JvmFormalParameter> _function_1 = (JvmFormalParameter it_1) -> {
        return this._jvmTypesBuilder.toParameter(operation, it_1.getName(), it_1.getParameterType());
      };
      List<JvmFormalParameter> _map = ListExtensions.<JvmFormalParameter, JvmFormalParameter>map(operation.getParameters(), _function_1);
      this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _map);
      this._jvmTypesBuilder.setBody(it, operation.getBody());
    };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(operation, operation.getName(), operation.getReturnType(), _function);
    return this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
  }
  
  protected JvmTypeReference getJvmType(final MongoProperty property) {
    JvmTypeReference _xifexpression = null;
    MongoBean _inlineType = property.getInlineType();
    boolean _tripleNotEquals = (_inlineType != null);
    if (_tripleNotEquals) {
      EObject _head = IterableExtensions.<EObject>head(this.associations.getJvmElements(property.getInlineType()));
      _xifexpression = this._typeReferenceBuilder.typeRef(((JvmDeclaredType) _head));
    } else {
      _xifexpression = property.getType();
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
