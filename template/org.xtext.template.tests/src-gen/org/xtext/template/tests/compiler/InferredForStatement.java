package org.xtext.template.tests.compiler;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

public class InferredForStatement {
  public InferredForStatement() {
  }
  
  public InferredForStatement(final InferredForStatement other) {
  }
  
  private Iterable<? extends Integer> loop0() {
    ArrayList<Integer> _newArrayList = CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
    return _newArrayList;
  }
  
  private Object exp0(final Integer x) {
    return x;
  }
  
  public String generate() {
    StringBuilder out = new StringBuilder();
    out.append("\n");
    for(Integer x : loop0()) {
      out.append("\n	No ");
      out.append(exp0(x));
      out.append("\n");
    }
    out.append("");
    return out.toString();
  }
  
  public String generate(final Procedure1<InferredForStatement> init) {
    try {
      InferredForStatement tpl = getClass().getConstructor(getClass()).newInstance(this);
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
