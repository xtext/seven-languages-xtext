package org.xtext.builddsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.builddsl.BuildDSLInjectorProvider
import org.xtext.builddsl.build.BuildFile

import static org.xtext.builddsl.build.BuildPackage$Literals.*
import static org.xtext.builddsl.validation.BuildDSLValidator.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(BuildDSLInjectorProvider))
class ValidationTest {
	
	@Inject extension ParseHelper<BuildFile> 
	@Inject extension ValidationTestHelper 
	
	@Test def testSelfDependency() {
		'''
			task Foo depends Foo {}
		'''.parse
		.assertError(TASK, SELF_DEPENDENCY)
	}
	
	@Test def testSimpleCyclicDependency() {
		'''
			task Foo depends Bar {}
			task Bar depends Baz {}
			task Baz depends Foo {}
		'''.parse
		.assertError(TASK, CYCLIC_DEPENDENCY)
	}
	
	@Test def testNoCycle() {
		'''
			task Foo depends Bar, Baz {}
			task Bar depends Baz {}
			task Baz {}
		'''.parse
		.assertNoError(CYCLIC_DEPENDENCY)
	}
	
}