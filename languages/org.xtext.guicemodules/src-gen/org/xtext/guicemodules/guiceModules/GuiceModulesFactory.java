/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.guicemodules.guiceModules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage
 * @generated
 */
public interface GuiceModulesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GuiceModulesFactory eINSTANCE = org.xtext.guicemodules.guiceModules.impl.GuiceModulesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Modules AST</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modules AST</em>'.
   * @generated
   */
  ModulesAST createModulesAST();

  /**
   * Returns a new object of class '<em>Module AST</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module AST</em>'.
   * @generated
   */
  ModuleAST createModuleAST();

  /**
   * Returns a new object of class '<em>Binding AST</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding AST</em>'.
   * @generated
   */
  BindingAST createBindingAST();

  /**
   * Returns a new object of class '<em>Key AST</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key AST</em>'.
   * @generated
   */
  KeyAST createKeyAST();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GuiceModulesPackage getGuiceModulesPackage();

} //GuiceModulesFactory
