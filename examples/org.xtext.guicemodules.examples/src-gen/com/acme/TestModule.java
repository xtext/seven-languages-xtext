package com.acme;

import com.acme.impl.BufferedLoggingService;
import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class TestModule implements com.google.inject.Module {
  private RuntimeModule runtimeModule = new com.acme.RuntimeModule();

  private DataProvider _toInstance0() {
    final DataProvider _function = () -> {
      return "dummy-data";
    };
    return _function;
  }

  public void configure(final Binder binder) {
    configure(binder, new HashSet<Key<?>>());
  }

  /**
   * Registers bindings for keys not present in the given set.
   */
  public void configure(final Binder bind, final Set<Key<?>> usedKeys) {
    try {
    	{
    		Key<DataProvider> key = Key.get(new TypeLiteral<DataProvider>(){});
    		if (usedKeys.add(key)) {
    			bind.bind(key).toInstance(_toInstance0());
    		}
    	}
    	{
    		Key<LoggingService> key = Key.get(new TypeLiteral<LoggingService>(){});
    		if (usedKeys.add(key)) {
    			bind.bind(key).to(Key.get(new TypeLiteral<BufferedLoggingService>(){}));
    		}
    	}
    	runtimeModule.configure(bind, usedKeys);
    } catch (Exception e) {
    	throw new RuntimeException(e);
    }
  }
}
