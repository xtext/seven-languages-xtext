package org.xtext.scripting.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.scripting.ScriptingInjectorProvider;

@RunWith(value = XtextRunner.class)
@InjectWith(value = ScriptingInjectorProvider.class)
@SuppressWarnings("all")
public class CompilationTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testDeepThought() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("val answer = 7 * 6;");
    _builder.newLine();
    _builder.append("println(answer)");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.InputOutput;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class __synthetic0 {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public static void main(final String[] args) {");
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
  }
  
  @Test
  public void testMixedImports() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.io.File");
    _builder.newLine();
    _builder.append("val file = new File(\'test\')");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.FileoutputStream");
    _builder.newLine();
    _builder.append("val stream = new FileOutputStream(file)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.*");
    _builder.newLine();
    _builder.append("val buffered = new BufferedOutputStream(stream) ");
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
    _builder_1.append("public class __synthetic0 {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public static void main(final String[] args) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("try {");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("File _file = new File(\"test\");");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final File file = _file;");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("FileOutputStream _fileOutputStream = new FileOutputStream(file);");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final FileOutputStream stream = _fileOutputStream;");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("BufferedOutputStream _bufferedOutputStream = new BufferedOutputStream(stream);");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final BufferedOutputStream buffered = _bufferedOutputStream;");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("} catch (Exception _e) {");
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
  }
}
