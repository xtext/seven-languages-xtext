package org.xtext.scripting.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.scripting.ScriptingInjectorProvider
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import java.lang.reflect.InvocationTargetException

import static org.junit.Assert.*
import static java.util.Collections.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ScriptingInjectorProvider))
class ExecutionTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@Test def void testHelloWorld() {
		'''
			throw new Exception('Hello World')
		'''.compileAndExecuteMainAndExpect('Hello World')
	}
	
	@Test def void testDeepThought() {
		'''
			val answer = 2 * (17 + 4)
			throw new Exception(answer.toString)
		'''.compileAndExecuteMainAndExpect(42)
	}
	
	def protected compileAndExecuteMainAndExpect(CharSequence script, Object expectedResult) {
		script.compile [
			try { 
				compiledClass.newInstance.invoke('main', null)
				fail('Expected ResultException not thrown.')
			} catch(InvocationTargetException exc) {
				assertEquals(expectedResult.toString(), exc.cause.message)
			}		
		]
	}
}

