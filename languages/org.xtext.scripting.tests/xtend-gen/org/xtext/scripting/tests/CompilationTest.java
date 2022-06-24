/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.scripting.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ScriptingInjectorProvider.class)
@SuppressWarnings("all")
public class CompilationTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;

  @Test
  public void testDeepThought() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("val answer = 7 * 6;");
      _builder.newLine();
      _builder.append("println(answer)");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("import org.eclipse.xtext.xbase.lib.InputOutput;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("@SuppressWarnings(\"all\")");
      _builder_1.newLine();
      _builder_1.append("public class MyFile {");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public static void main(final String... args) {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("final int answer = (7 * 6);");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("InputOutput.<Integer>println(Integer.valueOf(answer));");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void testConstrutorChaining() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("val file = new java.io.File(\'test\')\t\t\t");
      _builder.newLine();
      _builder.append("val stream = new java.io.FileOutputStream(file)");
      _builder.newLine();
      _builder.append("val buffered = new java.io.BufferedOutputStream(stream)");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("import java.io.BufferedOutputStream;");
      _builder_1.newLine();
      _builder_1.append("import java.io.File;");
      _builder_1.newLine();
      _builder_1.append("import java.io.FileOutputStream;");
      _builder_1.newLine();
      _builder_1.append("import org.eclipse.xtext.xbase.lib.Exceptions;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("@SuppressWarnings(\"all\")");
      _builder_1.newLine();
      _builder_1.append("public class MyFile {");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public static void main(final String... args) {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("try {");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("final File file = new File(\"test\");");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("final FileOutputStream stream = new FileOutputStream(file);");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("final BufferedOutputStream buffered = new BufferedOutputStream(stream);");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("} catch (Throwable _e) {");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("throw Exceptions.sneakyThrow(_e);");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
