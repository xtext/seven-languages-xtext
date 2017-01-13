/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.template.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.template.template.Parameter;
import org.xtext.template.template.TemplateFile;

/**
 * <p>Infers a JVM model from the source model.</p>
 */
@SuppressWarnings("all")
public class TemplateJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  protected void _infer(final TemplateFile element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final String simpleName = element.eResource().getURI().trimFileExtension().lastSegment();
    String _xifexpression = null;
    String _package = element.getPackage();
    boolean _tripleNotEquals = (_package != null);
    if (_tripleNotEquals) {
      String _package_1 = element.getPackage();
      String _plus = (_package_1 + ".");
      _xifexpression = (_plus + simpleName);
    } else {
      _xifexpression = simpleName;
    }
    final String qualifiedName = _xifexpression;
    final JvmGenericType javaClass = this._jvmTypesBuilder.toClass(element, qualifiedName);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        EList<Parameter> _params = element.getParams();
        for (final Parameter param : _params) {
          {
            JvmTypeReference _elvis = null;
            JvmTypeReference _elvis_1 = null;
            JvmTypeReference _type = param.getType();
            if (_type != null) {
              _elvis_1 = _type;
            } else {
              XExpression _defaultexp = param.getDefaultexp();
              JvmTypeReference _inferredType = null;
              if (_defaultexp!=null) {
                _inferredType=TemplateJvmModelInferrer.this._jvmTypesBuilder.inferredType(_defaultexp);
              }
              _elvis_1 = _inferredType;
            }
            if (_elvis_1 != null) {
              _elvis = _elvis_1;
            } else {
              JvmTypeReference _typeRef = TemplateJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              _elvis = _typeRef;
            }
            final JvmTypeReference type = _elvis;
            EList<JvmMember> _members = it.getMembers();
            final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
              @Override
              public void apply(final JvmField it) {
                XExpression _defaultexp = param.getDefaultexp();
                boolean _tripleNotEquals = (_defaultexp != null);
                if (_tripleNotEquals) {
                  TemplateJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, param.getDefaultexp());
                }
              }
            };
            JvmField _field = TemplateJvmModelInferrer.this._jvmTypesBuilder.toField(param, param.getName(), type, _function);
            TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
            EList<JvmMember> _members_1 = it.getMembers();
            JvmOperation _setter = TemplateJvmModelInferrer.this._jvmTypesBuilder.toSetter(param, param.getName(), type);
            TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _setter);
            EList<JvmMember> _members_2 = it.getMembers();
            JvmOperation _getter = TemplateJvmModelInferrer.this._jvmTypesBuilder.toGetter(param, param.getName(), type);
            TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _getter);
          }
        }
        EList<JvmMember> _members = it.getMembers();
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PRIVATE);
            TemplateJvmModelInferrer.this._jvmTypesBuilder.setBody(it, element.getBody());
          }
        };
        JvmOperation _method = TemplateJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "generate", TemplateJvmModelInferrer.this._typeReferenceBuilder.typeRef(CharSequence.class), _function);
        TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        EList<JvmMember> _members_1 = it.getMembers();
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmFormalParameter _parameter = TemplateJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, 
              "init", TemplateJvmModelInferrer.this._typeReferenceBuilder.typeRef(Procedure1.class, TemplateJvmModelInferrer.this._typeReferenceBuilder.typeRef(javaClass)));
            TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("if (init != null)");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("init.apply(this);");
                _builder.newLine();
                _builder.append("String result = generate().toString();");
                _builder.newLine();
                _builder.append("// remove leading -->");
                _builder.newLine();
                _builder.append("result = result.replaceAll(\"^-->\\\\n\",\"\");");
                _builder.newLine();
                _builder.append("// trim multi-newline to single newline");
                _builder.newLine();
                _builder.append("result = result.replaceAll(\"\\\\n\\\\s*\\\\n\",\"\\n\");");
                _builder.newLine();
                _builder.append("return result;");
                _builder.newLine();
              }
            };
            TemplateJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_1 = TemplateJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "generate", TemplateJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class), _function_1);
        TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
      }
    };
    acceptor.<JvmGenericType>accept(javaClass, _function);
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof TemplateFile) {
      _infer((TemplateFile)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
