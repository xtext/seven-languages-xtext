/**
 */
package org.xtext.tortoiseshell.tortoiseShell.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.tortoiseshell.tortoiseShell.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TortoiseShellFactoryImpl extends EFactoryImpl implements TortoiseShellFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TortoiseShellFactory init()
  {
    try
    {
      TortoiseShellFactory theTortoiseShellFactory = (TortoiseShellFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/tortoiseshell/TortoiseShell"); 
      if (theTortoiseShellFactory != null)
      {
        return theTortoiseShellFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TortoiseShellFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TortoiseShellFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TortoiseShellPackage.PROGRAM: return createProgram();
      case TortoiseShellPackage.FUNCTION: return createFunction();
      case TortoiseShellPackage.EXECUTABLE: return createExecutable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Executable createExecutable()
  {
    ExecutableImpl executable = new ExecutableImpl();
    return executable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TortoiseShellPackage getTortoiseShellPackage()
  {
    return (TortoiseShellPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TortoiseShellPackage getPackage()
  {
    return TortoiseShellPackage.eINSTANCE;
  }

} //TortoiseShellFactoryImpl
