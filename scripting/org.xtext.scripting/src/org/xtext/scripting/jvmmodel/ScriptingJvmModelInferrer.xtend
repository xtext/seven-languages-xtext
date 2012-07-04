package org.xtext.scripting.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.scripting.scripting.Script

/**
 * Infers a Java class with a main method from a {@link Script}.
 */
class ScriptingJvmModelInferrer extends AbstractModelInferrer {

   @Inject extension JvmTypesBuilder

   	def dispatch void infer(Script application, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(application.toClass(application.name)).initializeLater [
   			members += application.toMethod('main', application.newTypeRef(Void::TYPE)) [
   				varArgs = true
   				parameters += application.toParameter("args", application.newTypeRef(typeof(String)).addArrayTypeDimension)
   				setStatic(true)
   				body = application.main
   			]	
   		]
  	}
}

