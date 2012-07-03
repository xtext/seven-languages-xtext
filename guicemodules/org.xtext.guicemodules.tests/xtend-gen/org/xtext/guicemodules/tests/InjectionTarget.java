package org.xtext.guicemodules.tests;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import java.util.Collection;

@SuppressWarnings("all")
public class InjectionTarget {
  @Inject
  @Named(value = "foo-bar")
  public String s;
  
  @Inject
  public Collection col;
}
