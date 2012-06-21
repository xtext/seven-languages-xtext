package org.xtext.guicemodules.tests;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import java.util.Collection;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.guicemodules.GuiceModulesInjectorProvider;

@RunWith(value = XtextRunner.class)
@InjectWith(value = GuiceModulesInjectorProvider.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testSimple() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("foo.bar.MyModule {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("bind List<String> to-instance newArrayList(\'one\',\'two\')");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("bind Collection to List<String>");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            Object _newInstance = _compiledClass.newInstance();
            final Module module = ((Module) _newInstance);
            Injector _createInjector = Guice.createInjector(module);
            final Collection col = _createInjector.<Collection>getInstance(Collection.class);
            Object _head = IterableExtensions.<Object>head(col);
            Assert.assertEquals("one", _head);
          } catch (Exception _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
    this._compilationTestHelper.compile(_builder, new IAcceptor<Result>() {
        public void accept(Result t) {
          _function.apply(t);
        }
    });
  }
}
