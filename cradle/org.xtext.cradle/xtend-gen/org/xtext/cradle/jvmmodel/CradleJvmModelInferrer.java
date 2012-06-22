package org.xtext.cradle.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.xtext.cradle.TaskExtensions;
import org.xtext.cradle.cradle.CradleFile;
import org.xtext.cradle.cradle.Declaration;
import org.xtext.cradle.cradle.Parameter;
import org.xtext.cradle.cradle.Task;

@SuppressWarnings("all")
public class CradleJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private ITypeProvider typeProvider;
  
  @Inject
  private TypeReferenceSerializer _typeReferenceSerializer;
  
  @Inject
  private TypeReferences _typeReferences;
  
  protected void _infer(final CradleFile element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final String name = this.getJavaClassName(element);
    String _plus = ("cradle." + name);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _plus);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
              public void apply(final JvmGenericType it) {
                it.setStatic(true);
                EList<JvmMember> _members = it.getMembers();
                final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
                    public void apply(final JvmConstructor it) {
                    }
                  };
                JvmConstructor _constructor = CradleJvmModelInferrer.this._jvmTypesBuilder.toConstructor(element, _function);
                CradleJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
                EList<Declaration> _declarations = element.getDeclarations();
                Iterable<Parameter> _filter = Iterables.<Parameter>filter(_declarations, Parameter.class);
                for (final Parameter param : _filter) {
                  {
                    JvmTypeReference _type = param.getType();
                    XExpression _init = param.getInit();
                    JvmTypeReference _type_1 = CradleJvmModelInferrer.this.typeProvider.getType(_init);
                    final JvmTypeReference type = ObjectExtensions.<JvmTypeReference>operator_elvis(_type, _type_1);
                    EList<JvmMember> _members_1 = it.getMembers();
                    String _name = param.getName();
                    final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
                        public void apply(final JvmField it) {
                          it.setVisibility(JvmVisibility.PUBLIC);
                          XExpression _init = param.getInit();
                          boolean _notEquals = (!Objects.equal(_init, null));
                          if (_notEquals) {
                            XExpression _init_1 = param.getInit();
                            CradleJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _init_1);
                          }
                        }
                      };
                    JvmField _field = CradleJvmModelInferrer.this._jvmTypesBuilder.toField(param, _name, type, _function_1);
                    CradleJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field);
                  }
                }
              }
            };
          final JvmGenericType data = CradleJvmModelInferrer.this._jvmTypesBuilder.toClass(element, "Params", _function);
          EList<JvmMember> _members = it.getMembers();
          CradleJvmModelInferrer.this._jvmTypesBuilder.<JvmGenericType>operator_add(_members, data);
          EList<JvmMember> _members_1 = it.getMembers();
          JvmTypeReference _newTypeRef = CradleJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Void.TYPE);
          final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmTypeReference _newTypeRef = CradleJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
                JvmTypeReference _addArrayTypeDimension = CradleJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_newTypeRef);
                JvmFormalParameter _parameter = CradleJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "args", _addArrayTypeDimension);
                CradleJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                it.setStatic(true);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      EList<Declaration> _declarations = element.getDeclarations();
                      Iterable<Task> _filter = Iterables.<Task>filter(_declarations, Task.class);
                      final List<Task> tasks = IterableExtensions.<Task>toList(_filter);
                      EList<Declaration> _declarations_1 = element.getDeclarations();
                      Iterable<Parameter> _filter_1 = Iterables.<Parameter>filter(_declarations_1, Parameter.class);
                      final List<Parameter> params = IterableExtensions.<Parameter>toList(_filter_1);
                      ITreeAppendable _append = it.append("int index = 0;");
                      _append.newLine();
                      ITreeAppendable _append_1 = it.append("while(args.length == 0 || index < args.length) {");
                      ITreeAppendable _increaseIndentation = _append_1.increaseIndentation();
                      _increaseIndentation.newLine();
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("if(args.length == 0 || \"--help\".equals(args[index]) ||  \"-h\".equals(args[index])) {");
                      ITreeAppendable _append_2 = it.append(_builder);
                      ITreeAppendable _increaseIndentation_1 = _append_2.increaseIndentation();
                      _increaseIndentation_1.newLine();
                      StringConcatenation _builder_1 = new StringConcatenation();
                      _builder_1.append("System.out.println(\"Cradle \'");
                      Resource _eResource = element.eResource();
                      URI _uRI = _eResource.getURI();
                      URI _trimFileExtension = _uRI.trimFileExtension();
                      String _lastSegment = _trimFileExtension.lastSegment();
                      _builder_1.append(_lastSegment, "");
                      _builder_1.append("\'\");");
                      ITreeAppendable _append_3 = it.append(_builder_1);
                      _append_3.newLine();
                      StringConcatenation _builder_2 = new StringConcatenation();
                      _builder_2.append("System.out.println();");
                      ITreeAppendable _append_4 = it.append(_builder_2);
                      _append_4.newLine();
                      StringConcatenation _builder_3 = new StringConcatenation();
                      _builder_3.append("System.out.println(\"Tasks:\");");
                      ITreeAppendable _append_5 = it.append(_builder_3);
                      _append_5.newLine();
                      for (final Task dec : tasks) {
                        StringConcatenation _builder_4 = new StringConcatenation();
                        _builder_4.append("System.out.println(\"  ");
                        String _name = dec.getName();
                        _builder_4.append(_name, "");
                        _builder_4.append("\");");
                        ITreeAppendable _append_6 = it.append(_builder_4);
                        _append_6.newLine();
                      }
                      boolean _isEmpty = params.isEmpty();
                      boolean _not = (!_isEmpty);
                      if (_not) {
                        StringConcatenation _builder_5 = new StringConcatenation();
                        _builder_5.append("System.out.println();");
                        ITreeAppendable _append_7 = it.append(_builder_5);
                        _append_7.newLine();
                        StringConcatenation _builder_6 = new StringConcatenation();
                        _builder_6.append("System.out.println(\"Parameters:\");");
                        ITreeAppendable _append_8 = it.append(_builder_6);
                        _append_8.newLine();
                        for (final Parameter dec_1 : params) {
                          {
                            StringConcatenation _builder_7 = new StringConcatenation();
                            _builder_7.append("System.out.println(\"  --");
                            String _name_1 = dec_1.getName();
                            _builder_7.append(_name_1, "");
                            _builder_7.append(" <");
                            it.append(_builder_7);
                            JvmTypeReference _type = dec_1.getType();
                            XExpression _init = dec_1.getInit();
                            JvmTypeReference _type_1 = CradleJvmModelInferrer.this.typeProvider.getType(_init);
                            JvmTypeReference _elvis = ObjectExtensions.<JvmTypeReference>operator_elvis(_type, _type_1);
                            CradleJvmModelInferrer.this._typeReferenceSerializer.serialize(_elvis, element, it);
                            StringConcatenation _builder_8 = new StringConcatenation();
                            _builder_8.append(">\");");
                            ITreeAppendable _append_9 = it.append(_builder_8);
                            _append_9.newLine();
                          }
                        }
                      }
                      StringConcatenation _builder_7 = new StringConcatenation();
                      _builder_7.append("return;");
                      it.append(_builder_7);
                      ITreeAppendable _decreaseIndentation = it.decreaseIndentation();
                      ITreeAppendable _newLine = _decreaseIndentation.newLine();
                      _newLine.append("} else");
                      ITreeAppendable _increaseIndentation_2 = it.increaseIndentation();
                      ITreeAppendable _newLine_1 = _increaseIndentation_2.newLine();
                      ITreeAppendable _append_9 = _newLine_1.append("index++;");
                      _append_9.decreaseIndentation();
                      ITreeAppendable _decreaseIndentation_1 = it.decreaseIndentation();
                      ITreeAppendable _newLine_2 = _decreaseIndentation_1.newLine();
                      ITreeAppendable _append_10 = _newLine_2.append("}");
                      _append_10.newLine();
                      JvmTypeReference _newTypeRef = CradleJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, String.class);
                      JvmTypeReference _newTypeRef_1 = CradleJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Set.class, _newTypeRef);
                      CradleJvmModelInferrer.this._typeReferenceSerializer.serialize(_newTypeRef_1, element, it);
                      it.append(" tasks = ");
                      JvmType _findDeclaredType = CradleJvmModelInferrer.this._typeReferences.findDeclaredType(Sets.class, element);
                      it.append(_findDeclaredType);
                      ITreeAppendable _append_11 = it.append(".newLinkedHashSet();");
                      _append_11.newLine();
                      it.append(data);
                      it.append(" parameter = new ");
                      it.append(data);
                      ITreeAppendable _append_12 = it.append("();");
                      _append_12.newLine();
                      ITreeAppendable _append_13 = it.append("index = 0;");
                      _append_13.newLine();
                      ITreeAppendable _append_14 = it.append("while(index < args.length) {");
                      ITreeAppendable _increaseIndentation_3 = _append_14.increaseIndentation();
                      _increaseIndentation_3.newLine();
                      EList<Declaration> _declarations_2 = element.getDeclarations();
                      for (final Declaration dec_2 : _declarations_2) {
                        {
                          EList<Declaration> _declarations_3 = element.getDeclarations();
                          Declaration _head = IterableExtensions.<Declaration>head(_declarations_3);
                          boolean _notEquals = (!Objects.equal(dec_2, _head));
                          if (_notEquals) {
                            it.append(" else ");
                          }
                          boolean _matched = false;
                          if (!_matched) {
                            if (dec_2 instanceof Parameter) {
                              final Parameter _parameter = (Parameter)dec_2;
                              _matched=true;
                              StringConcatenation _builder_8 = new StringConcatenation();
                              _builder_8.append("if(\"--");
                              String _name_1 = _parameter.getName();
                              _builder_8.append(_name_1, "");
                              _builder_8.append("\".equals(args[index])) {");
                              ITreeAppendable _append_15 = it.append(_builder_8);
                              ITreeAppendable _increaseIndentation_4 = _append_15.increaseIndentation();
                              _increaseIndentation_4.newLine();
                              StringConcatenation _builder_9 = new StringConcatenation();
                              _builder_9.append("parameter.");
                              String _name_2 = _parameter.getName();
                              _builder_9.append(_name_2, "");
                              _builder_9.append(" = args[++index];");
                              it.append(_builder_9);
                              ITreeAppendable _decreaseIndentation_2 = it.decreaseIndentation();
                              ITreeAppendable _newLine_3 = _decreaseIndentation_2.newLine();
                              _newLine_3.append("}");
                            }
                          }
                          if (!_matched) {
                            if (dec_2 instanceof Task) {
                              final Task _task = (Task)dec_2;
                              _matched=true;
                              StringConcatenation _builder_8 = new StringConcatenation();
                              _builder_8.append("if(\"");
                              String _name_1 = _task.getName();
                              _builder_8.append(_name_1, "");
                              _builder_8.append("\".equals(args[index])) {");
                              ITreeAppendable _append_15 = it.append(_builder_8);
                              _append_15.increaseIndentation();
                              Collection<Task> _findDependentTasks = TaskExtensions.findDependentTasks(_task);
                              for (final Task t : _findDependentTasks) {
                                ITreeAppendable _newLine_3 = it.newLine();
                                StringConcatenation _builder_9 = new StringConcatenation();
                                _builder_9.append("tasks.add(\"");
                                String _name_2 = t.getName();
                                _builder_9.append(_name_2, "");
                                _builder_9.append("\");");
                                _newLine_3.append(_builder_9);
                              }
                              ITreeAppendable _decreaseIndentation_2 = it.decreaseIndentation();
                              ITreeAppendable _newLine_4 = _decreaseIndentation_2.newLine();
                              _newLine_4.append("}");
                            }
                          }
                        }
                      }
                      ITreeAppendable _append_15 = it.append(" else {");
                      ITreeAppendable _increaseIndentation_4 = _append_15.increaseIndentation();
                      _increaseIndentation_4.newLine();
                      StringConcatenation _builder_8 = new StringConcatenation();
                      _builder_8.append("System.out.println(\"Unknown task/parameter \'\" + args[index] + \"\'. Run program with --help to list available tasks/parameters\");");
                      ITreeAppendable _append_16 = it.append(_builder_8);
                      _append_16.newLine();
                      StringConcatenation _builder_9 = new StringConcatenation();
                      _builder_9.append("return;");
                      it.append(_builder_9);
                      ITreeAppendable _decreaseIndentation_2 = it.decreaseIndentation();
                      ITreeAppendable _newLine_3 = _decreaseIndentation_2.newLine();
                      _newLine_3.append("}");
                      ITreeAppendable _newLine_4 = it.newLine();
                      _newLine_4.append("index++;");
                      ITreeAppendable _decreaseIndentation_3 = it.decreaseIndentation();
                      ITreeAppendable _newLine_5 = _decreaseIndentation_3.newLine();
                      ITreeAppendable _append_17 = _newLine_5.append("}");
                      _append_17.newLine();
                      StringConcatenation _builder_10 = new StringConcatenation();
                      _builder_10.append("try {");
                      ITreeAppendable _append_18 = it.append(_builder_10);
                      ITreeAppendable _increaseIndentation_5 = _append_18.increaseIndentation();
                      _increaseIndentation_5.newLine();
                      ITreeAppendable _append_19 = it.append("for(String task:tasks) {");
                      ITreeAppendable _increaseIndentation_6 = _append_19.increaseIndentation();
                      _increaseIndentation_6.newLine();
                      StringConcatenation _builder_11 = new StringConcatenation();
                      _builder_11.append("System.out.print(\"running \" + task + \"...\");");
                      ITreeAppendable _append_20 = it.append(_builder_11);
                      _append_20.newLine();
                      for (final Task dec_3 : tasks) {
                        {
                          Task _head = IterableExtensions.<Task>head(tasks);
                          boolean _notEquals = (!Objects.equal(dec_3, _head));
                          if (_notEquals) {
                            ITreeAppendable _newLine_6 = it.newLine();
                            _newLine_6.append("else ");
                          }
                          StringConcatenation _builder_12 = new StringConcatenation();
                          _builder_12.append("if(\"");
                          String _name_1 = dec_3.getName();
                          _builder_12.append(_name_1, "");
                          _builder_12.append("\".equals(task))");
                          ITreeAppendable _append_21 = it.append(_builder_12);
                          ITreeAppendable _increaseIndentation_7 = _append_21.increaseIndentation();
                          _increaseIndentation_7.newLine();
                          StringConcatenation _builder_13 = new StringConcatenation();
                          _builder_13.append("execute");
                          String _name_2 = dec_3.getName();
                          String _firstUpper = StringExtensions.toFirstUpper(_name_2);
                          _builder_13.append(_firstUpper, "");
                          _builder_13.append("(parameter);");
                          it.append(_builder_13);
                          it.decreaseIndentation();
                        }
                      }
                      ITreeAppendable _newLine_6 = it.newLine();
                      ITreeAppendable _append_21 = _newLine_6.append("index++;");
                      _append_21.newLine();
                      StringConcatenation _builder_12 = new StringConcatenation();
                      _builder_12.append("System.out.println(\"success\");");
                      it.append(_builder_12);
                      ITreeAppendable _decreaseIndentation_4 = it.decreaseIndentation();
                      ITreeAppendable _newLine_7 = _decreaseIndentation_4.newLine();
                      _newLine_7.append("}");
                      ITreeAppendable _decreaseIndentation_5 = it.decreaseIndentation();
                      ITreeAppendable _newLine_8 = _decreaseIndentation_5.newLine();
                      _newLine_8.append("} catch(");
                      JvmType _findDeclaredType_1 = CradleJvmModelInferrer.this._typeReferences.findDeclaredType(Throwable.class, element);
                      it.append(_findDeclaredType_1);
                      StringConcatenation _builder_13 = new StringConcatenation();
                      _builder_13.append(" ");
                      _builder_13.append("e) {");
                      ITreeAppendable _append_22 = it.append(_builder_13);
                      ITreeAppendable _increaseIndentation_7 = _append_22.increaseIndentation();
                      _increaseIndentation_7.newLine();
                      StringConcatenation _builder_14 = new StringConcatenation();
                      _builder_14.append("System.out.println(\"failure: \" + e.getMessage());");
                      it.append(_builder_14);
                      ITreeAppendable _decreaseIndentation_6 = it.decreaseIndentation();
                      ITreeAppendable _newLine_9 = _decreaseIndentation_6.newLine();
                      ITreeAppendable _append_23 = _newLine_9.append("}");
                      _append_23.newLine();
                    }
                  };
                CradleJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method = CradleJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "main", _newTypeRef, _function_1);
          CradleJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
          EList<Declaration> _declarations = element.getDeclarations();
          Iterable<Task> _filter = Iterables.<Task>filter(_declarations, Task.class);
          for (final Task task : _filter) {
            {
              EList<JvmMember> _members_2 = it.getMembers();
              String _name = task.getName();
              JvmTypeReference _newTypeRef_1 = CradleJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(task, Void.TYPE);
              final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    JvmTypeReference _newTypeRef = CradleJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(data);
                    JvmTypeReference _newTypeRef_1 = CradleJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(element, Procedure1.class, _newTypeRef);
                    JvmFormalParameter _parameter = CradleJvmModelInferrer.this._jvmTypesBuilder.toParameter(task, "paramInitializer", _newTypeRef_1);
                    CradleJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    it.setStatic(true);
                    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                        public void apply(final ITreeAppendable it) {
                          ITreeAppendable _append = it.append("Params p = new Params();");
                          _append.newLine();
                          it.append("paramInitializer.apply(p);");
                          Collection<Task> _findDependentTasks = TaskExtensions.findDependentTasks(task);
                          for (final Task dependency : _findDependentTasks) {
                            ITreeAppendable _newLine = it.newLine();
                            String _name = dependency.getName();
                            String _firstUpper = StringExtensions.toFirstUpper(_name);
                            String _plus = ("execute" + _firstUpper);
                            String _plus_1 = (_plus + "(p);");
                            _newLine.append(_plus_1);
                          }
                        }
                      };
                    CradleJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                  }
                };
              JvmOperation _method_1 = CradleJvmModelInferrer.this._jvmTypesBuilder.toMethod(task, _name, _newTypeRef_1, _function_2);
              CradleJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_1);
              EList<JvmMember> _members_3 = it.getMembers();
              String _name_1 = task.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name_1);
              String _plus = ("execute" + _firstUpper);
              JvmTypeReference _newTypeRef_2 = CradleJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(task, Void.TYPE);
              final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    it.setStatic(true);
                    it.setVisibility(JvmVisibility.PROTECTED);
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    JvmTypeReference _newTypeRef = CradleJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(data);
                    JvmFormalParameter _parameter = CradleJvmModelInferrer.this._jvmTypesBuilder.toParameter(task, "it", _newTypeRef);
                    CradleJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    XExpression _action = task.getAction();
                    CradleJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _action);
                  }
                };
              JvmOperation _method_2 = CradleJvmModelInferrer.this._jvmTypesBuilder.toMethod(task, _plus, _newTypeRef_2, _function_3);
              CradleJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_2);
            }
          }
        }
      };
    _accept.initializeLater(_function);
  }
  
  public String getJavaClassName(final EObject it) {
    Resource _eResource = it.eResource();
    URI _uRI = _eResource.getURI();
    final String name = _uRI.lastSegment();
    int _lastIndexOf = name.lastIndexOf(".");
    return name.substring(0, _lastIndexOf);
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof CradleFile) {
      _infer((CradleFile)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
