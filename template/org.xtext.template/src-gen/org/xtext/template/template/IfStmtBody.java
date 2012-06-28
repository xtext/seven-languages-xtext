/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.template.template;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stmt Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.template.template.IfStmtBody#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.template.template.IfStmtBody#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.template.template.TemplatePackage#getIfStmtBody()
 * @model
 * @generated
 */
public interface IfStmtBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(XExpression)
   * @see org.xtext.template.template.TemplatePackage#getIfStmtBody_Condition()
   * @model containment="true"
   * @generated
   */
  XExpression getCondition();

  /**
   * Sets the value of the '{@link org.xtext.template.template.IfStmtBody#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(XExpression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(BlockStmt)
   * @see org.xtext.template.template.TemplatePackage#getIfStmtBody_Body()
   * @model containment="true"
   * @generated
   */
  BlockStmt getBody();

  /**
   * Sets the value of the '{@link org.xtext.template.template.IfStmtBody#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(BlockStmt value);

} // IfStmtBody
