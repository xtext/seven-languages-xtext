/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.httprouting.route;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.httprouting.route.Import#getImportedType <em>Imported Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.httprouting.route.RoutePackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Type</em>' reference.
   * @see #setImportedType(JvmType)
   * @see org.xtext.httprouting.route.RoutePackage#getImport_ImportedType()
   * @model
   * @generated
   */
  JvmType getImportedType();

  /**
   * Sets the value of the '{@link org.xtext.httprouting.route.Import#getImportedType <em>Imported Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Type</em>' reference.
   * @see #getImportedType()
   * @generated
   */
  void setImportedType(JvmType value);

} // Import
