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
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.xtext.template.template.RichString;
import org.xtext.template.template.RichStringForLoop;

@SuppressWarnings("all")
public class TemplateCompiler extends XbaseCompiler {
  @Override
  protected void doInternalToJavaStatement(final XExpression expr, final ITreeAppendable it, final boolean isReferenced) {
    boolean _matched = false;
    if (expr instanceof RichString) {
      _matched=true;
      final String name = it.declareVariable(expr, "_appendable");
      it.newLine();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("StringBuilder ");
      _builder.append(name);
      _builder.append(" = new StringBuilder();");
      _builder.newLineIfNotEmpty();
      it.append(_builder);
      EList<XExpression> _expressions = ((RichString)expr).getExpressions();
      for (final XExpression nestedExpression : _expressions) {
        {
          this.internalToJavaStatement(nestedExpression, it, true);
          it.newLine();
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(name);
          _builder_1.append(".append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis(");
          it.append(_builder_1);
          this.internalToJavaExpression(nestedExpression, it);
          it.append(",\"\"));");
        }
      }
    }
    if (!_matched) {
      if (expr instanceof RichStringForLoop) {
        _matched=true;
        this.internalToJavaStatement(((RichStringForLoop)expr).getForExpression(), it, true);
        final LightweightTypeReference paramType = this.getLightweightType(((RichStringForLoop)expr).getDeclaredParam());
        final String name = it.declareVariable(expr, "_forLoopResult");
        it.newLine();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("StringBuilder ");
        _builder.append(name);
        _builder.append(" = new StringBuilder();");
        _builder.newLineIfNotEmpty();
        _builder.append("for (final ");
        it.append(_builder);
        if ((paramType != null)) {
          it.append(paramType);
        } else {
          it.append("Object");
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        String _declareVariable = it.declareVariable(((RichStringForLoop)expr).getDeclaredParam(), this.makeJavaIdentifier(((RichStringForLoop)expr).getDeclaredParam().getName()));
        _builder_1.append(_declareVariable, " ");
        _builder_1.append(" : ");
        it.append(_builder_1);
        this.internalToJavaExpression(((RichStringForLoop)expr).getForExpression(), it);
        it.append(") {").increaseIndentation();
        this.internalToJavaStatement(((RichStringForLoop)expr).getEachExpression(), it, true);
        it.newLine();
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(name);
        _builder_2.append(".append(");
        it.append(_builder_2);
        this.internalToJavaExpression(((RichStringForLoop)expr).getEachExpression(), it);
        it.append(");");
        it.decreaseIndentation().newLine().append("}");
      }
    }
    if (!_matched) {
      super.doInternalToJavaStatement(expr, it, isReferenced);
    }
  }
  
  @Override
  protected void internalToConvertedExpression(final XExpression obj, final ITreeAppendable it) {
    boolean _hasName = it.hasName(obj);
    if (_hasName) {
      it.append(it.getName(obj));
    } else {
      super.internalToConvertedExpression(obj, it);
    }
  }
}
