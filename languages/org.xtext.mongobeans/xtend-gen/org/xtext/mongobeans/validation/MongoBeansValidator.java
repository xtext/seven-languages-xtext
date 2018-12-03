/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.validation.XbaseValidator;
import org.eclipse.xtext.xtype.XtypePackage;
import org.xtext.mongobeans.jvmmodel.MongoTypes;
import org.xtext.mongobeans.mongoBeans.MongoBean;
import org.xtext.mongobeans.mongoBeans.MongoBeansPackage;
import org.xtext.mongobeans.mongoBeans.MongoProperty;

@SuppressWarnings("all")
public class MongoBeansValidator extends XbaseValidator {
  public static final String ILLEGAL_TYPE = "issue.illegalType";
  
  public static final String MISSING_TYPE = "issue.missingType";
  
  public static final String ILLEGAL_PROPERTY_NAME = "issue.illegalPropertyName";
  
  @Inject
  @Extension
  private MongoTypes mongoTypes;
  
  @Check
  public void checkMongoProperty(final MongoProperty it) {
    String _name = it.getName();
    boolean _equals = Objects.equal(_name, "dbObject");
    if (_equals) {
      String _name_1 = it.getName();
      String _plus = ("__" + _name_1);
      this.error("Illegal property name \'dbObject\'", MongoBeansPackage.Literals.ABSTRACT_FEATURE__NAME, MongoBeansValidator.ILLEGAL_PROPERTY_NAME, _plus);
    }
    JvmTypeReference _type = it.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      boolean _isMongoType = this.mongoTypes.isMongoType(it.getType());
      boolean _not = (!_isMongoType);
      if (_not) {
        this.error("Only MongoBeans and mappable types are allowed", MongoBeansPackage.Literals.MONGO_PROPERTY__TYPE, MongoBeansValidator.ILLEGAL_TYPE);
      }
    } else {
      MongoBean _inlineType = it.getInlineType();
      boolean _tripleEquals = (_inlineType == null);
      if (_tripleEquals) {
        this.error("Type must be set", MongoBeansPackage.Literals.ABSTRACT_FEATURE__NAME, MongoBeansValidator.MISSING_TYPE);
      }
    }
  }
  
  @Override
  public List<EPackage> getEPackages() {
    return CollectionLiterals.<EPackage>newArrayList(
      MongoBeansPackage.eINSTANCE, 
      XbasePackage.eINSTANCE, 
      TypesPackage.eINSTANCE, 
      XtypePackage.eINSTANCE);
  }
}
