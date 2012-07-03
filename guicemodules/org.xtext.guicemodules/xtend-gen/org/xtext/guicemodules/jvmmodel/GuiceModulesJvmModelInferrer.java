package org.xtext.guicemodules.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.guicemodules.guiceModules.Binding;
import org.xtext.guicemodules.guiceModules.Module;

@SuppressWarnings("all")
public class GuiceModulesJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder builder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TypeReferences _typeReferences;
  
  protected void _infer(final Module module, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    JvmTypeReference _newTypeRef = this.builder.newTypeRef(module, Key.class);
    final JvmType keyType = _newTypeRef.getType();
    JvmTypeReference _newTypeRef_1 = this.builder.newTypeRef(module, com.google.inject.Module.class);
    final JvmType moduleType = _newTypeRef_1.getType();
    JvmTypeReference _newTypeRef_2 = this.builder.newTypeRef(module, Binder.class);
    final JvmType binderType = _newTypeRef_2.getType();
    JvmTypeReference _newTypeRef_3 = this.builder.newTypeRef(module, TypeLiteral.class);
    final JvmType typeLiteralType = _newTypeRef_3.getType();
    JvmTypeReference _newTypeRef_4 = this.builder.newTypeRef(module, HashSet.class);
    final JvmType hashSetType = _newTypeRef_4.getType();
    JvmTypeReference _newTypeRef_5 = this.builder.newTypeRef(module, Set.class);
    final JvmType setType = _newTypeRef_5.getType();
    JvmTypeReference _newTypeRef_6 = this.builder.newTypeRef(module, "void");
    final JvmType voidType = _newTypeRef_6.getType();
    boolean _equals = Objects.equal(keyType, null);
    if (_equals) {
      return;
    }
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(module);
    JvmGenericType _class = this.builder.toClass(module, _fullyQualifiedName);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          String _documentation = GuiceModulesJvmModelInferrer.this.builder.getDocumentation(module);
          GuiceModulesJvmModelInferrer.this.builder.setDocumentation(it, _documentation);
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmParameterizedTypeReference _createTypeRef = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(moduleType);
          GuiceModulesJvmModelInferrer.this.builder.<JvmParameterizedTypeReference>operator_add(_superTypes, _createTypeRef);
          EList<Module> _mixins = module.getMixins();
          for (final Module mixin : _mixins) {
            EList<JvmMember> _members = it.getMembers();
            String _name = mixin.getName();
            String _firstLower = StringExtensions.toFirstLower(_name);
            QualifiedName _fullyQualifiedName = GuiceModulesJvmModelInferrer.this._iQualifiedNameProvider.getFullyQualifiedName(mixin);
            String _string = _fullyQualifiedName.toString();
            JvmTypeReference _newTypeRef = GuiceModulesJvmModelInferrer.this.builder.newTypeRef(it, _string);
            final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
                public void apply(final JvmField it) {
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable it) {
                        StringConcatenation _builder = new StringConcatenation();
                        _builder.append("new ");
                        String _name = mixin.getName();
                        _builder.append(_name, "");
                        _builder.append("()");
                        it.append(_builder);
                      }
                    };
                  GuiceModulesJvmModelInferrer.this.builder.setInitializer(it, _function);
                }
              };
            JvmField _field = GuiceModulesJvmModelInferrer.this.builder.toField(module, _firstLower, _newTypeRef, _function);
            GuiceModulesJvmModelInferrer.this.builder.<JvmField>operator_add(_members, _field);
          }
          final HashMap<Binding,String> methods = CollectionLiterals.<Binding, String>newHashMap();
          EList<Binding> _bindings = module.getBindings();
          final Function1<Binding,Boolean> _function_1 = new Function1<Binding,Boolean>() {
              public Boolean apply(final Binding it) {
                XExpression _toInstance = it.getToInstance();
                boolean _notEquals = (!Objects.equal(_toInstance, null));
                return Boolean.valueOf(_notEquals);
              }
            };
          Iterable<Binding> _filter = IterableExtensions.<Binding>filter(_bindings, _function_1);
          for (final Binding binding : _filter) {
            {
              int _size = methods.size();
              final String name = ("_" + Integer.valueOf(_size));
              methods.put(binding, name);
              EList<JvmMember> _members_1 = it.getMembers();
              org.xtext.guicemodules.guiceModules.Key _from = binding.getFrom();
              JvmTypeReference _type = _from.getType();
              final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    it.setVisibility(JvmVisibility.PRIVATE);
                    XExpression _toInstance = binding.getToInstance();
                    GuiceModulesJvmModelInferrer.this.builder.setBody(it, _toInstance);
                  }
                };
              JvmOperation _method = GuiceModulesJvmModelInferrer.this.builder.toMethod(binding, name, _type, _function_2);
              GuiceModulesJvmModelInferrer.this.builder.<JvmOperation>operator_add(_members_1, _method);
            }
          }
          EList<JvmMember> _members_1 = it.getMembers();
          JvmParameterizedTypeReference _createTypeRef_1 = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(voidType);
          final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmParameterizedTypeReference _createTypeRef = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(binderType);
                JvmFormalParameter _parameter = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "binder", _createTypeRef);
                GuiceModulesJvmModelInferrer.this.builder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("configure(binder, new ");
                      JvmWildcardTypeReference _wildCard = GuiceModulesJvmModelInferrer.this._typeReferences.wildCard();
                      JvmParameterizedTypeReference _createTypeRef = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(keyType, _wildCard);
                      JvmParameterizedTypeReference _createTypeRef_1 = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(hashSetType, _createTypeRef);
                      String _identifier = _createTypeRef_1.getIdentifier();
                      _builder.append(_identifier, "");
                      _builder.append("());");
                      _builder.newLineIfNotEmpty();
                      it.append(_builder);
                    }
                  };
                GuiceModulesJvmModelInferrer.this.builder.setBody(it, _function);
              }
            };
          JvmOperation _method = GuiceModulesJvmModelInferrer.this.builder.toMethod(module, "configure", _createTypeRef_1, _function_2);
          GuiceModulesJvmModelInferrer.this.builder.<JvmOperation>operator_add(_members_1, _method);
          EList<JvmMember> _members_2 = it.getMembers();
          JvmParameterizedTypeReference _createTypeRef_2 = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(voidType);
          final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmParameterizedTypeReference _createTypeRef = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(binderType);
                JvmFormalParameter _parameter = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "bind", _createTypeRef);
                GuiceModulesJvmModelInferrer.this.builder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                JvmWildcardTypeReference _wildCard = GuiceModulesJvmModelInferrer.this._typeReferences.wildCard();
                JvmParameterizedTypeReference _createTypeRef_1 = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(keyType, _wildCard);
                JvmParameterizedTypeReference _createTypeRef_2 = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(setType, _createTypeRef_1);
                JvmFormalParameter _parameter_1 = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "usedKeys", _createTypeRef_2);
                GuiceModulesJvmModelInferrer.this.builder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      StringConcatenation _builder = new StringConcatenation();
                      {
                        EList<Binding> _bindings = module.getBindings();
                        for(final Binding b : _bindings) {
                          _builder.append("{");
                          _builder.newLine();
                          _builder.append("\t");
                          org.xtext.guicemodules.guiceModules.Key _from = b.getFrom();
                          JvmTypeReference _type = _from.getType();
                          JvmParameterizedTypeReference _createTypeRef = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(keyType, _type);
                          String _identifier = _createTypeRef.getIdentifier();
                          _builder.append(_identifier, "	");
                          _builder.append(" key = ");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          String _simpleName = keyType.getSimpleName();
                          _builder.append(_simpleName, "		");
                          _builder.append(".get(new ");
                          org.xtext.guicemodules.guiceModules.Key _from_1 = b.getFrom();
                          JvmTypeReference _type_1 = _from_1.getType();
                          JvmParameterizedTypeReference _createTypeRef_1 = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(typeLiteralType, _type_1);
                          String _identifier_1 = _createTypeRef_1.getIdentifier();
                          _builder.append(_identifier_1, "		");
                          _builder.append("(){});");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("if (usedKeys.add(key)) {");
                          _builder.newLine();
                          {
                            XExpression _toInstance = b.getToInstance();
                            boolean _notEquals = (!Objects.equal(_toInstance, null));
                            if (_notEquals) {
                              _builder.append("\t\t");
                              _builder.append("bind.bind(key).toInstance(");
                              String _get = methods.get(b);
                              _builder.append(_get, "		");
                              _builder.append("());");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("\t\t");
                              _builder.append("bind.bind(key).to(");
                              String _simpleName_1 = keyType.getSimpleName();
                              _builder.append(_simpleName_1, "		");
                              _builder.append(".get(new ");
                              org.xtext.guicemodules.guiceModules.Key _to = b.getTo();
                              JvmTypeReference _type_2 = _to.getType();
                              JvmParameterizedTypeReference _createTypeRef_2 = GuiceModulesJvmModelInferrer.this._typeReferences.createTypeRef(typeLiteralType, _type_2);
                              String _identifier_2 = _createTypeRef_2.getIdentifier();
                              _builder.append(_identifier_2, "		");
                              _builder.append("(){}));");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("}");
                          _builder.newLine();
                        }
                      }
                      {
                        EList<Module> _mixins = module.getMixins();
                        for(final Module mix : _mixins) {
                          String _name = mix.getName();
                          String _firstLower = StringExtensions.toFirstLower(_name);
                          _builder.append(_firstLower, "");
                          _builder.append(".configure(bind, usedKeys);");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                      it.append(_builder);
                    }
                  };
                GuiceModulesJvmModelInferrer.this.builder.setBody(it, _function);
              }
            };
          JvmOperation _method_1 = GuiceModulesJvmModelInferrer.this.builder.toMethod(module, "configure", _createTypeRef_2, _function_3);
          GuiceModulesJvmModelInferrer.this.builder.<JvmOperation>operator_add(_members_2, _method_1);
        }
      };
    _accept.initializeLater(_function);
  }
  
  public void infer(final EObject module, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    if (module instanceof Module) {
      _infer((Module)module, acceptor, preIndexingPhase);
      return;
    } else if (module != null) {
      _infer(module, acceptor, preIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(module, acceptor, preIndexingPhase).toString());
    }
  }
}
