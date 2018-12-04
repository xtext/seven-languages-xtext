package com.acme;

import com.acme.DataProvider;
import com.acme.impl.DataFile;
import com.acme.impl.FileDataProvider;
import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class RuntimeModule implements com.google.inject.Module {
  private String _toInstance1() {
    return "my-data.txt";
  }
  
  @DataFile
  private String _from1;
  
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
    			bind.bind(key).to(Key.get(new TypeLiteral<FileDataProvider>(){}));
    		}
    	}
    	{
    		Key<String> key = Key.get(new TypeLiteral<String>(){}, getClass().getDeclaredField("_from1").getAnnotations()[0]);
    		if (usedKeys.add(key)) {
    			bind.bind(key).toInstance(_toInstance1());
    		}
    	}
    } catch (Exception e) {
    	throw new RuntimeException(e);
    }
  }
}
