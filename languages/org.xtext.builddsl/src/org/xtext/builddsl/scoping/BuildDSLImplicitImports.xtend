/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.scoping

import org.xtext.builddsl.lib.FileExtensions
import org.xtext.builddsl.lib.ClassExtensions
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures

class BuildDSLImplicitlyImportedFeatures extends ImplicitlyImportedFeatures {
	
	/**
	 * Add methods from {@link FileExtensions} and {@link ClassExtensions} to the extension scope.
	 */
	override protected getExtensionClasses() {
		(super.getExtensionClasses() + #[FileExtensions, ClassExtensions]).toList
	}
	
}