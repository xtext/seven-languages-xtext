/**
 */
package org.xtext.scripting.scripting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XBlockExpression;

import org.eclipse.xtext.xtype.XImportDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.scripting.scripting.Script#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.scripting.scripting.ScriptingPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends XBlockExpression
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xtype.XImportDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.scripting.scripting.ScriptingPackage#getScript_Imports()
   * @model containment="true"
   * @generated
   */
  EList<XImportDeclaration> getImports();

} // Script
