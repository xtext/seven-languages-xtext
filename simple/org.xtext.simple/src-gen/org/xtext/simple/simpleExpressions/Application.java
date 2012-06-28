/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.simple.simpleExpressions;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.simple.simpleExpressions.Application#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.simple.simpleExpressions.Application#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.simple.simpleExpressions.SimpleExpressionsPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.simple.simpleExpressions.SimpleExpressionsPackage#getApplication_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.simple.simpleExpressions.Application#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(XBlockExpression)
   * @see org.xtext.simple.simpleExpressions.SimpleExpressionsPackage#getApplication_Main()
   * @model containment="true"
   * @generated
   */
  XBlockExpression getMain();

  /**
   * Sets the value of the '{@link org.xtext.simple.simpleExpressions.Application#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(XBlockExpression value);

} // Application
