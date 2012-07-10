package org.xtext.tortoiseshell.lib;

import com.google.common.base.Objects;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.xtext.tortoiseshell.lib.Module;

@SuppressWarnings("all")
public class Activator extends AbstractUIPlugin {
  private static Activator INSTANCE;
  
  private Injector injector;
  
  public void start(final BundleContext context) throws Exception {
    super.start(context);
    Activator.INSTANCE = this;
  }
  
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
      boolean _equals = Objects.equal(this.injector, null);
      if (_equals) {
        Injector _createInjector = this.createInjector();
        this.injector = _createInjector;
      }
      _xblockexpression = (this.injector);
    }
    return _xblockexpression;
  }
  
  protected Injector createInjector() {
    Module _module = new Module();
    Injector _createInjector = Guice.createInjector(_module);
    return _createInjector;
  }
}
