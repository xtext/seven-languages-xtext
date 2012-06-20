package or.cradle.language.tests

import com.google.inject.Inject
import java.util.List
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.cradle.CradleInjectorProvider
import org.xtext.cradle.cradle.CradleFile
import org.xtext.cradle.cradle.Declaration

import static org.junit.Assert.*

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