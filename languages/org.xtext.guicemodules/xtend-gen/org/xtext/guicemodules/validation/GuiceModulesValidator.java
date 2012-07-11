package org.xtext.guicemodules.validation;

import com.google.inject.BindingAnnotation;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage.Literals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GuiceModulesValidator extends XbaseWithAnnotationsJavaValidator {
  @Inject
  private TypeReferences _typeReferences;
  
  @Check
  public void checkAnnotationIsBindingAnnotation(final XAnnotation it) {
    JvmAnnotationType _annotationType = it.getAnnotationType();
    EList<JvmAnnotationReference> _annotations = _annotationType.getAnnotations();
    final Function1<JvmAnnotationReference,Boolean> _function = new Function1<JvmAnnotationReference,Boolean>() {
        public Boolean apply(final JvmAnnotationReference it) {
          JvmAnnotationType _annotation = it.getAnnotation();
          boolean _is = GuiceModulesValidator.this._typeReferences.is(_annotation, BindingAnnotation.class);
          return Boolean.valueOf(_is);
        }
      };
    boolean _exists = IterableExtensions.<JvmAnnotationReference>exists(_annotations, _function);
    boolean _not = (!_exists);
    if (_not) {
      this.error("The annotation is not annotated with @BindingAnnotation", Literals.XANNOTATION__ANNOTATION_TYPE);
    }
  }
}
