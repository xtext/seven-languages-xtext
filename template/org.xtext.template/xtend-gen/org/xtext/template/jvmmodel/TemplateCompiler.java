package org.xtext.template.jvmmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.xtext.template.template.RichString;
import org.xtext.template.template.RichStringForLoop;
import org.xtext.template.template.RichStringLiteral;

@SuppressWarnings("all")
public class TemplateCompiler extends XbaseCompiler {
  protected void doInternalToJavaStatement(final XExpression expr, final ITreeAppendable it, final boolean isReferenced) {
    boolean _matched = false;
    if (!_matched) {
      if (expr instanceof RichString) {
        final RichString _richString = (RichString)expr;
        _matched=true;
        final String name = it.declareVariable(_richString, "_appendable");
        it.newLine();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("StringBuilder ");
        _builder.append(name, "");
        _builder.append(" = new StringBuilder();");
        _builder.newLineIfNotEmpty();
        it.append(_builder);
        EList<XExpression> _expressions = _richString.getExpressions();
        for (final XExpression nestedExpression : _expressions) {
          {
            this.internalToJavaStatement(nestedExpression, it, true);
            it.newLine();
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(name, "");
            _builder_1.append(".append(");
            it.append(_builder_1);
            this.internalToJavaExpression(nestedExpression, it);
            it.append(");");
          }
        }
      }
    }
    if (!_matched) {
      if (expr instanceof RichStringForLoop) {
        final RichStringForLoop _richStringForLoop = (RichStringForLoop)expr;
        _matched=true;
        XExpression _forExpression = _richStringForLoop.getForExpression();
        this.internalToJavaStatement(_forExpression, it, true);
        ITypeProvider _typeProvider = this.getTypeProvider();
        JvmFormalParameter _declaredParam = _richStringForLoop.getDeclaredParam();
        final JvmTypeReference paramType = _typeProvider.getTypeForIdentifiable(_declaredParam);
        final String name = it.declareVariable(_richStringForLoop, "_forLoopResult");
        it.newLine();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("StringBuilder ");
        _builder.append(name, "");
        _builder.append(" = new StringBuilder();");
        _builder.newLineIfNotEmpty();
        _builder.append("for (final ");
        it.append(_builder);
        this.serialize(paramType, _richStringForLoop, it);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        JvmFormalParameter _declaredParam_1 = _richStringForLoop.getDeclaredParam();
        JvmFormalParameter _declaredParam_2 = _richStringForLoop.getDeclaredParam();
        String _name = _declaredParam_2.getName();
        String _makeJavaIdentifier = this.makeJavaIdentifier(_name);
        String _declareVariable = it.declareVariable(_declaredParam_1, _makeJavaIdentifier);
        _builder_1.append(_declareVariable, " ");
        _builder_1.append(" : ");
        it.append(_builder_1);
        XExpression _forExpression_1 = _richStringForLoop.getForExpression();
        this.internalToJavaExpression(_forExpression_1, it);
        ITreeAppendable _append = it.append(") {");
        _append.increaseIndentation();
        XExpression _eachExpression = _richStringForLoop.getEachExpression();
        this.internalToJavaStatement(_eachExpression, it, true);
        it.newLine();
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(name, "");
        _builder_2.append(".append(");
        it.append(_builder_2);
        XExpression _eachExpression_1 = _richStringForLoop.getEachExpression();
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
      boolean _matched = false;
      if (!_matched) {
        if (obj instanceof RichStringLiteral) {
          final RichStringLiteral _richStringLiteral = (RichStringLiteral)obj;
          _matched=true;
          String _value = _richStringLiteral.getValue();
          String _value_1 = _richStringLiteral.getValue();
          int _length = _value_1.length();
          int _minus = (_length - 1);
          String string = _value.substring(1, _minus);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("\"");
          String _convertToJavaString = Strings.convertToJavaString(string);
          _builder.append(_convertToJavaString, "");
          _builder.append("\"");
          it.append(_builder);
        }
      }
      if (!_matched) {
        super.internalToConvertedExpression(obj, it);
      }
    }
  }
}
