package or.cradle.language.tests

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
class IntegrationTest {
	
	@Inject extension CompilationTestHelper
	
	def assertExecute(CharSequence file, String cmdline, String expectedOutput) {
		val classes = <Class<?>>newArrayList()
		file.compile[ classes += compiledClass ]
		val clazz = classes.head
		val out = new ByteArrayOutputStream()
		val backup = System::out
		System::setOut(new PrintStream(out))
		try {
			TestUtil::runMain(clazz, cmdline.split(" "))
		} finally {
			System::setOut(backup)
		}
		assertEquals(expectedOutput, out.toString)
	} 
	
	@Test def testSimple() {
		val file = '''
			param String projectName = 'Hello'
			
			task Start {
				println(projectName)
			} 
		'''
		file.assertExecute("Start", '''
			running Start...Hello
			success
		''')
		file.assertExecute("Start --projectName MyProject", '''
			running Start...MyProject
			success
		''')
	}
	
	
}