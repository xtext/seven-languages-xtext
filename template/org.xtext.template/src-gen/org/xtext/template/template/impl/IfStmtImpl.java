/**
 */
package org.xtext.template.template.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.template.template.BlockStmt;
import org.xtext.template.template.IfStmt;
import org.xtext.template.template.IfStmtBody;
import org.xtext.template.template.TemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.template.template.impl.IfStmtImpl#getIfbodies <em>Ifbodies</em>}</li>
 *   <li>{@link org.xtext.template.template.impl.IfStmtImpl#getElsebody <em>Elsebody</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStmtImpl extends StructuralStmtImpl implements IfStmt
{
  /**
   * The cached value of the '{@link #getIfbodies() <em>Ifbodies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfbodies()
   * @generated
   * @ordered
   */
  protected EList<IfStmtBody> ifbodies;

  /**
   * The cached value of the '{@link #getElsebody() <em>Elsebody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsebody()
   * @generated
   * @ordered
   */
  protected BlockStmt elsebody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStmtImpl()
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
    return TemplatePackage.Literals.IF_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IfStmtBody> getIfbodies()
  {
    if (ifbodies == null)
    {
      ifbodies = new EObjectContainmentEList<IfStmtBody>(IfStmtBody.class, this, TemplatePackage.IF_STMT__IFBODIES);
    }
    return ifbodies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockStmt getElsebody()
  {
    return elsebody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElsebody(BlockStmt newElsebody, NotificationChain msgs)
  {
    BlockStmt oldElsebody = elsebody;
    elsebody = newElsebody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.IF_STMT__ELSEBODY, oldElsebody, newElsebody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElsebody(BlockStmt newElsebody)
  {
    if (newElsebody != elsebody)
    {
      NotificationChain msgs = null;
      if (elsebody != null)
        msgs = ((InternalEObject)elsebody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.IF_STMT__ELSEBODY, null, msgs);
      if (newElsebody != null)
        msgs = ((InternalEObject)newElsebody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.IF_STMT__ELSEBODY, null, msgs);
      msgs = basicSetElsebody(newElsebody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.IF_STMT__ELSEBODY, newElsebody, newElsebody));
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
      case TemplatePackage.IF_STMT__IFBODIES:
        return ((InternalEList<?>)getIfbodies()).basicRemove(otherEnd, msgs);
      case TemplatePackage.IF_STMT__ELSEBODY:
        return basicSetElsebody(null, msgs);
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
      case TemplatePackage.IF_STMT__IFBODIES:
        return getIfbodies();
      case TemplatePackage.IF_STMT__ELSEBODY:
        return getElsebody();
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
      case TemplatePackage.IF_STMT__IFBODIES:
        getIfbodies().clear();
        getIfbodies().addAll((Collection<? extends IfStmtBody>)newValue);
        return;
      case TemplatePackage.IF_STMT__ELSEBODY:
        setElsebody((BlockStmt)newValue);
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
      case TemplatePackage.IF_STMT__IFBODIES:
        getIfbodies().clear();
        return;
      case TemplatePackage.IF_STMT__ELSEBODY:
        setElsebody((BlockStmt)null);
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
      case TemplatePackage.IF_STMT__IFBODIES:
        return ifbodies != null && !ifbodies.isEmpty();
      case TemplatePackage.IF_STMT__ELSEBODY:
        return elsebody != null;
    }
    return super.eIsSet(featureID);
  }

} //IfStmtImpl
