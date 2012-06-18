package org.xtext.tortoiseshell.interpreter;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.xtext.tortoiseshell.interpreter.StopLineReachedException;
import org.xtext.tortoiseshell.runtime.ITortoiseInterpreter;
import org.xtext.tortoiseshell.runtime.Tortoise;
import org.xtext.tortoiseshell.tortoiseShell.Executable;

@SuppressWarnings("all")
public class TortoiseShellInterpeter extends XbaseInterpreter implements ITortoiseInterpreter {
  @Inject
  private IJvmModelAssociations _iJvmModelAssociations;
  
  private Tortoise tortoise;
  
  private int stopAtLine;
  
  public void run(final Tortoise tortoise, final EObject program, final int stopAtLine) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(tortoise, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(program, null));
      _and = (_notEquals && _notEquals_1);
    }
    if (_and) {
      this.tortoise = tortoise;
      this.stopAtLine = stopAtLine;
      try {
        Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(program);
        Iterable<JvmOperation> _filter = Iterables.<JvmOperation>filter(_jvmElements, JvmOperation.class);
        JvmOperation _head = IterableExtensions.<JvmOperation>head(_filter);
        List<Object> _emptyList = Collections.<Object>emptyList();
        if (_head!=null) this.invokeOperation(_head, null, _emptyList);
      } catch (final Throwable _t) {
        if (_t instanceof StopLineReachedException) {
          final StopLineReachedException exc = (StopLineReachedException)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  protected Object internalEvaluate(final XExpression expression, final IEvaluationContext context, final CancelIndicator indicator) {
    Object _xblockexpression = null;
    {
      ICompositeNode _findActualNodeFor = NodeModelUtils.findActualNodeFor(expression);
      final int line = _findActualNodeFor==null?0:_findActualNodeFor.getStartLine();
      int _minus = (line - 1);
      boolean _equals = (_minus == this.stopAtLine);
      if (_equals) {
        StopLineReachedException _stopLineReachedException = new StopLineReachedException();
        throw _stopLineReachedException;
      }
      Object _internalEvaluate = super.internalEvaluate(expression, context, indicator);
      _xblockexpression = (_internalEvaluate);
    }
    return _xblockexpression;
  }
  
  protected Object invokeOperation(final JvmOperation operation, final Object receiver, final List<Object> argumentValues) {
    Object _xblockexpression = null;
    {
      Set<EObject> _sourceElements = this._iJvmModelAssociations.getSourceElements(operation);
      final EObject executable = IterableExtensions.<EObject>head(_sourceElements);
      Object _xifexpression = null;
      if ((executable instanceof Executable)) {
        IEvaluationResult _xblockexpression_1 = null;
        {
          final IEvaluationContext context = this.createContext();
          context.newValue(XbaseScopeProvider.THIS, this.tortoise);
          int index = 0;
          EList<JvmFormalParameter> _parameters = operation.getParameters();
          for (final JvmFormalParameter param : _parameters) {
            {
              String _name = param.getName();
              QualifiedName _create = QualifiedName.create(_name);
              Object _get = argumentValues.get(index);
              context.newValue(_create, _get);
              int _plus = (index + 1);
              index = _plus;
            }
          }
          XBlockExpression _body = ((Executable) executable).getBody();
          IEvaluationResult _evaluate = this.evaluate(_body, context, CancelIndicator.NullImpl);
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
}
