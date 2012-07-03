package org.xtext.template.tests.compiler;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

public class SimpleExpression {
  public SimpleExpression() {
  }
  
  public SimpleExpression(final SimpleExpression other) {
  }
  
  private Object exp0() {
    return "myexpression";
  }
  
  public String generate() {
    StringBuilder out = new StringBuilder();
    out.append("\nexpression '");
    out.append(exp0());
    out.append("'");
    return out.toString();
  }
  
  public String generate(final Procedure1<SimpleExpression> init) {
    try {
      SimpleExpression tpl = getClass().getConstructor(getClass()).newInstance(this);
      init.apply(tpl);
      return tpl.generate();
    } catch(Exception e) {
      throw Exceptions.sneakyThrow(e);
    }
  }
  
  public String toString() {
    return new ToStringHelper().toString(this);
  }
}
