/**
 */
package org.guicecon.modules.guiceModules.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmAnnotationType;

import org.guicecon.modules.guiceModules.AnnotationRef;
import org.guicecon.modules.guiceModules.GuiceModulesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.guicecon.modules.guiceModules.impl.AnnotationRefImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationRefImpl extends MinimalEObjectImpl.Container implements AnnotationRef
{
  /**
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
  protected JvmAnnotationType annotation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GuiceModulesPackage.Literals.ANNOTATION_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmAnnotationType getAnnotation()
  {
    if (annotation != null && annotation.eIsProxy())
    {
      InternalEObject oldAnnotation = (InternalEObject)annotation;
      annotation = (JvmAnnotationType)eResolveProxy(oldAnnotation);
      if (annotation != oldAnnotation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiceModulesPackage.ANNOTATION_REF__ANNOTATION, oldAnnotation, annotation));
      }
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmAnnotationType basicGetAnnotation()
  {
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotation(JvmAnnotationType newAnnotation)
  {
    JvmAnnotationType oldAnnotation = annotation;
    annotation = newAnnotation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.ANNOTATION_REF__ANNOTATION, oldAnnotation, annotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GuiceModulesPackage.ANNOTATION_REF__ANNOTATION:
        if (resolve) return getAnnotation();
        return basicGetAnnotation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GuiceModulesPackage.ANNOTATION_REF__ANNOTATION:
        setAnnotation((JvmAnnotationType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GuiceModulesPackage.ANNOTATION_REF__ANNOTATION:
        setAnnotation((JvmAnnotationType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GuiceModulesPackage.ANNOTATION_REF__ANNOTATION:
        return annotation != null;
    }
    return super.eIsSet(featureID);
  }

} //AnnotationRefImpl
