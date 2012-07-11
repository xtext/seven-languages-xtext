/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.guicemodules.guiceModules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modules AST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.guicemodules.guiceModules.ModulesAST#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.ModulesAST#getModules <em>Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getModulesAST()
 * @model
 * @generated
 */
public interface ModulesAST extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.guicemodules.guiceModules.ImportAST}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getModulesAST_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportAST> getImports();

  /**
   * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.guicemodules.guiceModules.ModuleAST}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modules</em>' containment reference list.
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getModulesAST_Modules()
   * @model containment="true"
   * @generated
   */
  EList<ModuleAST> getModules();

} // ModulesAST
