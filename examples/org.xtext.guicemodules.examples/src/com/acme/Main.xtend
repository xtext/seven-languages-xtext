/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.acme

import com.google.inject.Guice
import org.junit.Test
import com.google.inject.Inject

import static org.junit.Assert.*

class Main {
	
	@Inject DataProvider provider
	@Inject LoggingService logger

	def static void main(String[] args) {
		val instance = new Main
		Guice.createInjector(new RuntimeModule).injectMembers(instance)
		instance.logTheData
	}
	
	@Test def testTheSystem() {
		Guice.createInjector(new TestModule).injectMembers(this)
		logTheData
		assertEquals('dummy-data', logger.toString)
	}
	
	def logTheData() {
		logger.logMessage(provider.data)
	}
	
}