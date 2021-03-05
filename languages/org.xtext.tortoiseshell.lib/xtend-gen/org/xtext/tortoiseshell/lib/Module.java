/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib;

import com.google.inject.Binder;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.service.AbstractGenericModule;

@SuppressWarnings("all")
public class Module extends AbstractGenericModule {
  @Override
  public void configure(final Binder binder) {
    binder.<AbstractUIPlugin>bind(AbstractUIPlugin.class).toInstance(Activator.getInstance());
  }
}
