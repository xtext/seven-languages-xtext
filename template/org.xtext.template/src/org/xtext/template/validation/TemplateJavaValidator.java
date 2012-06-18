package org.xtext.template.validation;

import org.eclipse.xtext.xbase.XExpression;

@SuppressWarnings("restriction")
public class TemplateJavaValidator extends AbstractTemplateJavaValidator {

	// @Check
	// public void checkGreetingStartsWithCapital(Greeting greeting) {
	// if (!Character.isUpperCase(greeting.getName().charAt(0))) {
	// warning("Name should start with a capital",
	// MyDslPackage.Literals.GREETING__NAME);
	// }
	// }

	@Override
	protected boolean isImplicitReturn(XExpression expr) {
		// workaround for https://bugs.eclipse.org/bugs/show_bug.cgi?id=382879
		return false;
	}
}
