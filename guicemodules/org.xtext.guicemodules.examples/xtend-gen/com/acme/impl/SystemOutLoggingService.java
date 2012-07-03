package com.acme.impl;

import com.acme.LoggingService;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class SystemOutLoggingService implements LoggingService {
  public void logMessage(final String msg) {
    InputOutput.<String>println(msg);
  }
}
