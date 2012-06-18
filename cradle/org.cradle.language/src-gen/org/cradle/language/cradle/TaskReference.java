/**
 */
package org.cradle.language.cradle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cradle.language.cradle.TaskReference#getReference <em>Reference</em>}</li>
 *   <li>{@link org.cradle.language.cradle.TaskReference#getSoftReference <em>Soft Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cradle.language.cradle.CradlePackage#getTaskReference()
 * @model
 * @generated
 */
public interface TaskReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Task)
   * @see org.cradle.language.cradle.CradlePackage#getTaskReference_Reference()
   * @model
   * @generated
   */
  Task getReference();

  /**
   * Sets the value of the '{@link org.cradle.language.cradle.TaskReference#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Task value);

  /**
   * Returns the value of the '<em><b>Soft Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Soft Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Soft Reference</em>' attribute.
   * @see #setSoftReference(String)
   * @see org.cradle.language.cradle.CradlePackage#getTaskReference_SoftReference()
   * @model
   * @generated
   */
  String getSoftReference();

  /**
   * Sets the value of the '{@link org.cradle.language.cradle.TaskReference#getSoftReference <em>Soft Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Soft Reference</em>' attribute.
   * @see #getSoftReference()
   * @generated
   */
  void setSoftReference(String value);

} // TaskReference
