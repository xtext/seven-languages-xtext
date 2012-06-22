package org.xtext.httprouting.tests;

import com.google.inject.Inject;
import javax.servlet.http.HttpServlet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.httprouting.RouteInjectorProvider;
import org.xtext.httprouting.tests.MockedHttpServletRequest;
import org.xtext.httprouting.tests.TestClass;

@InjectWith(value = RouteInjectorProvider.class)
@RunWith(value = XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testFirstRuleDoesNotMatch() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.xtext.httprouting.tests.TestClass");
    _builder.newLine();
    _builder.append("GET /client/foo/:id/:name*  when id==\"43\" TestClass::doSomethingStatic(id)   ");
    _builder.newLine();
    _builder.append("GET /client/foo/:id/:name*  when id==\"42\" TestClass::doSomethingStatic(name + \"/\" + id) ");
    _builder.newLine();
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            Object _newInstance = _compiledClass.newInstance();
            final HttpServlet servlet = ((HttpServlet) _newInstance);
            MockedHttpServletRequest _mockedHttpServletRequest = new MockedHttpServletRequest("/client/foo/42/rest/of");
            servlet.service(_mockedHttpServletRequest, null);
            Assert.assertEquals("rest/of/42", TestClass.id);
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
