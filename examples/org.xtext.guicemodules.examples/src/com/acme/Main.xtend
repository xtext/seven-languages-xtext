package com.acme

import com.google.inject.Guice
import org.junit.Test
import com.google.inject.Inject

import static org.junit.Assert.*

class Main {
	
	def static void main(String[] args) {
		val instance = new Main
		Guice::createInjector(new RuntimeModule).injectMembers(instance)
		instance.logTheData
	}
	
	@Test def testTheSystem() {
		Guice::createInjector(new TestModule).injectMembers(this)
		logTheData
		assertEquals('dummy-data', logger.toString)
	}
	
	@Inject DataProvider provider
	@Inject LoggingService logger
	
	def logTheData() {
		logger.logMessage(provider.data)
	}
	
}