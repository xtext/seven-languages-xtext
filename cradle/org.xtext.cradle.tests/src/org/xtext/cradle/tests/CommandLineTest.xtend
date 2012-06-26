package org.xtext.cradle.tests

import com.google.inject.Inject
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.cradle.CradleInjectorProvider

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CradleInjectorProvider))
class CommandLineTest {
	
	@Inject extension CompilationTestHelper
	
	def assertExecute(CharSequence file, String cmdline, String expectedOutput) {
		val classes = <Class<?>>newArrayList()
		file.compile[ classes += compiledClass ]
		val clazz = classes.head
		val out = new ByteArrayOutputStream()
		val backup = System::out
		System::setOut(new PrintStream(out))
		try {
			org::xtext::cradle::tests::RunUtil::runMain(clazz, cmdline.split(" "))
		} finally {
			System::setOut(backup)
		}
		assertEquals(expectedOutput, out.toString)
	} 
	
	@Test def testSimple() {
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
	
	@Test def testSkipIfNeeded() {
		val file = '''
			package foo
			
			task Pre {
				project:/digest.tmp:.delete
				skipTaskIfDigestUnchanged [
					digest = project:/digest.tmp
					files += project:/build.properties
				]	
			} 
			task Main dependsOn Pre {
				skipTaskIfDigestUnchanged [
					digest = project:/digest.tmp
					files += project:/build.properties
				]	
			} 
		'''
		file.assertExecute("Main", '''
			running Pre...
			success
			running Main...
			skipped: Skipped because digest is unchanged
		''')
	}
	
	@Test def testCompileJava() {
		val file = '''
			package foo
			
			task Compile {
				val file = project:/src/org/xtext/cradle/tests/SimpleMain.java
				compileJava [
					sources += file
					destination = project:/tmp/
				]	
			} 
		'''
		file.assertExecute("Compile", '''
			running Pre...
			success
			running Main...
			skipped: Skipped because digest is unchanged
		''')
	}
	
	
}