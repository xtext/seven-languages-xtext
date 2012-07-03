/**
 */
package org.xtext.template.template.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;

import org.xtext.template.template.BlockStmt;
import org.xtext.template.template.ExpressionStmt;
import org.xtext.template.template.ForStmt;
import org.xtext.template.template.IfStmt;
import org.xtext.template.template.IfStmtBody;
import org.xtext.template.template.Import;
import org.xtext.template.template.Parameter;
import org.xtext.template.template.Statement;
import org.xtext.template.template.StructuralStmt;
import org.xtext.template.template.TemplateFactory;
import org.xtext.template.template.TemplateFile;
import org.xtext.template.template.TemplatePackage;
import org.xtext.template.template.TextStmt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplatePackageImpl extends EPackageImpl implements TemplatePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structuralStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStmtBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textStmtEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.template.template.TemplatePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TemplatePackageImpl()
  {
    super(eNS_URI, TemplateFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TemplatePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TemplatePackage init()
  {
    if (isInited) return (TemplatePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatePackage.eNS_URI);

    // Obtain or create and register package
    TemplatePackageImpl theTemplatePackage = (TemplatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TemplatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TemplatePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XAnnotationsPackage.eINSTANCE.eClass();
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theTemplatePackage.createPackageContents();

    // Initialize created meta-data
    theTemplatePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTemplatePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TemplatePackage.eNS_URI, theTemplatePackage);
    return theTemplatePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateFile()
  {
    return templateFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemplateFile_Package()
  {
    return (EAttribute)templateFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateFile_Imports()
  {
    return (EReference)templateFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateFile_Params()
  {
    return (EReference)templateFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateFile_Body()
  {
    return (EReference)templateFileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Annotations()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Defaultexp()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockStmt()
  {
    return blockStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockStmt_Statements()
  {
    return (EReference)blockStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructuralStmt()
  {
    return structuralStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionStmt()
  {
    return expressionStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionStmt_Body()
  {
    return (EReference)expressionStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForStmt()
  {
    return forStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStmt_Param()
  {
    return (EReference)forStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStmt_Source()
  {
    return (EReference)forStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStmt_Body()
  {
    return (EReference)forStmtEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStmt()
  {
    return ifStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStmt_Ifbodies()
  {
    return (EReference)ifStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStmt_Elsebody()
  {
    return (EReference)ifStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStmtBody()
  {
    return ifStmtBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStmtBody_Condition()
  {
    return (EReference)ifStmtBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStmtBody_Body()
  {
    return (EReference)ifStmtBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextStmt()
  {
    return textStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextStmt_Text()
  {
    return (EAttribute)textStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateFactory getTemplateFactory()
  {
    return (TemplateFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    templateFileEClass = createEClass(TEMPLATE_FILE);
    createEAttribute(templateFileEClass, TEMPLATE_FILE__PACKAGE);
    createEReference(templateFileEClass, TEMPLATE_FILE__IMPORTS);
    createEReference(templateFileEClass, TEMPLATE_FILE__PARAMS);
    createEReference(templateFileEClass, TEMPLATE_FILE__BODY);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__ANNOTATIONS);
    createEAttribute(parameterEClass, PARAMETER__NAME);
    createEReference(parameterEClass, PARAMETER__DEFAULTEXP);
    createEReference(parameterEClass, PARAMETER__TYPE);

    statementEClass = createEClass(STATEMENT);

    blockStmtEClass = createEClass(BLOCK_STMT);
    createEReference(blockStmtEClass, BLOCK_STMT__STATEMENTS);

    structuralStmtEClass = createEClass(STRUCTURAL_STMT);

    expressionStmtEClass = createEClass(EXPRESSION_STMT);
    createEReference(expressionStmtEClass, EXPRESSION_STMT__BODY);

    forStmtEClass = createEClass(FOR_STMT);
    createEReference(forStmtEClass, FOR_STMT__PARAM);
    createEReference(forStmtEClass, FOR_STMT__SOURCE);
    createEReference(forStmtEClass, FOR_STMT__BODY);

    ifStmtEClass = createEClass(IF_STMT);
    createEReference(ifStmtEClass, IF_STMT__IFBODIES);
    createEReference(ifStmtEClass, IF_STMT__ELSEBODY);

    ifStmtBodyEClass = createEClass(IF_STMT_BODY);
    createEReference(ifStmtBodyEClass, IF_STMT_BODY__CONDITION);
    createEReference(ifStmtBodyEClass, IF_STMT_BODY__BODY);

    textStmtEClass = createEClass(TEXT_STMT);
    createEAttribute(textStmtEClass, TEXT_STMT__TEXT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XAnnotationsPackage theXAnnotationsPackage = (XAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(XAnnotationsPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    blockStmtEClass.getESuperTypes().add(this.getStatement());
    structuralStmtEClass.getESuperTypes().add(this.getStatement());
    expressionStmtEClass.getESuperTypes().add(this.getStatement());
    forStmtEClass.getESuperTypes().add(this.getStructuralStmt());
    ifStmtEClass.getESuperTypes().add(this.getStructuralStmt());

    // Initialize classes and features; add operations and parameters
    initEClass(templateFileEClass, TemplateFile.class, "TemplateFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemplateFile_Package(), ecorePackage.getEString(), "package", null, 0, 1, TemplateFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateFile_Imports(), this.getImport(), null, "imports", null, 0, -1, TemplateFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateFile_Params(), this.getParameter(), null, "params", null, 0, -1, TemplateFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateFile_Body(), this.getBlockStmt(), null, "body", null, 0, 1, TemplateFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Annotations(), theXAnnotationsPackage.getXAnnotation(), null, "annotations", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_Defaultexp(), theXbasePackage.getXExpression(), null, "defaultexp", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockStmtEClass, BlockStmt.class, "BlockStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlockStmt_Statements(), ecorePackage.getEObject(), null, "statements", null, 0, -1, BlockStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structuralStmtEClass, StructuralStmt.class, "StructuralStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionStmtEClass, ExpressionStmt.class, "ExpressionStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionStmt_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, ExpressionStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forStmtEClass, ForStmt.class, "ForStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForStmt_Param(), theTypesPackage.getJvmFormalParameter(), null, "param", null, 0, 1, ForStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStmt_Source(), theXbasePackage.getXExpression(), null, "source", null, 0, 1, ForStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStmt_Body(), this.getBlockStmt(), null, "body", null, 0, 1, ForStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStmtEClass, IfStmt.class, "IfStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStmt_Ifbodies(), this.getIfStmtBody(), null, "ifbodies", null, 0, -1, IfStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStmt_Elsebody(), this.getBlockStmt(), null, "elsebody", null, 0, 1, IfStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStmtBodyEClass, IfStmtBody.class, "IfStmtBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStmtBody_Condition(), theXbasePackage.getXExpression(), null, "condition", null, 0, 1, IfStmtBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStmtBody_Body(), this.getBlockStmt(), null, "body", null, 0, 1, IfStmtBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textStmtEClass, TextStmt.class, "TextStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextStmt_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TemplatePackageImpl
