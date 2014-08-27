package org.xtext.template.typesystem;

import java.util.Arrays;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.xtext.template.template.RichString;
import org.xtext.template.template.RichStringForLoop;

@SuppressWarnings("all")
public class TemplateTypeComputer extends XbaseWithAnnotationsTypeComputer {
  protected void _computeTypes(final RichString expression, final ITypeComputationState state) {
    super._computeTypes(((XBlockExpression) expression), state);
    LightweightTypeReference _typeForName = this.getTypeForName(StringBuilder.class, state);
    state.acceptActualType(_typeForName);
  }
  
  protected void _computeTypes(final RichStringForLoop expression, final ITypeComputationState state) {
    super._computeTypes(((XForLoopExpression) expression), state);
    LightweightTypeReference _typeForName = this.getTypeForName(StringBuilder.class, state);
    state.acceptActualType(_typeForName);
  }
  
  public void computeTypes(final XExpression expression, final ITypeComputationState state) {
    if (expression instanceof XAssignment) {
      _computeTypes((XAssignment)expression, state);
      return;
    } else if (expression instanceof XDoWhileExpression) {
      _computeTypes((XDoWhileExpression)expression, state);
      return;
    } else if (expression instanceof XListLiteral) {
      _computeTypes((XListLiteral)expression, state);
      return;
    } else if (expression instanceof XSetLiteral) {
      _computeTypes((XSetLiteral)expression, state);
      return;
    } else if (expression instanceof XWhileExpression) {
      _computeTypes((XWhileExpression)expression, state);
      return;
    } else if (expression instanceof RichString) {
      _computeTypes((RichString)expression, state);
      return;
    } else if (expression instanceof RichStringForLoop) {
      _computeTypes((RichStringForLoop)expression, state);
      return;
    } else if (expression instanceof XAbstractFeatureCall) {
      _computeTypes((XAbstractFeatureCall)expression, state);
      return;
    } else if (expression instanceof XBasicForLoopExpression) {
      _computeTypes((XBasicForLoopExpression)expression, state);
      return;
    } else if (expression instanceof XBlockExpression) {
      _computeTypes((XBlockExpression)expression, state);
      return;
    } else if (expression instanceof XBooleanLiteral) {
      _computeTypes((XBooleanLiteral)expression, state);
      return;
    } else if (expression instanceof XCastedExpression) {
      _computeTypes((XCastedExpression)expression, state);
      return;
    } else if (expression instanceof XClosure) {
      _computeTypes((XClosure)expression, state);
      return;
    } else if (expression instanceof XConstructorCall) {
      _computeTypes((XConstructorCall)expression, state);
      return;
    } else if (expression instanceof XForLoopExpression) {
      _computeTypes((XForLoopExpression)expression, state);
      return;
    } else if (expression instanceof XIfExpression) {
      _computeTypes((XIfExpression)expression, state);
      return;
    } else if (expression instanceof XInstanceOfExpression) {
      _computeTypes((XInstanceOfExpression)expression, state);
      return;
    } else if (expression instanceof XNullLiteral) {
      _computeTypes((XNullLiteral)expression, state);
      return;
    } else if (expression instanceof XNumberLiteral) {
      _computeTypes((XNumberLiteral)expression, state);
      return;
    } else if (expression instanceof XReturnExpression) {
      _computeTypes((XReturnExpression)expression, state);
      return;
    } else if (expression instanceof XStringLiteral) {
      _computeTypes((XStringLiteral)expression, state);
      return;
    } else if (expression instanceof XSwitchExpression) {
      _computeTypes((XSwitchExpression)expression, state);
      return;
    } else if (expression instanceof XSynchronizedExpression) {
      _computeTypes((XSynchronizedExpression)expression, state);
      return;
    } else if (expression instanceof XThrowExpression) {
      _computeTypes((XThrowExpression)expression, state);
      return;
    } else if (expression instanceof XTryCatchFinallyExpression) {
      _computeTypes((XTryCatchFinallyExpression)expression, state);
      return;
    } else if (expression instanceof XTypeLiteral) {
      _computeTypes((XTypeLiteral)expression, state);
      return;
    } else if (expression instanceof XVariableDeclaration) {
      _computeTypes((XVariableDeclaration)expression, state);
      return;
    } else if (expression instanceof XAnnotation) {
      _computeTypes((XAnnotation)expression, state);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression, state).toString());
    }
  }
}
