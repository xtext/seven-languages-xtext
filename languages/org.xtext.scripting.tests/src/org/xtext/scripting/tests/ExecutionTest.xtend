/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.scripting.tests

import com.google.inject.Inject
import java.lang.reflect.InvocationTargetException
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(ScriptingInjectorProvider)
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
				compiledClass.getDeclaredConstructor().newInstance.invoke('main', null)
				fail('Expected ResultException not thrown.')
			} catch(InvocationTargetException exc) {
				assertEquals(expectedResult.toString(), exc.cause.message)
			}		
		]
	}
}

