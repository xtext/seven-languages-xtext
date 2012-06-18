/**
 */
package org.guicecon.modules.guiceModules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

import org.guicecon.modules.guiceModules.Binding;
import org.guicecon.modules.guiceModules.GuiceModulesPackage;
import org.guicecon.modules.guiceModules.Key;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.guicecon.modules.guiceModules.impl.BindingImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.impl.BindingImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.impl.BindingImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.impl.BindingImpl#getToInstance <em>To Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding
{
  /**
   * The default value of the '{@link #isOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverride()
   * @generated
   * @ordered
   */
  protected static final boolean OVERRIDE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverride()
   * @generated
   * @ordered
   */
  protected boolean override = OVERRIDE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected Key from;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected Key to;

  /**
   * The cached value of the '{@link #getToInstance() <em>To Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToInstance()
   * @generated
   * @ordered
   */
  protected XExpression toInstance;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return GuiceModulesPackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOverride()
  {
    return override;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverride(boolean newOverride)
  {
    boolean oldOverride = override;
    override = newOverride;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING__OVERRIDE, oldOverride, override));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Key getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFrom(Key newFrom, NotificationChain msgs)
  {
    Key oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING__FROM, oldFrom, newFrom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(Key newFrom)
  {
    if (newFrom != from)
    {
      NotificationChain msgs = null;
      if (from != null)
        msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING__FROM, null, msgs);
      if (newFrom != null)
        msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING__FROM, null, msgs);
      msgs = basicSetFrom(newFrom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING__FROM, newFrom, newFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Key getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTo(Key newTo, NotificationChain msgs)
  {
    Key oldTo = to;
    to = newTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING__TO, oldTo, newTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(Key newTo)
  {
    if (newTo != to)
    {
      NotificationChain msgs = null;
      if (to != null)
        msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING__TO, null, msgs);
      if (newTo != null)
        msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING__TO, null, msgs);
      msgs = basicSetTo(newTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING__TO, newTo, newTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getToInstance()
  {
    return toInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToInstance(XExpression newToInstance, NotificationChain msgs)
  {
    XExpression oldToInstance = toInstance;
    toInstance = newToInstance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING__TO_INSTANCE, oldToInstance, newToInstance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToInstance(XExpression newToInstance)
  {
    if (newToInstance != toInstance)
    {
      NotificationChain msgs = null;
      if (toInstance != null)
        msgs = ((InternalEObject)toInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING__TO_INSTANCE, null, msgs);
      if (newToInstance != null)
        msgs = ((InternalEObject)newToInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiceModulesPackage.BINDING__TO_INSTANCE, null, msgs);
      msgs = basicSetToInstance(newToInstance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.BINDING__TO_INSTANCE, newToInstance, newToInstance));
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
      case GuiceModulesPackage.BINDING__FROM:
        return basicSetFrom(null, msgs);
      case GuiceModulesPackage.BINDING__TO:
        return basicSetTo(null, msgs);
      case GuiceModulesPackage.BINDING__TO_INSTANCE:
        return basicSetToInstance(null, msgs);
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
      case GuiceModulesPackage.BINDING__OVERRIDE:
        return isOverride();
      case GuiceModulesPackage.BINDING__FROM:
        return getFrom();
      case GuiceModulesPackage.BINDING__TO:
        return getTo();
      case GuiceModulesPackage.BINDING__TO_INSTANCE:
        return getToInstance();
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
      case GuiceModulesPackage.BINDING__OVERRIDE:
        setOverride((Boolean)newValue);
        return;
      case GuiceModulesPackage.BINDING__FROM:
        setFrom((Key)newValue);
        return;
      case GuiceModulesPackage.BINDING__TO:
        setTo((Key)newValue);
        return;
      case GuiceModulesPackage.BINDING__TO_INSTANCE:
        setToInstance((XExpression)newValue);
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
      case GuiceModulesPackage.BINDING__OVERRIDE:
        setOverride(OVERRIDE_EDEFAULT);
        return;
      case GuiceModulesPackage.BINDING__FROM:
        setFrom((Key)null);
        return;
      case GuiceModulesPackage.BINDING__TO:
        setTo((Key)null);
        return;
      case GuiceModulesPackage.BINDING__TO_INSTANCE:
        setToInstance((XExpression)null);
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
      case GuiceModulesPackage.BINDING__OVERRIDE:
        return override != OVERRIDE_EDEFAULT;
      case GuiceModulesPackage.BINDING__FROM:
        return from != null;
      case GuiceModulesPackage.BINDING__TO:
        return to != null;
      case GuiceModulesPackage.BINDING__TO_INSTANCE:
        return toInstance != null;
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
    result.append(" (override: ");
    result.append(override);
    result.append(')');
    return result.toString();
  }

} //BindingImpl
