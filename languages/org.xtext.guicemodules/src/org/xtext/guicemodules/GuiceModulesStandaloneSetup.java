
package org.xtext.guicemodules;

import org.xtext.guicemodules.GuiceModulesStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GuiceModulesStandaloneSetup extends GuiceModulesStandaloneSetupGenerated{

	public static void doSetup() {
		new GuiceModulesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

