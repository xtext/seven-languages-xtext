/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.tortoiseshell.interpreter

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.xtext.tortoiseshell.lib.ITortoiseInterpreter
import org.xtext.tortoiseshell.lib.Tortoise
import org.xtext.tortoiseshell.tortoiseShell.Executable

class TortoiseShellInterpeter extends XbaseInterpreter implements ITortoiseInterpreter {
	
	@Inject extension IJvmModelAssociations 
	
	Tortoise tortoise
	
	int stopAtLine
	
	override run(Tortoise tortoise, EObject program, int stopAtLine) {
		if (tortoise !== null && program !== null) {
			this.tortoise = tortoise
			this.stopAtLine = stopAtLine
			try {
				program.jvmElements.filter(JvmOperation).head
					?.invokeOperation(null, emptyList)
			} catch (StopLineReachedException exc) {
				// ignore
			}
		}
	}
	
	override protected internalEvaluate(XExpression expression, IEvaluationContext context, CancelIndicator indicator) {
		val line = NodeModelUtils.findActualNodeFor(expression)?.startLine
		if (line-1 == stopAtLine)
			throw new StopLineReachedException
		super.internalEvaluate(expression, context, indicator)
	}
	
	override protected invokeOperation(JvmOperation operation, Object receiver, List<Object> argumentValues) {
		val executable = operation.sourceElements.head
		if (executable instanceof Executable) {
			val context = createContext
			context.newValue(QualifiedName.create("this"), tortoise)
			var index = 0
			for (param : operation.parameters) {
				context.newValue(QualifiedName.create(param.name), argumentValues.get(index))
				index = index + 1	
			}
			val result = evaluate(executable.body, context, CancelIndicator.NullImpl)
			if(result.exception !== null)
				throw result.exception
			result.result
		} else {
			super.invokeOperation(operation, receiver, argumentValues)
		}
	}
	
}

class StopLineReachedException extends RuntimeException {
}