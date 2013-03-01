/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.acme;

import com.acme.DataProvider;
import com.acme.LoggingService;
import com.acme.RuntimeModule;
import com.acme.TestModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class Main {
  @Inject
  private DataProvider provider;
  
  @Inject
  private LoggingService logger;
  
  public static void main(final String[] args) {
    Main _main = new Main();
    final Main instance = _main;
    RuntimeModule _runtimeModule = new RuntimeModule();
    Injector _createInjector = Guice.createInjector(_runtimeModule);
    _createInjector.injectMembers(instance);
    instance.logTheData();
  }
  
  @Test
  public void testTheSystem() {
    TestModule _testModule = new TestModule();
    Injector _createInjector = Guice.createInjector(_testModule);
    _createInjector.injectMembers(this);
    this.logTheData();
    String _string = this.logger.toString();
    Assert.assertEquals("dummy-data", _string);
  }
  
  public void logTheData() {
    String _data = this.provider.getData();
    this.logger.logMessage(_data);
  }
}
