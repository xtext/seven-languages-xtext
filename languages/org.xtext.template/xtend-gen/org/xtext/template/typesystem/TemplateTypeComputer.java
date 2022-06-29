package org.xtext.template.typesystem;

import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.xtext.template.template.RichString;
import org.xtext.template.template.RichStringForLoop;

@SuppressWarnings("all")
public class TemplateTypeComputer extends XbaseWithAnnotationsTypeComputer {
  @Override
  public void computeTypes(final XExpression expression, final ITypeComputationState state) {
    if ((expression instanceof RichString)) {
      this._computeTypes(((RichString)expression), state);
    } else {
      if ((expression instanceof RichStringForLoop)) {
        this._computeTypes(((RichStringForLoop)expression), state);
      } else {
        super.computeTypes(expression, state);
      }
    }
  }

  protected void _computeTypes(final RichString expression, final ITypeComputationState state) {
    super._computeTypes(((XBlockExpression) expression), state);
    state.acceptActualType(this.getTypeForName(StringBuilder.class, state));
  }

  protected void _computeTypes(final RichStringForLoop expression, final ITypeComputationState state) {
    super._computeTypes(((XForLoopExpression) expression), state);
    state.acceptActualType(this.getTypeForName(StringBuilder.class, state));
  }
}
