package org.xtext.guicemodules.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.guicemodules.guiceModules.Binding;
import org.xtext.guicemodules.guiceModules.Key;
import org.xtext.guicemodules.guiceModules.Module;
import org.xtext.guicemodules.jvmmodel.CodeGenerationContext;
import org.xtext.guicemodules.jvmmodel.ModelInferrer;

@SuppressWarnings("all")
public class GuiceModulesJvmModelInferrer extends ModelInferrer {
  @Inject
  private JvmTypesBuilder builder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  protected void _infer(final Module module, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    JvmTypeReference _type = this.type(module, "com.google.inject.Key");
    boolean _equals = Objects.equal(_type, null);
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
          JvmTypeReference _type = GuiceModulesJvmModelInferrer.this.type(module, "com.google.inject.Module");
          GuiceModulesJvmModelInferrer.this.builder.<JvmTypeReference>operator_add(_superTypes, _type);
          EList<Module> _mixins = module.getMixins();
          for (final Module mixin : _mixins) {
            EList<JvmMember> _members = it.getMembers();
            String _name = mixin.getName();
            String _firstLower = StringExtensions.toFirstLower(_name);
            QualifiedName _fullyQualifiedName = GuiceModulesJvmModelInferrer.this._iQualifiedNameProvider.getFullyQualifiedName(mixin);
            String _string = _fullyQualifiedName.toString();
            JvmTypeReference _type_1 = GuiceModulesJvmModelInferrer.this.type(it, _string);
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
            JvmField _field = GuiceModulesJvmModelInferrer.this.builder.toField(module, _firstLower, _type_1, _function);
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
              Key _from = binding.getFrom();
              JvmTypeReference _type_2 = _from.getType();
              final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    it.setVisibility(JvmVisibility.PRIVATE);
                    XExpression _toInstance = binding.getToInstance();
                    GuiceModulesJvmModelInferrer.this.builder.setBody(it, _toInstance);
                  }
                };
              JvmOperation _method = GuiceModulesJvmModelInferrer.this.builder.toMethod(binding, name, _type_2, _function_2);
              GuiceModulesJvmModelInferrer.this.builder.<JvmOperation>operator_add(_members_1, _method);
            }
          }
          EList<JvmMember> _members_1 = it.getMembers();
          JvmTypeReference _type_2 = GuiceModulesJvmModelInferrer.this.type(module, "void");
          final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmTypeReference _type = GuiceModulesJvmModelInferrer.this.type(module, "com.google.inject.Binder");
                JvmFormalParameter _parameter = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "binder", _type);
                GuiceModulesJvmModelInferrer.this.builder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                final Function1<CodeGenerationContext,String> _function = new Function1<CodeGenerationContext,String>() {
                    public String apply(final CodeGenerationContext it) {
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("configure(binder, new java.util.HashSet<com.google.inject.Key<?>>());");
                      _builder.newLine();
                      return _builder.toString();
                    }
                  };
                GuiceModulesJvmModelInferrer.this.body(it, _function);
              }
            };
          JvmOperation _method = GuiceModulesJvmModelInferrer.this.builder.toMethod(module, "configure", _type_2, _function_2);
          GuiceModulesJvmModelInferrer.this.builder.<JvmOperation>operator_add(_members_1, _method);
          EList<JvmMember> _members_2 = it.getMembers();
          JvmTypeReference _type_3 = GuiceModulesJvmModelInferrer.this.type(module, "void");
          final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                Pair<String,String> _mappedTo = Pair.<String, String>of("com.google.inject.Binder", "bind");
                GuiceModulesJvmModelInferrer.this.parameters(it, _mappedTo);
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmTypeReference _type = GuiceModulesJvmModelInferrer.this.type(module, "com.google.inject.Binder");
                JvmFormalParameter _parameter = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "bind", _type);
                GuiceModulesJvmModelInferrer.this.builder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                JvmWildcardTypeReference _wildcard = GuiceModulesJvmModelInferrer.this.wildcard();
                JvmTypeReference _type_1 = GuiceModulesJvmModelInferrer.this.type(module, "com.google.inject.Key", _wildcard);
                JvmTypeReference _type_2 = GuiceModulesJvmModelInferrer.this.type(module, "java.util.Set", _type_1);
                JvmFormalParameter _parameter_1 = GuiceModulesJvmModelInferrer.this.builder.toParameter(module, "usedKeys", _type_2);
                GuiceModulesJvmModelInferrer.this.builder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                final Function1<CodeGenerationContext,String> _function = new Function1<CodeGenerationContext,String>() {
                    public String apply(final CodeGenerationContext it) {
                      StringConcatenation _builder = new StringConcatenation();
                      {
                        EList<Binding> _bindings = module.getBindings();
                        for(final Binding b : _bindings) {
                          Key _from = b.getFrom();
                          JvmTypeReference _type = _from.getType();
                          JvmTypeReference _type_1 = it.type("com.google.inject.Key", _type);
                          String __ = it._(_type_1);
                          _builder.append(__, "");
                          _builder.append("> key = ");
                          _builder.newLineIfNotEmpty();
                          _builder.append("  ");
                          String ___1 = it._("com.google.inject.Key");
                          _builder.append(___1, "  ");
                          _builder.append(".get(new ");
                          Key _from_1 = b.getFrom();
                          JvmTypeReference _type_2 = _from_1.getType();
                          JvmTypeReference _type_3 = it.type("com.google.inject.TypeLiteral", _type_2);
                          String ___2 = it._(_type_3);
                          _builder.append(___2, "  ");
                          _builder.append("(){});");
                          _builder.newLineIfNotEmpty();
                          _builder.append("if (usedKeys.add(key)) {");
                          _builder.newLine();
                          {
                            XExpression _toInstance = b.getToInstance();
                            boolean _notEquals = (!Objects.equal(_toInstance, null));
                            if (_notEquals) {
                              _builder.append("  ");
                              _builder.append("bind.bind(key).toInstance(");
                              String _get = methods.get(b);
                              _builder.append(_get, "  ");
                              _builder.append("());");
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("  ");
                              _builder.append("bind.bind(key).to(");
                              String ___3 = it._("com.google.inject.Key");
                              _builder.append(___3, "  ");
                              _builder.append(".get(new <");
                              Key _to = b.getTo();
                              JvmTypeReference _type_4 = _to.getType();
                              JvmTypeReference _type_5 = it.type("com.google.inject.TypeLiteral", _type_4);
                              String ___4 = it._(_type_5);
                              _builder.append(___4, "  ");
                              _builder.append("(){}));");
                              _builder.newLineIfNotEmpty();
                            }
                          }
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
                      return _builder.toString();
                    }
                  };
                GuiceModulesJvmModelInferrer.this.body(it, _function);
              }
            };
          JvmOperation _method_1 = GuiceModulesJvmModelInferrer.this.builder.toMethod(module, "configure", _type_3, _function_3);
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
