/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.tortoiseshell.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.tortoiseshell.lib.Tortoise
import org.xtext.tortoiseshell.tortoiseShell.Program

class TortoiseShellJvmModelInferrer extends AbstractModelInferrer {

	public static val INFERRED_CLASS_NAME = 'MyTortoiseProgram'

	@Inject extension JvmTypesBuilder

   	def dispatch void infer(Program program, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(program.toClass(INFERRED_CLASS_NAME)) [
   			superTypes += typeRef(Tortoise)
   			if (program.body !== null)
   				members += program.toMethod("main", typeRef(void)) [
   					body = program.body
   				]
   			for (subProgram : program.subPrograms)
   				members += subProgram.toMethod(subProgram.name, subProgram.returnType ?: inferredType(subProgram.body)) [
		   			for(subParameter: subProgram.parameters)
		   				parameters += subParameter.toParameter(subParameter.name, subParameter.parameterType)
   					body = subProgram.body
   				]
   		]
   	}
   	
}

