/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.scoping

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider$ExtensionClassNameProvider
import java.io.File
import org.xtext.builddsl.lib.FileExtensions
import org.xtext.builddsl.lib.ClassExtensions

/** 
 * Add more static extension classes. 
 */
class BuildDSLExtensionClassNameProvider extends ExtensionClassNameProvider {

	override simpleComputeExtensionClasses() {
		super.simpleComputeExtensionClasses => [
			put(typeof(File), typeof(FileExtensions))
			put(typeof(String), typeof(FileExtensions))
			put(typeof(Class), typeof(ClassExtensions))
		]
	}

}