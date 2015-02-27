/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.acme.impl;

import com.acme.LoggingService;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class BufferedLoggingService implements LoggingService {
  @Accessors
  private StringBuilder buffer = new StringBuilder();
  
  @Override
  public void logMessage(final String msg) {
    this.buffer.append(msg);
  }
  
  @Override
  public String toString() {
    return this.buffer.toString();
  }
  
  @Pure
  public StringBuilder getBuffer() {
    return this.buffer;
  }
  
  public void setBuffer(final StringBuilder buffer) {
    this.buffer = buffer;
  }
}
