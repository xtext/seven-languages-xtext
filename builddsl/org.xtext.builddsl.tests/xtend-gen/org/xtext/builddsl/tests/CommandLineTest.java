package org.xtext.builddsl.tests;

import com.google.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.builddsl.BuildDSLInjectorProvider;

@RunWith(value = XtextRunner.class)
@InjectWith(value = BuildDSLInjectorProvider.class)
@SuppressWarnings("all")
public class CommandLineTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  private ReflectExtensions _reflectExtensions;
  
  @Test
  public void testStringParameterWithDefault() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("param String projectName = \'Hello\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Start {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("println(projectName)");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    final CharSequence file = _builder;
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("running Start...");
    _builder_1.newLine();
    _builder_1.append("Hello");
    _builder_1.newLine();
    _builder_1.append("success");
    _builder_1.newLine();
    this.assertExecute(file, "Start", _builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("running Start...");
    _builder_2.newLine();
    _builder_2.append("MyProject");
    _builder_2.newLine();
    _builder_2.append("success");
    _builder_2.newLine();
    this.assertExecute(file, "Start --projectName MyProject", _builder_2.toString());
  }
  
  @Test
  public void testFileParameter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.File");
    _builder.newLine();
    _builder.newLine();
    _builder.append("param File file");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Check {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(file == null) ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("showHelp(null)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else if(file.exists)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(\'yes\')");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(\'no\')");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    final CharSequence file = _builder;
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("running Check...");
    _builder_1.newLine();
    _builder_1.append("Build \'__synthetic0\'");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("Tasks:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Check");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("Parameters:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("--file <File>");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("success");
    _builder_1.newLine();
    this.assertExecute(file, "Check", _builder_1.toString());
    String _property = System.getProperty("user.dir");
    String _plus = ("Check --file " + _property);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("running Check...");
    _builder_2.newLine();
    _builder_2.append("yes");
    _builder_2.newLine();
    _builder_2.append("success");
    _builder_2.newLine();
    this.assertExecute(file, _plus, _builder_2.toString());
  }
  
  @Test
  public void testDependencies() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Bar depends Baz {");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Foo depends Bar {");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Baz {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task FooBar depends Bar {");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    final CharSequence file = _builder;
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("running Baz...");
    _builder_1.newLine();
    _builder_1.append("success");
    _builder_1.newLine();
    _builder_1.append("running Bar...");
    _builder_1.newLine();
    _builder_1.append("success");
    _builder_1.newLine();
    _builder_1.append("running Foo...");
    _builder_1.newLine();
    _builder_1.append("success");
    _builder_1.newLine();
    this.assertExecute(file, "Foo", _builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("running Baz...");
    _builder_2.newLine();
    _builder_2.append("success");
    _builder_2.newLine();
    _builder_2.append("running Bar...");
    _builder_2.newLine();
    _builder_2.append("success");
    _builder_2.newLine();
    _builder_2.append("running FooBar...");
    _builder_2.newLine();
    _builder_2.append("success");
    _builder_2.newLine();
    this.assertExecute(file, "FooBar", _builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("running Baz...");
    _builder_3.newLine();
    _builder_3.append("success");
    _builder_3.newLine();
    this.assertExecute(file, "Baz", _builder_3.toString());
  }
  
  @Test
  public void testCompileJava() {
    final String tmpDir = System.getProperty("java.io.tmpdir");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.append("import java.io.File");
    _builder.newLine();
    _builder.append("import org.xtext.builddsl.lib.JavaCompiler");
    _builder.newLine();
    _builder.newLine();
    _builder.append("param File source");
    _builder.newLine();
    _builder.append("param File dest");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Pre {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Compile depends Pre {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("javac [");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("sources += source");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("destination = dest");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("]\t");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    final CharSequence file = _builder;
    String _plus = ("Compile --source testdata/org/xtext/builddsl/tests/SimpleMain.java --dest " + tmpDir);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("running Pre...");
    _builder_1.newLine();
    _builder_1.append("success");
    _builder_1.newLine();
    _builder_1.append("running Compile...");
    _builder_1.newLine();
    _builder_1.append("compiling Java files...success.");
    _builder_1.newLine();
    _builder_1.append("success");
    _builder_1.newLine();
    this.assertExecute(file, _plus, _builder_1.toString());
  }
  
  protected void assertExecute(final CharSequence file, final String cmdline, final String expectedOutput) {
    try {
      final ArrayList<Class<?>> classes = CollectionLiterals.<Class<?>>newArrayList();
      final Procedure1<Result> _function = new Procedure1<Result>() {
          public void apply(final Result it) {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            classes.add(_compiledClass);
          }
        };
      this._compilationTestHelper.compile(file, new IAcceptor<Result>() {
          public void accept(Result t) {
            _function.apply(t);
          }
      });
      final Class<?> clazz = IterableExtensions.<Class<?>>head(classes);
      ByteArrayOutputStream _byteArrayOutputStream = new ByteArrayOutputStream();
      final ByteArrayOutputStream out = _byteArrayOutputStream;
      final PrintStream backup = System.out;
      PrintStream _printStream = new PrintStream(out);
      System.setOut(_printStream);
      try {
        final Object instance = clazz.newInstance();
        String[] _split = cmdline.split(" ");
        this._reflectExtensions.invoke(instance, "build", ((Object) _split));
      } finally {
        System.setOut(backup);
      }
      String _string = out.toString();
      Assert.assertEquals(expectedOutput, _string);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
