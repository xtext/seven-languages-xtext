package org.xtext.cradle.tests;

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
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.cradle.CradleInjectorProvider;
import org.xtext.cradle.tests.TestUtil;

@RunWith(value = XtextRunner.class)
@InjectWith(value = CradleInjectorProvider.class)
@SuppressWarnings("all")
public class CommandLineTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  public void assertExecute(final CharSequence file, final String cmdline, final String expectedOutput) {
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
        String[] _split = cmdline.split(" ");
        TestUtil.runMain(clazz, _split);
      } finally {
        System.setOut(backup);
      }
      String _string = out.toString();
      Assert.assertEquals(expectedOutput, _string);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimple() {
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
  public void testSkipIfNeeded() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Pre {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("project:/digest.tmp:.delete");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("skipTaskIfDigestUnchanged [");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("digest = project:/digest.tmp");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("files += project:/build.properties");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("]\t");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    _builder.append("task Main dependsOn Pre {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("skipTaskIfDigestUnchanged [");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("digest = project:/digest.tmp");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("files += project:/build.properties");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("]\t");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    final CharSequence file = _builder;
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("running Pre...");
    _builder_1.newLine();
    _builder_1.append("success");
    _builder_1.newLine();
    _builder_1.append("running Main...");
    _builder_1.newLine();
    _builder_1.append("skipped: Skipped because digest is unchanged");
    _builder_1.newLine();
    this.assertExecute(file, "Main", _builder_1.toString());
  }
}
