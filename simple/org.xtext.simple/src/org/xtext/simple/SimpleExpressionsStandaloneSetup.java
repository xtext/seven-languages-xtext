
package org.xtext.simple;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SimpleExpressionsStandaloneSetup extends SimpleExpressionsStandaloneSetupGenerated{

	public static void doSetup() {
		new SimpleExpressionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

