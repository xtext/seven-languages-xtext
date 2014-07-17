/**
 */
package org.xtext.builddsl.build;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.builddsl.build.BuildFile#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.builddsl.build.BuildFile#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.xtext.builddsl.build.BuildFile#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.builddsl.build.BuildPackage#getBuildFile()
 * @model
 * @generated
 */
public interface BuildFile extends EObject
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
   * @see org.xtext.builddsl.build.BuildPackage#getBuildFile_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.builddsl.build.BuildFile#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see org.xtext.builddsl.build.BuildPackage#getBuildFile_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link org.xtext.builddsl.build.BuildFile#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.builddsl.build.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.xtext.builddsl.build.BuildPackage#getBuildFile_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

} // BuildFile
