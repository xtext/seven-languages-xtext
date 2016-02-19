/** 
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures
import org.xtext.tortoiseshell.interpreter.NullGenerator
import org.xtext.tortoiseshell.interpreter.TortoiseShellInterpeter
import org.xtext.tortoiseshell.lib.ITortoiseInterpreter
import org.xtext.tortoiseshell.scoping.TortoiseResourceDescriptionStrategy
import org.xtext.tortoiseshell.scoping.TortoiseShellIdentifiableSimpleNameProvider
import org.xtext.tortoiseshell.scoping.TortoiseShellImplicitlyImportedFeatures

/** 
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class TortoiseShellRuntimeModule extends org.xtext.tortoiseshell.AbstractTortoiseShellRuntimeModule {
	def Class<? extends ImplicitlyImportedFeatures> bindImplicitlyImportedTypes() {
		return TortoiseShellImplicitlyImportedFeatures
	}

	def Class<? extends ITortoiseInterpreter> bindITortoiseInterpreter() {
		return TortoiseShellInterpeter
	}

	override Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
		return TortoiseShellIdentifiableSimpleNameProvider
	}

	override Class<? extends IGenerator> bindIGenerator() {
		return NullGenerator
	}

	override Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return TortoiseResourceDescriptionStrategy
	}
}
