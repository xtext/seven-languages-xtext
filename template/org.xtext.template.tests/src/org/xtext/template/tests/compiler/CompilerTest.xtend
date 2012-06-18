package org.xtext.template.tests.compiler

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.parameterized.InjectParameter
import org.eclipse.xtext.junit4.parameterized.ParameterizedXtextRunner
import org.eclipse.xtext.junit4.parameterized.ResourceURIs
import org.eclipse.xtext.junit4.parameterized.XpectString
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.template.TemplateInjectorProvider
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler

@SuppressWarnings("restriction")
@InjectWith(typeof(TemplateInjectorProvider))
@RunWith(typeof(ParameterizedXtextRunner))
@ResourceURIs(baseDir = "src/org/xtext/template/tests/compiler", fileExtensions = "template")
class CompilerTest {
	
	@Inject extension ValidationTestHelper
	
	@Inject JvmModelGenerator generator
	
	@InjectParameter Resource resource
	
	@Inject OnTheFlyJavaCompiler javaCompiler;
	
	@Test def noErrors(){
		resource.contents.head.assertNoErrors
	}
	
	@XpectString def execute() {
		val inferredType = resource.contents.filter(typeof(JvmGenericType)).head
		val javaCode = generator.generateType(inferredType);
		println(javaCode)
		val clazz = javaCompiler.compileToClass(inferredType.qualifiedName, javaCode.toString)
		val generateMethod = clazz.getMethod("generate")
		val result = generateMethod.invoke(clazz.newInstance)
		result.toString 
	}	
}