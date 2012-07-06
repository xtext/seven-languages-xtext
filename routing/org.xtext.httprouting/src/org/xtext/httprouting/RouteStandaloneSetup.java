
package org.xtext.httprouting;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RouteStandaloneSetup extends RouteStandaloneSetupGenerated {

	public static void doSetup() {
		new RouteStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

