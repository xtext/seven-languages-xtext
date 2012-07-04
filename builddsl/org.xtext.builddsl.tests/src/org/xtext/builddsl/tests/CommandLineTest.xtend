package org.xtext.builddsl.tests

import com.google.inject.Inject
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.builddsl.BuildDSLInjectorProvider

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(BuildDSLInjectorProvider))
class CommandLineTest {
	
	@Inject extension CompilationTestHelper
	
	@Inject extension ReflectExtensions
	
	@Test def testStringParameterWithDefault() {
		val file = '''
			package foo
			
			param String projectName = 'Hello'
			
			task Start {
				println(projectName)
			} 
		'''
		file.assertExecute("Start", '''
			running Start...
			Hello
			success
		''')
		file.assertExecute("Start --projectName MyProject", '''
			running Start...
			MyProject
			success
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
			running Check...
			Build '__synthetic0'

			Tasks:
				Check

			Parameters:
				--file <File>

			success
		''')
		file.assertExecute("Check --file " + System::getProperty('user.dir'), '''
			running Check...
			yes
			success
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
			running Baz...
			success
			running Bar...
			success
			running Foo...
			success
		''')
		file.assertExecute("FooBar", '''
			running Baz...
			success
			running Bar...
			success
			running FooBar...
			success
		''')
		file.assertExecute("Baz", '''
			running Baz...
			success
		''')
	}
	
	@Test def testCompileJava() {
		val tmpDir = System::getProperty('java.io.tmpdir')
		val file = '''
			package foo
			import java.io.File
			import org.xtext.builddsl.lib.JavaCompiler
			
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
			running Pre...
			success
			running Compile...
			compiling Java files...success.
			success
		''')
	}
	
	def protected assertExecute(CharSequence file, String cmdline, String expectedOutput) {
		val classes = <Class<?>>newArrayList()
		file.compile[ classes += compiledClass ]
		val clazz = classes.head
		val out = new ByteArrayOutputStream()
		val backup = System::out
		System::setOut(new PrintStream(out))
		try {
			val instance = clazz.newInstance
			instance.invoke('build', cmdline.split(' ') as Object) 
		} finally {
			System::setOut(backup)
		}
		assertEquals(expectedOutput, out.toString)
	} 
}