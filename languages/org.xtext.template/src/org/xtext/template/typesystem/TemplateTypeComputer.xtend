package org.xtext.template.typesystem

import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XForLoopExpression
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.xtext.template.template.RichString
import org.xtext.template.template.RichStringForLoop

class TemplateTypeComputer extends XbaseWithAnnotationsTypeComputer {
	
	override computeTypes(XExpression expression, ITypeComputationState state) {
		if(expression instanceof RichString) {
			_computeTypes(expression as RichString, state);
		} else if(expression instanceof RichStringForLoop) {
			_computeTypes(expression as RichStringForLoop, state);
		} else {
			super.computeTypes(expression, state)
		}
	}
	
	protected def _computeTypes(RichString expression, ITypeComputationState state) {
		super._computeTypes(expression as XBlockExpression, state)
		state.acceptActualType(getTypeForName(typeof(StringBuilder), state))
	}
	 
	protected def _computeTypes(RichStringForLoop expression, ITypeComputationState state) {
		super._computeTypes(expression as XForLoopExpression, state)
		state.acceptActualType(getTypeForName(typeof(StringBuilder), state))
	}
}