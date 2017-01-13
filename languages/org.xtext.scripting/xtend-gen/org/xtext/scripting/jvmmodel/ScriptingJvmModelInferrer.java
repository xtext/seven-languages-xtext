/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.scripting.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.scripting.scripting.Script;

/**
 * Infers a Java class with a main method from a {@link Script}.
 */
@SuppressWarnings("all")
public class ScriptingJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  protected void _infer(final Script script, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final String className = script.eResource().getURI().trimFileExtension().lastSegment();
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        EList<JvmMember> _members = it.getMembers();
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmFormalParameter _parameter = ScriptingJvmModelInferrer.this._jvmTypesBuilder.toParameter(script, "args", ScriptingJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(ScriptingJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class)));
            ScriptingJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            it.setStatic(true);
            it.setVarArgs(true);
            ScriptingJvmModelInferrer.this._jvmTypesBuilder.setBody(it, script);
          }
        };
        JvmOperation _method = ScriptingJvmModelInferrer.this._jvmTypesBuilder.toMethod(script, "main", ScriptingJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE), _function);
        ScriptingJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      }
    };
    acceptor.<JvmGenericType>accept(this._jvmTypesBuilder.toClass(script, className), _function);
  }
  
  public void infer(final EObject script, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (script instanceof Script) {
      _infer((Script)script, acceptor, isPreIndexingPhase);
      return;
    } else if (script != null) {
      _infer(script, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(script, acceptor, isPreIndexingPhase).toString());
    }
  }
}
