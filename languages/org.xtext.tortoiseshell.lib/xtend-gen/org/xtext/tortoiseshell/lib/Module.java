/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib;

import com.google.inject.Binder;
import com.google.inject.binder.AnnotatedBindingBuilder;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.xtext.tortoiseshell.lib.Activator;

@SuppressWarnings("all")
public class Module extends AbstractGenericModule {
  public void configure(final Binder binder) {
    AnnotatedBindingBuilder<AbstractUIPlugin> _bind = binder.<AbstractUIPlugin>bind(AbstractUIPlugin.class);
    Activator _instance = Activator.getInstance();
    _bind.toInstance(_instance);
  }
}
