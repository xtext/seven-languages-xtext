package org.xtext.template.tests.compiler;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

public class NestedForStatement {
  public NestedForStatement() {
  }
  
  public NestedForStatement(final NestedForStatement other) {
  }
  
  private Iterable<? extends Integer> loop0() {
    ArrayList<Integer> _newArrayList = CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
    return _newArrayList;
  }
  
  private Iterable<? extends String> loop1(final Integer x) {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("a", "b", "c");
    return _newArrayList;
  }
  
  private Object exp0(final Integer x, final String y) {
    return x;
  }
  
  private Object exp1(final Integer x, final String y) {
    return y;
  }
  
  public String generate() {
    StringBuilder out = new StringBuilder();
    out.append("\n");
    for(Integer x : loop0()) {
      out.append("\n	");
      for(String y : loop1(x)) {
        out.append("\n		");
        out.append(exp0(x, y));
        out.append("-");
        out.append(exp1(x, y));
        out.append("\n	");
      }
      out.append("\n");
    }
    out.append("\n");
    return out.toString();
  }
  
  public String generate(final Procedure1<NestedForStatement> init) {
    try {
      NestedForStatement tpl = getClass().getConstructor(getClass()).newInstance(this);
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
