/**
 */
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
 *   <li>{@link org.xtext.tortoiseshell.tortoiseShell.Program#getFunctions <em>Functions</em>}</li>
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
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tortoiseshell.tortoiseShell.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage#getProgram_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

} // Program
