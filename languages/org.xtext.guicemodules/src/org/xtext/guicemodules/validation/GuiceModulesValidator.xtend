package org.xtext.guicemodules.validation

import com.google.inject.BindingAnnotation
import com.google.inject.Inject
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation

import static org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage$Literals.*

class GuiceModulesValidator extends XbaseWithAnnotationsJavaValidator {
	
	@Inject extension TypeReferences

	@Check def checkAnnotationIsBindingAnnotation(XAnnotation it) {
		if (!annotationType.annotations.exists[ annotation.is(typeof(BindingAnnotation)) ])
			error("The annotation is not annotated with @BindingAnnotation", XANNOTATION__ANNOTATION_TYPE)
	}
}