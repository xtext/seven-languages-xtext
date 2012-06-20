package org.xtext.template.tests.compiler;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.lang.reflect.Method;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.parameterized.InjectParameter;
import org.eclipse.xtext.junit4.parameterized.ParameterSyntax;
import org.eclipse.xtext.junit4.parameterized.ParameterizedXtextRunner;
import org.eclipse.xtext.junit4.parameterized.ResourceURIs;
import org.eclipse.xtext.junit4.parameterized.XpectString;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.template.TemplateInjectorProvider;

@SuppressWarnings(value = "restriction")
@InjectWith(value = TemplateInjectorProvider.class)
@RunWith(value = ParameterizedXtextRunner.class)
@ResourceURIs(baseDir = "src/org/xtext/template/tests/compiler", fileExtensions = "template")
public class CompilerTest {
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  private JvmModelGenerator generator;
  
  @InjectParameter
  private Resource resource;
  
  @InjectParameter
  private String param;
  
  @Inject
  private OnTheFlyJavaCompiler javaCompiler;
  
  @Test
  public void noErrors() {
    EList<EObject> _contents = this.resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    this._validationTestHelper.assertNoErrors(_head);
  }
  
  @XpectString
  @ParameterSyntax(value = "param=STRING?")
  public String execute() {
    try {
      String _xblockexpression = null;
      {
        EList<EObject> _contents = this.resource.getContents();
        Iterable<JvmGenericType> _filter = Iterables.<JvmGenericType>filter(_contents, JvmGenericType.class);
        final JvmGenericType inferredType = IterableExtensions.<JvmGenericType>head(_filter);
        final CharSequence javaCode = this.generator.generateType(inferredType);
        InputOutput.<CharSequence>println(javaCode);
        String _qualifiedName = inferredType.getQualifiedName();
        String _string = javaCode.toString();
        final Class<? extends Object> clazz = this.javaCompiler.compileToClass(_qualifiedName, _string);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{ val inst = new \u00C7inferredType.qualifiedName\u00C8() \u00C7IF !param.nullOrEmpty\u00C8 => [ \u00C7param\u00C8 ]\u00C7ENDIF\u00C8; inst }");
        final String document = _builder.toString();
        final Object template = this.newInstance(clazz, inferredType, document);
        final Method generateMethod = clazz.getMethod("generate");
        Object _invoke = generateMethod.invoke(template);
        String _string_1 = _invoke.toString();
        _xblockexpression = (_string_1);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @XpectString
  @ParameterSyntax(value = "param=STRING?")
  public String initexecute() {
    try {
      String _xblockexpression = null;
      {
        EList<EObject> _contents = this.resource.getContents();
        Iterable<JvmGenericType> _filter = Iterables.<JvmGenericType>filter(_contents, JvmGenericType.class);
        final JvmGenericType inferredType = IterableExtensions.<JvmGenericType>head(_filter);
        final CharSequence javaCode = this.generator.generateType(inferredType);
        String _qualifiedName = inferredType.getQualifiedName();
        String _string = javaCode.toString();
        final Class<? extends Object> clazz = this.javaCompiler.compileToClass(_qualifiedName, _string);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[\u00C7inferredType.qualifiedName\u00C8 it|\u00C7IF !param.nullOrEmpty\u00C8\u00C7param\u00C8\u00C7ENDIF\u00C8; null] as (\u00C7inferredType.qualifiedName\u00C8) => void");
        final String document = _builder.toString();
        final Object closure = this.newInstance(clazz, inferredType, document);
        final Object template = clazz.newInstance();
        final Method generateMethod = clazz.getMethod("generate", Procedure1.class);
        Object _invoke = generateMethod.invoke(template, closure);
        String _string_1 = _invoke.toString();
        _xblockexpression = (_string_1);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Object newInstance(final Class<? extends Object> clazz, final JvmGenericType context, final String document) {
    try {
      Object _xblockexpression = null;
      {
        Resource _eResource = context.eResource();
        ResourceSet _resourceSet = _eResource.getResourceSet();
        URI _createURI = URI.createURI("param.___xbase");
        final Resource resource = _resourceSet.createResource(_createURI);
        StringInputStream _stringInputStream = new StringInputStream(document);
        resource.load(_stringInputStream, null);
        EList<EObject> _contents = resource.getContents();
        EObject _head = IterableExtensions.<EObject>head(_contents);
        final XExpression expression = ((XExpression) _head);
        this._validationTestHelper.assertNoErrors(expression);
        IResourceServiceProvider _resourceServiceProvider = ((XtextResource) resource).getResourceServiceProvider();
        final XbaseInterpreter interpreter = _resourceServiceProvider.<XbaseInterpreter>get(XbaseInterpreter.class);
        ClassLoader _classLoader = clazz.getClassLoader();
        interpreter.setClassLoader(_classLoader);
        IEvaluationResult _evaluate = interpreter.evaluate(expression);
        final Object result = _evaluate.getResult();
        Resource _eResource_1 = context.eResource();
        ResourceSet _resourceSet_1 = _eResource_1.getResourceSet();
        EList<Resource> _resources = _resourceSet_1.getResources();
        _resources.remove(resource);
        _xblockexpression = (result);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
