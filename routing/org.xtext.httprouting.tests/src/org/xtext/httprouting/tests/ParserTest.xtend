package org.xtext.httprouting.tests

import com.google.inject.Inject
import javax.servlet.http.HttpServlet 
import static org.junit.Assert.*
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.httprouting.RouteInjectorProvider
 
@InjectWith(typeof(RouteInjectorProvider))
@RunWith(typeof(XtextRunner))
class ParserTest {
	
	@Inject extension CompilationTestHelper
	
	@Test 
	def testFirstRuleDoesNotMatch(){ 
	'''
			import org.xtext.httprouting.tests.TestClass
			GET /client/foo/:id/:name*  when id=="43" TestClass::doSomethingStatic(id)   
			GET /client/foo/:id/:name*  when id=="42" TestClass::doSomethingStatic(name + "/" + id) 
	'''.compile[
		val servlet = compiledClass.newInstance as HttpServlet
		servlet.service(new MockedHttpServletRequest("/client/foo/42/rest/of"),null)
		assertEquals("rest/of/42",TestClass::id)
	] 
	}
}