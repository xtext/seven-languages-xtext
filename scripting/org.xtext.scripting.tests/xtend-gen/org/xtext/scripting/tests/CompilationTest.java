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
  public void testHelloWorld() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("script sample.HelloWorld");
    _builder.newLine();
    _builder.newLine();
    _builder.append("println(\'Hello World!\')");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package sample;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.InputOutput;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class HelloWorld {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public static void main(final String... args) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("InputOutput.<String>println(\"Hello World!\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
  }
  
  @Test
  public void testDeepThought() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("script sample.DeepThought");
    _builder.newLine();
    _builder.append("val answer = 7 * 6;");
    _builder.newLine();
    _builder.append("println(answer)");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package sample;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.InputOutput;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class DeepThought {");
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
  }
}
