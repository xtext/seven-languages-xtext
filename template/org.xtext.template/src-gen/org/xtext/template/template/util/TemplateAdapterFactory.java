/**
 */
package org.xtext.template.template.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.template.template.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.template.template.TemplatePackage
 * @generated
 */
public class TemplateAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TemplatePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TemplatePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateSwitch<Adapter> modelSwitch =
    new TemplateSwitch<Adapter>()
    {
      @Override
      public Adapter caseTemplateFile(TemplateFile object)
      {
        return createTemplateFileAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseBlockStmt(BlockStmt object)
      {
        return createBlockStmtAdapter();
      }
      @Override
      public Adapter caseStructuralStmt(StructuralStmt object)
      {
        return createStructuralStmtAdapter();
      }
      @Override
      public Adapter caseExpressionStmt(ExpressionStmt object)
      {
        return createExpressionStmtAdapter();
      }
      @Override
      public Adapter caseForStmt(ForStmt object)
      {
        return createForStmtAdapter();
      }
      @Override
      public Adapter caseIfStmt(IfStmt object)
      {
        return createIfStmtAdapter();
      }
      @Override
      public Adapter caseIfStmtBody(IfStmtBody object)
      {
        return createIfStmtBodyAdapter();
      }
      @Override
      public Adapter caseTextStmt(TextStmt object)
      {
        return createTextStmtAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.template.template.TemplateFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.template.template.TemplateFile
   * @generated
   */
  public Adapter createTemplateFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.template.template.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.template.template.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.template.template.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.template.template.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.template.template.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.template.template.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.template.template.BlockStmt <em>Block Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.template.template.BlockStmt
   * @generated
   */
  public Adapter createBlockStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.template.template.StructuralStmt <em>Structural Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.template.template.StructuralStmt
   * @generated
   */
  public Adapter createStructuralStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.template.template.ExpressionStmt <em>Expression Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.template.template.ExpressionStmt
   * @generated
   */
  public Adapter createExpressionStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.template.template.ForStmt <em>For Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.template.template.ForStmt
   * @generated
   */
  public Adapter createForStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.template.template.IfStmt <em>If Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.template.template.IfStmt
   * @generated
   */
  public Adapter createIfStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.template.template.IfStmtBody <em>If Stmt Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.template.template.IfStmtBody
   * @generated
   */
  public Adapter createIfStmtBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.template.template.TextStmt <em>Text Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.template.template.TextStmt
   * @generated
   */
  public Adapter createTextStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TemplateAdapterFactory
