/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.template.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.lib.Procedures
import org.xtext.template.template.TemplateFile

/**
 * <p>Infers a JVM model from the source model.</p> 
 */
class TemplateJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	
   	def dispatch void infer(TemplateFile element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val simpleName = element.eResource.URI.trimFileExtension.lastSegment
   		val qualifiedName = if(element.getPackage !== null) 
   				element.getPackage + "." + simpleName
   			else 
   				simpleName
		val javaClass = element.toClass(qualifiedName)
   		acceptor.accept(javaClass) [
			
			for (param : element.params) {
				// try compute the type 
				// 1) explicitly declared, 
				// 2) inferred from the initializer 
				// catch-all) just String 
				val type = param.type 
					?: param.defaultexp?.inferredType 
					?: typeRef(String)
				members += param.toField(param.name, type) [
					if (param.defaultexp !== null)
						initializer = param.defaultexp
				]
				members += param.toSetter(param.name, type)
				members += param.toGetter(param.name, type)
			}
			
			members += element.toMethod("generate", typeRef(CharSequence)) [
				visibility = JvmVisibility.PRIVATE
				body = element.body
			]
			
			// generate a method accepting an initializer lambda expression
			members += element.toMethod("generate", typeRef(String)) [
				parameters += element.toParameter(
					"init", typeRef(Procedures.Procedure1, typeRef(javaClass))
				)
				body = '''
					if (init != null)
						init.apply(this);
					String result = generate().toString();
					// remove leading -->
					result = result.replaceAll("^-->\\n","");
					// trim multi-newline to single newline
					result = result.replaceAll("\\n\\s*\\n","\n");
					return result;
				'''
			]
		]
	}
}
