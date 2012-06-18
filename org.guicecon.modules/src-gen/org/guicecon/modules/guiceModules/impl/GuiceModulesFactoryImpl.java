/**
 */
package org.guicecon.modules.guiceModules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.guicecon.modules.guiceModules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiceModulesFactoryImpl extends EFactoryImpl implements GuiceModulesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GuiceModulesFactory init()
  {
    try
    {
      GuiceModulesFactory theGuiceModulesFactory = (GuiceModulesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.guicecon.org/modules/GuiceModules"); 
      if (theGuiceModulesFactory != null)
      {
        return theGuiceModulesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GuiceModulesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiceModulesFactoryImpl()
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
      case GuiceModulesPackage.MODULE: return createModule();
      case GuiceModulesPackage.BINDING: return createBinding();
      case GuiceModulesPackage.KEY: return createKey();
      case GuiceModulesPackage.ANNOTATION_REF: return createAnnotationRef();
      case GuiceModulesPackage.IMPORT: return createImport();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Key createKey()
  {
    KeyImpl key = new KeyImpl();
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationRef createAnnotationRef()
  {
    AnnotationRefImpl annotationRef = new AnnotationRefImpl();
    return annotationRef;
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
  public GuiceModulesPackage getGuiceModulesPackage()
  {
    return (GuiceModulesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GuiceModulesPackage getPackage()
  {
    return GuiceModulesPackage.eINSTANCE;
  }

} //GuiceModulesFactoryImpl
