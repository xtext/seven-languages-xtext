/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.guicemodules.jvmmodel;

import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.guicemodules.guiceModules.BindingAST;
import org.xtext.guicemodules.guiceModules.KeyAST;
import org.xtext.guicemodules.guiceModules.ModuleAST;

@SuppressWarnings("all")
public class GuiceModulesJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder builder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  protected void _infer(final ModuleAST module, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        GuiceModulesJvmModelInferrer.this.builder.setDocumentation(it, GuiceModulesJvmModelInferrer.this.builder.getDocumentation(module));
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeRef = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Module.class);
        GuiceModulesJvmModelInferrer.this.builder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
        EList<ModuleAST> _mixins = module.getMixins();
        for (final ModuleAST mixin : _mixins) {
          boolean _eIsProxy = mixin.eIsProxy();
          boolean _not = (!_eIsProxy);
          if (_not) {
            EList<JvmMember> _members = it.getMembers();
            final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
              @Override
              public void apply(final JvmField it) {
                StringConcatenationClient _client = new StringConcatenationClient() {
                  @Override
                  protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                    _builder.append("new ");
                    String _name = mixin.getName();
                    _builder.append(_name);
                    _builder.append("()");
                  }
                };
                GuiceModulesJvmModelInferrer.this.builder.setInitializer(it, _client);
              }
            };
            JvmField _field = GuiceModulesJvmModelInferrer.this.builder.toField(mixin, GuiceModulesJvmModelInferrer.this.simpleName(mixin), GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(GuiceModulesJvmModelInferrer.this._iQualifiedNameProvider.getFullyQualifiedName(mixin).toString()), _function);
            GuiceModulesJvmModelInferrer.this.builder.<JvmField>operator_add(_members, _field);
          }
        }
        EList<BindingAST> _bindings = module.getBindings();
        for (final BindingAST binding : _bindings) {
          {
            XExpression _toInstance = binding.getToInstance();
            boolean _tripleNotEquals = (_toInstance != null);
            if (_tripleNotEquals) {
              EList<JvmMember> _members_1 = it.getMembers();
              final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
                @Override
                public void apply(final JvmOperation it) {
                  it.setVisibility(JvmVisibility.PRIVATE);
                  GuiceModulesJvmModelInferrer.this.builder.setBody(it, binding.getToInstance());
                }
              };
              JvmOperation _method = GuiceModulesJvmModelInferrer.this.builder.toMethod(binding, GuiceModulesJvmModelInferrer.this.syntheticToInstanceName(binding), binding.getFrom().getType(), _function_1);
              GuiceModulesJvmModelInferrer.this.builder.<JvmOperation>operator_add(_members_1, _method);
            }
            KeyAST _to = binding.getTo();
            XAnnotation _annotation = null;
            if (_to!=null) {
              _annotation=_to.getAnnotation();
            }
            boolean _tripleNotEquals_1 = (_annotation != null);
            if (_tripleNotEquals_1) {
              EList<JvmMember> _members_2 = it.getMembers();
              final Procedure1<JvmField> _function_2 = new Procedure1<JvmField>() {
                @Override
                public void apply(final JvmField it) {
                  GuiceModulesJvmModelInferrer.this.builder.addAnnotation(it, binding.getTo().getAnnotation());
                  it.setVisibility(JvmVisibility.PRIVATE);
                }
              };
              JvmField _field_1 = GuiceModulesJvmModelInferrer.this.builder.toField(binding, GuiceModulesJvmModelInferrer.this.syntheticName(binding.getTo()), binding.getTo().getType(), _function_2);
              GuiceModulesJvmModelInferrer.this.builder.<JvmField>operator_add(_members_2, _field_1);
            }
            XAnnotation _annotation_1 = binding.getFrom().getAnnotation();
            boolean _tripleNotEquals_2 = (_annotation_1 != null);
            if (_tripleNotEquals_2) {
              EList<JvmMember> _members_3 = it.getMembers();
              final Procedure1<JvmField> _function_3 = new Procedure1<JvmField>() {
                @Override
                public void apply(final JvmField it) {
                  GuiceModulesJvmModelInferrer.this.builder.addAnnotation(it, binding.getFrom().getAnnotation());
                  it.setVisibility(JvmVisibility.PRIVATE);
                }
              };
              JvmField _field_2 = GuiceModulesJvmModelInferrer.this.builder.toField(binding, GuiceModulesJvmModelInferrer.this.syntheticName(binding.getFrom()), binding.getFrom().getType(), _function_3);
              GuiceModulesJvmModelInferrer.this.builder.<JvmField>operator_add(_members_3, _field_2);
            }
          }
        }
        EList<JvmMember> _members_1 = it.getMembers();
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmFormalParameter _parameter = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "binder", GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Binder.class));
            GuiceModulesJvmModelInferrer.this.builder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("configure(binder, new ");
                _builder.append(HashSet.class);
                _builder.append("<");
                JvmTypeReference _typeRef = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Key.class, GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.wildcard());
                _builder.append(_typeRef);
                _builder.append(">());");
                _builder.newLineIfNotEmpty();
              }
            };
            GuiceModulesJvmModelInferrer.this.builder.setBody(it, _client);
          }
        };
        JvmOperation _method = GuiceModulesJvmModelInferrer.this.builder.toMethod(module, "configure", GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class), _function_1);
        GuiceModulesJvmModelInferrer.this.builder.<JvmOperation>operator_add(_members_1, _method);
        EList<JvmMember> _members_2 = it.getMembers();
        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            GuiceModulesJvmModelInferrer.this.builder.setDocumentation(it, "Registers bindings for keys not present in the given set.");
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmFormalParameter _parameter = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "bind", GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Binder.class));
            GuiceModulesJvmModelInferrer.this.builder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            JvmFormalParameter _parameter_1 = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "usedKeys", GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Set.class, GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Key.class, GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.wildcard())));
            GuiceModulesJvmModelInferrer.this.builder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("try {");
                _builder.newLine();
                {
                  EList<BindingAST> _bindings = module.getBindings();
                  for(final BindingAST b : _bindings) {
                    _builder.append("\t");
                    _builder.append("{");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    JvmTypeReference _typeRef = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Key.class, b.getFrom().getType());
                    _builder.append(_typeRef, "\t\t");
                    _builder.append(" key = ");
                    StringConcatenationClient _guiceKey = GuiceModulesJvmModelInferrer.this.guiceKey(b.getFrom());
                    _builder.append(_guiceKey, "\t\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("if (usedKeys.add(key)) {");
                    _builder.newLine();
                    {
                      XExpression _toInstance = b.getToInstance();
                      boolean _tripleNotEquals = (_toInstance != null);
                      if (_tripleNotEquals) {
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("bind.bind(key).toInstance(");
                        String _syntheticToInstanceName = GuiceModulesJvmModelInferrer.this.syntheticToInstanceName(b);
                        _builder.append(_syntheticToInstanceName, "\t\t\t");
                        _builder.append("());");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("bind.bind(key).to(");
                        StringConcatenationClient _guiceKey_1 = GuiceModulesJvmModelInferrer.this.guiceKey(b.getTo());
                        _builder.append(_guiceKey_1, "\t\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
                {
                  EList<ModuleAST> _mixins = module.getMixins();
                  for(final ModuleAST mix : _mixins) {
                    _builder.append("\t");
                    String _simpleName = GuiceModulesJvmModelInferrer.this.simpleName(mix);
                    _builder.append(_simpleName, "\t");
                    _builder.append(".configure(bind, usedKeys);");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("} catch (");
                _builder.append(Exception.class);
                _builder.append(" e) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("throw new ");
                _builder.append(RuntimeException.class, "\t");
                _builder.append("(e);");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
              }
            };
            GuiceModulesJvmModelInferrer.this.builder.setBody(it, _client);
          }
        };
        JvmOperation _method_1 = GuiceModulesJvmModelInferrer.this.builder.toMethod(module, "configure", GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class), _function_2);
        GuiceModulesJvmModelInferrer.this.builder.<JvmOperation>operator_add(_members_2, _method_1);
      }
    };
    acceptor.<JvmGenericType>accept(this.builder.toClass(module, this._iQualifiedNameProvider.getFullyQualifiedName(module)), _function);
  }
  
  public StringConcatenationClient guiceKey(final KeyAST it) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append(Key.class);
        _builder.append(".get(new ");
        _builder.append(TypeLiteral.class);
        _builder.append("<");
        JvmTypeReference _type = it.getType();
        _builder.append(_type);
        _builder.append(">(){}");
        {
          XAnnotation _annotation = it.getAnnotation();
          boolean _tripleNotEquals = (_annotation != null);
          if (_tripleNotEquals) {
            _builder.append(", getClass().getDeclaredField(\"");
            String _syntheticName = GuiceModulesJvmModelInferrer.this.syntheticName(it);
            _builder.append(_syntheticName);
            _builder.append("\").getAnnotations()[0]");
          }
        }
        _builder.append(")");
      }
    };
    return _client;
  }
  
  public String syntheticName(final KeyAST b) {
    final EObject binding = b.eContainer();
    String _name = b.eContainingFeature().getName();
    String _plus = ("_" + _name);
    int _indexOf = binding.eContainer().eContents().indexOf(binding);
    return (_plus + Integer.valueOf(_indexOf));
  }
  
  public String syntheticToInstanceName(final BindingAST binding) {
    int _indexOf = binding.eContainer().eContents().indexOf(binding);
    return ("_toInstance" + Integer.valueOf(_indexOf));
  }
  
  public String simpleName(final ModuleAST module) {
    return StringExtensions.toFirstLower(IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(module.getName().split("\\.")))));
  }
  
  public void infer(final EObject module, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    if (module instanceof ModuleAST) {
      _infer((ModuleAST)module, acceptor, preIndexingPhase);
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
