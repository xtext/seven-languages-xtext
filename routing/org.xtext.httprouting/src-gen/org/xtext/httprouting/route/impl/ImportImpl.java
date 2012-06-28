/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.httprouting.route.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

import org.xtext.httprouting.route.Import;
import org.xtext.httprouting.route.RoutePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.httprouting.route.impl.ImportImpl#getImportedType <em>Imported Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import
{
  /**
   * The cached value of the '{@link #getImportedType() <em>Imported Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedType()
   * @generated
   * @ordered
   */
  protected JvmType importedType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportImpl()
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
    return RoutePackage.Literals.IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getImportedType()
  {
    if (importedType != null && importedType.eIsProxy())
    {
      InternalEObject oldImportedType = (InternalEObject)importedType;
      importedType = (JvmType)eResolveProxy(oldImportedType);
      if (importedType != oldImportedType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoutePackage.IMPORT__IMPORTED_TYPE, oldImportedType, importedType));
      }
    }
    return importedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetImportedType()
  {
    return importedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedType(JvmType newImportedType)
  {
    JvmType oldImportedType = importedType;
    importedType = newImportedType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoutePackage.IMPORT__IMPORTED_TYPE, oldImportedType, importedType));
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
      case RoutePackage.IMPORT__IMPORTED_TYPE:
        if (resolve) return getImportedType();
        return basicGetImportedType();
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
      case RoutePackage.IMPORT__IMPORTED_TYPE:
        setImportedType((JvmType)newValue);
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
      case RoutePackage.IMPORT__IMPORTED_TYPE:
        setImportedType((JvmType)null);
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
      case RoutePackage.IMPORT__IMPORTED_TYPE:
        return importedType != null;
    }
    return super.eIsSet(featureID);
  }

} //ImportImpl
