package org.xtext.mongobeans.tests

import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.xtext.mongobeans.MongoBeansInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import com.google.inject.Inject
import org.junit.Test
import org.eclipse.xtext.junit4.util.ParseHelper
import org.xtext.mongobeans.mongoBeans.MongoFile
import org.xtext.mongobeans.mongoBeans.MongoBean
import static org.junit.Assert.*
import org.eclipse.xtext.naming.QualifiedName

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(MongoBeansInjectorProvider))
class QualifiedNameProviderTest {
	
	@Inject extension IQualifiedNameProvider
	
	@Inject extension ParseHelper<MongoFile>
	
	@Test def testQualifiedName() {
		val beans = '''
			package pkg {
				Foo {
					Bar {
					} bar
				}
			}
		'''.parse.eAllContents.filter(typeof(MongoBean))
		assertEquals(QualifiedName::create('pkg', 'Foo'), beans.head.fullyQualifiedName)
		assertEquals(QualifiedName::create('pkg', 'Bar'), beans.last.fullyQualifiedName)
	}
}