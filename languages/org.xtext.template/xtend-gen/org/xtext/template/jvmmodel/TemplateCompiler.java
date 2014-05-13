/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.template.jvmmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.xtext.template.template.RichString;
import org.xtext.template.template.RichStringForLoop;

@SuppressWarnings("all")
public class TemplateCompiler extends XbaseCompiler {
  protected void doInternalToJavaStatement(final XExpression expr, final ITreeAppendable it, final boolean isReferenced) {
    boolean _matched = false;
    if (!_matched) {
      if (expr instanceof RichString) {
        _matched=true;
        final String name = it.declareVariable(expr, "_appendable");
        it.newLine();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("StringBuilder ");
        _builder.append(name, "");
        _builder.append(" = new StringBuilder();");
        _builder.newLineIfNotEmpty();
        it.append(_builder);
        EList<XExpression> _expressions = ((RichString)expr).getExpressions();
        for (final XExpression nestedExpression : _expressions) {
          {
            this.internalToJavaStatement(nestedExpression, it, true);
            it.newLine();
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(name, "");
            _builder_1.append(".append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis(");
            it.append(_builder_1);
            this.internalToJavaExpression(nestedExpression, it);
            it.append(",\"\"));");
          }
        }
      }
    }
    if (!_matched) {
      if (expr instanceof RichStringForLoop) {
        _matched=true;
        XExpression _forExpression = ((RichStringForLoop)expr).getForExpression();
        this.internalToJavaStatement(_forExpression, it, true);
        JvmFormalParameter _declaredParam = ((RichStringForLoop)expr).getDeclaredParam();
        final JvmTypeReference paramType = this.getType(_declaredParam);
        final String name = it.declareVariable(expr, "_forLoopResult");
        it.newLine();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("StringBuilder ");
        _builder.append(name, "");
        _builder.append(" = new StringBuilder();");
        _builder.newLineIfNotEmpty();
        _builder.append("for (final ");
        it.append(_builder);
        this.serialize(paramType, expr, it);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        JvmFormalParameter _declaredParam_1 = ((RichStringForLoop)expr).getDeclaredParam();
        JvmFormalParameter _declaredParam_2 = ((RichStringForLoop)expr).getDeclaredParam();
        String _name = _declaredParam_2.getName();
        String _makeJavaIdentifier = this.makeJavaIdentifier(_name);
        String _declareVariable = it.declareVariable(_declaredParam_1, _makeJavaIdentifier);
        _builder_1.append(_declareVariable, " ");
        _builder_1.append(" : ");
        it.append(_builder_1);
        XExpression _forExpression_1 = ((RichStringForLoop)expr).getForExpression();
        this.internalToJavaExpression(_forExpression_1, it);
        ITreeAppendable _append = it.append(") {");
        _append.increaseIndentation();
        XExpression _eachExpression = ((RichStringForLoop)expr).getEachExpression();
        this.internalToJavaStatement(_eachExpression, it, true);
        it.newLine();
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(name, "");
        _builder_2.append(".append(");
        it.append(_builder_2);
        XExpression _eachExpression_1 = ((RichStringForLoop)expr).getEachExpression();
        this.internalToJavaExpression(_eachExpression_1, it);
        it.append(");");
        ITreeAppendable _decreaseIndentation = it.decreaseIndentation();
        ITreeAppendable _newLine = _decreaseIndentation.newLine();
        _newLine.append("}");
      }
    }
    if (!_matched) {
      super.doInternalToJavaStatement(expr, it, isReferenced);
    }
  }
  
  protected void internalToConvertedExpression(final XExpression obj, final ITreeAppendable it) {
    boolean _hasName = it.hasName(obj);
    if (_hasName) {
      String _name = it.getName(obj);
      it.append(_name);
    } else {
      super.internalToConvertedExpression(obj, it);
    }
  }
}
