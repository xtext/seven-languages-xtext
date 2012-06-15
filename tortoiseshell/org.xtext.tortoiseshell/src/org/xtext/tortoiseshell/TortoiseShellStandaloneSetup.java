
package org.xtext.tortoiseshell;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TortoiseShellStandaloneSetup extends TortoiseShellStandaloneSetupGenerated{

	public static void doSetup() {
		new TortoiseShellStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

