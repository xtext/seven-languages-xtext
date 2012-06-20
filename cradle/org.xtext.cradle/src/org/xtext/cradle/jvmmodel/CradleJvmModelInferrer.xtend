package org.xtext.cradle.jvmmodel

import com.google.inject.Inject
import org.xtext.cradle.cradle.CradleFile
import org.xtext.cradle.cradle.Parameter
import org.xtext.cradle.cradle.Task
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.ITypeProvider

import static extension org.xtext.cradle.TaskExtensions.*
import org.eclipse.xtext.xbase.lib.Procedures

class CradleJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject ITypeProvider typeProvider

   	def dispatch void infer(CradleFile element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val name = element.javaClassName
   		acceptor.accept(element.toClass('cradle.'+name))
   			.initializeLater([
   				val data = element.toClass("Params") [
   					^static = true
   					members += element.toConstructor[]
	   				for (param : element.declarations.filter(typeof(Parameter))) {
	   					val type = param.type ?: typeProvider.getType(param.init)
	   					members += param.toField(param.name, type) [
	   						visibility = JvmVisibility::PUBLIC
	   						if (param.init != null)
	   							initializer = param.init
	   					]
	   				}
   				]
   				members += data
   				for (task : element.declarations.filter(typeof(Task))) {
		   			members += task.toMethod(task.name, task.newTypeRef(Void::TYPE)) [
		   				parameters += task.toParameter("paramInitializer", element.newTypeRef(typeof(Procedures$Procedure1),newTypeRef(data)))
		   				^static = true
		   				body = [
		   					append('Params p = new Params();').append('\n')
		   					append('paramInitializer.apply(p);').append('\n')
		   					for (dependency : task.findDependentTasks) {
			   					append('execute'+dependency.name.toFirstUpper+"(p);").append('\n')
		   					}
		   					append('execute'+task.name.toFirstUpper+"(p);").append('\n')
		   				]
		   			]
		   			members += task.toMethod("execute"+task.name.toFirstUpper, task.newTypeRef(Void::TYPE)) [
		   				^static = true
		   				visibility = JvmVisibility::PROTECTED
		   				parameters += task.toParameter("it", newTypeRef(data))
		   				body = task.action
		   			]
   				}
   			])
   	}
   	
   	def getJavaClassName(EObject it) {
   		val name = eResource.URI.lastSegment
   		return name.substring(0, name.lastIndexOf('.'))
   	}
   	
}
