package org.xtext.builddsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.xtext.builddsl.TaskExtensions;
import org.xtext.builddsl.build.BuildFile;
import org.xtext.builddsl.build.Declaration;
import org.xtext.builddsl.build.Parameter;
import org.xtext.builddsl.build.Task;
import org.xtext.builddsl.lib.BuildScript;

/**
 * Infers a Java class from a {@link BuildFile} allowing to execute it.
 */
@SuppressWarnings("all")
public class BuildDSLJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private ITypeProvider typeProvider;
  
  @Inject
  private TypeReferenceSerializer _typeReferenceSerializer;
  
  protected void _infer(final BuildFile file, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final String fqn = TaskExtensions.getJavaClassName(file);
    final String scriptName = Strings.lastToken(fqn, ".");
    JvmGenericType _class = this._jvmTypesBuilder.toClass(file, fqn);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmTypeReference _newTypeRef = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(file, BuildScript.class);
          BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
          Iterable<Task> _tasks = BuildDSLJvmModelInferrer.this.getTasks(file);
          final Function1<Task,String> _function = new Function1<Task,String>() {
              public String apply(final Task it) {
                String _name = it.getName();
                return _name;
              }
            };
          final List<Task> tasks = IterableExtensions.<Task, String>sortBy(_tasks, _function);
          Iterable<Parameter> _parameters = BuildDSLJvmModelInferrer.this.getParameters(file);
          final Function1<Parameter,String> _function_1 = new Function1<Parameter,String>() {
              public String apply(final Parameter it) {
                String _name = it.getName();
                return _name;
              }
            };
          final List<Parameter> declaredParameters = IterableExtensions.<Parameter, String>sortBy(_parameters, _function_1);
          for (final Parameter declaredParameter : declaredParameters) {
            {
              JvmTypeReference _type = declaredParameter.getType();
              XExpression _init = declaredParameter.getInit();
              JvmTypeReference _type_1 = BuildDSLJvmModelInferrer.this.typeProvider.getType(_init);
              final JvmTypeReference type = ObjectExtensions.<JvmTypeReference>operator_elvis(_type, _type_1);
              EList<JvmMember> _members = it.getMembers();
              String _name = declaredParameter.getName();
              final Procedure1<JvmField> _function_2 = new Procedure1<JvmField>() {
                  public void apply(final JvmField it) {
                    it.setVisibility(JvmVisibility.PUBLIC);
                    XExpression _init = declaredParameter.getInit();
                    boolean _notEquals = (!Objects.equal(_init, null));
                    if (_notEquals) {
                      XExpression _init_1 = declaredParameter.getInit();
                      BuildDSLJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _init_1);
                    }
                  }
                };
              JvmField _field = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toField(declaredParameter, _name, type, _function_2);
              BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
            }
          }
          JvmTypeReference _newTypeRef_1 = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(file, String.class);
          final JvmTypeReference stringArray = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_newTypeRef_1);
          JvmTypeReference _newTypeRef_2 = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(file, String.class);
          final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      ITreeAppendable _append = it.append("return \"");
                      ITreeAppendable _append_1 = _append.append(scriptName);
                      _append_1.append("\";");
                    }
                  };
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          BuildDSLJvmModelInferrer.this.overrideMethod(it, "getScriptName", _newTypeRef_2, file, _function_2);
          final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      it.append("return new String[] {");
                      boolean _isEmpty = declaredParameters.isEmpty();
                      boolean _not = (!_isEmpty);
                      if (_not) {
                        ITreeAppendable _increaseIndentation = it.increaseIndentation();
                        _increaseIndentation.newLine();
                        final Function1<Parameter,String> _function = new Function1<Parameter,String>() {
                            public String apply(final Parameter it) {
                              String _name = it.getName();
                              String _plus = ("\"" + _name);
                              String _plus_1 = (_plus + "\"");
                              return _plus_1;
                            }
                          };
                        List<String> _map = ListExtensions.<Parameter, String>map(declaredParameters, _function);
                        String _join = IterableExtensions.join(_map, ", ");
                        it.append(_join);
                        ITreeAppendable _decreaseIndentation = it.decreaseIndentation();
                        _decreaseIndentation.newLine();
                      }
                      it.append("};");
                    }
                  };
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          BuildDSLJvmModelInferrer.this.overrideMethod(it, "getParameterNames", stringArray, file, _function_3);
          final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      it.append("return new String[] {");
                      boolean _isEmpty = tasks.isEmpty();
                      boolean _not = (!_isEmpty);
                      if (_not) {
                        ITreeAppendable _increaseIndentation = it.increaseIndentation();
                        _increaseIndentation.newLine();
                        final Function1<Task,String> _function = new Function1<Task,String>() {
                            public String apply(final Task it) {
                              String _name = it.getName();
                              String _plus = ("\"" + _name);
                              String _plus_1 = (_plus + "\"");
                              return _plus_1;
                            }
                          };
                        List<String> _map = ListExtensions.<Task, String>map(tasks, _function);
                        String _join = IterableExtensions.join(_map, ", ");
                        it.append(_join);
                        ITreeAppendable _decreaseIndentation = it.decreaseIndentation();
                        _decreaseIndentation.newLine();
                      }
                      it.append("};");
                    }
                  };
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          BuildDSLJvmModelInferrer.this.overrideMethod(it, "getTaskNames", stringArray, file, _function_4);
          EList<JvmMember> _members = it.getMembers();
          JvmTypeReference _newTypeRef_3 = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(file, Void.TYPE);
          final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmFormalParameter _parameter = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toParameter(it, "args", stringArray);
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                it.setStatic(true);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      ITreeAppendable _append = it.append(scriptName);
                      ITreeAppendable _append_1 = _append.append(" script = new ");
                      ITreeAppendable _append_2 = _append_1.append(scriptName);
                      ITreeAppendable _append_3 = _append_2.append("();");
                      _append_3.newLine();
                      ITreeAppendable _append_4 = it.append("if (script.showHelp(args)) {");
                      ITreeAppendable _increaseIndentation = _append_4.increaseIndentation();
                      _increaseIndentation.newLine();
                      ITreeAppendable _append_5 = it.append("System.exit(HELP);");
                      ITreeAppendable _decreaseIndentation = _append_5.decreaseIndentation();
                      _decreaseIndentation.newLine();
                      ITreeAppendable _append_6 = it.append("}");
                      _append_6.newLine();
                      it.append("System.exit(script.build(args));");
                    }
                  };
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toMethod(file, "main", _newTypeRef_3, _function_5);
          BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
          JvmTypeReference _newTypeRef_4 = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(file, Integer.TYPE);
          final Procedure1<JvmOperation> _function_6 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmFormalParameter _parameter = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toParameter(it, "args", stringArray);
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                EList<JvmTypeReference> _exceptions = it.getExceptions();
                JvmTypeReference _newTypeRef = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(file, Throwable.class);
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _newTypeRef);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      JvmTypeReference _newTypeRef = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(file, String.class);
                      JvmTypeReference _newTypeRef_1 = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(file, Set.class, _newTypeRef);
                      BuildDSLJvmModelInferrer.this._typeReferenceSerializer.serialize(_newTypeRef_1, file, it);
                      it.append(" tasks = ");
                      JvmTypeReference _newTypeRef_2 = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(file, Sets.class);
                      BuildDSLJvmModelInferrer.this._typeReferenceSerializer.serialize(_newTypeRef_2, file, it);
                      ITreeAppendable _append = it.append(".newLinkedHashSet();");
                      _append.newLine();
                      ITreeAppendable _append_1 = it.append("int index = 0;");
                      _append_1.newLine();
                      ITreeAppendable _append_2 = it.append("while(index < args.length) {");
                      ITreeAppendable _increaseIndentation = _append_2.increaseIndentation();
                      _increaseIndentation.newLine();
                      EList<Declaration> _declarations = file.getDeclarations();
                      for (final Declaration dec : _declarations) {
                        {
                          EList<Declaration> _declarations_1 = file.getDeclarations();
                          Declaration _head = IterableExtensions.<Declaration>head(_declarations_1);
                          boolean _notEquals = (!Objects.equal(dec, _head));
                          if (_notEquals) {
                            it.append(" else ");
                          }
                          boolean _matched = false;
                          if (!_matched) {
                            if (dec instanceof Parameter) {
                              final Parameter _parameter = (Parameter)dec;
                              _matched=true;
                              StringConcatenation _builder = new StringConcatenation();
                              _builder.append("if(\"--");
                              String _name = _parameter.getName();
                              _builder.append(_name, "");
                              _builder.append("\".equals(args[index])) {");
                              ITreeAppendable _append_3 = it.append(_builder);
                              ITreeAppendable _increaseIndentation_1 = _append_3.increaseIndentation();
                              _increaseIndentation_1.newLine();
                              StringConcatenation _builder_1 = new StringConcatenation();
                              String _name_1 = _parameter.getName();
                              _builder_1.append(_name_1, "");
                              _builder_1.append(" = ");
                              it.append(_builder_1);
                              JvmTypeReference _type = _parameter.getType();
                              XExpression _init = _parameter.getInit();
                              JvmTypeReference _type_1 = BuildDSLJvmModelInferrer.this.typeProvider.getType(_init);
                              final JvmTypeReference type = ObjectExtensions.<JvmTypeReference>operator_elvis(_type, _type_1);
                              BuildDSLJvmModelInferrer.this.paramToStr(it, type, "args[++index]");
                              it.append(";");
                              ITreeAppendable _decreaseIndentation = it.decreaseIndentation();
                              ITreeAppendable _newLine = _decreaseIndentation.newLine();
                              _newLine.append("}");
                            }
                          }
                          if (!_matched) {
                            if (dec instanceof Task) {
                              final Task _task = (Task)dec;
                              _matched=true;
                              StringConcatenation _builder = new StringConcatenation();
                              _builder.append("if(\"");
                              String _name = _task.getName();
                              _builder.append(_name, "");
                              _builder.append("\".equals(args[index])) {");
                              ITreeAppendable _append_3 = it.append(_builder);
                              _append_3.increaseIndentation();
                              Collection<Task> _findDependentTasks = TaskExtensions.findDependentTasks(_task);
                              for (final Task t : _findDependentTasks) {
                                ITreeAppendable _newLine = it.newLine();
                                StringConcatenation _builder_1 = new StringConcatenation();
                                _builder_1.append("tasks.add(\"");
                                String _name_1 = t.getName();
                                _builder_1.append(_name_1, "");
                                _builder_1.append("\");");
                                _newLine.append(_builder_1);
                              }
                              ITreeAppendable _decreaseIndentation = it.decreaseIndentation();
                              ITreeAppendable _newLine_1 = _decreaseIndentation.newLine();
                              _newLine_1.append("}");
                            }
                          }
                        }
                      }
                      ITreeAppendable _append_3 = it.append(" else {");
                      ITreeAppendable _increaseIndentation_1 = _append_3.increaseIndentation();
                      _increaseIndentation_1.newLine();
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("System.out.println(\"Unknown task/parameter \'\" + args[index] + \"\'. Run program with --help to list available tasks/parameters\");");
                      ITreeAppendable _append_4 = it.append(_builder);
                      _append_4.newLine();
                      StringConcatenation _builder_1 = new StringConcatenation();
                      _builder_1.append("return WRONG_PARAM;");
                      it.append(_builder_1);
                      ITreeAppendable _decreaseIndentation = it.decreaseIndentation();
                      ITreeAppendable _newLine = _decreaseIndentation.newLine();
                      _newLine.append("}");
                      ITreeAppendable _newLine_1 = it.newLine();
                      _newLine_1.append("index++;");
                      ITreeAppendable _decreaseIndentation_1 = it.decreaseIndentation();
                      ITreeAppendable _newLine_2 = _decreaseIndentation_1.newLine();
                      ITreeAppendable _append_5 = _newLine_2.append("}");
                      _append_5.newLine();
                      ITreeAppendable _append_6 = it.append("for(String task:tasks) {");
                      ITreeAppendable _increaseIndentation_2 = _append_6.increaseIndentation();
                      _increaseIndentation_2.newLine();
                      for (final Task dec_1 : tasks) {
                        {
                          Task _head = IterableExtensions.<Task>head(tasks);
                          boolean _notEquals = (!Objects.equal(dec_1, _head));
                          if (_notEquals) {
                            ITreeAppendable _newLine_3 = it.newLine();
                            _newLine_3.append("else ");
                          }
                          StringConcatenation _builder_2 = new StringConcatenation();
                          _builder_2.append("if(\"");
                          String _name = dec_1.getName();
                          _builder_2.append(_name, "");
                          _builder_2.append("\".equals(task))");
                          ITreeAppendable _append_7 = it.append(_builder_2);
                          ITreeAppendable _increaseIndentation_3 = _append_7.increaseIndentation();
                          _increaseIndentation_3.newLine();
                          StringConcatenation _builder_3 = new StringConcatenation();
                          String _methodName = BuildDSLJvmModelInferrer.this.getMethodName(dec_1);
                          _builder_3.append(_methodName, "");
                          _builder_3.append("();");
                          it.append(_builder_3);
                          it.decreaseIndentation();
                        }
                      }
                      ITreeAppendable _newLine_3 = it.newLine();
                      _newLine_3.append("index++;");
                      ITreeAppendable _decreaseIndentation_2 = it.decreaseIndentation();
                      ITreeAppendable _newLine_4 = _decreaseIndentation_2.newLine();
                      _newLine_4.append("}");
                      it.append("return OK;");
                    }
                  };
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          BuildDSLJvmModelInferrer.this.overrideMethod(it, "doBuild", _newTypeRef_4, file, _function_6);
          for (final Task task : tasks) {
            {
              EList<JvmMember> _members_1 = it.getMembers();
              String _methodName = BuildDSLJvmModelInferrer.this.getMethodName(task);
              JvmTypeReference _newTypeRef_5 = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(task, Void.TYPE);
              final Procedure1<JvmOperation> _function_7 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    it.setVisibility(JvmVisibility.PROTECTED);
                    EList<JvmTypeReference> _exceptions = it.getExceptions();
                    JvmTypeReference _newTypeRef = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(task, Throwable.class);
                    BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _newTypeRef);
                    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                        public void apply(final ITreeAppendable it) {
                          ITreeAppendable _append = it.append("try {");
                          ITreeAppendable _increaseIndentation = _append.increaseIndentation();
                          _increaseIndentation.newLine();
                          StringConcatenation _builder = new StringConcatenation();
                          _builder.append("System.out.println(\"running ");
                          String _name = task.getName();
                          _builder.append(_name, "");
                          _builder.append("...\");");
                          ITreeAppendable _append_1 = it.append(_builder);
                          _append_1.newLine();
                          String _methodNameImpl = BuildDSLJvmModelInferrer.this.getMethodNameImpl(task);
                          ITreeAppendable _append_2 = it.append(_methodNameImpl);
                          ITreeAppendable _append_3 = _append_2.append("();");
                          _append_3.newLine();
                          it.append("System.out.println(\"success\");");
                          ITreeAppendable _decreaseIndentation = it.decreaseIndentation();
                          ITreeAppendable _newLine = _decreaseIndentation.newLine();
                          _newLine.append("} catch(");
                          JvmTypeReference _newTypeRef = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(file, Throwable.class);
                          BuildDSLJvmModelInferrer.this._typeReferenceSerializer.serialize(_newTypeRef, file, it);
                          ITreeAppendable _append_4 = it.append(" throwable) {");
                          ITreeAppendable _increaseIndentation_1 = _append_4.increaseIndentation();
                          _increaseIndentation_1.newLine();
                          ITreeAppendable _append_5 = it.append("System.err.println(throwable.getMessage());");
                          _append_5.newLine();
                          it.append("throw throwable;");
                          ITreeAppendable _decreaseIndentation_1 = it.decreaseIndentation();
                          ITreeAppendable _newLine_1 = _decreaseIndentation_1.newLine();
                          _newLine_1.append("}");
                        }
                      };
                    BuildDSLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                  }
                };
              JvmOperation _method_1 = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toMethod(task, _methodName, _newTypeRef_5, _function_7);
              BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
              EList<JvmMember> _members_2 = it.getMembers();
              String _methodNameImpl = BuildDSLJvmModelInferrer.this.getMethodNameImpl(task);
              JvmTypeReference _newTypeRef_6 = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(task, Void.TYPE);
              final Procedure1<JvmOperation> _function_8 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    EList<JvmTypeReference> _exceptions = it.getExceptions();
                    JvmTypeReference _newTypeRef = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(task, Throwable.class);
                    BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _newTypeRef);
                    it.setVisibility(JvmVisibility.PROTECTED);
                    XExpression _action = task.getAction();
                    BuildDSLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _action);
                  }
                };
              JvmOperation _method_2 = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toMethod(task, _methodNameImpl, _newTypeRef_6, _function_8);
              BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_2);
            }
          }
        }
      };
    _accept.initializeLater(_function);
  }
  
  private boolean overrideMethod(final JvmDeclaredType it, final String name, final JvmTypeReference returnType, final BuildFile context, final Procedure1<? super JvmOperation> init) {
    EList<JvmMember> _members = it.getMembers();
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          it.setVisibility(JvmVisibility.PROTECTED);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _annotation = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(context, Override.class);
          BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
          init.apply(it);
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(it, name, returnType, _function);
    boolean _add = this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    return _add;
  }
  
  private Iterable<Task> getTasks(final BuildFile it) {
    EList<Declaration> _declarations = it.getDeclarations();
    Iterable<Task> _filter = Iterables.<Task>filter(_declarations, Task.class);
    return _filter;
  }
  
  private Iterable<Parameter> getParameters(final BuildFile it) {
    EList<Declaration> _declarations = it.getDeclarations();
    Iterable<Parameter> _filter = Iterables.<Parameter>filter(_declarations, Parameter.class);
    return _filter;
  }
  
  private String getMethodName(final Task it) {
    String _name = it.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    return _firstLower;
  }
  
  private String getMethodNameImpl(final Task it) {
    String _methodName = this.getMethodName(it);
    String _plus = ("_" + _methodName);
    String _plus_1 = (_plus + "Impl");
    return _plus_1;
  }
  
  private ITreeAppendable paramToStr(final ITreeAppendable out, final JvmTypeReference type, final String name) {
    ITreeAppendable _switchResult = null;
    String _qualifiedName = type.getQualifiedName();
    final String _switchValue = _qualifiedName;
    boolean _matched = false;
    if (!_matched) {
      String _name = String.class.getName();
      if (Objects.equal(_switchValue,_name)) {
        _matched=true;
        ITreeAppendable _append = out.append(name);
        _switchResult = _append;
      }
    }
    if (!_matched) {
      String _name_1 = File.class.getName();
      if (Objects.equal(_switchValue,_name_1)) {
        _matched=true;
        ITreeAppendable _xblockexpression = null;
        {
          out.append("new ");
          JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(type, File.class);
          this._typeReferenceSerializer.serialize(_newTypeRef, type, out);
          ITreeAppendable _append_1 = out.append("(");
          ITreeAppendable _append_2 = _append_1.append(name);
          ITreeAppendable _append_3 = _append_2.append(")");
          _xblockexpression = (_append_3);
        }
        _switchResult = _xblockexpression;
      }
    }
    return _switchResult;
  }
  
  public void infer(final EObject file, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (file instanceof BuildFile) {
      _infer((BuildFile)file, acceptor, isPreIndexingPhase);
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
