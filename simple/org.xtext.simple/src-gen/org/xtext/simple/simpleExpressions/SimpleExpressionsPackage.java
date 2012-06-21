/**
 */
package org.xtext.simple.simpleExpressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.simple.simpleExpressions.SimpleExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleExpressionsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simpleExpressions";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/simple/SimpleExpressions";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simpleExpressions";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleExpressionsPackage eINSTANCE = org.xtext.simple.simpleExpressions.impl.SimpleExpressionsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.simple.simpleExpressions.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.simple.simpleExpressions.impl.ApplicationImpl
   * @see org.xtext.simple.simpleExpressions.impl.SimpleExpressionsPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__MAIN = 1;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.simple.simpleExpressions.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see org.xtext.simple.simpleExpressions.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.simple.simpleExpressions.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.simple.simpleExpressions.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.simple.simpleExpressions.Application#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see org.xtext.simple.simpleExpressions.Application#getMain()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Main();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimpleExpressionsFactory getSimpleExpressionsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.simple.simpleExpressions.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.simple.simpleExpressions.impl.ApplicationImpl
     * @see org.xtext.simple.simpleExpressions.impl.SimpleExpressionsPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__MAIN = eINSTANCE.getApplication_Main();

  }

} //SimpleExpressionsPackage
