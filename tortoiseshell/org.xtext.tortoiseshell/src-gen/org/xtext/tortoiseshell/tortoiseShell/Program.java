/**
 */
package org.xtext.tortoiseshell.tortoiseShell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tortoiseshell.tortoiseShell.Program#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.tortoiseshell.tortoiseShell.Program#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XBlockExpression)
   * @see org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage#getProgram_Body()
   * @model containment="true"
   * @generated
   */
  XBlockExpression getBody();

  /**
   * Sets the value of the '{@link org.xtext.tortoiseshell.tortoiseShell.Program#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XBlockExpression value);

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
