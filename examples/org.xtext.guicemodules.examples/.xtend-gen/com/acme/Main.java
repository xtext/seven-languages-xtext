/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.acme;

import com.google.inject.Guice;
import com.google.inject.Inject;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class Main {
  @Inject
  private DataProvider provider;
  
  @Inject
  private LoggingService logger;
  
  public static void main(final String[] args) {
    final Main instance = new Main();
    RuntimeModule _runtimeModule = new RuntimeModule();
    Guice.createInjector(_runtimeModule).injectMembers(instance);
    instance.logTheData();
  }
  
  @Test
  public void testTheSystem() {
    TestModule _testModule = new TestModule();
    Guice.createInjector(_testModule).injectMembers(this);
    this.logTheData();
    Assert.assertEquals("dummy-data", this.logger.toString());
  }
  
  public void logTheData() {
    this.logger.logMessage(this.provider.getData());
  }
}
