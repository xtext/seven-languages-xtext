
package org.xtext.template;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TemplateStandaloneSetup extends TemplateStandaloneSetupGenerated{

	public static void doSetup() {
		new TemplateStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

