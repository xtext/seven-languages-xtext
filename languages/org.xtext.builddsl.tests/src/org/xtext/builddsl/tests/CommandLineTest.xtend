/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.tests

import com.google.inject.Inject
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.eclipse.xtext.xbase.testing.TemporaryFolder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(BuildDSLInjectorProvider)
class CommandLineTest {
	
	@Inject extension CompilationTestHelper
	@Rule public TemporaryFolder temporaryFolder
	
	@Test def testStringParameterWithDefault() {
		val file = '''
			package foo
			
			param String projectName = 'Hello'
			
			task Start {
				println(projectName)
			} 
		'''
		file.assertExecute("Start", '''
			[Task 'Start']
			Hello
		''')
		file.assertExecute("Start --projectName MyProject", '''
			[Task 'Start']
			MyProject
		''')
	}
	
	@Test def testFileParameter() {
		val file = '''
			package foo
			
			import java.io.File
			
			param File file
			
			task Check {
				if(file == null) 
					showHelp(null)
				else if(file.exists)
					println('yes')
				else 
					println('no')
			}
		'''
		file.assertExecute("Check", '''
			[Task 'Check']
			Build 'MyFile'

			Tasks:
				Check

			Parameters:
				--file <File>

		''')
		file.assertExecute("Check --file " + System.getProperty('user.dir'), '''
			[Task 'Check']
			yes
		''')
	}
	
	@Test def testDependencies() {
		val file = '''
			package foo
			
			task Bar depends Baz {
			} 

			task Foo depends Bar {
			} 
			
			task Baz {
			}
			
			task FooBar depends Bar {
			} 
		'''
		file.assertExecute("Foo", '''
			[Task 'Baz']
			[Task 'Bar']
			[Task 'Foo']
		''')
		file.assertExecute("FooBar", '''
			[Task 'Baz']
			[Task 'Bar']
			[Task 'FooBar']
		''')
		file.assertExecute("Baz", '''
			[Task 'Baz']
		''')
	}
	
	@Test def testCompileJava() {
		val tmpDir = System.getProperty('java.io.tmpdir')
		val file = '''
			package foo
			import java.io.File
			import static org.xtext.builddsl.lib.JavaCompiler.*
			
			param File source
			param File dest
			
			task Pre {
			}
			
			task Compile depends Pre {
				javac [
					sources += source
					destination = dest
				]	
			} 
		'''
		file.assertExecute("Compile --source testdata/org/xtext/builddsl/tests/SimpleMain.java --dest " + tmpDir, '''
			[Task 'Pre']
			[Task 'Compile']
			compiling Java files...success.
		''')
	}
	
	def protected assertExecute(CharSequence file, String cmdline, String expectedOutput) {
		val classes = <Class<?>>newArrayList()
		file.compile[ classes += compiledClass ]
		val clazz = classes.head
		val out = new ByteArrayOutputStream()
		val backup = System.out
		System.setOut(new PrintStream(out))
		try {
			val instance = clazz.newInstance
			clazz.superclass.declaredMethods.findFirst[name == 'doBuild'] => [
				accessible = true
				invoke(instance, cmdline.split(' ') as Object)	
			]
		} finally {
			System.setOut(backup)
		}
		assertEquals(expectedOutput, out.toString)
	} 
}