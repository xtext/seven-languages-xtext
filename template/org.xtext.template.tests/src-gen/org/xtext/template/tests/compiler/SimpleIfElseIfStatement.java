package org.xtext.template.tests.compiler;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

public class SimpleIfElseIfStatement {
  private boolean param1;
  
  private boolean param2;
  
  public SimpleIfElseIfStatement() {
  }
  
  public SimpleIfElseIfStatement(final SimpleIfElseIfStatement other) {
    this.param1 = other.param1;
    this.param2 = other.param2;
  }
  
  private boolean cond0() {
    return this.param1;
  }
  
  private boolean cond1() {
    return this.param2;
  }
  
  public String generate() {
    StringBuilder out = new StringBuilder();
    out.append("\nhello ");
    if(cond0()) {
      out.append("World");
    } else if(cond1()) {
      out.append("Germany");
    } else {
      out.append("Europe");
    }
    out.append("!");
    return out.toString();
  }
  
  public String generate(final Procedure1<SimpleIfElseIfStatement> init) {
    try {
      SimpleIfElseIfStatement tpl = getClass().getConstructor(getClass()).newInstance(this);
      init.apply(tpl);
      return tpl.generate();
    } catch(Exception e) {
      throw Exceptions.sneakyThrow(e);
    }
  }
  
  public void setParam1(final boolean param1) {
    this.param1 = param1;
  }
  
  public void setParam2(final boolean param2) {
    this.param2 = param2;
  }
  
  public String toString() {
    return new ToStringHelper().toString(this);
  }
}
