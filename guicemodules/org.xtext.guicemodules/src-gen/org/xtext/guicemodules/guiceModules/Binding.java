/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.guicemodules.guiceModules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.guicemodules.guiceModules.Binding#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.Binding#getTo <em>To</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.Binding#getToInstance <em>To Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(Key)
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getBinding_From()
   * @model containment="true"
   * @generated
   */
  Key getFrom();

  /**
   * Sets the value of the '{@link org.xtext.guicemodules.guiceModules.Binding#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Key value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(Key)
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getBinding_To()
   * @model containment="true"
   * @generated
   */
  Key getTo();

  /**
   * Sets the value of the '{@link org.xtext.guicemodules.guiceModules.Binding#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Key value);

  /**
   * Returns the value of the '<em><b>To Instance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Instance</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Instance</em>' containment reference.
   * @see #setToInstance(XExpression)
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getBinding_ToInstance()
   * @model containment="true"
   * @generated
   */
  XExpression getToInstance();

  /**
   * Sets the value of the '{@link org.xtext.guicemodules.guiceModules.Binding#getToInstance <em>To Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Instance</em>' containment reference.
   * @see #getToInstance()
   * @generated
   */
  void setToInstance(XExpression value);

} // Binding
