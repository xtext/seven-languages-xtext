package org.xtext.scripting.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.scripting.scripting.Script

import static org.xtext.scripting.jvmmodel.ScriptingJvmModelInferrer.*

/**
 * Infers a Java class with a main method from a {@link Script}.
 */
class ScriptingJvmModelInferrer extends AbstractModelInferrer {
	
   	@Inject extension JvmTypesBuilder

   	def dispatch void infer(Script script, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val className = script.eResource.URI.trimFileExtension.lastSegment
   		acceptor.accept(script.toClass(className)).initializeLater [
   			members += script.toMethod('main', script.newTypeRef(Void::TYPE)) [
   				parameters += script.toParameter("args", script.newTypeRef(typeof(String)).addArrayTypeDimension)
   				setStatic(true)
   				body = script
   			]	
   		]
  	}
}

