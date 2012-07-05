package org.xtext.template.validation;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator;

@SuppressWarnings("all")
public class TemplateValidator extends XbaseWithAnnotationsJavaValidator {
  protected boolean isImplicitReturn(final XExpression expr) {
    return false;
  }
  
  public void checkInnerExpressions(final XExpression expr) {
  }
}
