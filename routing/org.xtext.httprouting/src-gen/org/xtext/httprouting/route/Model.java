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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.httprouting.route.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.httprouting.route.Model#getRoutes <em>Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.httprouting.route.RoutePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.httprouting.route.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.httprouting.route.RoutePackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.httprouting.route.Route}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Routes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Routes</em>' containment reference list.
   * @see org.xtext.httprouting.route.RoutePackage#getModel_Routes()
   * @model containment="true"
   * @generated
   */
  EList<Route> getRoutes();

} // Model
