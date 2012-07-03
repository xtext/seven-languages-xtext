package org.xtext.template.tests.jvmmodel;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

public class ParameterTypeInference {
  private String param1 = "foo";
  
  public ParameterTypeInference() {
  }
  
  public ParameterTypeInference(final ParameterTypeInference other) {
    this.param1 = other.param1;
  }
  
  public String generate() {
    StringBuilder out = new StringBuilder();
    out.append("\n\nHello World!");
    return out.toString();
  }
  
  public String generate(final Procedure1<ParameterTypeInference> init) {
    try {
      ParameterTypeInference tpl = getClass().getConstructor(getClass()).newInstance(this);
      init.apply(tpl);
      return tpl.generate();
    } catch(Exception e) {
      throw Exceptions.sneakyThrow(e);
    }
  }
  
  public void setParam1(final String param1) {
    this.param1 = param1;
  }
  
  public String toString() {
    return new ToStringHelper().toString(this);
  }
}
