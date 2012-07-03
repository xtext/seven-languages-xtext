/**
 */
package org.xtext.guicemodules.guiceModules.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.guicemodules.guiceModules.GuiceModulesPackage;
import org.xtext.guicemodules.guiceModules.ImportAST;
import org.xtext.guicemodules.guiceModules.ModuleAST;
import org.xtext.guicemodules.guiceModules.ModulesAST;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modules AST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.guicemodules.guiceModules.impl.ModulesASTImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.impl.ModulesASTImpl#getModules <em>Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModulesASTImpl extends MinimalEObjectImpl.Container implements ModulesAST
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportAST> imports;

  /**
   * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModules()
   * @generated
   * @ordered
   */
  protected EList<ModuleAST> modules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModulesASTImpl()
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
    return GuiceModulesPackage.Literals.MODULES_AST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportAST> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportAST>(ImportAST.class, this, GuiceModulesPackage.MODULES_AST__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModuleAST> getModules()
  {
    if (modules == null)
    {
      modules = new EObjectContainmentEList<ModuleAST>(ModuleAST.class, this, GuiceModulesPackage.MODULES_AST__MODULES);
    }
    return modules;
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
      case GuiceModulesPackage.MODULES_AST__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case GuiceModulesPackage.MODULES_AST__MODULES:
        return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
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
      case GuiceModulesPackage.MODULES_AST__IMPORTS:
        return getImports();
      case GuiceModulesPackage.MODULES_AST__MODULES:
        return getModules();
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
      case GuiceModulesPackage.MODULES_AST__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportAST>)newValue);
        return;
      case GuiceModulesPackage.MODULES_AST__MODULES:
        getModules().clear();
        getModules().addAll((Collection<? extends ModuleAST>)newValue);
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
      case GuiceModulesPackage.MODULES_AST__IMPORTS:
        getImports().clear();
        return;
      case GuiceModulesPackage.MODULES_AST__MODULES:
        getModules().clear();
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
      case GuiceModulesPackage.MODULES_AST__IMPORTS:
        return imports != null && !imports.isEmpty();
      case GuiceModulesPackage.MODULES_AST__MODULES:
        return modules != null && !modules.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModulesASTImpl
