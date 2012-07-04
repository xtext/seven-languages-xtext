package org.xtext.template.jvmmodel

import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.xtext.template.template.RichString
import org.xtext.template.template.RichStringForLoop
import org.xtext.template.template.RichStringLiteral
import org.eclipse.xtext.util.Strings

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
					append('''«name».append(''')
					nestedExpression.internalToJavaExpression(it)
					append(');')
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
		if (hasName(obj)) {
			append(getName(obj))
		} else switch obj {
			RichStringLiteral : {
				// trim the guillemets
				var string = obj.value.substring(1, obj.value.length-1)
				append('''"«Strings::convertToJavaString(string)»"''')
			}
			default :
				super.internalToConvertedExpression(obj, it) 
		}
	}
	
}