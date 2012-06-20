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
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.eclipse.xtext.common.types.util.TypeReferences
import com.google.common.collect.Sets
import java.util.Set

class CradleJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject ITypeProvider typeProvider
	@Inject extension TypeReferenceSerializer
	@Inject extension TypeReferences

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
   				
   				members += element.toMethod("main", element.newTypeRef(Void::TYPE)) [
   					parameters += element.toParameter("args", element.newTypeRef(typeof(String)).addArrayTypeDimension)
   					^static = true
   					body = [
   						val tasks = element.declarations.filter(typeof(Task)).toList
   						val params = element.declarations.filter(typeof(Parameter)).toList
   						append("int index = 0;").newLine
   						append("while(args.length == 0 || index < args.length) {").increaseIndentation.newLine
   						append('''if(args.length == 0 || "--help".equals(args[index]) ||  "-h".equals(args[index])) {''').increaseIndentation.newLine
   						append('''System.out.println("Cradle 'Çelement.eResource.URI.trimFileExtension.lastSegmentÈ'");''').newLine
   						append('''System.out.println();''').newLine
   						append('''System.out.println("Tasks:");''').newLine
   						for(dec : tasks)
   							append('''System.out.println("  Çdec.nameÈ");''').newLine
   						if(!params.empty) {
	   						append('''System.out.println();''').newLine
	   						append('''System.out.println("Parameters:");''').newLine
	   						for(dec : params) {
	   							append('''System.out.println("  --Çdec.nameÈ <''')
	   							(dec.type ?: typeProvider.getType(dec.init)).serialize(element, it)
	   							append('''>");''').newLine
	   						}
   						}
   						append('''return;''')
   						decreaseIndentation.newLine.append("} else")
   						increaseIndentation.newLine.append("index++;").decreaseIndentation
   						decreaseIndentation.newLine.append("}").newLine
   						serialize(newTypeRef(element, typeof(Set), newTypeRef(element, typeof(String))), element, it)
   						append(" tasks = ")
   						append(findDeclaredType(typeof(Sets), element))
   						append(".newLinkedHashSet();").newLine
   						append(data)
   						append(" parameter = new ")
   						append(data)
   						append("();").newLine
	   					append("index = 0;").newLine
   						append("while(index < args.length) {").increaseIndentation.newLine
	   					for(dec : element.declarations) {
	   						if(dec != params.head)
	   							append(" else ")
   							switch(dec) {
   								Parameter: {
			   						append('''if("--Çdec.nameÈ".equals(args[index])) {''').increaseIndentation.newLine
			   						append('''parameter.Çdec.nameÈ = args[++index];''')
			   						decreaseIndentation.newLine.append("}")	 
   								}
   								Task: {
			   						append('''if("Çdec.nameÈ".equals(args[index])) {''').increaseIndentation
			   						for(t:dec.findDependentTasks)
			   							newLine.append('''tasks.add("Çt.nameÈ");''')
			   						decreaseIndentation.newLine.append("}") 
   								}
   							}
	   					}
	   					append(" else {").increaseIndentation.newLine
	   					append('''System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");''').newLine
	   					append('''return;''')
	   					decreaseIndentation.newLine.append("}")
	   					newLine.append("index++;")
	   					decreaseIndentation.newLine.append("}").newLine
   						append('''try {''').increaseIndentation.newLine
   						append("for(String task:tasks) {").increaseIndentation.newLine
   						append('''System.out.print("running " + task + "...");''').newLine
	   					for(dec : tasks) {
	   						if(dec != tasks.head)
	   							newLine.append("else ")
	   						append('''if("Çdec.nameÈ".equals(task))''').increaseIndentation.newLine
	   						append('''executeÇdec.name.toFirstUpperÈ(parameter);''') 
	   						decreaseIndentation	
	   					}
	   					newLine.append("index++;").newLine
	   					append('''System.out.println("success");''')
	   					decreaseIndentation.newLine.append("}")
	   					decreaseIndentation.newLine.append("} catch(")
	   					append(findDeclaredType(typeof(Throwable), element))
	   					append(''' e) {''').increaseIndentation.newLine
	   					append('''System.out.println("failure: " + e.getMessage());''')
	   					decreaseIndentation.newLine.append("}").newLine
   					]
   				]
   				
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
