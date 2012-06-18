package org.xtext.tortoiseshell.runtime;

import com.google.inject.Binder;
import com.google.inject.binder.AnnotatedBindingBuilder;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.xtext.tortoiseshell.runtime.Activator;

@SuppressWarnings("all")
public class Module extends AbstractGenericModule {
  public void configure(final Binder binder) {
    AnnotatedBindingBuilder<AbstractUIPlugin> _bind = binder.<AbstractUIPlugin>bind(AbstractUIPlugin.class);
    Activator _instance = Activator.getInstance();
    _bind.toInstance(_instance);
  }
}
