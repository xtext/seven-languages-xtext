/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.mongobeans.mongoBeans.MongoBean
import org.xtext.mongobeans.mongoBeans.MongoFile

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MongoBeansInjectorProvider)
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
		'''.parse.eAllContents.filter(MongoBean)
		assertEquals(QualifiedName.create('pkg', 'Foo'), beans.head.fullyQualifiedName)
		assertEquals(QualifiedName.create('pkg', 'Bar'), beans.last.fullyQualifiedName)
	}
}