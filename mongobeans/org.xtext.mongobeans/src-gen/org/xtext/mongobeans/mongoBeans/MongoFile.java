/**
 */
package org.xtext.mongobeans.mongoBeans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mongo File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mongobeans.mongoBeans.MongoFile#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mongobeans.mongoBeans.MongoBeansPackage#getMongoFile()
 * @model
 * @generated
 */
public interface MongoFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mongobeans.mongoBeans.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.mongobeans.mongoBeans.MongoBeansPackage#getMongoFile_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // MongoFile
