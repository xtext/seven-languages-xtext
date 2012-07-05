package org.xtext.template.validation

import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator

class TemplateValidator extends XbaseWithAnnotationsJavaValidator {

	override protected isImplicitReturn(XExpression expr) {
		// workaround for https://bugs.eclipse.org/bugs/show_bug.cgi?id=382879
		false
	}
	
	override checkInnerExpressions(XExpression expr) {
		// disabled
	}
}
