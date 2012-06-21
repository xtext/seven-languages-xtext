/**
 */
package org.xtext.simple.simpleExpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.simple.simpleExpressions.SimpleExpressionsPackage
 * @generated
 */
public interface SimpleExpressionsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleExpressionsFactory eINSTANCE = org.xtext.simple.simpleExpressions.impl.SimpleExpressionsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimpleExpressionsPackage getSimpleExpressionsPackage();

} //SimpleExpressionsFactory
