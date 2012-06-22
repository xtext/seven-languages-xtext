package org.xtext.simple.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.simple.simpleExpressions.Application

/**
 * <p>Infers a JVM model from the source model.</p> 
 */
class SimpleExpressionsJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder

   	def dispatch void infer(Application application, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(application.toClass(application.name)).initializeLater [
   			members += application.toMethod('main', application.newTypeRef(Void::TYPE)) [
   				parameters += application.toParameter("args", application.newTypeRef(typeof(String)).addArrayTypeDimension)
   				setStatic(true)
   				body = application.main
   			]	
   		]
  	}
}

