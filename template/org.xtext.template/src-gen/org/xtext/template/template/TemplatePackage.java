/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.template.template;

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
 * @see org.xtext.template.template.TemplateFactory
 * @model kind="package"
 * @generated
 */
public interface TemplatePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "template";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.itemis.de/xtl/XTL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "template";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TemplatePackage eINSTANCE = org.xtext.template.template.impl.TemplatePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.TemplateFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.TemplateFileImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getTemplateFile()
   * @generated
   */
  int TEMPLATE_FILE = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FILE__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FILE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FILE__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FILE__BODY = 3;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FILE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.ImportImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

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
   * The meta object id for the '{@link org.xtext.template.template.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.ParameterImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The feature id for the '<em><b>Defaultexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DEFAULTEXP = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 3;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.StatementImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.BlockStmtImpl <em>Block Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.BlockStmtImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getBlockStmt()
   * @generated
   */
  int BLOCK_STMT = 4;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STMT__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.StructuralStmtImpl <em>Structural Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.StructuralStmtImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getStructuralStmt()
   * @generated
   */
  int STRUCTURAL_STMT = 5;

  /**
   * The number of structural features of the '<em>Structural Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.ExpressionStmtImpl <em>Expression Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.ExpressionStmtImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getExpressionStmt()
   * @generated
   */
  int EXPRESSION_STMT = 6;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STMT__BODY = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STMT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.ForStmtImpl <em>For Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.ForStmtImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getForStmt()
   * @generated
   */
  int FOR_STMT = 7;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__PARAM = STRUCTURAL_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__SOURCE = STRUCTURAL_STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__BODY = STRUCTURAL_STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT_FEATURE_COUNT = STRUCTURAL_STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.IfStmtImpl <em>If Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.IfStmtImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getIfStmt()
   * @generated
   */
  int IF_STMT = 8;

  /**
   * The feature id for the '<em><b>Ifbodies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__IFBODIES = STRUCTURAL_STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elsebody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT__ELSEBODY = STRUCTURAL_STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT_FEATURE_COUNT = STRUCTURAL_STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.IfStmtBodyImpl <em>If Stmt Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.IfStmtBodyImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getIfStmtBody()
   * @generated
   */
  int IF_STMT_BODY = 9;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT_BODY__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT_BODY__BODY = 1;

  /**
   * The number of structural features of the '<em>If Stmt Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STMT_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.TextStmtImpl <em>Text Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.TextStmtImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getTextStmt()
   * @generated
   */
  int TEXT_STMT = 10;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_STMT__TEXT = 0;

  /**
   * The number of structural features of the '<em>Text Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_STMT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.template.template.TemplateFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.xtext.template.template.TemplateFile
   * @generated
   */
  EClass getTemplateFile();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.template.template.TemplateFile#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see org.xtext.template.template.TemplateFile#getPackage()
   * @see #getTemplateFile()
   * @generated
   */
  EAttribute getTemplateFile_Package();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.template.template.TemplateFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.template.template.TemplateFile#getImports()
   * @see #getTemplateFile()
   * @generated
   */
  EReference getTemplateFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.template.template.TemplateFile#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.template.template.TemplateFile#getParams()
   * @see #getTemplateFile()
   * @generated
   */
  EReference getTemplateFile_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.TemplateFile#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.template.template.TemplateFile#getBody()
   * @see #getTemplateFile()
   * @generated
   */
  EReference getTemplateFile_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtext.template.template.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.template.template.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xtext.template.template.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.template.template.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.template.template.Parameter#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.xtext.template.template.Parameter#getAnnotations()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Annotations();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.template.template.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.template.template.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.Parameter#getDefaultexp <em>Defaultexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Defaultexp</em>'.
   * @see org.xtext.template.template.Parameter#getDefaultexp()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Defaultexp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.template.template.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.template.template.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.BlockStmt <em>Block Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Stmt</em>'.
   * @see org.xtext.template.template.BlockStmt
   * @generated
   */
  EClass getBlockStmt();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.template.template.BlockStmt#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.template.template.BlockStmt#getStatements()
   * @see #getBlockStmt()
   * @generated
   */
  EReference getBlockStmt_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.StructuralStmt <em>Structural Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structural Stmt</em>'.
   * @see org.xtext.template.template.StructuralStmt
   * @generated
   */
  EClass getStructuralStmt();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.ExpressionStmt <em>Expression Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Stmt</em>'.
   * @see org.xtext.template.template.ExpressionStmt
   * @generated
   */
  EClass getExpressionStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.ExpressionStmt#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.template.template.ExpressionStmt#getBody()
   * @see #getExpressionStmt()
   * @generated
   */
  EReference getExpressionStmt_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.ForStmt <em>For Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Stmt</em>'.
   * @see org.xtext.template.template.ForStmt
   * @generated
   */
  EClass getForStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.ForStmt#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see org.xtext.template.template.ForStmt#getParam()
   * @see #getForStmt()
   * @generated
   */
  EReference getForStmt_Param();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.ForStmt#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.xtext.template.template.ForStmt#getSource()
   * @see #getForStmt()
   * @generated
   */
  EReference getForStmt_Source();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.ForStmt#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.template.template.ForStmt#getBody()
   * @see #getForStmt()
   * @generated
   */
  EReference getForStmt_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.IfStmt <em>If Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Stmt</em>'.
   * @see org.xtext.template.template.IfStmt
   * @generated
   */
  EClass getIfStmt();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.template.template.IfStmt#getIfbodies <em>Ifbodies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ifbodies</em>'.
   * @see org.xtext.template.template.IfStmt#getIfbodies()
   * @see #getIfStmt()
   * @generated
   */
  EReference getIfStmt_Ifbodies();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.IfStmt#getElsebody <em>Elsebody</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elsebody</em>'.
   * @see org.xtext.template.template.IfStmt#getElsebody()
   * @see #getIfStmt()
   * @generated
   */
  EReference getIfStmt_Elsebody();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.IfStmtBody <em>If Stmt Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Stmt Body</em>'.
   * @see org.xtext.template.template.IfStmtBody
   * @generated
   */
  EClass getIfStmtBody();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.IfStmtBody#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.template.template.IfStmtBody#getCondition()
   * @see #getIfStmtBody()
   * @generated
   */
  EReference getIfStmtBody_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.IfStmtBody#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.template.template.IfStmtBody#getBody()
   * @see #getIfStmtBody()
   * @generated
   */
  EReference getIfStmtBody_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.TextStmt <em>Text Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Stmt</em>'.
   * @see org.xtext.template.template.TextStmt
   * @generated
   */
  EClass getTextStmt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.template.template.TextStmt#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.template.template.TextStmt#getText()
   * @see #getTextStmt()
   * @generated
   */
  EAttribute getTextStmt_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TemplateFactory getTemplateFactory();

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
     * The meta object literal for the '{@link org.xtext.template.template.impl.TemplateFileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.TemplateFileImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getTemplateFile()
     * @generated
     */
    EClass TEMPLATE_FILE = eINSTANCE.getTemplateFile();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE_FILE__PACKAGE = eINSTANCE.getTemplateFile_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_FILE__IMPORTS = eINSTANCE.getTemplateFile_Imports();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_FILE__PARAMS = eINSTANCE.getTemplateFile_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_FILE__BODY = eINSTANCE.getTemplateFile_Body();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.ImportImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getImport()
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

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.ParameterImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__ANNOTATIONS = eINSTANCE.getParameter_Annotations();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Defaultexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__DEFAULTEXP = eINSTANCE.getParameter_Defaultexp();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.StatementImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.BlockStmtImpl <em>Block Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.BlockStmtImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getBlockStmt()
     * @generated
     */
    EClass BLOCK_STMT = eINSTANCE.getBlockStmt();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_STMT__STATEMENTS = eINSTANCE.getBlockStmt_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.StructuralStmtImpl <em>Structural Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.StructuralStmtImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getStructuralStmt()
     * @generated
     */
    EClass STRUCTURAL_STMT = eINSTANCE.getStructuralStmt();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.ExpressionStmtImpl <em>Expression Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.ExpressionStmtImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getExpressionStmt()
     * @generated
     */
    EClass EXPRESSION_STMT = eINSTANCE.getExpressionStmt();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_STMT__BODY = eINSTANCE.getExpressionStmt_Body();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.ForStmtImpl <em>For Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.ForStmtImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getForStmt()
     * @generated
     */
    EClass FOR_STMT = eINSTANCE.getForStmt();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__PARAM = eINSTANCE.getForStmt_Param();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__SOURCE = eINSTANCE.getForStmt_Source();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__BODY = eINSTANCE.getForStmt_Body();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.IfStmtImpl <em>If Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.IfStmtImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getIfStmt()
     * @generated
     */
    EClass IF_STMT = eINSTANCE.getIfStmt();

    /**
     * The meta object literal for the '<em><b>Ifbodies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__IFBODIES = eINSTANCE.getIfStmt_Ifbodies();

    /**
     * The meta object literal for the '<em><b>Elsebody</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT__ELSEBODY = eINSTANCE.getIfStmt_Elsebody();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.IfStmtBodyImpl <em>If Stmt Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.IfStmtBodyImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getIfStmtBody()
     * @generated
     */
    EClass IF_STMT_BODY = eINSTANCE.getIfStmtBody();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT_BODY__CONDITION = eINSTANCE.getIfStmtBody_Condition();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STMT_BODY__BODY = eINSTANCE.getIfStmtBody_Body();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.TextStmtImpl <em>Text Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.TextStmtImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getTextStmt()
     * @generated
     */
    EClass TEXT_STMT = eINSTANCE.getTextStmt();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_STMT__TEXT = eINSTANCE.getTextStmt_Text();

  }

} //TemplatePackage
