package org.xtext.cradle;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class CradleStandaloneSetup extends CradleStandaloneSetupGenerated {

	public static void doSetup() {
		new CradleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
