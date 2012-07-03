package org.xtext.template.tests.compiler;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

public class SimpleParameter {
  private String param1;
  
  public SimpleParameter() {
  }
  
  public SimpleParameter(final SimpleParameter other) {
    this.param1 = other.param1;
  }
  
  private Object exp0() {
    return this.param1;
  }
  
  public String generate() {
    StringBuilder out = new StringBuilder();
    out.append("\nexpression '");
    out.append(exp0());
    out.append("'");
    return out.toString();
  }
  
  public String generate(final Procedure1<SimpleParameter> init) {
    try {
      SimpleParameter tpl = getClass().getConstructor(getClass()).newInstance(this);
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
