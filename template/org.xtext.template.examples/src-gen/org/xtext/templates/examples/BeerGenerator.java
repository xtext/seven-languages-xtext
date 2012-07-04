package org.xtext.templates.examples;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

public class BeerGenerator {
  public BeerGenerator() {
  }
  
  public BeerGenerator(final BeerGenerator other) {
  }
  
  private Iterable<? extends Integer> loop0() {
    IntegerRange _upTo = new IntegerRange(99, 3);
    return _upTo;
  }
  
  private Object exp0(final Integer i) {
    return i;
  }
  
  private Object exp1(final Integer i) {
    return i;
  }
  
  private Object exp2(final Integer i) {
    int _minus = ((i).intValue() - 1);
    return Integer.valueOf(_minus);
  }
  
  public String generate() {
    StringBuilder out = new StringBuilder();
    out.append("\n\n");
    for(Integer i : loop0()) {
      out.append("\n");
      out.append(exp0(i));
      out.append(" bottles of beer on the wall, ");
      out.append(exp1(i));
      out.append(" bottles of beer.\nTake one down and pass it around, ");
      out.append(exp2(i));
      out.append(" bottles of beer on the wall.\n");
    }
    out.append("\n2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n\n1 bottle of beer on the wall, 1 bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\n\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the shop and buy some more. 99 bottles of beer on the wall.\n");
    return out.toString();
  }
  
  public String generate(final Procedure1<BeerGenerator> init) {
    try {
      BeerGenerator tpl = getClass().getConstructor(getClass()).newInstance(this);
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
