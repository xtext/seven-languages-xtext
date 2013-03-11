/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.scoping

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsBatchScopeProvider
import org.eclipse.xtext.xbase.imports.IImportsConfiguration

class BuildDSLBatchScopeProvider extends XbaseWithAnnotationsBatchScopeProvider {
	
	@Inject IImportsConfiguration importsConfig
	
	/**
	 * Make all imports automatically static.  
	 */
	override newSession(Resource context) {
		var result = super.newSession(context)
		val importSection = importsConfig.getImportSection(context as XtextResource)
		if(importSection != null) {
			val plainImportedTypes = importSection.getImportDeclarations().filter[!static].map[importedType].toList
			result = result.addTypesToStaticScope(plainImportedTypes, plainImportedTypes)
		}
		result
	}
	
}