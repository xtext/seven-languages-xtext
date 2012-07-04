package org.xtext.mongobeans.tests

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.mongobeans.MongoBeansInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.junit4.util.ParseHelper
import org.xtext.mongobeans.mongoBeans.MongoFile
import org.xtext.mongobeans.mongoBeans.MongoProperty

import static org.junit.Assert.*
import static org.xtext.mongobeans.mongoBeans.MongoBeansPackage$Literals.*
import static org.xtext.mongobeans.validation.MongoBeansIssueCodes.*


@RunWith(typeof(XtextRunner))
@InjectWith(typeof(MongoBeansInjectorProvider))
class ValidationTest {

	@Inject extension ValidationTestHelper
	@Inject extension ParseHelper<MongoFile>

	@Test def testValidType() {
		'''
			package pkg {
				Foo {
					java.util.Date date
					java.util.regex.Pattern pattern
				}
			}
		'''.parse.assertNoErrors
	}	

	@Test def testInvalidPropertyType() {
		val properties = '''
			Foo {
				java.io.File file
				char character
			}
		'''.parse.eAllContents.filter(typeof(MongoProperty))
		assertError(properties.head, MONGO_PROPERTY, ILLEGAL_TYPE)
		assertError(properties.last, MONGO_PROPERTY, ILLEGAL_TYPE)
	}	
	
	@Test def testInvalidPropertyName() {
		val property = '''
			Foo {
				String _dbObject
			}
		'''.parse.eAllContents.filter(typeof(MongoProperty)).head
		assertError(property, MONGO_PROPERTY, ILLEGAL_PROPERTY_NAME)
	}	
}