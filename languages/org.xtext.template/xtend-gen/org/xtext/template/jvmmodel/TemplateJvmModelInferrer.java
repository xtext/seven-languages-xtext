/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.template.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.XBlockExpression;
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
    Resource _eResource = element.eResource();
    URI _uRI = _eResource.getURI();
    URI _trimFileExtension = _uRI.trimFileExtension();
    final String simpleName = _trimFileExtension.lastSegment();
    String _xifexpression = null;
    String _package = element.getPackage();
    boolean _notEquals = (!Objects.equal(_package, null));
    if (_notEquals) {
      String _package_1 = element.getPackage();
      String _plus = (_package_1 + ".");
      _xifexpression = (_plus + simpleName);
    } else {
      _xifexpression = simpleName;
    }
    final String qualifiedName = _xifexpression;
    final JvmGenericType javaClass = this._jvmTypesBuilder.toClass(element, qualifiedName);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
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
            String _name = param.getName();
            final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
              public void apply(final JvmField it) {
                XExpression _defaultexp = param.getDefaultexp();
                boolean _notEquals = (!Objects.equal(_defaultexp, null));
                if (_notEquals) {
                  XExpression _defaultexp_1 = param.getDefaultexp();
                  TemplateJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _defaultexp_1);
                }
              }
            };
            JvmField _field = TemplateJvmModelInferrer.this._jvmTypesBuilder.toField(param, _name, type, _function);
            TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
            EList<JvmMember> _members_1 = it.getMembers();
            String _name_1 = param.getName();
            JvmOperation _setter = TemplateJvmModelInferrer.this._jvmTypesBuilder.toSetter(param, _name_1, type);
            TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _setter);
            EList<JvmMember> _members_2 = it.getMembers();
            String _name_2 = param.getName();
            JvmOperation _getter = TemplateJvmModelInferrer.this._jvmTypesBuilder.toGetter(param, _name_2, type);
            TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _getter);
          }
        }
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _typeRef = TemplateJvmModelInferrer.this._typeReferenceBuilder.typeRef(CharSequence.class);
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PRIVATE);
            XBlockExpression _body = element.getBody();
            TemplateJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
          }
        };
        JvmOperation _method = TemplateJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "generate", _typeRef, _function);
        TemplateJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _typeRef_1 = TemplateJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeRef = TemplateJvmModelInferrer.this._typeReferenceBuilder.typeRef(javaClass);
            JvmTypeReference _typeRef_1 = TemplateJvmModelInferrer.this._typeReferenceBuilder.typeRef(Procedure1.class, _typeRef);
            JvmFormalParameter _parameter = TemplateJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, 
              "init", _typeRef_1);
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
                _builder.append("result = result.replaceAll(\"^-->\\\\r?\\\\n\",\"\");");
                _builder.newLine();
                _builder.append("// trim multi-newline to single newline");
                _builder.newLine();
                _builder.append("result = result.replaceAll(\"\\\\r?\\\\n\\\\s*\\\\r?\\\\n\", System.getProperty(\"line.separator\"));");
                _builder.newLine();
                _builder.append("return result;");
                _builder.newLine();
              }
            };
            TemplateJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method_1 = TemplateJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "generate", _typeRef_1, _function_1);
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
