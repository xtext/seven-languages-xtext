/**
 */
package org.xtext.template.template.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.template.template.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateFactoryImpl extends EFactoryImpl implements TemplateFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TemplateFactory init()
  {
    try
    {
      TemplateFactory theTemplateFactory = (TemplateFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.itemis.de/xtl/XTL"); 
      if (theTemplateFactory != null)
      {
        return theTemplateFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TemplateFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateFactoryImpl()
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
      case TemplatePackage.TEMPLATE_FILE: return createTemplateFile();
      case TemplatePackage.IMPORT: return createImport();
      case TemplatePackage.PARAMETER: return createParameter();
      case TemplatePackage.STATEMENT: return createStatement();
      case TemplatePackage.BLOCK_STMT: return createBlockStmt();
      case TemplatePackage.STRUCTURAL_STMT: return createStructuralStmt();
      case TemplatePackage.EXPRESSION_STMT: return createExpressionStmt();
      case TemplatePackage.FOR_STMT: return createForStmt();
      case TemplatePackage.IF_STMT: return createIfStmt();
      case TemplatePackage.IF_STMT_BODY: return createIfStmtBody();
      case TemplatePackage.TEXT_STMT: return createTextStmt();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateFile createTemplateFile()
  {
    TemplateFileImpl templateFile = new TemplateFileImpl();
    return templateFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockStmt createBlockStmt()
  {
    BlockStmtImpl blockStmt = new BlockStmtImpl();
    return blockStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuralStmt createStructuralStmt()
  {
    StructuralStmtImpl structuralStmt = new StructuralStmtImpl();
    return structuralStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionStmt createExpressionStmt()
  {
    ExpressionStmtImpl expressionStmt = new ExpressionStmtImpl();
    return expressionStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStmt createForStmt()
  {
    ForStmtImpl forStmt = new ForStmtImpl();
    return forStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStmt createIfStmt()
  {
    IfStmtImpl ifStmt = new IfStmtImpl();
    return ifStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStmtBody createIfStmtBody()
  {
    IfStmtBodyImpl ifStmtBody = new IfStmtBodyImpl();
    return ifStmtBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextStmt createTextStmt()
  {
    TextStmtImpl textStmt = new TextStmtImpl();
    return textStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplatePackage getTemplatePackage()
  {
    return (TemplatePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TemplatePackage getPackage()
  {
    return TemplatePackage.eINSTANCE;
  }

} //TemplateFactoryImpl
