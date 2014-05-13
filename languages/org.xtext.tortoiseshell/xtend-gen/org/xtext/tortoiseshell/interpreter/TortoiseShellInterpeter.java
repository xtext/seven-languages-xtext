/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.interpreter;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureNames;
import org.xtext.tortoiseshell.interpreter.StopLineReachedException;
import org.xtext.tortoiseshell.lib.ITortoiseInterpreter;
import org.xtext.tortoiseshell.lib.Tortoise;
import org.xtext.tortoiseshell.tortoiseShell.Executable;

@SuppressWarnings("all")
public class TortoiseShellInterpeter extends XbaseInterpreter implements ITortoiseInterpreter {
  @Inject
  @Extension
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
      _and = _notEquals_1;
    }
    if (_and) {
      this.tortoise = tortoise;
      this.stopAtLine = stopAtLine;
      try {
        Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(program);
        Iterable<JvmOperation> _filter = Iterables.<JvmOperation>filter(_jvmElements, JvmOperation.class);
        JvmOperation _head = IterableExtensions.<JvmOperation>head(_filter);
        if (_head!=null) {
          List<Object> _emptyList = CollectionLiterals.<Object>emptyList();
          this.invokeOperation(_head, null, _emptyList);
        }
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
      int _startLine = 0;
      if (_findActualNodeFor!=null) {
        _startLine=_findActualNodeFor.getStartLine();
      }
      final int line = _startLine;
      if (((line - 1) == this.stopAtLine)) {
        throw new StopLineReachedException();
      }
      _xblockexpression = super.internalEvaluate(expression, context, indicator);
    }
    return _xblockexpression;
  }
  
  protected Object invokeOperation(final JvmOperation operation, final Object receiver, final List<Object> argumentValues) {
    try {
      Object _xblockexpression = null;
      {
        Set<EObject> _sourceElements = this._iJvmModelAssociations.getSourceElements(operation);
        final EObject executable = IterableExtensions.<EObject>head(_sourceElements);
        Object _xifexpression = null;
        if ((executable instanceof Executable)) {
          Object _xblockexpression_1 = null;
          {
            final IEvaluationContext context = this.createContext();
            context.newValue(IFeatureNames.THIS, this.tortoise);
            int index = 0;
            EList<JvmFormalParameter> _parameters = operation.getParameters();
            for (final JvmFormalParameter param : _parameters) {
              {
                String _name = param.getName();
                QualifiedName _create = QualifiedName.create(_name);
                Object _get = argumentValues.get(index);
                context.newValue(_create, _get);
                index = (index + 1);
              }
            }
            XBlockExpression _body = ((Executable)executable).getBody();
            final IEvaluationResult result = this.evaluate(_body, context, CancelIndicator.NullImpl);
            Throwable _exception = result.getException();
            boolean _notEquals = (!Objects.equal(_exception, null));
            if (_notEquals) {
              throw result.getException();
            }
            _xblockexpression_1 = result.getResult();
          }
          _xifexpression = _xblockexpression_1;
        } else {
          _xifexpression = super.invokeOperation(operation, receiver, argumentValues);
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
