/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.acme.impl;

import com.acme.LoggingService;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class BufferedLoggingService implements LoggingService {
  private StringBuilder _buffer = new Function0<StringBuilder>() {
    public StringBuilder apply() {
      StringBuilder _stringBuilder = new StringBuilder();
      return _stringBuilder;
    }
  }.apply();
  
  public StringBuilder getBuffer() {
    return this._buffer;
  }
  
  public void setBuffer(final StringBuilder buffer) {
    this._buffer = buffer;
  }
  
  public void logMessage(final String msg) {
    StringBuilder _buffer = this.getBuffer();
    _buffer.append(msg);
  }
  
  public String toString() {
    StringBuilder _buffer = this.getBuffer();
    String _string = _buffer.toString();
    return _string;
  }
}
