package org.xtext.tortoiseshell.interpreter;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.impl.FeatureCallToJavaMapping;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.xtext.tortoiseshell.runtime.ITortoiseInterpreter;
import org.xtext.tortoiseshell.runtime.Tortoise;
import org.xtext.tortoiseshell.tortoiseShell.Function;
import org.xtext.tortoiseshell.tortoiseShell.Program;

@SuppressWarnings("all")
public class TortoiseShellInterpeter extends XbaseInterpreter implements ITortoiseInterpreter {
  @Inject
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  private Provider<IEvaluationContext> contextProvider;
  
  @Inject
  private FeatureCallToJavaMapping callToJavaMapping;
  
  public void execute(final Tortoise tortoise, final XtextResource resource) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(resource, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      EList<Diagnostic> _errors = resource.getErrors();
      boolean _isEmpty = _errors.isEmpty();
      _and_1 = (_notEquals && _isEmpty);
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(tortoise, null));
      _and = (_and_1 && _notEquals_1);
    }
    if (_and) {
      EList<EObject> _contents = resource.getContents();
      Iterable<Program> _filter = Iterables.<Program>filter(_contents, Program.class);
      final Program program = IterableExtensions.<Program>head(_filter);
      boolean _notEquals_2 = (!Objects.equal(program, null));
      if (_notEquals_2) {
        final IEvaluationContext context = this.contextProvider.get();
        Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(program);
        Iterable<JvmDeclaredType> _filter_1 = Iterables.<JvmDeclaredType>filter(_jvmElements, JvmDeclaredType.class);
        JvmDeclaredType _head = IterableExtensions.<JvmDeclaredType>head(_filter_1);
        context.newValue(XbaseScopeProvider.THIS, _head);
        context.newValue(XbaseScopeProvider.IT, tortoise);
        Class<? extends Object> _class = this.getClass();
        ClassLoader _classLoader = _class.getClassLoader();
        this.setClassLoader(_classLoader);
        XBlockExpression _body = program.getBody();
        IEvaluationContext _fork = context.fork();
        this.evaluate(_body, _fork, CancelIndicator.NullImpl);
      }
    }
  }
  
  protected Object _featureCallOperation(final JvmOperation operation, final XAbstractFeatureCall featureCall, final Object receiver, final IEvaluationContext context, final CancelIndicator indicator) {
    Object _xblockexpression = null;
    {
      final List<XExpression> operationArguments = this.callToJavaMapping.getActualArguments(featureCall);
      final List<Object> argumentValues = this.evaluateArgumentExpressions(operation, operationArguments, context, indicator);
      Set<EObject> _sourceElements = this._iJvmModelAssociations.getSourceElements(operation);
      final EObject function = IterableExtensions.<EObject>head(_sourceElements);
      Object _xifexpression = null;
      if ((function instanceof Function)) {
        IEvaluationResult _xblockexpression_1 = null;
        {
          final IEvaluationContext functionCallContext = this.contextProvider.get();
          Object _value = context.getValue(XbaseScopeProvider.THIS);
          functionCallContext.newValue(XbaseScopeProvider.THIS, _value);
          int index = 0;
          EList<JvmFormalParameter> _parameters = operation.getParameters();
          for (final JvmFormalParameter param : _parameters) {
            {
              String _name = param.getName();
              QualifiedName _create = QualifiedName.create(_name);
              Object _get = argumentValues.get(index);
              functionCallContext.newValue(_create, _get);
              int _plus = (index + 1);
              index = _plus;
            }
          }
          XBlockExpression _body = ((Function) function).getBody();
          IEvaluationResult _evaluate = this.evaluate(_body, functionCallContext, indicator);
          _xblockexpression_1 = (_evaluate);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        Object _invokeOperation = super.invokeOperation(operation, receiver, argumentValues);
        _xifexpression = _invokeOperation;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  /**
   * Fixes a TODO in super.getReceiver()
   */
  protected Object getReceiver(final XAssignment assignment, final IEvaluationContext context, final CancelIndicator indicator) {
    Object _xblockexpression = null;
    {
      XExpression _assignable = assignment.getAssignable();
      boolean _equals = Objects.equal(_assignable, null);
      if (_equals) {
        final XExpression implicitReceiver = assignment.getImplicitReceiver();
        if ((implicitReceiver instanceof XFeatureCall)) {
          JvmIdentifiableElement _feature = ((XFeatureCall) implicitReceiver)==null?(JvmIdentifiableElement)null:((XFeatureCall) implicitReceiver).getFeature();
          final String implicitReceiverName = _feature==null?(String)null:_feature.getIdentifier();
          boolean _notEquals = (!Objects.equal(implicitReceiverName, null));
          if (_notEquals) {
            QualifiedName _create = QualifiedName.create(implicitReceiverName);
            return context.getValue(_create);
          }
        }
      }
      Object _receiver = super.getReceiver(assignment, context, indicator);
      _xblockexpression = (_receiver);
    }
    return _xblockexpression;
  }
}
