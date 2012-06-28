/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.httprouting.route;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.xtext.httprouting.route.RouteFactory
 * @model kind="package"
 * @generated
 */
public interface RoutePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "route";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/httprouting/Route";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "route";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RoutePackage eINSTANCE = org.xtext.httprouting.route.impl.RoutePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.ModelImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Routes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ROUTES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.ImportImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_TYPE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.RouteImpl <em>Route</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.RouteImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getRoute()
   * @generated
   */
  int ROUTE = 2;

  /**
   * The feature id for the '<em><b>Request Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__REQUEST_TYPE = 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__URL = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__CONDITION = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__KEY = 3;

  /**
   * The feature id for the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__CALL = 4;

  /**
   * The number of structural features of the '<em>Route</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.URLImpl <em>URL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.URLImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getURL()
   * @generated
   */
  int URL = 3;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__VARIABLES = 0;

  /**
   * The number of structural features of the '<em>URL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.VariableImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__WILDCARD = 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.ConditionImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 5;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.KeyImpl <em>Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.KeyImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getKey()
   * @generated
   */
  int KEY = 6;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__ANNOTATIONS = 0;

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
   * The meta object id for the '{@link org.xtext.httprouting.route.RequestType <em>Request Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.RequestType
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getRequestType()
   * @generated
   */
  int REQUEST_TYPE = 7;


  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.httprouting.route.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.httprouting.route.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.httprouting.route.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.httprouting.route.Model#getRoutes <em>Routes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Routes</em>'.
   * @see org.xtext.httprouting.route.Model#getRoutes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Routes();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtext.httprouting.route.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the reference '{@link org.xtext.httprouting.route.Import#getImportedType <em>Imported Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Imported Type</em>'.
   * @see org.xtext.httprouting.route.Import#getImportedType()
   * @see #getImport()
   * @generated
   */
  EReference getImport_ImportedType();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.Route <em>Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Route</em>'.
   * @see org.xtext.httprouting.route.Route
   * @generated
   */
  EClass getRoute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.httprouting.route.Route#getRequestType <em>Request Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Request Type</em>'.
   * @see org.xtext.httprouting.route.Route#getRequestType()
   * @see #getRoute()
   * @generated
   */
  EAttribute getRoute_RequestType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.httprouting.route.Route#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.xtext.httprouting.route.Route#getUrl()
   * @see #getRoute()
   * @generated
   */
  EReference getRoute_Url();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.httprouting.route.Route#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.httprouting.route.Route#getCondition()
   * @see #getRoute()
   * @generated
   */
  EReference getRoute_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.httprouting.route.Route#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see org.xtext.httprouting.route.Route#getKey()
   * @see #getRoute()
   * @generated
   */
  EReference getRoute_Key();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.httprouting.route.Route#getCall <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Call</em>'.
   * @see org.xtext.httprouting.route.Route#getCall()
   * @see #getRoute()
   * @generated
   */
  EReference getRoute_Call();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.URL <em>URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URL</em>'.
   * @see org.xtext.httprouting.route.URL
   * @generated
   */
  EClass getURL();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.httprouting.route.URL#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.xtext.httprouting.route.URL#getVariables()
   * @see #getURL()
   * @generated
   */
  EReference getURL_Variables();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.httprouting.route.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.httprouting.route.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.httprouting.route.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.httprouting.route.Variable#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see org.xtext.httprouting.route.Variable#isWildcard()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Wildcard();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.xtext.httprouting.route.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.httprouting.route.Condition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.httprouting.route.Condition#getExpression()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key</em>'.
   * @see org.xtext.httprouting.route.Key
   * @generated
   */
  EClass getKey();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.httprouting.route.Key#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.xtext.httprouting.route.Key#getAnnotations()
   * @see #getKey()
   * @generated
   */
  EReference getKey_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.httprouting.route.Key#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.httprouting.route.Key#getType()
   * @see #getKey()
   * @generated
   */
  EReference getKey_Type();

  /**
   * Returns the meta object for enum '{@link org.xtext.httprouting.route.RequestType <em>Request Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Request Type</em>'.
   * @see org.xtext.httprouting.route.RequestType
   * @generated
   */
  EEnum getRequestType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RouteFactory getRouteFactory();

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
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.ModelImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ROUTES = eINSTANCE.getModel_Routes();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.ImportImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__IMPORTED_TYPE = eINSTANCE.getImport_ImportedType();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.RouteImpl <em>Route</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.RouteImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getRoute()
     * @generated
     */
    EClass ROUTE = eINSTANCE.getRoute();

    /**
     * The meta object literal for the '<em><b>Request Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROUTE__REQUEST_TYPE = eINSTANCE.getRoute_RequestType();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE__URL = eINSTANCE.getRoute_Url();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE__CONDITION = eINSTANCE.getRoute_Condition();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE__KEY = eINSTANCE.getRoute_Key();

    /**
     * The meta object literal for the '<em><b>Call</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE__CALL = eINSTANCE.getRoute_Call();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.URLImpl <em>URL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.URLImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getURL()
     * @generated
     */
    EClass URL = eINSTANCE.getURL();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference URL__VARIABLES = eINSTANCE.getURL_Variables();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.VariableImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__WILDCARD = eINSTANCE.getVariable_Wildcard();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.ConditionImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.KeyImpl <em>Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.KeyImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getKey()
     * @generated
     */
    EClass KEY = eINSTANCE.getKey();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY__ANNOTATIONS = eINSTANCE.getKey_Annotations();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY__TYPE = eINSTANCE.getKey_Type();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.RequestType <em>Request Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.RequestType
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getRequestType()
     * @generated
     */
    EEnum REQUEST_TYPE = eINSTANCE.getRequestType();

  }

} //RoutePackage
