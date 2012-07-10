
package org.xtext.builddsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BuildDSLStandaloneSetup extends BuildDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new BuildDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

