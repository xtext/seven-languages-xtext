/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.guicemodules.tests

import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Module
import com.google.inject.name.Named
import java.util.Collection
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.guicemodules.guiceModules.ModulesAST

import static org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage.Literals.*
import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(GuiceModulesInjectorProvider)
class IntegrationTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ParseHelper<ModulesAST>
	@Inject extension ValidationTestHelper
	
	@Test def void testParsing() {
		val it = '''
			import java.util.ArrayList
			import java.util.Collection
			ModuleA {
				bind List<String> to-instance newArrayList('one','two')
			}
			ModuleB {
				bind Collection to List<String>
			}
			ModuleC mixin ModuleA, ModuleB {
			}
		'''.parse
		
		assertEquals(3, modules.size)
		assertEquals(modules.get(0), modules.get(2).mixins.get(0))
		assertEquals(modules.get(1), modules.get(2).mixins.get(1))
	}
	
	@Test def void testValidation_01() {
		'''
			MyModule {
				bind @SuppressWarnings String to-instance 'foo' 
			}
		'''.parse.assertError(XANNOTATION, null)
	}
	
	@Test def void testValidation_02() {
		'''
			MyModule {
				bind @com.google.inject.name.Named('foo') String to-instance 'foo' 
			}
		'''.parse.assertNoErrors
	}
	
	@Test def void testCompileAndExecute() {
		'''
			import java.util.Collection
			import java.util.List
			import com.google.inject.name.Named
			
			foo.bar.MyModule {
				bind List<String> to-instance newArrayList('one','two')
				bind Collection<?> to List<String>
				bind @Named('foo-bar') String to-instance 'hello annotation'
			}
		'''
		.compile[
			val module = compiledClass.getDeclaredConstructor().newInstance as Module
			val obj = Guice.createInjector(module).getInstance(InjectionTarget)
			assertEquals('one', obj.col.head)
			assertEquals('hello annotation', obj.s)
		]
	}
}

class InjectionTarget {
	@Inject @Named('foo-bar') public String s
	@Inject public Collection<?> col
}