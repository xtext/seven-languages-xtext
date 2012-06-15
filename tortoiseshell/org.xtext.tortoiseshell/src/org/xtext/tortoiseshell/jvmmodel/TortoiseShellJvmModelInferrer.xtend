package org.xtext.tortoiseshell.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.tortoiseshell.runtime.Tortoise
import org.xtext.tortoiseshell.tortoiseShell.Program

class TortoiseShellJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder

   	def dispatch void infer(Program program, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(program.toClass("MyTortoiseProgram")).initializeLater[
   			if(program.body != null)
   				members += program.toMethod("main", program.newTypeRef(Void::TYPE)) [
		   			parameters += program.toParameter("it", program.newTypeRef(typeof(Tortoise)))
   					body = program.body
   				]
   			for(function: program.functions)
   				members += function.toMethod(function.name, program.newTypeRef(Void::TYPE)) [
		   			parameters += program.toParameter("it", program.newTypeRef(typeof(Tortoise)))
		   			for(functionParameter: function.parameters)
		   				parameters += functionParameter.toParameter(functionParameter.name, functionParameter.parameterType)
   					body = function.body
   				]
   		]
   	}
   	
}

