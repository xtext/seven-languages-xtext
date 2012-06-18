/**
 */
package org.guicecon.modules.guiceModules.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.guicecon.modules.guiceModules.Binding;
import org.guicecon.modules.guiceModules.GuiceModulesPackage;
import org.guicecon.modules.guiceModules.Import;
import org.guicecon.modules.guiceModules.Module;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.guicecon.modules.guiceModules.impl.ModuleImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.impl.ModuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.impl.ModuleImpl#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.impl.ModuleImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module
{
  /**
   * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected String packageName = PACKAGE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

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
   * The cached value of the '{@link #getMixins() <em>Mixins</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixins()
   * @generated
   * @ordered
   */
  protected EList<Module> mixins;

  /**
   * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindings()
   * @generated
   * @ordered
   */
  protected EList<Binding> bindings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl()
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
    return GuiceModulesPackage.Literals.MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackageName()
  {
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageName(String newPackageName)
  {
    String oldPackageName = packageName;
    packageName = newPackageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.MODULE__PACKAGE_NAME, oldPackageName, packageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, GuiceModulesPackage.MODULE__IMPORTS);
    }
    return imports;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GuiceModulesPackage.MODULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Module> getMixins()
  {
    if (mixins == null)
    {
      mixins = new EObjectResolvingEList<Module>(Module.class, this, GuiceModulesPackage.MODULE__MIXINS);
    }
    return mixins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Binding> getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList<Binding>(Binding.class, this, GuiceModulesPackage.MODULE__BINDINGS);
    }
    return bindings;
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
      case GuiceModulesPackage.MODULE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case GuiceModulesPackage.MODULE__BINDINGS:
        return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
      case GuiceModulesPackage.MODULE__PACKAGE_NAME:
        return getPackageName();
      case GuiceModulesPackage.MODULE__IMPORTS:
        return getImports();
      case GuiceModulesPackage.MODULE__NAME:
        return getName();
      case GuiceModulesPackage.MODULE__MIXINS:
        return getMixins();
      case GuiceModulesPackage.MODULE__BINDINGS:
        return getBindings();
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
      case GuiceModulesPackage.MODULE__PACKAGE_NAME:
        setPackageName((String)newValue);
        return;
      case GuiceModulesPackage.MODULE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case GuiceModulesPackage.MODULE__NAME:
        setName((String)newValue);
        return;
      case GuiceModulesPackage.MODULE__MIXINS:
        getMixins().clear();
        getMixins().addAll((Collection<? extends Module>)newValue);
        return;
      case GuiceModulesPackage.MODULE__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection<? extends Binding>)newValue);
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
      case GuiceModulesPackage.MODULE__PACKAGE_NAME:
        setPackageName(PACKAGE_NAME_EDEFAULT);
        return;
      case GuiceModulesPackage.MODULE__IMPORTS:
        getImports().clear();
        return;
      case GuiceModulesPackage.MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GuiceModulesPackage.MODULE__MIXINS:
        getMixins().clear();
        return;
      case GuiceModulesPackage.MODULE__BINDINGS:
        getBindings().clear();
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
      case GuiceModulesPackage.MODULE__PACKAGE_NAME:
        return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
      case GuiceModulesPackage.MODULE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case GuiceModulesPackage.MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GuiceModulesPackage.MODULE__MIXINS:
        return mixins != null && !mixins.isEmpty();
      case GuiceModulesPackage.MODULE__BINDINGS:
        return bindings != null && !bindings.isEmpty();
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
    result.append(" (packageName: ");
    result.append(packageName);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModuleImpl
