
package org.xtext.mongobeans;

import org.xtext.mongobeans.MongoBeansStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MongoBeansStandaloneSetup extends MongoBeansStandaloneSetupGenerated{

	public static void doSetup() {
		new MongoBeansStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

