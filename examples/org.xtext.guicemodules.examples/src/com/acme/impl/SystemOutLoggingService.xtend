package com.acme.impl

import com.acme.LoggingService

class SystemOutLoggingService implements LoggingService {

	override logMessage(String msg) {
		println(msg)
	}
	
}