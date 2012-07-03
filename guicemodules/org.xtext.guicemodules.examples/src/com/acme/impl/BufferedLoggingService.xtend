package com.acme.impl

import com.acme.LoggingService

class BufferedLoggingService implements LoggingService {
	
	@Property StringBuilder buffer = new StringBuilder

	override logMessage(String msg) {
		buffer.append(msg)
	}
	
	override toString() {
		buffer.toString
	}
	
}