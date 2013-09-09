package com.acme;

import com.acme.DataProvider;
import com.acme.RuntimeModule;
import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.Module;
import java.util.Set;

@SuppressWarnings("all")
public class TestModule implements Module {
  private RuntimeModule runtimeModule = new com.acme.RuntimeModule();
  
  private DataProvider _toInstance0() {
    final DataProvider _function = new DataProvider() {
      public String getData() {
        return "dummy-data";
      }
    };
    return _function;
  }
  
  public void configure(final Binder binder) {
    configure(binder, new java.util.HashSet<com.google.inject.Key<?>>());
    
  }
  
  /**
   * Registers bindings for keys not present in the given set.
   */
  public void configure(final Binder bind, final Set<Key<? extends Object>> usedKeys) {
    try {
    	{
    		com.google.inject.Key<com.acme.DataProvider> key = 
    			com.google.inject.Key.get(new com.google.inject.TypeLiteral<com.acme.DataProvider>(){});
    		if (usedKeys.add(key)) {
    			bind.bind(key).toInstance(_toInstance0());
    		}
    	}
    	{
    		com.google.inject.Key<com.acme.LoggingService> key = 
    			com.google.inject.Key.get(new com.google.inject.TypeLiteral<com.acme.LoggingService>(){});
    		if (usedKeys.add(key)) {
    			bind.bind(key).to(com.google.inject.Key.get(new com.google.inject.TypeLiteral<com.acme.impl.BufferedLoggingService>(){}));
    		}
    	}
    	runtimeModule.configure(bind, usedKeys);
    } catch (Exception e) {
    	throw new RuntimeException(e);
    }
    
  }
}
