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
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsValidator;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GuiceModulesValidator extends XbaseWithAnnotationsValidator {
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Check
  public void checkAnnotationIsBindingAnnotation(final XAnnotation it) {
    JvmType _annotationType = it.getAnnotationType();
    final JvmType type = _annotationType;
    boolean _matched = false;
    if (type instanceof JvmAnnotationType) {
      _matched=true;
      final Function1<JvmAnnotationReference, Boolean> _function = (JvmAnnotationReference it_1) -> {
        return Boolean.valueOf(this._typeReferences.is(it_1.getAnnotation(), BindingAnnotation.class));
      };
      boolean _exists = IterableExtensions.<JvmAnnotationReference>exists(((JvmAnnotationType)type).getAnnotations(), _function);
      boolean _not = (!_exists);
      if (_not) {
        this.error("The annotation is not annotated with @BindingAnnotation", XAnnotationsPackage.Literals.XANNOTATION__ANNOTATION_TYPE);
      }
    }
  }
}
