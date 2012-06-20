/**
 */
package org.xtext.template.template;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.template.template.IfStmt#getIfbodies <em>Ifbodies</em>}</li>
 *   <li>{@link org.xtext.template.template.IfStmt#getElsebody <em>Elsebody</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.template.template.TemplatePackage#getIfStmt()
 * @model
 * @generated
 */
public interface IfStmt extends StructuralStmt
{
  /**
   * Returns the value of the '<em><b>Ifbodies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.template.template.IfStmtBody}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifbodies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifbodies</em>' containment reference list.
   * @see org.xtext.template.template.TemplatePackage#getIfStmt_Ifbodies()
   * @model containment="true"
   * @generated
   */
  EList<IfStmtBody> getIfbodies();

  /**
   * Returns the value of the '<em><b>Elsebody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsebody</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsebody</em>' containment reference.
   * @see #setElsebody(BlockStmt)
   * @see org.xtext.template.template.TemplatePackage#getIfStmt_Elsebody()
   * @model containment="true"
   * @generated
   */
  BlockStmt getElsebody();

  /**
   * Sets the value of the '{@link org.xtext.template.template.IfStmt#getElsebody <em>Elsebody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elsebody</em>' containment reference.
   * @see #getElsebody()
   * @generated
   */
  void setElsebody(BlockStmt value);

} // IfStmt
