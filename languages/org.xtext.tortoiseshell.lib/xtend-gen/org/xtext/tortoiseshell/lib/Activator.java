/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.xtext.tortoiseshell.lib.Module;

@SuppressWarnings("all")
public class Activator extends AbstractUIPlugin {
  private static Activator INSTANCE;
  
  private Injector injector;
  
  @Override
  public void start(final BundleContext context) throws Exception {
    super.start(context);
    Activator.INSTANCE = this;
  }
  
  @Override
  public void stop(final BundleContext context) throws Exception {
    super.stop(context);
    Activator.INSTANCE = null;
    this.injector = null;
  }
  
  public static Activator getInstance() {
    return Activator.INSTANCE;
  }
  
  public Injector getInjector() {
    Injector _xblockexpression = null;
    {
      if ((this.injector == null)) {
        this.injector = this.createInjector();
      }
      _xblockexpression = this.injector;
    }
    return _xblockexpression;
  }
  
  protected Injector createInjector() {
    Module _module = new Module();
    return Guice.createInjector(_module);
  }
}
