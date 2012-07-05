package org.xtext.builddsl.jvmmodel

import com.google.common.collect.Sets
import com.google.inject.Inject
import java.io.File
import java.util.Set
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.xtext.builddsl.build.BuildFile
import org.xtext.builddsl.build.Parameter
import org.xtext.builddsl.build.Task
import org.xtext.builddsl.lib.BuildScript

import static extension org.xtext.builddsl.TaskExtensions.*

/**
 * Infers a Java class from a {@link BuildFile} allowing to execute it.
 */
class BuildDSLJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject ITypeProvider typeProvider
	@Inject extension TypeReferenceSerializer

   	def dispatch void infer(BuildFile file, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val fqn = file.javaClassName
   		val scriptName = Strings::lastToken(fqn, ".")
   		acceptor.accept(file.toClass(fqn)).initializeLater [
   				superTypes += file.newTypeRef(typeof(BuildScript))
   				val tasks = file.tasks.sortBy [ name ]
				val declaredParameters = file.parameters.sortBy [ name ]
				
				for (declaredParameter : declaredParameters) {
   					val type = declaredParameter.type ?: typeProvider.getType(declaredParameter.init)
   					members += declaredParameter.toField(declaredParameter.name, type) [
   						visibility = JvmVisibility::PUBLIC
   						if (declaredParameter.init != null)
   							initializer = declaredParameter.init
   					]
   				}
				
				val stringArray = file.newTypeRef(typeof(String)).addArrayTypeDimension
   				overrideMethod("getScriptName", file.newTypeRef(typeof(String)), file) [
   					body = [
   						append('return "').append(scriptName).append('";')
   					]
   				]
   				overrideMethod("getParameterNames", stringArray, file) [
   					body = [
   						append('return new String[] {')
						if (!declaredParameters.empty) {
							increaseIndentation.newLine
							append(declaredParameters.map[ '"' + name + '"' ].join(', '))
							decreaseIndentation.newLine
						}
						append("};")
   					]
   				]
   				overrideMethod("getTaskNames", stringArray, file) [
   					body = [
   						append('return new String[] {')
						if (!tasks.empty) {
							increaseIndentation.newLine
							append(tasks.map[ '"' + name + '"' ].join(', '))
							decreaseIndentation.newLine
						}
						append("};")
   					]
   				]
   				
   				
   				members += file.toMethod("main", file.newTypeRef(Void::TYPE)) [
   					it.parameters += toParameter("args", stringArray)
   					^static = true
   					
   					body = [
   						append(scriptName).append(' script = new ').append(scriptName).append('();').newLine
   						append('if (script.showHelp(args)) {').increaseIndentation.newLine
   						append("System.exit(HELP);").decreaseIndentation.newLine
   						append("}").newLine
   						append("System.exit(script.build(args));")
					]
				]
				overrideMethod("doBuild", file.newTypeRef(Integer::TYPE), file) [
					parameters += toParameter("args", stringArray)
					exceptions += file.newTypeRef(typeof(Throwable))
					body = [
						file.newTypeRef(typeof(Set), file.newTypeRef(typeof(String))).serialize(file, it)
   						append(" tasks = ")
   						file.newTypeRef(typeof(Sets)).serialize(file, it)
   						append(".newLinkedHashSet();").newLine
						append("int index = 0;").newLine
   						append("while(index < args.length) {").increaseIndentation.newLine
	   					for(dec : file.declarations) {
	   						if(dec != file.declarations.head)
	   							append(" else ")
   							switch(dec) {
   								Parameter: {
			   						append('''if("--«dec.name»".equals(args[index])) {''').increaseIndentation.newLine
			   						append('''«dec.name» = ''')
			   						val type = dec.type ?: typeProvider.getType(dec.init)
			   						paramToStr(it, type, "args[++index]")
			   						append(";")
			   						decreaseIndentation.newLine.append("}")	 
   								}
   								Task: {
			   						append('''if("«dec.name»".equals(args[index])) {''').increaseIndentation
			   						for(t:dec.findDependentTasks)
			   							newLine.append('''tasks.add("«t.name»");''')
			   						decreaseIndentation.newLine.append("}") 
   								}
   							}
	   					}
	   					append(" else {").increaseIndentation.newLine
	   					append('''System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");''').newLine
	   					append('''return WRONG_PARAM;''')
	   					decreaseIndentation.newLine.append("}")
	   					newLine.append("index++;")
	   					decreaseIndentation.newLine.append("}").newLine
   						append("for(String task:tasks) {").increaseIndentation.newLine
	   					for(dec : tasks) {
	   						if(dec != tasks.head)
	   							newLine.append("else ")
	   						append('''if("«dec.name»".equals(task))''').increaseIndentation.newLine
	   						append('''«dec.methodName»();''') 
	   						decreaseIndentation	
	   					}
	   					newLine.append("index++;")
	   					decreaseIndentation.newLine.append("}")
	   					append("return OK;")
   					]
   				]

			for (task : tasks) {
	   			members += task.toMethod(task.methodName, task.newTypeRef(Void::TYPE)) [
	   				visibility = JvmVisibility::PROTECTED
	   				exceptions += task.newTypeRef(typeof(Throwable))
	   				body = [
	   					append("try {").increaseIndentation.newLine
	   					append('''System.out.println("running «task.name»...");''').newLine
   						append(task.methodNameImpl).append("();").newLine
	   					append('System.out.println("success");')
	   					decreaseIndentation.newLine.append("} catch(")
	   					file.newTypeRef(typeof(Throwable)).serialize(file, it)
	   					append(' throwable) {').increaseIndentation.newLine
	   					append('System.err.println(throwable.getMessage());').newLine
	   					append("throw throwable;")
	   					decreaseIndentation.newLine.append("}")
	   				]
	   			]
	   			members += task.toMethod(task.methodNameImpl, task.newTypeRef(Void::TYPE)) [
	   				exceptions += task.newTypeRef(typeof(Throwable))
	   				visibility = JvmVisibility::PROTECTED
	   				body = task.action
	   			]
   			}
		]
   	}
   	
   	def private overrideMethod(JvmDeclaredType it, String name, JvmTypeReference returnType, BuildFile context, (JvmOperation)=>void init) {
   		members += toMethod(name, returnType) [
   			visibility = JvmVisibility::PROTECTED
   			annotations += context.toAnnotation(typeof(Override))
   			init.apply(it)
   		]
	}
   	
   	def private getTasks(BuildFile it) {
   		declarations.filter(typeof(Task))
   	}
   	
   	def private getParameters(BuildFile it) {
   		declarations.filter(typeof(Parameter))
   	}
   	
   	def private getMethodName(Task it) {
   		name.toFirstLower
   	}
   	
   	def private getMethodNameImpl(Task it) {
   		"_" + methodName + "Impl"
   	}
   	
   	def private paramToStr(ITreeAppendable out, JvmTypeReference type, String name) {
   		switch(type.qualifiedName) {
   			case(typeof(String).name): 
   				out.append(name)
   			case(typeof(File).name): { 
   				out.append("new ")
   				serialize(type.newTypeRef(typeof(File)), type, out)
   				out.append("(").append(name).append(")")
   			}
   		}
   	}
}
