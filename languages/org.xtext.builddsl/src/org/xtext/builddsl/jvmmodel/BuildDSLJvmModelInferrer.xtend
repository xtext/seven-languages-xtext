/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.builddsl.build.BuildFile
import org.xtext.builddsl.build.Parameter
import org.xtext.builddsl.build.Task
import org.xtext.builddsl.lib.BuildScript
import org.xtext.builddsl.lib.DependsOn
import org.xtext.builddsl.lib.Param

/**
 * Infers a Java class from a {@link BuildFile} allowing to execute it.
 */
class BuildDSLJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	
   	def dispatch void infer(BuildFile file, extension IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val qualifiedName = file.javaClassName
   		val simpleName = Strings.lastToken(qualifiedName, ".")
   		accept (file.toClass(qualifiedName)) [
			superTypes += typeRef(BuildScript)
			
			// parameters become Java fields
			for (declaredParameter : file.parameters) {
				val type = declaredParameter.type 
						?: declaredParameter?.init?.inferredType
						?: typeRef(String)
				members += declaredParameter.toField (declaredParameter.name, type) [
					visibility = JvmVisibility.PUBLIC
					annotations += annotationRef(Param)
					initializer = declaredParameter.init
				]
			}
			
			// the main method		
   			val stringArray = typeRef(String).addArrayTypeDimension
			members += file.toMethod ("main", typeRef(void)) [
				parameters += file.toParameter("args", stringArray)
				varArgs = true
				static = true
				body = '''
					«simpleName» script = new «simpleName»();
					if (script.showHelp(args)) {
						System.exit(HELP);
					}
					System.exit(script.doBuild(args));
				'''
			]
			
			// a method for the actual task body
   			members += file.tasks.map[ task | task.toMethod (task.methodName, typeRef(void)) [
   				visibility = JvmVisibility.PROTECTED
   				annotations += annotationRef(DependsOn, task.depends.map[name])
   				body = task.action
   			]]
   			
		]
   	}
   	
   	def private getTasks(BuildFile it) {
   		declarations.filter(Task)
   	}
   	
   	def private getParameters(BuildFile it) {
   		declarations.filter(Parameter)
   	}
   	
   	def private getMethodName(Task it) {
   		name
   	}
   	
   	def getJavaClassName(BuildFile it) {
		if (name == null)
			eResource.URI.trimFileExtension.lastSegment
		else
			name + "." + eResource.URI.trimFileExtension.lastSegment
	}
   	
}
