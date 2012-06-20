/**
 */
package org.cradle.language.cradle;

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
 * @see org.cradle.language.cradle.CradleFactory
 * @model kind="package"
 * @generated
 */
public interface CradlePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cradle";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cradle.org/language/Cradle";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cradle";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CradlePackage eINSTANCE = org.cradle.language.cradle.impl.CradlePackageImpl.init();

  /**
   * The meta object id for the '{@link org.cradle.language.cradle.impl.CradleFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cradle.language.cradle.impl.CradleFileImpl
   * @see org.cradle.language.cradle.impl.CradlePackageImpl#getCradleFile()
   * @generated
   */
  int CRADLE_FILE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRADLE_FILE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRADLE_FILE__DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRADLE_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.cradle.language.cradle.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cradle.language.cradle.impl.ImportDeclarationImpl
   * @see org.cradle.language.cradle.impl.CradlePackageImpl#getImportDeclaration()
   * @generated
   */
  int IMPORT_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cradle.language.cradle.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cradle.language.cradle.impl.DeclarationImpl
   * @see org.cradle.language.cradle.impl.CradlePackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.cradle.language.cradle.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cradle.language.cradle.impl.ParameterImpl
   * @see org.cradle.language.cradle.impl.CradlePackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__INIT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cradle.language.cradle.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cradle.language.cradle.impl.TaskImpl
   * @see org.cradle.language.cradle.impl.CradlePackageImpl#getTask()
   * @generated
   */
  int TASK = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Depends On</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DEPENDS_ON = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ACTION = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.cradle.language.cradle.impl.TaskReferenceImpl <em>Task Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cradle.language.cradle.impl.TaskReferenceImpl
   * @see org.cradle.language.cradle.impl.CradlePackageImpl#getTaskReference()
   * @generated
   */
  int TASK_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_REFERENCE__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Soft Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_REFERENCE__SOFT_REFERENCE = 1;

  /**
   * The number of structural features of the '<em>Task Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_REFERENCE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.cradle.language.cradle.CradleFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.cradle.language.cradle.CradleFile
   * @generated
   */
  EClass getCradleFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.cradle.language.cradle.CradleFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.cradle.language.cradle.CradleFile#getImports()
   * @see #getCradleFile()
   * @generated
   */
  EReference getCradleFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.cradle.language.cradle.CradleFile#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.cradle.language.cradle.CradleFile#getDeclarations()
   * @see #getCradleFile()
   * @generated
   */
  EReference getCradleFile_Declarations();

  /**
   * Returns the meta object for class '{@link org.cradle.language.cradle.ImportDeclaration <em>Import Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Declaration</em>'.
   * @see org.cradle.language.cradle.ImportDeclaration
   * @generated
   */
  EClass getImportDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.cradle.language.cradle.ImportDeclaration#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.cradle.language.cradle.ImportDeclaration#getImportedNamespace()
   * @see #getImportDeclaration()
   * @generated
   */
  EAttribute getImportDeclaration_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.cradle.language.cradle.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.cradle.language.cradle.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.cradle.language.cradle.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.cradle.language.cradle.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.cradle.language.cradle.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.cradle.language.cradle.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.cradle.language.cradle.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.cradle.language.cradle.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.cradle.language.cradle.Parameter#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.cradle.language.cradle.Parameter#getInit()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Init();

  /**
   * Returns the meta object for class '{@link org.cradle.language.cradle.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.cradle.language.cradle.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the containment reference list '{@link org.cradle.language.cradle.Task#getDependsOn <em>Depends On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Depends On</em>'.
   * @see org.cradle.language.cradle.Task#getDependsOn()
   * @see #getTask()
   * @generated
   */
  EReference getTask_DependsOn();

  /**
   * Returns the meta object for the containment reference '{@link org.cradle.language.cradle.Task#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.cradle.language.cradle.Task#getAction()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Action();

  /**
   * Returns the meta object for class '{@link org.cradle.language.cradle.TaskReference <em>Task Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Reference</em>'.
   * @see org.cradle.language.cradle.TaskReference
   * @generated
   */
  EClass getTaskReference();

  /**
   * Returns the meta object for the reference '{@link org.cradle.language.cradle.TaskReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.cradle.language.cradle.TaskReference#getReference()
   * @see #getTaskReference()
   * @generated
   */
  EReference getTaskReference_Reference();

  /**
   * Returns the meta object for the attribute '{@link org.cradle.language.cradle.TaskReference#getSoftReference <em>Soft Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Soft Reference</em>'.
   * @see org.cradle.language.cradle.TaskReference#getSoftReference()
   * @see #getTaskReference()
   * @generated
   */
  EAttribute getTaskReference_SoftReference();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CradleFactory getCradleFactory();

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
     * The meta object literal for the '{@link org.cradle.language.cradle.impl.CradleFileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cradle.language.cradle.impl.CradleFileImpl
     * @see org.cradle.language.cradle.impl.CradlePackageImpl#getCradleFile()
     * @generated
     */
    EClass CRADLE_FILE = eINSTANCE.getCradleFile();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRADLE_FILE__IMPORTS = eINSTANCE.getCradleFile_Imports();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRADLE_FILE__DECLARATIONS = eINSTANCE.getCradleFile_Declarations();

    /**
     * The meta object literal for the '{@link org.cradle.language.cradle.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cradle.language.cradle.impl.ImportDeclarationImpl
     * @see org.cradle.language.cradle.impl.CradlePackageImpl#getImportDeclaration()
     * @generated
     */
    EClass IMPORT_DECLARATION = eINSTANCE.getImportDeclaration();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DECLARATION__IMPORTED_NAMESPACE = eINSTANCE.getImportDeclaration_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.cradle.language.cradle.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cradle.language.cradle.impl.DeclarationImpl
     * @see org.cradle.language.cradle.impl.CradlePackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.cradle.language.cradle.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cradle.language.cradle.impl.ParameterImpl
     * @see org.cradle.language.cradle.impl.CradlePackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__INIT = eINSTANCE.getParameter_Init();

    /**
     * The meta object literal for the '{@link org.cradle.language.cradle.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cradle.language.cradle.impl.TaskImpl
     * @see org.cradle.language.cradle.impl.CradlePackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Depends On</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__DEPENDS_ON = eINSTANCE.getTask_DependsOn();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__ACTION = eINSTANCE.getTask_Action();

    /**
     * The meta object literal for the '{@link org.cradle.language.cradle.impl.TaskReferenceImpl <em>Task Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cradle.language.cradle.impl.TaskReferenceImpl
     * @see org.cradle.language.cradle.impl.CradlePackageImpl#getTaskReference()
     * @generated
     */
    EClass TASK_REFERENCE = eINSTANCE.getTaskReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_REFERENCE__REFERENCE = eINSTANCE.getTaskReference_Reference();

    /**
     * The meta object literal for the '<em><b>Soft Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_REFERENCE__SOFT_REFERENCE = eINSTANCE.getTaskReference_SoftReference();

  }

} //CradlePackage
