
package org.xtext.scripting;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ScriptingStandaloneSetup extends ScriptingStandaloneSetupGenerated{

	public static void doSetup() {
		new ScriptingStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

