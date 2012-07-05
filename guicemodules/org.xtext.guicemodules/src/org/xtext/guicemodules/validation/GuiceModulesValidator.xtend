package org.xtext.guicemodules.validation

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation
import com.google.inject.BindingAnnotation
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator

class GuiceModulesValidator extends XbaseWithAnnotationsJavaValidator {
	
	@Check def checkAnnotationIsBindingAnnotation(XAnnotation annotation) {
		if (!annotation.annotationType.annotations.exists[
			it.annotation.identifier.equals(typeof(BindingAnnotation).name)
		]) {
			error("The annotation is not annotated with @BindingAnnotation", 
				XAnnotationsPackage$Literals::XANNOTATION__ANNOTATION_TYPE)
		}
	}
}