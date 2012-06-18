/**
 */
package org.guicecon.modules.guiceModules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmAnnotationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.guicecon.modules.guiceModules.AnnotationRef#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getAnnotationRef()
 * @model
 * @generated
 */
public interface AnnotationRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' reference.
   * @see #setAnnotation(JvmAnnotationType)
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getAnnotationRef_Annotation()
   * @model
   * @generated
   */
  JvmAnnotationType getAnnotation();

  /**
   * Sets the value of the '{@link org.guicecon.modules.guiceModules.AnnotationRef#getAnnotation <em>Annotation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(JvmAnnotationType value);

} // AnnotationRef
