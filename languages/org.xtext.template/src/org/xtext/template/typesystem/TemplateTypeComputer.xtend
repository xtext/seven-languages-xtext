package org.xtext.template.typesystem

import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XForLoopExpression
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.xtext.template.template.RichString
import org.xtext.template.template.RichStringForLoop

class TemplateTypeComputer extends XbaseWithAnnotationsTypeComputer {
	
	def dispatch computeTypes(RichString expression, ITypeComputationState state) {
		super._computeTypes(expression as XBlockExpression, state)
		state.acceptActualType(getTypeForName(StringBuilder, state))
	}
	 
	def dispatch computeTypes(RichStringForLoop expression, ITypeComputationState state) {
		super._computeTypes(expression as XForLoopExpression, state)
		state.acceptActualType(getTypeForName(StringBuilder, state))
	}
}