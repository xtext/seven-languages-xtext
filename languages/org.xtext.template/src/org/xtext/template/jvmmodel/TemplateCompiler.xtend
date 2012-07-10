package org.xtext.template.jvmmodel

import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.xtext.template.template.RichString
import org.xtext.template.template.RichStringForLoop

class TemplateCompiler extends XbaseCompiler {
	
	override protected doInternalToJavaStatement(XExpression expr, ITreeAppendable it, boolean isReferenced) {
		switch expr {
			RichString : {
				val name = declareVariable(expr, '_appendable')
				newLine
				append('''
					StringBuilder «name» = new StringBuilder();
				''')
				for (nestedExpression : expr.expressions) {
					nestedExpression.internalToJavaStatement(it, true)
					newLine
					append('''«name».append(org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_elvis(''')
					nestedExpression.internalToJavaExpression(it)
					append(',""));')
				}
			}
			
			RichStringForLoop : {
				expr.forExpression.internalToJavaStatement(it, true)
				val paramType = typeProvider.getTypeForIdentifiable(expr.declaredParam)
				val name = declareVariable(expr, '_forLoopResult')
				newLine
				append('''
					StringBuilder «name» = new StringBuilder();
					for (final ''')
				serialize(paramType, expr, it);
				append(''' «declareVariable(expr.declaredParam, makeJavaIdentifier(expr.declaredParam.name))» : ''')
				internalToJavaExpression(expr.forExpression, it)
				append(") {").increaseIndentation
					expr.eachExpression.internalToJavaStatement(it, true)
					newLine
					append('''«name».append(''')
					expr.eachExpression.internalToJavaExpression(it)
					append(');')
				decreaseIndentation.newLine.append("}")
			}
			
			default :
				super.doInternalToJavaStatement(expr, it, isReferenced)
		}
	}
	
	override protected internalToConvertedExpression(XExpression obj, ITreeAppendable it) {
		if (hasName(obj))
			append(getName(obj))
		else 
			super.internalToConvertedExpression(obj, it) 
	}
	
}