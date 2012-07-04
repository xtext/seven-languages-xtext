package org.xtext.templates.examples;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.templates.examples.BeerGenerator;

@SuppressWarnings("all")
public class BeerRunner {
  public static void main(final String[] args) {
    BeerGenerator _beerGenerator = new BeerGenerator();
    String _generate = _beerGenerator.generate();
    InputOutput.<String>println(_generate);
  }
}
