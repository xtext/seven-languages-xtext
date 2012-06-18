/**
 */
package org.guicecon.modules.guiceModules;

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
 *   <li>{@link org.guicecon.modules.guiceModules.Binding#isOverride <em>Override</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.Binding#getFrom <em>From</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.Binding#getTo <em>To</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.Binding#getToInstance <em>To Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
{
  /**
   * Returns the value of the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Override</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Override</em>' attribute.
   * @see #setOverride(boolean)
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getBinding_Override()
   * @model
   * @generated
   */
  boolean isOverride();

  /**
   * Sets the value of the '{@link org.guicecon.modules.guiceModules.Binding#isOverride <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Override</em>' attribute.
   * @see #isOverride()
   * @generated
   */
  void setOverride(boolean value);

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
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getBinding_From()
   * @model containment="true"
   * @generated
   */
  Key getFrom();

  /**
   * Sets the value of the '{@link org.guicecon.modules.guiceModules.Binding#getFrom <em>From</em>}' containment reference.
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
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getBinding_To()
   * @model containment="true"
   * @generated
   */
  Key getTo();

  /**
   * Sets the value of the '{@link org.guicecon.modules.guiceModules.Binding#getTo <em>To</em>}' containment reference.
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
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getBinding_ToInstance()
   * @model containment="true"
   * @generated
   */
  XExpression getToInstance();

  /**
   * Sets the value of the '{@link org.guicecon.modules.guiceModules.Binding#getToInstance <em>To Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Instance</em>' containment reference.
   * @see #getToInstance()
   * @generated
   */
  void setToInstance(XExpression value);

} // Binding
