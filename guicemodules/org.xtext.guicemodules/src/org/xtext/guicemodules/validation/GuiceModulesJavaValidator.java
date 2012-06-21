package org.xtext.guicemodules.validation;

import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;

import com.google.inject.BindingAnnotation;
 

public class GuiceModulesJavaValidator extends AbstractGuiceModulesJavaValidator {

	@Check
	public void checkAnnotationIsBindingAnnotation(XAnnotation annotation) {
		boolean found = false;
		for (JvmAnnotationReference jvmAnnotationReference : annotation.getAnnotationType().getAnnotations()) {
			if (jvmAnnotationReference.getAnnotation().getIdentifier().equals(BindingAnnotation.class.getName())) {
				found = true;
			}
		}
		if (!found) {
			error("The annotation is not annotated with @BindingAnnotation", 
					XAnnotationsPackage.Literals.XANNOTATION__ANNOTATION_TYPE);
		}
	}
	
}
