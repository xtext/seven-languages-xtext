/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.scoping

import com.google.common.collect.Maps
import com.google.common.collect.Sets
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider
import org.xtext.builddsl.build.BuildFile

/**
 * Handle all imports as static imports.
 */
class AllImportsAreStaticFeatureProvider extends StaticImplicitMethodsFeatureForTypeProvider {

	override getVisibleTypesContainingStaticMethods(Iterable<JvmTypeReference> hierarchy) {
		val buildFile = context.contents.get(0) as BuildFile
		val importedTypes = <String>newArrayList
		for (importDeclaration : buildFile.imports) {
			val importedTypeOrPackage = importDeclaration.importedNamespace
			if (!importedTypeOrPackage.endsWith(".*")) {
				importedTypes += importedTypeOrPackage
			}
		}
		val result = Maps::newLinkedHashMap(super.getVisibleTypesContainingStaticMethods(hierarchy))
		for (entry : result.entrySet) {
			val copy = Sets::newLinkedHashSet(entry.getValue)
			copy += importedTypes
			entry.value = copy
		}
		return result
	}
	
}
