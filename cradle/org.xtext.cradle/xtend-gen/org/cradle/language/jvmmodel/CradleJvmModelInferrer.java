package org.cradle.language.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.cradle.language.TaskExtensions;
import org.cradle.language.cradle.CradleFile;
import org.cradle.language.cradle.Declaration;
import org.cradle.language.cradle.Parameter;
import org.cradle.language.cradle.Task;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

@SuppressWarnings("all")
public class CradleJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private ITypeProvider typeProvider;
  
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
          EList<Declaration> _declarations = element.getDeclarations();
          Iterable<Task> _filter = Iterables.<Task>filter(_declarations, Task.class);
          for (final Task task : _filter) {
            {
              EList<JvmMember> _members_1 = it.getMembers();
              String _name = task.getName();
              JvmTypeReference _newTypeRef = CradleJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(task, Void.TYPE);
              final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
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
                          _append.append("\n");
                          ITreeAppendable _append_1 = it.append("paramInitializer.apply(p);");
                          _append_1.append("\n");
                          List<? extends Task> _findDependentTasks = TaskExtensions.findDependentTasks(task);
                          for (final Task dependency : _findDependentTasks) {
                            String _name = dependency.getName();
                            String _firstUpper = StringExtensions.toFirstUpper(_name);
                            String _plus = ("execute" + _firstUpper);
                            String _plus_1 = (_plus + "(p);");
                            ITreeAppendable _append_2 = it.append(_plus_1);
                            _append_2.append("\n");
                          }
                          String _name_1 = task.getName();
                          String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
                          String _plus_2 = ("execute" + _firstUpper_1);
                          String _plus_3 = (_plus_2 + "(p);");
                          ITreeAppendable _append_3 = it.append(_plus_3);
                          _append_3.append("\n");
                        }
                      };
                    CradleJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                  }
                };
              JvmOperation _method = CradleJvmModelInferrer.this._jvmTypesBuilder.toMethod(task, _name, _newTypeRef, _function_1);
              CradleJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
              EList<JvmMember> _members_2 = it.getMembers();
              String _name_1 = task.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name_1);
              String _plus = ("execute" + _firstUpper);
              JvmTypeReference _newTypeRef_1 = CradleJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(task, Void.TYPE);
              final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
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
              JvmOperation _method_1 = CradleJvmModelInferrer.this._jvmTypesBuilder.toMethod(task, _plus, _newTypeRef_1, _function_2);
              CradleJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_1);
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
