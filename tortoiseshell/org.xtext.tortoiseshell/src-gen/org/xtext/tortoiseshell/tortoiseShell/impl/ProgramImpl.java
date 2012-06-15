/**
 */
package org.xtext.tortoiseshell.tortoiseShell.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XBlockExpression;

import org.xtext.tortoiseshell.tortoiseShell.Function;
import org.xtext.tortoiseshell.tortoiseShell.Program;
import org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tortoiseshell.tortoiseShell.impl.ProgramImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.tortoiseshell.tortoiseShell.impl.ProgramImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected XBlockExpression body;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<Function> functions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return TortoiseShellPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBlockExpression getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(XBlockExpression newBody, NotificationChain msgs)
  {
    XBlockExpression oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TortoiseShellPackage.PROGRAM__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(XBlockExpression newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TortoiseShellPackage.PROGRAM__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TortoiseShellPackage.PROGRAM__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TortoiseShellPackage.PROGRAM__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<Function>(Function.class, this, TortoiseShellPackage.PROGRAM__FUNCTIONS);
    }
    return functions;
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
      case TortoiseShellPackage.PROGRAM__BODY:
        return basicSetBody(null, msgs);
      case TortoiseShellPackage.PROGRAM__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
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
      case TortoiseShellPackage.PROGRAM__BODY:
        return getBody();
      case TortoiseShellPackage.PROGRAM__FUNCTIONS:
        return getFunctions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TortoiseShellPackage.PROGRAM__BODY:
        setBody((XBlockExpression)newValue);
        return;
      case TortoiseShellPackage.PROGRAM__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Function>)newValue);
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
      case TortoiseShellPackage.PROGRAM__BODY:
        setBody((XBlockExpression)null);
        return;
      case TortoiseShellPackage.PROGRAM__FUNCTIONS:
        getFunctions().clear();
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
      case TortoiseShellPackage.PROGRAM__BODY:
        return body != null;
      case TortoiseShellPackage.PROGRAM__FUNCTIONS:
        return functions != null && !functions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
