/**
 */
package org.xtext.template.template;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.template.template.TemplateFile#getPackage <em>Package</em>}</li>
 *   <li>{@link org.xtext.template.template.TemplateFile#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.template.template.TemplateFile#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.template.template.TemplateFile#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.template.template.TemplatePackage#getTemplateFile()
 * @model
 * @generated
 */
public interface TemplateFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see org.xtext.template.template.TemplatePackage#getTemplateFile_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link org.xtext.template.template.TemplateFile#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.template.template.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.template.template.TemplatePackage#getTemplateFile_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.template.template.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.template.template.TemplatePackage#getTemplateFile_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

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
   * @see org.xtext.template.template.TemplatePackage#getTemplateFile_Body()
   * @model containment="true"
   * @generated
   */
  BlockStmt getBody();

  /**
   * Sets the value of the '{@link org.xtext.template.template.TemplateFile#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(BlockStmt value);

} // TemplateFile
