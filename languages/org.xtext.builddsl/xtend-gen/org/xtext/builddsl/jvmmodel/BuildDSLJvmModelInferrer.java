/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.builddsl.build.BuildFile;
import org.xtext.builddsl.build.Declaration;
import org.xtext.builddsl.build.Parameter;
import org.xtext.builddsl.build.Task;
import org.xtext.builddsl.lib.BuildScript;
import org.xtext.builddsl.lib.DependsOn;
import org.xtext.builddsl.lib.Param;

/**
 * Infers a Java class from a {@link BuildFile} allowing to execute it.
 */
@SuppressWarnings("all")
public class BuildDSLJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  protected void _infer(final BuildFile file, @Extension final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final String qualifiedName = this.getJavaClassName(file);
    final String simpleName = Strings.lastToken(qualifiedName, ".");
    JvmGenericType _class = this._jvmTypesBuilder.toClass(file, qualifiedName);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeRef = BuildDSLJvmModelInferrer.this._typeReferenceBuilder.typeRef(BuildScript.class);
        BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
        Iterable<Parameter> _parameters = BuildDSLJvmModelInferrer.this.getParameters(file);
        for (final Parameter declaredParameter : _parameters) {
          {
            JvmTypeReference _elvis = null;
            JvmTypeReference _elvis_1 = null;
            JvmTypeReference _type = declaredParameter.getType();
            if (_type != null) {
              _elvis_1 = _type;
            } else {
              XExpression _init = null;
              if (declaredParameter!=null) {
                _init=declaredParameter.getInit();
              }
              JvmTypeReference _inferredType = null;
              if (_init!=null) {
                _inferredType=BuildDSLJvmModelInferrer.this._jvmTypesBuilder.inferredType(_init);
              }
              _elvis_1 = _inferredType;
            }
            if (_elvis_1 != null) {
              _elvis = _elvis_1;
            } else {
              JvmTypeReference _typeRef_1 = BuildDSLJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              _elvis = _typeRef_1;
            }
            final JvmTypeReference type = _elvis;
            EList<JvmMember> _members = it.getMembers();
            String _name = declaredParameter.getName();
            final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
              public void apply(final JvmField it) {
                it.setVisibility(JvmVisibility.PUBLIC);
                EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                JvmAnnotationReference _annotation = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(declaredParameter, Param.class);
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                XExpression _init = declaredParameter.getInit();
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _init);
              }
            };
            JvmField _field = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toField(declaredParameter, _name, type, _function);
            BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
          }
        }
        JvmTypeReference _typeRef_1 = BuildDSLJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
        final JvmTypeReference stringArray = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_typeRef_1);
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _typeRef_2 = BuildDSLJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmFormalParameter _parameter = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toParameter(it, "args", stringArray);
            BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            it.setVarArgs(true);
            it.setStatic(true);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append(simpleName, "");
                _builder.append(" script = new ");
                _builder.append(simpleName, "");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("if (script.showHelp(args)) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("System.exit(HELP);");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
                _builder.append("System.exit(script.doBuild(args));");
                _builder.newLine();
              }
            };
            BuildDSLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method = BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toMethod(file, "main", _typeRef_2, _function);
        BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        EList<JvmMember> _members_1 = it.getMembers();
        Iterable<Task> _tasks = BuildDSLJvmModelInferrer.this.getTasks(file);
        final Function1<Task, JvmOperation> _function_1 = new Function1<Task, JvmOperation>() {
          public JvmOperation apply(final Task task) {
            String _methodName = BuildDSLJvmModelInferrer.this.getMethodName(task);
            JvmTypeReference _typeRef = BuildDSLJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE);
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                it.setVisibility(JvmVisibility.PROTECTED);
                EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                EList<Task> _depends = task.getDepends();
                final Function1<Task, String> _function = new Function1<Task, String>() {
                  public String apply(final Task it) {
                    return it.getName();
                  }
                };
                List<String> _map = ListExtensions.<Task, String>map(_depends, _function);
                JvmAnnotationReference _annotationRef = BuildDSLJvmModelInferrer.this._annotationTypesBuilder.annotationRef(DependsOn.class, ((String[])Conversions.unwrapArray(_map, String.class)));
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
                XExpression _action = task.getAction();
                BuildDSLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _action);
              }
            };
            return BuildDSLJvmModelInferrer.this._jvmTypesBuilder.toMethod(task, _methodName, _typeRef, _function);
          }
        };
        Iterable<JvmMember> _map = IterableExtensions.<Task, JvmMember>map(_tasks, _function_1);
        BuildDSLJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_1, _map);
      }
    };
    acceptor.<JvmGenericType>accept(_class, _function);
  }
  
  private Iterable<Task> getTasks(final BuildFile it) {
    EList<Declaration> _declarations = it.getDeclarations();
    return Iterables.<Task>filter(_declarations, Task.class);
  }
  
  private Iterable<Parameter> getParameters(final BuildFile it) {
    EList<Declaration> _declarations = it.getDeclarations();
    return Iterables.<Parameter>filter(_declarations, Parameter.class);
  }
  
  private String getMethodName(final Task it) {
    return it.getName();
  }
  
  public String getJavaClassName(final BuildFile it) {
    String _xifexpression = null;
    String _name = it.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      Resource _eResource = it.eResource();
      URI _uRI = _eResource.getURI();
      URI _trimFileExtension = _uRI.trimFileExtension();
      _xifexpression = _trimFileExtension.lastSegment();
    } else {
      String _name_1 = it.getName();
      String _plus = (_name_1 + ".");
      Resource _eResource_1 = it.eResource();
      URI _uRI_1 = _eResource_1.getURI();
      URI _trimFileExtension_1 = _uRI_1.trimFileExtension();
      String _lastSegment = _trimFileExtension_1.lastSegment();
      _xifexpression = (_plus + _lastSegment);
    }
    return _xifexpression;
  }
  
  public void infer(final EObject file, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (file instanceof BuildFile) {
      _infer((BuildFile)file, acceptor, isPreIndexingPhase);
      return;
    } else if (file != null) {
      _infer(file, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(file, acceptor, isPreIndexingPhase).toString());
    }
  }
}
