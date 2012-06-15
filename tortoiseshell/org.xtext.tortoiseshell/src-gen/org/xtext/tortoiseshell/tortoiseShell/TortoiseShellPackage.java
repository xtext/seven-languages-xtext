/**
 */
package org.xtext.tortoiseshell.tortoiseShell;

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
 * @see org.xtext.tortoiseshell.tortoiseShell.TortoiseShellFactory
 * @model kind="package"
 * @generated
 */
public interface TortoiseShellPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tortoiseShell";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/tortoiseshell/TortoiseShell";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tortoiseShell";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TortoiseShellPackage eINSTANCE = org.xtext.tortoiseshell.tortoiseShell.impl.TortoiseShellPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.tortoiseshell.tortoiseShell.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tortoiseshell.tortoiseShell.impl.ProgramImpl
   * @see org.xtext.tortoiseshell.tortoiseShell.impl.TortoiseShellPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__BODY = 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__FUNCTIONS = 1;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tortoiseshell.tortoiseShell.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tortoiseshell.tortoiseShell.impl.FunctionImpl
   * @see org.xtext.tortoiseshell.tortoiseShell.impl.TortoiseShellPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__BODY = 2;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.tortoiseshell.tortoiseShell.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.xtext.tortoiseshell.tortoiseShell.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tortoiseshell.tortoiseShell.Program#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.tortoiseshell.tortoiseShell.Program#getBody()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Body();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tortoiseshell.tortoiseShell.Program#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.xtext.tortoiseshell.tortoiseShell.Program#getFunctions()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Functions();

  /**
   * Returns the meta object for class '{@link org.xtext.tortoiseshell.tortoiseShell.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.tortoiseshell.tortoiseShell.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tortoiseshell.tortoiseShell.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.tortoiseshell.tortoiseShell.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tortoiseshell.tortoiseShell.Function#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.tortoiseshell.tortoiseShell.Function#getParameters()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tortoiseshell.tortoiseShell.Function#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.tortoiseshell.tortoiseShell.Function#getBody()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Body();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TortoiseShellFactory getTortoiseShellFactory();

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
     * The meta object literal for the '{@link org.xtext.tortoiseshell.tortoiseShell.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tortoiseshell.tortoiseShell.impl.ProgramImpl
     * @see org.xtext.tortoiseshell.tortoiseShell.impl.TortoiseShellPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__BODY = eINSTANCE.getProgram_Body();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__FUNCTIONS = eINSTANCE.getProgram_Functions();

    /**
     * The meta object literal for the '{@link org.xtext.tortoiseshell.tortoiseShell.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tortoiseshell.tortoiseShell.impl.FunctionImpl
     * @see org.xtext.tortoiseshell.tortoiseShell.impl.TortoiseShellPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__BODY = eINSTANCE.getFunction_Body();

  }

} //TortoiseShellPackage
