/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.validation

import com.google.inject.Inject
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xbase.validation.XbaseValidator
import org.eclipse.xtext.xtype.XtypePackage
import org.xtext.mongobeans.jvmmodel.MongoTypes
import org.xtext.mongobeans.mongoBeans.MongoBeansPackage
import org.xtext.mongobeans.mongoBeans.MongoProperty

import static org.xtext.mongobeans.mongoBeans.MongoBeansPackage.Literals.*

class MongoBeansValidator extends XbaseValidator {
	
	public static val ILLEGAL_TYPE = 'issue.illegalType'
	public static val MISSING_TYPE = 'issue.missingType'
	public static val ILLEGAL_PROPERTY_NAME = 'issue.illegalPropertyName'

	@Inject extension MongoTypes mongoTypes
	
	@Check def checkMongoProperty(MongoProperty it) {
		if (name == 'dbObject') 
			error("Illegal property name 'dbObject'", ABSTRACT_FEATURE__NAME, ILLEGAL_PROPERTY_NAME, '__' + name)
		if (type !== null) {
			if (!type.isMongoType)
				error('Only MongoBeans and mappable types are allowed', MONGO_PROPERTY__TYPE, ILLEGAL_TYPE)
		} else if (inlineType === null) {
			error('Type must be set', ABSTRACT_FEATURE__NAME, MISSING_TYPE)
		}
	}
	
	override getEPackages() {
		newArrayList(
			MongoBeansPackage.eINSTANCE,
			XbasePackage.eINSTANCE,
			TypesPackage.eINSTANCE,
			XtypePackage.eINSTANCE
		)
	}
}