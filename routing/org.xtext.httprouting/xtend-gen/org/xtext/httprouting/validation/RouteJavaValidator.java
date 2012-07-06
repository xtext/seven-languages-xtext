package org.xtext.httprouting.validation;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator;

@SuppressWarnings("all")
public class RouteJavaValidator extends XbaseWithAnnotationsJavaValidator {
  /**
   * disable this check
   */
  protected boolean isImplicitReturn(final XExpression expr) {
    return false;
  }
}
