/**
 */
package org.cradle.language.cradle;

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
 *   <li>{@link org.cradle.language.cradle.Task#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.cradle.language.cradle.Task#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cradle.language.cradle.CradlePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Declaration
{
  /**
   * Returns the value of the '<em><b>Depends On</b></em>' containment reference list.
   * The list contents are of type {@link org.cradle.language.cradle.TaskReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depends On</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends On</em>' containment reference list.
   * @see org.cradle.language.cradle.CradlePackage#getTask_DependsOn()
   * @model containment="true"
   * @generated
   */
  EList<TaskReference> getDependsOn();

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
   * @see org.cradle.language.cradle.CradlePackage#getTask_Action()
   * @model containment="true"
   * @generated
   */
  XExpression getAction();

  /**
   * Sets the value of the '{@link org.cradle.language.cradle.Task#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(XExpression value);

} // Task
