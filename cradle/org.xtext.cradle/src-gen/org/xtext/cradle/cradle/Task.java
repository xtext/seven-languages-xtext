/**
 */
package org.xtext.cradle.cradle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cradle.cradle.Task#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.xtext.cradle.cradle.Task#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cradle.cradle.CradlePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Declaration
{
  /**
   * Returns the value of the '<em><b>Depends On</b></em>' reference list.
   * The list contents are of type {@link org.xtext.cradle.cradle.Task}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depends On</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends On</em>' reference list.
   * @see org.xtext.cradle.cradle.CradlePackage#getTask_DependsOn()
   * @model
   * @generated
   */
  EList<Task> getDependsOn();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(XExpression)
   * @see org.xtext.cradle.cradle.CradlePackage#getTask_Action()
   * @model containment="true"
   * @generated
   */
  XExpression getAction();

  /**
   * Sets the value of the '{@link org.xtext.cradle.cradle.Task#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(XExpression value);

} // Task
