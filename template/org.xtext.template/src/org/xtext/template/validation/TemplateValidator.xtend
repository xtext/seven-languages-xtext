package org.xtext.template.validation

import org.eclipse.emf.ecore.EPackage
import org.xtext.template.template.TemplatePackage
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.xtype.XtypePackage
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator
import org.eclipse.xtext.xbase.XExpression

class TemplateValidator extends XbaseWithAnnotationsJavaValidator {

	override protected isImplicitReturn(XExpression expr) {
		// workaround for https://bugs.eclipse.org/bugs/show_bug.cgi?id=382879
		false
	}
	
	override checkInnerExpressions(XExpression expr) {
		// disabled
	}

	override getEPackages() {
	    val result = <EPackage>newArrayList
	    result += TemplatePackage::eINSTANCE
	    result += XAnnotationsPackage::eINSTANCE
	    result += XbasePackage::eINSTANCE
	    result += TypesPackage::eINSTANCE
	    result += XtypePackage::eINSTANCE
		result
	}
}
