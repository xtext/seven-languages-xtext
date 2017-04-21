import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
@SuppressWarnings("all")
public class GenerateHtml {
  public static void main(final String... args) {
    final MyWebsite template = new MyWebsite();
    final Procedure1<MyWebsite> _function = (MyWebsite it) -> {
      it.setAuthor("Fred Flintstone");
      it.setTitle("My Website");
      it.setDescription("A simple Website");
      ArrayList<Section> _sections = it.getSections();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor ");
      _builder.newLine();
      _builder.append("invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam ");
      _builder.newLine();
      _builder.append("et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est ");
      _builder.newLine();
      _builder.append("Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed ");
      _builder.newLine();
      _builder.append("diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. ");
      _builder.newLine();
      _builder.append("At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea ");
      _builder.newLine();
      _builder.append("takimata sanctus est Lorem ipsum dolor sit amet.");
      _builder.newLine();
      Section _section = new Section(
        "First Section", 
        "Bli bla blo.", _builder.toString());
      _sections.add(_section);
      ArrayList<Section> _sections_1 = it.getSections();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor ");
      _builder_1.newLine();
      _builder_1.append("invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam ");
      _builder_1.newLine();
      _builder_1.append("et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est ");
      _builder_1.newLine();
      _builder_1.append("Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed ");
      _builder_1.newLine();
      _builder_1.append("diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. ");
      _builder_1.newLine();
      _builder_1.append("At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea ");
      _builder_1.newLine();
      _builder_1.append("takimata sanctus est Lorem ipsum dolor sit amet.");
      _builder_1.newLine();
      Section _section_1 = new Section(
        "Second Section", 
        "Another description", _builder_1.toString());
      _sections_1.add(_section_1);
    };
    InputOutput.<String>println(template.generate(_function));
  }
}
