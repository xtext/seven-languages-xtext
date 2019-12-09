/**
 * generated by Xtext
 */
package org.xtext.guicemodules.guiceModules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding AST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.guicemodules.guiceModules.BindingAST#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.BindingAST#getTo <em>To</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.BindingAST#getToInstance <em>To Instance</em>}</li>
 * </ul>
 *
 * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getBindingAST()
 * @model
 * @generated
 */
public interface BindingAST extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(KeyAST)
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getBindingAST_From()
   * @model containment="true"
   * @generated
   */
  KeyAST getFrom();

  /**
   * Sets the value of the '{@link org.xtext.guicemodules.guiceModules.BindingAST#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(KeyAST value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(KeyAST)
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getBindingAST_To()
   * @model containment="true"
   * @generated
   */
  KeyAST getTo();

  /**
   * Sets the value of the '{@link org.xtext.guicemodules.guiceModules.BindingAST#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(KeyAST value);

  /**
   * Returns the value of the '<em><b>To Instance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Instance</em>' containment reference.
   * @see #setToInstance(XExpression)
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getBindingAST_ToInstance()
   * @model containment="true"
   * @generated
   */
  XExpression getToInstance();

  /**
   * Sets the value of the '{@link org.xtext.guicemodules.guiceModules.BindingAST#getToInstance <em>To Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Instance</em>' containment reference.
   * @see #getToInstance()
   * @generated
   */
  void setToInstance(XExpression value);

} // BindingAST
