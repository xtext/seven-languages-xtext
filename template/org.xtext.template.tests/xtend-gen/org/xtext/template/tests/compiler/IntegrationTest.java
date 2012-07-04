package org.xtext.template.tests.compiler;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.template.TemplateInjectorProvider;

@RunWith(value = XtextRunner.class)
@InjectWith(value = TemplateInjectorProvider.class)
@SuppressWarnings("all")
public class IntegrationTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  private ReflectExtensions _reflectExtensions;
  
  @Test
  public void testParseAndCompile_01() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!--<< >>-->");
    _builder.newLine();
    _builder.append("Hello World");
    _builder.newLine();
    String _repl = this.repl(_builder);
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            Object _newInstance = _compiledClass.newInstance();
            final Object result = IntegrationTest.this._reflectExtensions.invoke(_newInstance, "generate", null);
            Assert.assertEquals("Hello World", result);
          } catch (Exception _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
    this._compilationTestHelper.compile(_repl, new IAcceptor<Result>() {
        public void accept(Result t) {
          _function.apply(t);
        }
    });
  }
  
  @Test
  public void testParseAndCompile_02() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!--<<");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("param name = \'Foo\'");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("param nullString");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("param list = newArrayList(\'one\', \'two\', \'three\', \'four\')");
    _builder.newLine();
    _builder.append(">>-->");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<title><<name>></title>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<<FOR element : list>>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<<IF element == \'one\'>>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<h1><<element>></h1>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<<ELSEIF element == \'two\'>>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<h2><<element>></h2>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<<ELSE>>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<p><<element>></p>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<<ENDIF>>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<<ENDFOR>>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    String _repl = this.repl(_builder);
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            Object _newInstance = _compiledClass.newInstance();
            final Object result = IntegrationTest.this._reflectExtensions.invoke(_newInstance, "generate", null);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("<html>");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("<title>Foo</title>");
            _builder.newLine();
            _builder.append("      ");
            _builder.append("<h1>one</h1>");
            _builder.newLine();
            _builder.append("      ");
            _builder.append("<h2>two</h2>");
            _builder.newLine();
            _builder.append("      ");
            _builder.append("<p>three</p>");
            _builder.newLine();
            _builder.append("      ");
            _builder.append("<p>four</p>");
            _builder.newLine();
            _builder.append("</html>");
            String _string = _builder.toString();
            String _string_1 = result.toString();
            Assert.assertEquals(_string, _string_1);
          } catch (Exception _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
    this._compilationTestHelper.compile(_repl, new IAcceptor<Result>() {
        public void accept(Result t) {
          _function.apply(t);
        }
    });
  }
  
  public String repl(final CharSequence s) {
    String _string = s.toString();
    String _replace = _string.replace("<<", "\u00AB");
    String _replace_1 = _replace.replace(">>", "\u00BB");
    return _replace_1;
  }
}
