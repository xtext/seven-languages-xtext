/**
 * generated by Xtext
 */
package org.xtext.mongobeans.mongoBeans.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xtype.XtypePackage;

import org.xtext.mongobeans.mongoBeans.AbstractElement;
import org.xtext.mongobeans.mongoBeans.AbstractFeature;
import org.xtext.mongobeans.mongoBeans.MongoBean;
import org.xtext.mongobeans.mongoBeans.MongoBeansFactory;
import org.xtext.mongobeans.mongoBeans.MongoBeansPackage;
import org.xtext.mongobeans.mongoBeans.MongoFile;
import org.xtext.mongobeans.mongoBeans.MongoOperation;
import org.xtext.mongobeans.mongoBeans.MongoProperty;
import org.xtext.mongobeans.mongoBeans.PackageDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MongoBeansPackageImpl extends EPackageImpl implements MongoBeansPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mongoFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mongoBeanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mongoPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mongoOperationEClass = null;

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
   * @see org.xtext.mongobeans.mongoBeans.MongoBeansPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MongoBeansPackageImpl()
  {
    super(eNS_URI, MongoBeansFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MongoBeansPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MongoBeansPackage init()
  {
    if (isInited) return (MongoBeansPackage)EPackage.Registry.INSTANCE.getEPackage(MongoBeansPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMongoBeansPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MongoBeansPackageImpl theMongoBeansPackage = registeredMongoBeansPackage instanceof MongoBeansPackageImpl ? (MongoBeansPackageImpl)registeredMongoBeansPackage : new MongoBeansPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();
    XbasePackage.eINSTANCE.eClass();
    XtypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theMongoBeansPackage.createPackageContents();

    // Initialize created meta-data
    theMongoBeansPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMongoBeansPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MongoBeansPackage.eNS_URI, theMongoBeansPackage);
    return theMongoBeansPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMongoFile()
  {
    return mongoFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMongoFile_ImportSection()
  {
    return (EReference)mongoFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMongoFile_Elements()
  {
    return (EReference)mongoFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAbstractElement_Name()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPackageDeclaration_Elements()
  {
    return (EReference)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMongoBean()
  {
    return mongoBeanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMongoBean_Features()
  {
    return (EReference)mongoBeanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAbstractFeature()
  {
    return abstractFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAbstractFeature_Name()
  {
    return (EAttribute)abstractFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMongoProperty()
  {
    return mongoPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMongoProperty_Type()
  {
    return (EReference)mongoPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMongoProperty_InlineType()
  {
    return (EReference)mongoPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMongoProperty_Many()
  {
    return (EAttribute)mongoPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMongoOperation()
  {
    return mongoOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMongoOperation_ReturnType()
  {
    return (EReference)mongoOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMongoOperation_Parameters()
  {
    return (EReference)mongoOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMongoOperation_Body()
  {
    return (EReference)mongoOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MongoBeansFactory getMongoBeansFactory()
  {
    return (MongoBeansFactory)getEFactoryInstance();
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
    mongoFileEClass = createEClass(MONGO_FILE);
    createEReference(mongoFileEClass, MONGO_FILE__IMPORT_SECTION);
    createEReference(mongoFileEClass, MONGO_FILE__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__NAME);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__ELEMENTS);

    mongoBeanEClass = createEClass(MONGO_BEAN);
    createEReference(mongoBeanEClass, MONGO_BEAN__FEATURES);

    abstractFeatureEClass = createEClass(ABSTRACT_FEATURE);
    createEAttribute(abstractFeatureEClass, ABSTRACT_FEATURE__NAME);

    mongoPropertyEClass = createEClass(MONGO_PROPERTY);
    createEReference(mongoPropertyEClass, MONGO_PROPERTY__TYPE);
    createEReference(mongoPropertyEClass, MONGO_PROPERTY__INLINE_TYPE);
    createEAttribute(mongoPropertyEClass, MONGO_PROPERTY__MANY);

    mongoOperationEClass = createEClass(MONGO_OPERATION);
    createEReference(mongoOperationEClass, MONGO_OPERATION__RETURN_TYPE);
    createEReference(mongoOperationEClass, MONGO_OPERATION__PARAMETERS);
    createEReference(mongoOperationEClass, MONGO_OPERATION__BODY);
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
    XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packageDeclarationEClass.getESuperTypes().add(this.getAbstractElement());
    mongoBeanEClass.getESuperTypes().add(this.getAbstractElement());
    mongoPropertyEClass.getESuperTypes().add(this.getAbstractFeature());
    mongoOperationEClass.getESuperTypes().add(this.getAbstractFeature());

    // Initialize classes and features; add operations and parameters
    initEClass(mongoFileEClass, MongoFile.class, "MongoFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMongoFile_ImportSection(), theXtypePackage.getXImportSection(), null, "importSection", null, 0, 1, MongoFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMongoFile_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, MongoFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageDeclaration_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mongoBeanEClass, MongoBean.class, "MongoBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMongoBean_Features(), this.getAbstractFeature(), null, "features", null, 0, -1, MongoBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractFeatureEClass, AbstractFeature.class, "AbstractFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mongoPropertyEClass, MongoProperty.class, "MongoProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMongoProperty_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, MongoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMongoProperty_InlineType(), this.getMongoBean(), null, "inlineType", null, 0, 1, MongoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMongoProperty_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, MongoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mongoOperationEClass, MongoOperation.class, "MongoOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMongoOperation_ReturnType(), theTypesPackage.getJvmTypeReference(), null, "returnType", null, 0, 1, MongoOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMongoOperation_Parameters(), theTypesPackage.getJvmFormalParameter(), null, "parameters", null, 0, -1, MongoOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMongoOperation_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, MongoOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MongoBeansPackageImpl
