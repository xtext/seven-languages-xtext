/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.tortoiseshell.lib.Activator;

@SuppressWarnings("all")
public class ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
  @Override
  protected Bundle getBundle() {
    Activator _instance = Activator.getInstance();
    return _instance.getBundle();
  }
  
  @Override
  protected Injector getInjector() {
    Activator _instance = Activator.getInstance();
    return _instance.getInjector();
  }
}
