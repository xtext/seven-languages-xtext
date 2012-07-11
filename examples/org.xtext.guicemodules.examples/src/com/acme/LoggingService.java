package com.acme;

import com.acme.impl.SystemOutLoggingService;
import com.google.inject.ImplementedBy;

@ImplementedBy(SystemOutLoggingService.class)
public interface LoggingService {
	void logMessage(String msg);
}
