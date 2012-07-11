/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.tortoiseshell.tortoiseShell;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tortoiseshell.tortoiseShell.Program#getSubPrograms <em>Sub Programs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends Executable
{
  /**
   * Returns the value of the '<em><b>Sub Programs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tortoiseshell.tortoiseShell.SubProgram}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Programs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Programs</em>' containment reference list.
   * @see org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage#getProgram_SubPrograms()
   * @model containment="true"
   * @generated
   */
  EList<SubProgram> getSubPrograms();

} // Program
