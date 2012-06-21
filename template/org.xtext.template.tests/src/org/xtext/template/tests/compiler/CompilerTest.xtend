package org.xtext.template.tests.compiler

import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.parameterized.InjectParameter
import org.eclipse.xtext.junit4.parameterized.ParameterSyntax
import org.eclipse.xtext.junit4.parameterized.ParameterizedXtextRunner
import org.eclipse.xtext.junit4.parameterized.ResourceURIs
import org.eclipse.xtext.junit4.parameterized.XpectString
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.StringInputStream
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.template.TemplateInjectorProvider
import org.eclipse.xtext.xbase.lib.Procedures$Procedure1

@SuppressWarnings("restriction")
@InjectWith(typeof(TemplateInjectorProvider))
@RunWith(typeof(ParameterizedXtextRunner))
@ResourceURIs(baseDir = "src/org/xtext/template/tests/compiler", fileExtensions = "template")
class CompilerTest {
	
	@Inject extension ValidationTestHelper
	
	@Inject JvmModelGenerator generator
	
	@InjectParameter Resource resource
	
	@InjectParameter String param
	
	@Inject OnTheFlyJavaCompiler javaCompiler;
	
	@Test def noErrors(){
		resource.contents.head.assertNoErrors
	}
	
	@XpectString @ParameterSyntax("param=STRING?") def execute() {
		val inferredType = resource.contents.filter(typeof(JvmGenericType)).head
		val javaCode = generator.generateType(inferredType);
		println(javaCode)
		val clazz = javaCompiler.compileToClass(inferredType.qualifiedName, javaCode.toString)
		val document = '''{ val inst = new «inferredType.qualifiedName»() «IF !param.nullOrEmpty» => [ «param» ]«ENDIF»; inst }'''.toString
		val template = newInstance(clazz, inferredType, document)
		val generateMethod = clazz.getMethod("generate")
		generateMethod.invoke(template).toString
	}
	
	@XpectString @ParameterSyntax("param=STRING?") def initexecute() {
		val inferredType = resource.contents.filter(typeof(JvmGenericType)).head
		val javaCode = generator.generateType(inferredType);
		val clazz = javaCompiler.compileToClass(inferredType.qualifiedName, javaCode.toString)
		val document = '''[«inferredType.qualifiedName» it|«IF !param.nullOrEmpty»«param»«ENDIF»; null] as («inferredType.qualifiedName») => void'''.toString
		val closure = newInstance(clazz, inferredType, document)
		val template = clazz.newInstance()
		val generateMethod = clazz.getMethod("generate", typeof(Procedures$Procedure1))
		generateMethod.invoke(template, closure).toString
	}
	
	def private newInstance(Class<?> clazz, JvmGenericType context, String document) {
		val resource = context.eResource.resourceSet.createResource(URI::createURI("param.___xbase"))
		resource.load(new StringInputStream(document), null)
		val expression =  resource.contents.head as XExpression
		assertNoErrors(expression)
		val interpreter = (resource as XtextResource).resourceServiceProvider.get(typeof(XbaseInterpreter))
		interpreter.setClassLoader(clazz.classLoader)
		val result = interpreter.evaluate(expression).result
		context.eResource.resourceSet.resources.remove(resource)
		result
	}	
}