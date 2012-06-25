package org.xtext.cradle.tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.cradle.CradleInjectorProvider;
import org.xtext.cradle.cradle.CradleFile;
import org.xtext.cradle.cradle.Declaration;

@RunWith(value = XtextRunner.class)
@InjectWith(value = CradleInjectorProvider.class)
@SuppressWarnings("all")
public class IntegrationTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testSimple() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("param String projectName = \'Hello\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Start {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("println(projectName)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
  }
  
  @Test
  public void testExtensionMethod() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("param String projectName = \'Hello\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Start {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("println(projectName)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          Resource _source = it.getSource();
          EList<EObject> _contents = _source.getContents();
          EObject _head = IterableExtensions.<EObject>head(_contents);
          final CradleFile file = ((CradleFile) _head);
          EList<Declaration> _declarations = file.getDeclarations();
          Declaration _get = IntegrationTest.this.<Declaration>get(_declarations, "Start");
          Assert.assertNotNull(_get);
        }
      };
    this._compilationTestHelper.compile(_builder, new IAcceptor<Result>() {
        public void accept(Result t) {
          _function.apply(t);
        }
    });
  }
  
  public <T extends Declaration> T get(final List<T> list, final String key) {
    final Function1<T,Boolean> _function = new Function1<T,Boolean>() {
        public Boolean apply(final T it) {
          String _name = it.getName();
          boolean _equals = Objects.equal(_name, key);
          return Boolean.valueOf(_equals);
        }
      };
    T _findFirst = IterableExtensions.<T>findFirst(list, _function);
    return _findFirst;
  }
}
