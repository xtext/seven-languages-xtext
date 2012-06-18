
package org.guicecon.modules;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GuiceModulesStandaloneSetup extends GuiceModulesStandaloneSetupGenerated{

	public static void doSetup() {
		new GuiceModulesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

