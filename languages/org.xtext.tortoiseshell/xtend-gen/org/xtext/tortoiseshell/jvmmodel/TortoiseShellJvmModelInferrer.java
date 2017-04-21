/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.tortoiseshell.lib.Tortoise;
import org.xtext.tortoiseshell.tortoiseShell.Program;
import org.xtext.tortoiseshell.tortoiseShell.SubProgram;

@SuppressWarnings("all")
public class TortoiseShellJvmModelInferrer extends AbstractModelInferrer {
  public final static String INFERRED_CLASS_NAME = "MyTortoiseProgram";
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  protected void _infer(final Program program, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      EList<JvmTypeReference> _superTypes = it.getSuperTypes();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(Tortoise.class);
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
      XBlockExpression _body = program.getBody();
      boolean _tripleNotEquals = (_body != null);
      if (_tripleNotEquals) {
        EList<JvmMember> _members = it.getMembers();
        final Procedure1<JvmOperation> _function_1 = (JvmOperation it_1) -> {
          this._jvmTypesBuilder.setBody(it_1, program.getBody());
        };
        JvmOperation _method = this._jvmTypesBuilder.toMethod(program, "main", this._typeReferenceBuilder.typeRef(void.class), _function_1);
        this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      }
      EList<SubProgram> _subPrograms = program.getSubPrograms();
      for (final SubProgram subProgram : _subPrograms) {
        EList<JvmMember> _members_1 = it.getMembers();
        String _name = subProgram.getName();
        JvmTypeReference _elvis = null;
        JvmTypeReference _returnType = subProgram.getReturnType();
        if (_returnType != null) {
          _elvis = _returnType;
        } else {
          JvmTypeReference _inferredType = this._jvmTypesBuilder.inferredType(subProgram.getBody());
          _elvis = _inferredType;
        }
        final Procedure1<JvmOperation> _function_2 = (JvmOperation it_1) -> {
          EList<JvmFormalParameter> _parameters = subProgram.getParameters();
          for (final JvmFormalParameter subParameter : _parameters) {
            EList<JvmFormalParameter> _parameters_1 = it_1.getParameters();
            JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(subParameter, subParameter.getName(), subParameter.getParameterType());
            this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
          }
          this._jvmTypesBuilder.setBody(it_1, subProgram.getBody());
        };
        JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(subProgram, _name, _elvis, _function_2);
        this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
      }
    };
    acceptor.<JvmGenericType>accept(this._jvmTypesBuilder.toClass(program, TortoiseShellJvmModelInferrer.INFERRED_CLASS_NAME), _function);
  }
  
  public void infer(final EObject program, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (program instanceof Program) {
      _infer((Program)program, acceptor, isPreIndexingPhase);
      return;
    } else if (program != null) {
      _infer(program, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(program, acceptor, isPreIndexingPhase).toString());
    }
  }
}
