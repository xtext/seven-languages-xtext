/**
 */
package org.cradle.language.cradle.impl;

import org.cradle.language.cradle.CradlePackage;
import org.cradle.language.cradle.Task;
import org.cradle.language.cradle.TaskReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.cradle.language.cradle.impl.TaskReferenceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.cradle.language.cradle.impl.TaskReferenceImpl#getSoftReference <em>Soft Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskReferenceImpl extends MinimalEObjectImpl.Container implements TaskReference
{
  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected Task reference;

  /**
   * The default value of the '{@link #getSoftReference() <em>Soft Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoftReference()
   * @generated
   * @ordered
   */
  protected static final String SOFT_REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSoftReference() <em>Soft Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoftReference()
   * @generated
   * @ordered
   */
  protected String softReference = SOFT_REFERENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskReferenceImpl()
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
    return CradlePackage.Literals.TASK_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (Task)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CradlePackage.TASK_REFERENCE__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(Task newReference)
  {
    Task oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CradlePackage.TASK_REFERENCE__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSoftReference()
  {
    return softReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSoftReference(String newSoftReference)
  {
    String oldSoftReference = softReference;
    softReference = newSoftReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CradlePackage.TASK_REFERENCE__SOFT_REFERENCE, oldSoftReference, softReference));
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
      case CradlePackage.TASK_REFERENCE__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case CradlePackage.TASK_REFERENCE__SOFT_REFERENCE:
        return getSoftReference();
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
      case CradlePackage.TASK_REFERENCE__REFERENCE:
        setReference((Task)newValue);
        return;
      case CradlePackage.TASK_REFERENCE__SOFT_REFERENCE:
        setSoftReference((String)newValue);
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
      case CradlePackage.TASK_REFERENCE__REFERENCE:
        setReference((Task)null);
        return;
      case CradlePackage.TASK_REFERENCE__SOFT_REFERENCE:
        setSoftReference(SOFT_REFERENCE_EDEFAULT);
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
      case CradlePackage.TASK_REFERENCE__REFERENCE:
        return reference != null;
      case CradlePackage.TASK_REFERENCE__SOFT_REFERENCE:
        return SOFT_REFERENCE_EDEFAULT == null ? softReference != null : !SOFT_REFERENCE_EDEFAULT.equals(softReference);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (softReference: ");
    result.append(softReference);
    result.append(')');
    return result.toString();
  }

} //TaskReferenceImpl
