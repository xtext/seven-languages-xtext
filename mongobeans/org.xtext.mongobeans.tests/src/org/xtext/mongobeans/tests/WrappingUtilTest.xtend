package org.xtext.mongobeans.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.xtext.mongobeans.MongoBeansInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.Test
import org.junit.Before
import org.xtext.mongobeans.lib.IMongoBean
import org.xtext.mongobeans.lib.WrappingUtil
import java.util.List
import com.mongodb.BasicDBObject
import com.mongodb.DBObject

import static org.junit.Assert.*
import static java.util.Collections.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(MongoBeansInjectorProvider))
class WrappingUtilTest {

	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@Property Class<?> mongoBeanClass
	
	@Before def setUp() {
		'''
			Foo {
				String bar
				Foo* foos
			}
		'''.compile[
			mongoBeanClass = compiledClass
			WrappingUtil::setClassLoader(compiledClass.classLoader) 
		]
	}
	
	@Test def testUnwrap() {
		val one = mongoBeanClass.newInstance
		val two = mongoBeanClass.newInstance
		val three = mongoBeanClass.newInstance
		one.invoke('setBar', 'BAR')
		(one.invoke('getFoos') as List<Object>).add(two)
		(one.invoke('getFoos') as List<Object>).add(three)
		
		val oneDB = WrappingUtil::unwrap(one)
		assertEquals('Foo', oneDB.get(IMongoBean::JAVA_CLASS_KEY))
		assertEquals('BAR', oneDB.get('bar'))
		val foos = oneDB.get('foos') as List
		assertTrue(foos.contains(two.invoke('getDbObject')))
		assertTrue(foos.contains(three.invoke('getDbObject')))
	}
	
	@Test def testWrap() {
		val oneDB = newFooDbObject('one')
		val twoDB = newFooDbObject('two')
		val threeDB = newFooDbObject('three')
		oneDB.put('foos', newArrayList(twoDB, threeDB))		
		
		val oneBean = newFooMongoBean(oneDB)
		assertEquals('Foo', oneBean.getClass.name)
		assertEquals('one', oneBean.invoke('getBar'))
		val foos = oneBean.invoke('getFoos') as List
		assertEquals(WrappingUtil::unwrap(foos.head), twoDB)
		assertEquals(WrappingUtil::unwrap(foos.last), threeDB)
	}
	
	
	def protected newFooDbObject(String bar) {
		new BasicDBObject => [
			put(IMongoBean::JAVA_CLASS_KEY, 'Foo')
			put('bar', bar)
		]
	}
	
	def protected newFooMongoBean(DBObject source) {
		mongoBeanClass
			.getConstructor(singletonList(typeof(DBObject)) as Class<?>[]) 
			.newInstance(singletonList(source) as Object[])
	}
	
}