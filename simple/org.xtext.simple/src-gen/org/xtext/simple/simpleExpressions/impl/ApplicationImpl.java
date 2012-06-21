/**
 */
package org.xtext.simple.simpleExpressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XBlockExpression;

import org.xtext.simple.simpleExpressions.Application;
import org.xtext.simple.simpleExpressions.SimpleExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.simple.simpleExpressions.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.simple.simpleExpressions.impl.ApplicationImpl#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected XBlockExpression main;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationImpl()
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
    return SimpleExpressionsPackage.Literals.APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleExpressionsPackage.APPLICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBlockExpression getMain()
  {
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMain(XBlockExpression newMain, NotificationChain msgs)
  {
    XBlockExpression oldMain = main;
    main = newMain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleExpressionsPackage.APPLICATION__MAIN, oldMain, newMain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMain(XBlockExpression newMain)
  {
    if (newMain != main)
    {
      NotificationChain msgs = null;
      if (main != null)
        msgs = ((InternalEObject)main).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleExpressionsPackage.APPLICATION__MAIN, null, msgs);
      if (newMain != null)
        msgs = ((InternalEObject)newMain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleExpressionsPackage.APPLICATION__MAIN, null, msgs);
      msgs = basicSetMain(newMain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleExpressionsPackage.APPLICATION__MAIN, newMain, newMain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimpleExpressionsPackage.APPLICATION__MAIN:
        return basicSetMain(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SimpleExpressionsPackage.APPLICATION__NAME:
        return getName();
      case SimpleExpressionsPackage.APPLICATION__MAIN:
        return getMain();
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
      case SimpleExpressionsPackage.APPLICATION__NAME:
        setName((String)newValue);
        return;
      case SimpleExpressionsPackage.APPLICATION__MAIN:
        setMain((XBlockExpression)newValue);
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
      case SimpleExpressionsPackage.APPLICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimpleExpressionsPackage.APPLICATION__MAIN:
        setMain((XBlockExpression)null);
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
      case SimpleExpressionsPackage.APPLICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimpleExpressionsPackage.APPLICATION__MAIN:
        return main != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ApplicationImpl
