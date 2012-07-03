package org.xtext.mongobeans.validation

import com.google.inject.Inject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xbase.validation.XbaseJavaValidator
import org.eclipse.xtext.xtype.XtypePackage
import org.xtext.mongobeans.jvmmodel.MongoTypes
import org.xtext.mongobeans.mongoBeans.MongoBeansPackage
import org.xtext.mongobeans.mongoBeans.MongoProperty

import static org.xtext.mongobeans.mongoBeans.MongoBeansPackage$Literals.*
import static org.xtext.mongobeans.validation.IssueCodes.*

class MongoBeansValidator extends XbaseJavaValidator {

	@Inject extension MongoTypes mongoTypes;
	
	@Check def checkMongoProperty(MongoProperty property) {
		if(property.name == '_dbObject') 
			error("Illegal property name '_dbObject'", ABSTRACT_FEATURE__NAME, ILLEGAL_PROPERTY_NAME)
		val type = property.getType()
		if(type != null) {
			if(!type.isMongoType) 
				error('Only MongoBeans and mappable types are allowed', MONGO_PROPERTY__TYPE, ILLEGAL_TYPE)
		} else if(property.getInlineType() == null) {
			error('Type must be set', ABSTRACT_FEATURE__NAME, MISSING_TYPE)			
		}
	}

	override getEPackages() {
	    val result = <EPackage>newArrayList()
	    result += MongoBeansPackage::eINSTANCE
	    result += XbasePackage::eINSTANCE
	    result += TypesPackage::eINSTANCE
	    result += XtypePackage::eINSTANCE
		return result;
	}
}