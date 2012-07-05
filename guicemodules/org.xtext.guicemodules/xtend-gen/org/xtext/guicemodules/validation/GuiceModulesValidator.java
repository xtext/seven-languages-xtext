package org.xtext.guicemodules.validation;

import com.google.inject.BindingAnnotation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage.Literals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GuiceModulesValidator extends XbaseWithAnnotationsJavaValidator {
  @Check
  public void checkAnnotationIsBindingAnnotation(final XAnnotation annotation) {
    JvmAnnotationType _annotationType = annotation.getAnnotationType();
    EList<JvmAnnotationReference> _annotations = _annotationType.getAnnotations();
    final Function1<JvmAnnotationReference,Boolean> _function = new Function1<JvmAnnotationReference,Boolean>() {
        public Boolean apply(final JvmAnnotationReference it) {
          JvmAnnotationType _annotation = it.getAnnotation();
          String _identifier = _annotation.getIdentifier();
          String _name = BindingAnnotation.class.getName();
          boolean _equals = _identifier.equals(_name);
          return Boolean.valueOf(_equals);
        }
      };
    boolean _exists = IterableExtensions.<JvmAnnotationReference>exists(_annotations, _function);
    boolean _not = (!_exists);
    if (_not) {
      this.error("The annotation is not annotated with @BindingAnnotation", 
        Literals.XANNOTATION__ANNOTATION_TYPE);
    }
  }
}
