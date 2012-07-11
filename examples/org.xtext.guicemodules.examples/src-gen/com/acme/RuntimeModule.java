package com.acme;

import com.acme.impl.DataFile;
import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.Module;
import java.util.Set;

public class RuntimeModule implements Module {
  private String _toInstance1() {
    return "my-data.txt";
  }
  
  @DataFile
  private String _from1;
  
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
    			bind.bind(key).to(com.google.inject.Key.get(new com.google.inject.TypeLiteral<com.acme.impl.FileDataProvider>(){}));
    		}
    	}
    	{
    		com.google.inject.Key<java.lang.String> key = 
    			com.google.inject.Key.get(new com.google.inject.TypeLiteral<java.lang.String>(){}, getClass().getDeclaredField("_from1").getAnnotations()[0]);
    		if (usedKeys.add(key)) {
    			bind.bind(key).toInstance(_toInstance1());
    		}
    	}
    } catch (Exception e) {
    	throw new RuntimeException(e);
    }
    
  }
}
