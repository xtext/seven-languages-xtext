/**
 */
package org.xtext.httprouting.route;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.httprouting.route.Route#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.xtext.httprouting.route.Route#getUrl <em>Url</em>}</li>
 *   <li>{@link org.xtext.httprouting.route.Route#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.httprouting.route.Route#getKey <em>Key</em>}</li>
 *   <li>{@link org.xtext.httprouting.route.Route#getCall <em>Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.httprouting.route.RoutePackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject
{
  /**
   * Returns the value of the '<em><b>Request Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.httprouting.route.RequestType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Request Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Request Type</em>' attribute.
   * @see org.xtext.httprouting.route.RequestType
   * @see #setRequestType(RequestType)
   * @see org.xtext.httprouting.route.RoutePackage#getRoute_RequestType()
   * @model
   * @generated
   */
  RequestType getRequestType();

  /**
   * Sets the value of the '{@link org.xtext.httprouting.route.Route#getRequestType <em>Request Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Request Type</em>' attribute.
   * @see org.xtext.httprouting.route.RequestType
   * @see #getRequestType()
   * @generated
   */
  void setRequestType(RequestType value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' containment reference.
   * @see #setUrl(URL)
   * @see org.xtext.httprouting.route.RoutePackage#getRoute_Url()
   * @model containment="true"
   * @generated
   */
  URL getUrl();

  /**
   * Sets the value of the '{@link org.xtext.httprouting.route.Route#getUrl <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' containment reference.
   * @see #getUrl()
   * @generated
   */
  void setUrl(URL value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see org.xtext.httprouting.route.RoutePackage#getRoute_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link org.xtext.httprouting.route.Route#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' containment reference.
   * @see #setKey(Key)
   * @see org.xtext.httprouting.route.RoutePackage#getRoute_Key()
   * @model containment="true"
   * @generated
   */
  Key getKey();

  /**
   * Sets the value of the '{@link org.xtext.httprouting.route.Route#getKey <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' containment reference.
   * @see #getKey()
   * @generated
   */
  void setKey(Key value);

  /**
   * Returns the value of the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call</em>' containment reference.
   * @see #setCall(XExpression)
   * @see org.xtext.httprouting.route.RoutePackage#getRoute_Call()
   * @model containment="true"
   * @generated
   */
  XExpression getCall();

  /**
   * Sets the value of the '{@link org.xtext.httprouting.route.Route#getCall <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call</em>' containment reference.
   * @see #getCall()
   * @generated
   */
  void setCall(XExpression value);

} // Route
