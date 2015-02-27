/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.guicemodules.validation;

import com.google.inject.BindingAnnotation;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GuiceModulesValidator extends XbaseWithAnnotationsJavaValidator {
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Check
  public void checkAnnotationIsBindingAnnotation(final XAnnotation it) {
    JvmType _annotationType = it.getAnnotationType();
    final JvmType type = _annotationType;
    boolean _matched = false;
    if (!_matched) {
      if (type instanceof JvmAnnotationType) {
        _matched=true;
        EList<JvmAnnotationReference> _annotations = ((JvmAnnotationType)type).getAnnotations();
        final Function1<JvmAnnotationReference, Boolean> _function = new Function1<JvmAnnotationReference, Boolean>() {
          @Override
          public Boolean apply(final JvmAnnotationReference it) {
            JvmAnnotationType _annotation = it.getAnnotation();
            return Boolean.valueOf(GuiceModulesValidator.this._typeReferences.is(_annotation, BindingAnnotation.class));
          }
        };
        boolean _exists = IterableExtensions.<JvmAnnotationReference>exists(_annotations, _function);
        boolean _not = (!_exists);
        if (_not) {
          this.error("The annotation is not annotated with @BindingAnnotation", XAnnotationsPackage.Literals.XANNOTATION__ANNOTATION_TYPE);
        }
      }
    }
  }
}
