/*******************************************************************************
 * Copyright (c) 2012, 2020 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.template.tests.compiler

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.template.tests.TemplateInjectorProvider

import static org.junit.Assert.*

import static extension org.eclipse.xtext.util.Strings.toUnixLineSeparator

@RunWith(XtextRunner)
@InjectWith(TemplateInjectorProvider)
class IntegrationTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@Test def void testParseAndCompile_01() {
		'''
			<!--<< >>-->
			Hello World
		'''.toUnixLineSeparator.replace.compile [
			val result = compiledClass.newInstance.invoke('generate', null)
			assertEquals('Hello World',result.toString)
		]
	}
	
	@Test def void testParseAndCompile_02() {
		'''
			<!--<<
				param name = 'Foo'
				param nullString
				param String string
				param list = #['one', 'two', 'three', 'four']
			>>-->
			<html><<nullString>>
			  <title><<name>>/<<nullString>>/<<string>></title>
			  <<FOR element : list>>
			    <<IF element == 'one'>>
			      <h1><<element>></h1>
			    <<ELSEIF element == 'two'>>
			      <h2><<element>></h2>
			    <<ELSE>>
			      <p><<element>></p>
			    <<ENDIF>>
			  <<ENDFOR>>
			</html>
		'''.toUnixLineSeparator.replace.compile [
			val result = compiledClass.newInstance.invoke('generate', null)
			assertEquals('''
				<html>
				  <title>Foo//</title>
				      <h1>one</h1>
				      <h2>two</h2>
				      <p>three</p>
				      <p>four</p>
				</html>'''.toUnixLineSeparator.toString,result.toString)
		]
	}
	
	def replace(CharSequence s) {
		s.toString.replace('<<','«').replace('>>','»')
	}
}