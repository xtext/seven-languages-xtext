package org.xtext.simple.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.simple.simpleExpressions.Application
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class SimpleExpressionsJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
   	def dispatch void infer(Application application, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(application.toClass(application.fullyQualifiedName)).initializeLater [
   			members += application.toMethod('main', application.newTypeRef(Void::TYPE)) [
   				parameters += application.toParameter("args", application.newTypeRef(typeof(String)).addArrayTypeDimension)
   				setStatic(true)
   				body = application.main
   			]	
   		]
  	}
}

