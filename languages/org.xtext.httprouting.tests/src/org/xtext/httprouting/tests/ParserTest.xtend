/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.httprouting.tests

import com.google.inject.Inject
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.eclipse.xtext.xbase.testing.TemporaryFolder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@InjectWith(RouteInjectorProvider)
@RunWith(XtextRunner)
class ParserTest {
	
	@Inject extension CompilationTestHelper
	@Rule public TemporaryFolder tempFolder = new TemporaryFolder();
	
	@Test 
	def testFirstRuleDoesNotMatch() {'''
			GET /client/foo/:id/:name*  when id=="43" do response.addHeader(id, null)
			GET /client/foo/:id/:name*  when id=="42" do response.addHeader(name + "/" + id, null)
		'''.compile [
			val servlet = compiledClass.newInstance as HttpServlet
			
			response => [
				servlet.service(request("/client/foo/42/rest/of"), it)
				assertTrue("containsHeader('rest/of/42')",containsHeader('rest/of/42'))
			]
			
			response => [
				servlet.service(request("/client/foo/43/rest/of"), it)
				assertTrue("containsHeader('43')", containsHeader('43'))
			]
		]
	}
	
	/**
	 * creates a HttpServletRequest proxy
	 */
	def request(String url) {
		HttpServletRequest.newProxy [ proxy, method, args |
			switch method.name {
				case 'getRequestURL' : 
					new StringBuffer(url)
				case 'getMethod' : 
					'GET'
			}
		]
	}
	
	/**
	 * creates a HttpServletResponse proxy
	 */
	def response() {
		val header = <String>newHashSet
		HttpServletResponse.newProxy [ proxy, method, args |
			switch method.name {
				case 'addHeader' : 
					header.add(args.get(0) as String)
				case 'containsHeader' : 
					header.contains(args.get(0))
				default:
					false
			}
		]
	}
	
	/**
	 * utility to create a proxy for a class and an invocation handler
	 */
	def private <T> T newProxy(Class<T> clazz, InvocationHandler handler) {
		Proxy.newProxyInstance(getClass().classLoader,	newArrayList(clazz), handler) as T
	}
}

