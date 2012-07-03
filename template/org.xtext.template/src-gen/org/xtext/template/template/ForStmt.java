/**
 */
package org.xtext.template.template;

import org.eclipse.xtext.common.types.JvmFormalParameter;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.template.template.ForStmt#getParam <em>Param</em>}</li>
 *   <li>{@link org.xtext.template.template.ForStmt#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.template.template.ForStmt#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.template.template.TemplatePackage#getForStmt()
 * @model
 * @generated
 */
public interface ForStmt extends StructuralStmt
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(JvmFormalParameter)
   * @see org.xtext.template.template.TemplatePackage#getForStmt_Param()
   * @model containment="true"
   * @generated
   */
  JvmFormalParameter getParam();

  /**
   * Sets the value of the '{@link org.xtext.template.template.ForStmt#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(JvmFormalParameter value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(XExpression)
   * @see org.xtext.template.template.TemplatePackage#getForStmt_Source()
   * @model containment="true"
   * @generated
   */
  XExpression getSource();

  /**
   * Sets the value of the '{@link org.xtext.template.template.ForStmt#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(XExpression value);

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
   * @see org.xtext.template.template.TemplatePackage#getForStmt_Body()
   * @model containment="true"
   * @generated
   */
  BlockStmt getBody();

  /**
   * Sets the value of the '{@link org.xtext.template.template.ForStmt#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(BlockStmt value);

} // ForStmt
