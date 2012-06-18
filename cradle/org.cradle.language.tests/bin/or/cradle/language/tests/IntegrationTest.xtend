package or.cradle.language.tests

import org.eclipse.xtext.junit4.InjectWith
import org.cradle.language.CradleInjectorProvider
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import com.google.inject.Inject
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.cradle.language.cradle.CradleFile
import org.cradle.language.cradle.Task

import static org.junit.Assert.*
import java.util.List
import org.cradle.language.cradle.Declaration

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CradleInjectorProvider))
class IntegrationTest {
	
	@Inject extension CompilationTestHelper 
	
	@Test def testSimple() {
		'''
			param String projectName = 'Hello'
			
			task Start {
				println(context.projectName)
			}
		'''.assertCompilesTo('''
		''')
	}
	
	@Test def testExtensionMethod() {
		'''
			param String projectName = 'Hello'
			
			task Start {
ллл				println(context.projectName)
			}
		'''.compile [
			val file = it.source.contents.head as CradleFile
			assertNotNull(file.declarations.get('Start'))
		]
	}
	
	def <T extends Declaration> T get(List<T> list, String key) {
		list.findFirst[ name == key ]
	}
	
}