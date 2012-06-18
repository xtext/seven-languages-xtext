/**
 */
package org.guicecon.modules.guiceModules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.guicecon.modules.guiceModules.Key#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.Key#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getKey()
 * @model
 * @generated
 */
public interface Key extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(AnnotationRef)
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getKey_Annotation()
   * @model containment="true"
   * @generated
   */
  AnnotationRef getAnnotation();

  /**
   * Sets the value of the '{@link org.guicecon.modules.guiceModules.Key#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(AnnotationRef value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getKey_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.guicecon.modules.guiceModules.Key#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

} // Key
