/**
 */
package org.guicecon.modules.guiceModules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.guicecon.modules.guiceModules.Module#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.Module#getImports <em>Imports</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.Module#getName <em>Name</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.Module#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.guicecon.modules.guiceModules.Module#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getModule_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link org.guicecon.modules.guiceModules.Module#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.guicecon.modules.guiceModules.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getModule_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.guicecon.modules.guiceModules.Module#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mixins</b></em>' reference list.
   * The list contents are of type {@link org.guicecon.modules.guiceModules.Module}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixins</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixins</em>' reference list.
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getModule_Mixins()
   * @model
   * @generated
   */
  EList<Module> getMixins();

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link org.guicecon.modules.guiceModules.Binding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see org.guicecon.modules.guiceModules.GuiceModulesPackage#getModule_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<Binding> getBindings();

} // Module
