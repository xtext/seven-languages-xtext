/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.httprouting.route;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.httprouting.route.URL#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.httprouting.route.RoutePackage#getURL()
 * @model
 * @generated
 */
public interface URL extends EObject
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.httprouting.route.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see org.xtext.httprouting.route.RoutePackage#getURL_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariables();

} // URL
