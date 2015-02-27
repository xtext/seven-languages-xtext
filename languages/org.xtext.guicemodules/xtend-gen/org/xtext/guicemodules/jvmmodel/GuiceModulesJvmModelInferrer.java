/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.guicemodules.jvmmodel;

import com.google.common.base.Objects;
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
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
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(module);
    JvmGenericType _class = this.builder.toClass(module, _fullyQualifiedName);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        String _documentation = GuiceModulesJvmModelInferrer.this.builder.getDocumentation(module);
        GuiceModulesJvmModelInferrer.this.builder.setDocumentation(it, _documentation);
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeRef = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Module.class);
        GuiceModulesJvmModelInferrer.this.builder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
        EList<ModuleAST> _mixins = module.getMixins();
        for (final ModuleAST mixin : _mixins) {
          boolean _eIsProxy = mixin.eIsProxy();
          boolean _not = (!_eIsProxy);
          if (_not) {
            EList<JvmMember> _members = it.getMembers();
            String _simpleName = GuiceModulesJvmModelInferrer.this.simpleName(mixin);
            QualifiedName _fullyQualifiedName = GuiceModulesJvmModelInferrer.this._iQualifiedNameProvider.getFullyQualifiedName(mixin);
            String _string = _fullyQualifiedName.toString();
            JvmTypeReference _typeRef_1 = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(_string);
            final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
              @Override
              public void apply(final JvmField it) {
                StringConcatenationClient _client = new StringConcatenationClient() {
                  @Override
                  protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                    _builder.append("new ");
                    String _name = mixin.getName();
                    _builder.append(_name, "");
                    _builder.append("()");
                  }
                };
                GuiceModulesJvmModelInferrer.this.builder.setInitializer(it, _client);
              }
            };
            JvmField _field = GuiceModulesJvmModelInferrer.this.builder.toField(mixin, _simpleName, _typeRef_1, _function);
            GuiceModulesJvmModelInferrer.this.builder.<JvmField>operator_add(_members, _field);
          }
        }
        EList<BindingAST> _bindings = module.getBindings();
        for (final BindingAST binding : _bindings) {
          {
            XExpression _toInstance = binding.getToInstance();
            boolean _notEquals = (!Objects.equal(_toInstance, null));
            if (_notEquals) {
              EList<JvmMember> _members_1 = it.getMembers();
              String _syntheticToInstanceName = GuiceModulesJvmModelInferrer.this.syntheticToInstanceName(binding);
              KeyAST _from = binding.getFrom();
              JvmTypeReference _type = _from.getType();
              final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
                @Override
                public void apply(final JvmOperation it) {
                  it.setVisibility(JvmVisibility.PRIVATE);
                  XExpression _toInstance = binding.getToInstance();
                  GuiceModulesJvmModelInferrer.this.builder.setBody(it, _toInstance);
                }
              };
              JvmOperation _method = GuiceModulesJvmModelInferrer.this.builder.toMethod(binding, _syntheticToInstanceName, _type, _function_1);
              GuiceModulesJvmModelInferrer.this.builder.<JvmOperation>operator_add(_members_1, _method);
            }
            KeyAST _to = binding.getTo();
            XAnnotation _annotation = null;
            if (_to!=null) {
              _annotation=_to.getAnnotation();
            }
            boolean _notEquals_1 = (!Objects.equal(_annotation, null));
            if (_notEquals_1) {
              EList<JvmMember> _members_2 = it.getMembers();
              KeyAST _to_1 = binding.getTo();
              String _syntheticName = GuiceModulesJvmModelInferrer.this.syntheticName(_to_1);
              KeyAST _to_2 = binding.getTo();
              JvmTypeReference _type_1 = _to_2.getType();
              final Procedure1<JvmField> _function_2 = new Procedure1<JvmField>() {
                @Override
                public void apply(final JvmField it) {
                  KeyAST _to = binding.getTo();
                  XAnnotation _annotation = _to.getAnnotation();
                  GuiceModulesJvmModelInferrer.this.builder.addAnnotation(it, _annotation);
                  it.setVisibility(JvmVisibility.PRIVATE);
                }
              };
              JvmField _field_1 = GuiceModulesJvmModelInferrer.this.builder.toField(binding, _syntheticName, _type_1, _function_2);
              GuiceModulesJvmModelInferrer.this.builder.<JvmField>operator_add(_members_2, _field_1);
            }
            KeyAST _from_1 = binding.getFrom();
            XAnnotation _annotation_1 = _from_1.getAnnotation();
            boolean _notEquals_2 = (!Objects.equal(_annotation_1, null));
            if (_notEquals_2) {
              EList<JvmMember> _members_3 = it.getMembers();
              KeyAST _from_2 = binding.getFrom();
              String _syntheticName_1 = GuiceModulesJvmModelInferrer.this.syntheticName(_from_2);
              KeyAST _from_3 = binding.getFrom();
              JvmTypeReference _type_2 = _from_3.getType();
              final Procedure1<JvmField> _function_3 = new Procedure1<JvmField>() {
                @Override
                public void apply(final JvmField it) {
                  KeyAST _from = binding.getFrom();
                  XAnnotation _annotation = _from.getAnnotation();
                  GuiceModulesJvmModelInferrer.this.builder.addAnnotation(it, _annotation);
                  it.setVisibility(JvmVisibility.PRIVATE);
                }
              };
              JvmField _field_2 = GuiceModulesJvmModelInferrer.this.builder.toField(binding, _syntheticName_1, _type_2, _function_3);
              GuiceModulesJvmModelInferrer.this.builder.<JvmField>operator_add(_members_3, _field_2);
            }
          }
        }
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _typeRef_2 = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Binder.class);
            JvmFormalParameter _parameter = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "binder", _typeRef);
            GuiceModulesJvmModelInferrer.this.builder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("configure(binder, new ");
                _builder.append(HashSet.class, "");
                _builder.append("<");
                JvmTypeReference _wildcard = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.wildcard();
                JvmTypeReference _typeRef = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Key.class, _wildcard);
                _builder.append(_typeRef, "");
                _builder.append(">());");
                _builder.newLineIfNotEmpty();
              }
            };
            GuiceModulesJvmModelInferrer.this.builder.setBody(it, _client);
          }
        };
        JvmOperation _method = GuiceModulesJvmModelInferrer.this.builder.toMethod(module, "configure", _typeRef_2, _function_1);
        GuiceModulesJvmModelInferrer.this.builder.<JvmOperation>operator_add(_members_1, _method);
        EList<JvmMember> _members_2 = it.getMembers();
        JvmTypeReference _typeRef_3 = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            GuiceModulesJvmModelInferrer.this.builder.setDocumentation(it, "Registers bindings for keys not present in the given set.");
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Binder.class);
            JvmFormalParameter _parameter = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "bind", _typeRef);
            GuiceModulesJvmModelInferrer.this.builder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            JvmTypeReference _wildcard = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.wildcard();
            JvmTypeReference _typeRef_1 = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Key.class, _wildcard);
            JvmTypeReference _typeRef_2 = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Set.class, _typeRef_1);
            JvmFormalParameter _parameter_1 = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "usedKeys", _typeRef_2);
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
                    KeyAST _from = b.getFrom();
                    JvmTypeReference _type = _from.getType();
                    JvmTypeReference _typeRef = GuiceModulesJvmModelInferrer.this._typeReferenceBuilder.typeRef(Key.class, _type);
                    _builder.append(_typeRef, "\t\t");
                    _builder.append(" key = ");
                    KeyAST _from_1 = b.getFrom();
                    StringConcatenationClient _guiceKey = GuiceModulesJvmModelInferrer.this.guiceKey(_from_1);
                    _builder.append(_guiceKey, "\t\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("if (usedKeys.add(key)) {");
                    _builder.newLine();
                    {
                      XExpression _toInstance = b.getToInstance();
                      boolean _notEquals = (!Objects.equal(_toInstance, null));
                      if (_notEquals) {
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
                        KeyAST _to = b.getTo();
                        StringConcatenationClient _guiceKey_1 = GuiceModulesJvmModelInferrer.this.guiceKey(_to);
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
                _builder.append(Exception.class, "");
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
        JvmOperation _method_1 = GuiceModulesJvmModelInferrer.this.builder.toMethod(module, "configure", _typeRef_3, _function_2);
        GuiceModulesJvmModelInferrer.this.builder.<JvmOperation>operator_add(_members_2, _method_1);
      }
    };
    acceptor.<JvmGenericType>accept(_class, _function);
  }
  
  public StringConcatenationClient guiceKey(final KeyAST it) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append(Key.class, "");
        _builder.append(".get(new ");
        _builder.append(TypeLiteral.class, "");
        _builder.append("<");
        JvmTypeReference _type = it.getType();
        _builder.append(_type, "");
        _builder.append(">(){}");
        {
          XAnnotation _annotation = it.getAnnotation();
          boolean _notEquals = (!Objects.equal(_annotation, null));
          if (_notEquals) {
            _builder.append(", getClass().getDeclaredField(\"");
            String _syntheticName = GuiceModulesJvmModelInferrer.this.syntheticName(it);
            _builder.append(_syntheticName, "");
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
    EStructuralFeature _eContainingFeature = b.eContainingFeature();
    String _name = _eContainingFeature.getName();
    String _plus = ("_" + _name);
    EObject _eContainer = binding.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    int _indexOf = _eContents.indexOf(binding);
    return (_plus + Integer.valueOf(_indexOf));
  }
  
  public String syntheticToInstanceName(final BindingAST binding) {
    EObject _eContainer = binding.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    int _indexOf = _eContents.indexOf(binding);
    return ("_toInstance" + Integer.valueOf(_indexOf));
  }
  
  public String simpleName(final ModuleAST module) {
    String _name = module.getName();
    String[] _split = _name.split("\\.");
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
    return StringExtensions.toFirstLower(_last);
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
