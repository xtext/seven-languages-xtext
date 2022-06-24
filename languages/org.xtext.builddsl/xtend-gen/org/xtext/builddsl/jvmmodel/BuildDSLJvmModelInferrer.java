/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.jvmmodel;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      EList<JvmTypeReference> _superTypes = it.getSuperTypes();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(BuildScript.class);
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
      Iterable<Parameter> _parameters = this.getParameters(file);
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
              _inferredType=this._jvmTypesBuilder.inferredType(_init);
            }
            _elvis_1 = _inferredType;
          }
          if (_elvis_1 != null) {
            _elvis = _elvis_1;
          } else {
            JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(String.class);
            _elvis = _typeRef_1;
          }
          final JvmTypeReference type = _elvis;
          EList<JvmMember> _members = it.getMembers();
          final Procedure1<JvmField> _function_1 = (JvmField it_1) -> {
            it_1.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
            JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Param.class);
            this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
            this._jvmTypesBuilder.setInitializer(it_1, declaredParameter.getInit());
          };
          JvmField _field = this._jvmTypesBuilder.toField(declaredParameter, declaredParameter.getName(), type, _function_1);
          this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
        }
      }
      final JvmTypeReference stringArray = this._jvmTypesBuilder.addArrayTypeDimension(this._typeReferenceBuilder.typeRef(String.class));
      EList<JvmMember> _members = it.getMembers();
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it_1) -> {
        EList<JvmFormalParameter> _parameters_1 = it_1.getParameters();
        JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(file, "args", stringArray);
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
        it_1.setVarArgs(true);
        it_1.setStatic(true);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append(simpleName);
            _builder.append(" script = new ");
            _builder.append(simpleName);
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
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(file, "main", this._typeReferenceBuilder.typeRef(void.class), _function_1);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      EList<JvmMember> _members_1 = it.getMembers();
      final Function1<Task, JvmOperation> _function_2 = (Task task) -> {
        final Procedure1<JvmOperation> _function_3 = (JvmOperation it_1) -> {
          it_1.setVisibility(JvmVisibility.PROTECTED);
          EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
          final Function1<Task, String> _function_4 = (Task it_2) -> {
            return it_2.getName();
          };
          JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(DependsOn.class, ((String[])Conversions.unwrapArray(ListExtensions.<Task, String>map(task.getDepends(), _function_4), String.class)));
          this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
          this._jvmTypesBuilder.setBody(it_1, task.getAction());
        };
        return this._jvmTypesBuilder.toMethod(task, this.getMethodName(task), this._typeReferenceBuilder.typeRef(Void.TYPE), _function_3);
      };
      Iterable<JvmOperation> _map = IterableExtensions.<Task, JvmOperation>map(this.getTasks(file), _function_2);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_1, _map);
    };
    acceptor.<JvmGenericType>accept(this._jvmTypesBuilder.toClass(file, qualifiedName), _function);
  }

  private Iterable<Task> getTasks(final BuildFile it) {
    return Iterables.<Task>filter(it.getDeclarations(), Task.class);
  }

  private Iterable<Parameter> getParameters(final BuildFile it) {
    return Iterables.<Parameter>filter(it.getDeclarations(), Parameter.class);
  }

  private String getMethodName(final Task it) {
    return it.getName();
  }

  public String getJavaClassName(final BuildFile it) {
    String _xifexpression = null;
    String _name = it.getName();
    boolean _tripleEquals = (_name == null);
    if (_tripleEquals) {
      _xifexpression = it.eResource().getURI().trimFileExtension().lastSegment();
    } else {
      String _name_1 = it.getName();
      String _plus = (_name_1 + ".");
      String _lastSegment = it.eResource().getURI().trimFileExtension().lastSegment();
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
