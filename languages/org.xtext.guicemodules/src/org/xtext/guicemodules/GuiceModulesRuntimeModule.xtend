/** 
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.guicemodules

import org.eclipse.xtext.service.SingletonBinding
import org.xtext.guicemodules.validation.GuiceModulesValidator

/** 
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class GuiceModulesRuntimeModule extends org.xtext.guicemodules.AbstractGuiceModulesRuntimeModule {
	// contributed by org.eclipse.xtext.generator.validation.JavaValidatorFragment
	@SingletonBinding(eager=true) override Class<? extends GuiceModulesValidator> bindGuiceModulesValidator() {
		return GuiceModulesValidator
	}
}
