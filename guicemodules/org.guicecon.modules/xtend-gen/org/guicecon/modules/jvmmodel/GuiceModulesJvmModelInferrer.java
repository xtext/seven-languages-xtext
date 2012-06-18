package org.guicecon.modules.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import java.util.Arrays;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
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
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.guicecon.modules.guiceModules.Binding;
import org.guicecon.modules.guiceModules.Module;

@SuppressWarnings("all")
public class GuiceModulesJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TypeReferences typeReferences;
  
  protected void _infer(final Module m, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(m, "com.google.inject.Key");
    boolean _equals = Objects.equal(_newTypeRef, null);
    if (_equals) {
      return;
    } else {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(m);
      JvmGenericType _class = this._jvmTypesBuilder.toClass(m, _fullyQualifiedName);
      IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            String _documentation = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(m);
            GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmTypeReference _newTypeRef = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(m, com.google.inject.Module.class);
            GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
            EList<JvmMember> _members = it.getMembers();
            final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
                public void apply(final JvmConstructor it) {
                }
              };
            JvmConstructor _constructor = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.toConstructor(m, _function);
            GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
            EList<Module> _mixins = m.getMixins();
            for (final Module mix : _mixins) {
              {
                String _name = mix.getName();
                String _firstLower = StringExtensions.toFirstLower(_name);
                String _name_1 = mix.getName();
                JvmTypeReference _newTypeRef_1 = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(mix, _name_1);
                final JvmField field = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.toField(mix, _firstLower, _newTypeRef_1);
                EList<JvmMember> _members_1 = it.getMembers();
                GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, field);
                final Procedure1<ITreeAppendable> _function_1 = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("new ");
                      String _name = mix.getName();
                      _builder.append(_name, "");
                      _builder.append("()");
                      it.append(_builder);
                    }
                  };
                GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.setInitializer(field, _function_1);
              }
            }
            EList<JvmMember> _members_1 = it.getMembers();
            JvmTypeReference _newTypeRef_1 = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(m, Void.TYPE);
            final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  JvmTypeReference _newTypeRef = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(m, Binder.class);
                  JvmFormalParameter _parameter = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.toParameter(m, "binder", _newTypeRef);
                  GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable it) {
                        StringConcatenation _builder = new StringConcatenation();
                        _builder.append("configure(binder, new ");
                        it.append(_builder);
                        JvmTypeReference _newTypeRef = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(m, HashSet.class);
                        JvmType _type = _newTypeRef.getType();
                        it.append(_type);
                        StringConcatenation _builder_1 = new StringConcatenation();
                        _builder_1.append("<Key<?>>());");
                        it.append(_builder_1);
                      }
                    };
                  GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                }
              };
            JvmOperation _method = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.toMethod(m, "configure", _newTypeRef_1, _function_1);
            GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
            EList<JvmMember> _members_2 = it.getMembers();
            JvmTypeReference _newTypeRef_2 = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(m, Void.TYPE);
            final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  JvmTypeReference _newTypeRef = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(m, Binder.class);
                  JvmFormalParameter _parameter = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.toParameter(m, "bind", _newTypeRef);
                  GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                  JvmWildcardTypeReference _wildCard = GuiceModulesJvmModelInferrer.this.typeReferences.wildCard();
                  JvmTypeReference _newTypeRef_1 = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(m, "com.google.inject.Key", _wildCard);
                  JvmTypeReference _newTypeRef_2 = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(m, "java.util.Set", _newTypeRef_1);
                  JvmFormalParameter _parameter_1 = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.toParameter(m, "usedKeys", _newTypeRef_2);
                  GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable it) {
                        EList<Binding> _bindings = m.getBindings();
                        for (final Binding b : _bindings) {
                          {
                            StringConcatenation _builder = new StringConcatenation();
                            _builder.append("if (usedKeys.add(");
                            it.append(_builder);
                            JvmTypeReference _newTypeRef = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(m, Key.class);
                            JvmType _type = _newTypeRef.getType();
                            it.append(_type);
                            StringConcatenation _builder_1 = new StringConcatenation();
                            _builder_1.append(".get(new ");
                            ITreeAppendable _append = it.append(_builder_1);
                            JvmTypeReference _newTypeRef_1 = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(m, TypeLiteral.class);
                            JvmType _type_1 = _newTypeRef_1.getType();
                            ITreeAppendable _append_1 = _append.append(_type_1);
                            StringConcatenation _builder_2 = new StringConcatenation();
                            _builder_2.append("<");
                            ITreeAppendable _append_2 = _append_1.append(_builder_2);
                            org.guicecon.modules.guiceModules.Key _from = b.getFrom();
                            JvmTypeReference _type_2 = _from.getType();
                            JvmType _type_3 = _type_2.getType();
                            _append_2.append(_type_3);
                            StringConcatenation _builder_3 = new StringConcatenation();
                            _builder_3.append(">(){}))) {");
                            _builder_3.newLine();
                            _builder_3.append("\t");
                            _builder_3.append("bind.bind(Key.get(new TypeLiteral<");
                            ITreeAppendable _append_3 = it.append(_builder_3);
                            org.guicecon.modules.guiceModules.Key _from_1 = b.getFrom();
                            JvmTypeReference _type_4 = _from_1.getType();
                            JvmType _type_5 = _type_4.getType();
                            ITreeAppendable _append_4 = _append_3.append(_type_5);
                            StringConcatenation _builder_4 = new StringConcatenation();
                            _builder_4.append(">(){}))");
                            _append_4.append(_builder_4);
                            XExpression _toInstance = b.getToInstance();
                            boolean _notEquals = (!Objects.equal(_toInstance, null));
                            if (_notEquals) {
                              StringConcatenation _builder_5 = new StringConcatenation();
                              _builder_5.append(".toInstance(");
                              String _nameForInstanceMethod = GuiceModulesJvmModelInferrer.this.getNameForInstanceMethod(b);
                              _builder_5.append(_nameForInstanceMethod, "");
                              _builder_5.append("())");
                              it.append(_builder_5);
                            } else {
                              StringConcatenation _builder_6 = new StringConcatenation();
                              _builder_6.append(".to(Key.get(new TypeLiteral<");
                              ITreeAppendable _append_5 = it.append(_builder_6);
                              org.guicecon.modules.guiceModules.Key _to = b.getTo();
                              JvmTypeReference _type_6 = _to.getType();
                              JvmType _type_7 = _type_6.getType();
                              ITreeAppendable _append_6 = _append_5.append(_type_7);
                              StringConcatenation _builder_7 = new StringConcatenation();
                              _builder_7.append(">(){}));");
                              _append_6.append(_builder_7);
                            }
                            StringConcatenation _builder_8 = new StringConcatenation();
                            _builder_8.append("\t");
                            _builder_8.append("// End bindings\t");
                            _builder_8.newLine();
                            _builder_8.append("}");
                            _builder_8.newLine();
                            it.append(_builder_8);
                          }
                        }
                        EList<Module> _mixins = m.getMixins();
                        for (final Module mix : _mixins) {
                          StringConcatenation _builder = new StringConcatenation();
                          String _name = mix.getName();
                          String _firstLower = StringExtensions.toFirstLower(_name);
                          _builder.append(_firstLower, "");
                          _builder.append(".configure(bind, usedKeys);");
                          it.append(_builder);
                        }
                      }
                    };
                  GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                }
              };
            JvmOperation _method_1 = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.toMethod(m, "configure", _newTypeRef_2, _function_2);
            GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_1);
            EList<Binding> _bindings = m.getBindings();
            for (final Binding b : _bindings) {
              XExpression _toInstance = b.getToInstance();
              boolean _notEquals = (!Objects.equal(_toInstance, null));
              if (_notEquals) {
                EList<JvmMember> _members_3 = it.getMembers();
                String _nameForInstanceMethod = GuiceModulesJvmModelInferrer.this.getNameForInstanceMethod(b);
                org.guicecon.modules.guiceModules.Key _from = b.getFrom();
                JvmTypeReference _type = _from.getType();
                final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      XExpression _toInstance = b.getToInstance();
                      GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _toInstance);
                    }
                  };
                JvmOperation _method_2 = GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.toMethod(b, _nameForInstanceMethod, _type, _function_3);
                GuiceModulesJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_2);
              }
            }
          }
        };
      _accept.initializeLater(_function);
    }
  }
  
  public String getNameForInstanceMethod(final Binding b) {
    org.guicecon.modules.guiceModules.Key _from = b.getFrom();
    JvmTypeReference _type = _from.getType();
    JvmType _type_1 = _type.getType();
    String _simpleName = _type_1.getSimpleName();
    String _plus = ("getInstanceFor" + _simpleName);
    return _plus;
  }
  
  public void infer(final EObject m, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    if (m instanceof Module) {
      _infer((Module)m, acceptor, preIndexingPhase);
      return;
    } else if (m != null) {
      _infer(m, acceptor, preIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(m, acceptor, preIndexingPhase).toString());
    }
  }
}
