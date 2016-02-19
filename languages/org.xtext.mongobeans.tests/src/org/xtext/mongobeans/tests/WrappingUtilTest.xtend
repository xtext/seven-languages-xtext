/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.tests

import com.google.inject.Inject
import com.mongodb.BasicDBObject
import com.mongodb.DBObject
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.mongobeans.lib.IMongoBean
import org.xtext.mongobeans.lib.WrappingUtil

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MongoBeansInjectorProvider)
class WrappingUtilTest {

	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions

	@Accessors Class<?> mongoBeanClass

	@Before def setUp() {
		'''
			Foo {
				String bar
				Foo* foos
			}
		'''.compile[
			mongoBeanClass = compiledClass
			WrappingUtil.setClassLoader(compiledClass.classLoader) 
		]
	}

	@Test def testUnwrap() {
		val one = mongoBeanClass.newInstance
		val two = mongoBeanClass.newInstance
		val three = mongoBeanClass.newInstance
		one.invoke('setBar', 'BAR')
		(one.invoke('getFoos') as List<Object>).add(two)
		(one.invoke('getFoos') as List<Object>).add(three)
		
		val oneDB = WrappingUtil.unwrap(one)
		assertEquals('Foo', oneDB.get(IMongoBean.JAVA_CLASS_KEY))
		assertEquals('BAR', oneDB.get('bar'))
		val foos = oneDB.get('foos') as List<?>
		assertTrue(foos.contains(two.invoke('getDbObject')))
		assertTrue(foos.contains(three.invoke('getDbObject')))
	}

	@Test def testWrap() {
		val oneDB = newFooDbObject('one')
		val twoDB = newFooDbObject('two')
		val threeDB = newFooDbObject('three')
		oneDB.put('foos', #[twoDB, threeDB])		
		
		val oneBean = newFooMongoBean(oneDB)
		assertEquals('Foo', oneBean.class.name)
		assertEquals('one', oneBean.invoke('getBar'))
		val foos = oneBean.invoke('getFoos') as List<?>
		assertEquals(WrappingUtil.unwrap(foos.head), twoDB)
		assertEquals(WrappingUtil.unwrap(foos.last), threeDB)
	}


	def protected newFooDbObject(String bar) {
		new BasicDBObject => [
			put(IMongoBean.JAVA_CLASS_KEY, 'Foo')
			put('bar', bar)
		]
	}

	def protected newFooMongoBean(DBObject source) {
		mongoBeanClass
			.getConstructor(DBObject) 
			.newInstance(source)
	}

}