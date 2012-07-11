/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
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
      case TemplatePackage.RICH_STRING: return createRichString();
      case TemplatePackage.RICH_STRING_LITERAL: return createRichStringLiteral();
      case TemplatePackage.RICH_STRING_FOR_LOOP: return createRichStringForLoop();
      case TemplatePackage.RICH_STRING_IF: return createRichStringIf();
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
  public RichString createRichString()
  {
    RichStringImpl richString = new RichStringImpl();
    return richString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringLiteral createRichStringLiteral()
  {
    RichStringLiteralImpl richStringLiteral = new RichStringLiteralImpl();
    return richStringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringForLoop createRichStringForLoop()
  {
    RichStringForLoopImpl richStringForLoop = new RichStringForLoopImpl();
    return richStringForLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringIf createRichStringIf()
  {
    RichStringIfImpl richStringIf = new RichStringIfImpl();
    return richStringIf;
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
