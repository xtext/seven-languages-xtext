/**
 */
package org.guicecon.modules.guiceModules;

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
 * @see org.guicecon.modules.guiceModules.GuiceModulesFactory
 * @model kind="package"
 * @generated
 */
public interface GuiceModulesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "guiceModules";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.guicecon.org/modules/GuiceModules";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "guiceModules";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GuiceModulesPackage eINSTANCE = org.guicecon.modules.guiceModules.impl.GuiceModulesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.guicecon.modules.guiceModules.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.guicecon.modules.guiceModules.impl.ModuleImpl
   * @see org.guicecon.modules.guiceModules.impl.GuiceModulesPackageImpl#getModule()
   * @generated
   */
  int MODULE = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 2;

  /**
   * The feature id for the '<em><b>Mixins</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__MIXINS = 3;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__BINDINGS = 4;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.guicecon.modules.guiceModules.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.guicecon.modules.guiceModules.impl.BindingImpl
   * @see org.guicecon.modules.guiceModules.impl.GuiceModulesPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 1;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__OVERRIDE = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__FROM = 1;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__TO = 2;

  /**
   * The feature id for the '<em><b>To Instance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__TO_INSTANCE = 3;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.guicecon.modules.guiceModules.impl.KeyImpl <em>Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.guicecon.modules.guiceModules.impl.KeyImpl
   * @see org.guicecon.modules.guiceModules.impl.GuiceModulesPackageImpl#getKey()
   * @generated
   */
  int KEY = 2;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__TYPE = 1;

  /**
   * The number of structural features of the '<em>Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.guicecon.modules.guiceModules.impl.AnnotationRefImpl <em>Annotation Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.guicecon.modules.guiceModules.impl.AnnotationRefImpl
   * @see org.guicecon.modules.guiceModules.impl.GuiceModulesPackageImpl#getAnnotationRef()
   * @generated
   */
  int ANNOTATION_REF = 3;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_REF__ANNOTATION = 0;

  /**
   * The number of structural features of the '<em>Annotation Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.guicecon.modules.guiceModules.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.guicecon.modules.guiceModules.impl.ImportImpl
   * @see org.guicecon.modules.guiceModules.impl.GuiceModulesPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 4;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.guicecon.modules.guiceModules.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.guicecon.modules.guiceModules.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link org.guicecon.modules.guiceModules.Module#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see org.guicecon.modules.guiceModules.Module#getPackageName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link org.guicecon.modules.guiceModules.Module#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.guicecon.modules.guiceModules.Module#getImports()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Imports();

  /**
   * Returns the meta object for the attribute '{@link org.guicecon.modules.guiceModules.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.guicecon.modules.guiceModules.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the reference list '{@link org.guicecon.modules.guiceModules.Module#getMixins <em>Mixins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Mixins</em>'.
   * @see org.guicecon.modules.guiceModules.Module#getMixins()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Mixins();

  /**
   * Returns the meta object for the containment reference list '{@link org.guicecon.modules.guiceModules.Module#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.guicecon.modules.guiceModules.Module#getBindings()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Bindings();

  /**
   * Returns the meta object for class '{@link org.guicecon.modules.guiceModules.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.guicecon.modules.guiceModules.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the attribute '{@link org.guicecon.modules.guiceModules.Binding#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see org.guicecon.modules.guiceModules.Binding#isOverride()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Override();

  /**
   * Returns the meta object for the containment reference '{@link org.guicecon.modules.guiceModules.Binding#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see org.guicecon.modules.guiceModules.Binding#getFrom()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_From();

  /**
   * Returns the meta object for the containment reference '{@link org.guicecon.modules.guiceModules.Binding#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see org.guicecon.modules.guiceModules.Binding#getTo()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_To();

  /**
   * Returns the meta object for the containment reference '{@link org.guicecon.modules.guiceModules.Binding#getToInstance <em>To Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Instance</em>'.
   * @see org.guicecon.modules.guiceModules.Binding#getToInstance()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_ToInstance();

  /**
   * Returns the meta object for class '{@link org.guicecon.modules.guiceModules.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key</em>'.
   * @see org.guicecon.modules.guiceModules.Key
   * @generated
   */
  EClass getKey();

  /**
   * Returns the meta object for the containment reference '{@link org.guicecon.modules.guiceModules.Key#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see org.guicecon.modules.guiceModules.Key#getAnnotation()
   * @see #getKey()
   * @generated
   */
  EReference getKey_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link org.guicecon.modules.guiceModules.Key#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.guicecon.modules.guiceModules.Key#getType()
   * @see #getKey()
   * @generated
   */
  EReference getKey_Type();

  /**
   * Returns the meta object for class '{@link org.guicecon.modules.guiceModules.AnnotationRef <em>Annotation Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Ref</em>'.
   * @see org.guicecon.modules.guiceModules.AnnotationRef
   * @generated
   */
  EClass getAnnotationRef();

  /**
   * Returns the meta object for the reference '{@link org.guicecon.modules.guiceModules.AnnotationRef#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Annotation</em>'.
   * @see org.guicecon.modules.guiceModules.AnnotationRef#getAnnotation()
   * @see #getAnnotationRef()
   * @generated
   */
  EReference getAnnotationRef_Annotation();

  /**
   * Returns the meta object for class '{@link org.guicecon.modules.guiceModules.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.guicecon.modules.guiceModules.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.guicecon.modules.guiceModules.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.guicecon.modules.guiceModules.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GuiceModulesFactory getGuiceModulesFactory();

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
     * The meta object literal for the '{@link org.guicecon.modules.guiceModules.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.guicecon.modules.guiceModules.impl.ModuleImpl
     * @see org.guicecon.modules.guiceModules.impl.GuiceModulesPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__PACKAGE_NAME = eINSTANCE.getModule_PackageName();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__IMPORTS = eINSTANCE.getModule_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Mixins</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__MIXINS = eINSTANCE.getModule_Mixins();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__BINDINGS = eINSTANCE.getModule_Bindings();

    /**
     * The meta object literal for the '{@link org.guicecon.modules.guiceModules.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.guicecon.modules.guiceModules.impl.BindingImpl
     * @see org.guicecon.modules.guiceModules.impl.GuiceModulesPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__OVERRIDE = eINSTANCE.getBinding_Override();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__FROM = eINSTANCE.getBinding_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__TO = eINSTANCE.getBinding_To();

    /**
     * The meta object literal for the '<em><b>To Instance</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__TO_INSTANCE = eINSTANCE.getBinding_ToInstance();

    /**
     * The meta object literal for the '{@link org.guicecon.modules.guiceModules.impl.KeyImpl <em>Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.guicecon.modules.guiceModules.impl.KeyImpl
     * @see org.guicecon.modules.guiceModules.impl.GuiceModulesPackageImpl#getKey()
     * @generated
     */
    EClass KEY = eINSTANCE.getKey();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY__ANNOTATION = eINSTANCE.getKey_Annotation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY__TYPE = eINSTANCE.getKey_Type();

    /**
     * The meta object literal for the '{@link org.guicecon.modules.guiceModules.impl.AnnotationRefImpl <em>Annotation Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.guicecon.modules.guiceModules.impl.AnnotationRefImpl
     * @see org.guicecon.modules.guiceModules.impl.GuiceModulesPackageImpl#getAnnotationRef()
     * @generated
     */
    EClass ANNOTATION_REF = eINSTANCE.getAnnotationRef();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_REF__ANNOTATION = eINSTANCE.getAnnotationRef_Annotation();

    /**
     * The meta object literal for the '{@link org.guicecon.modules.guiceModules.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.guicecon.modules.guiceModules.impl.ImportImpl
     * @see org.guicecon.modules.guiceModules.impl.GuiceModulesPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

  }

} //GuiceModulesPackage
