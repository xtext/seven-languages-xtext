/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.builddsl.scoping;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider;
import org.xtext.builddsl.build.BuildFile;
import org.xtext.builddsl.build.ImportDeclaration;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * @author Sebastia Zarnekow - Initial contribution and API
 */
public class AllImportsAreStaticFeatureProvider extends StaticImplicitMethodsFeatureForTypeProvider {

	@Override
	protected Map<JvmTypeReference, Collection<String>> getVisibleTypesContainingStaticMethods(Iterable<JvmTypeReference> hierarchy) {
		BuildFile buildFile = (BuildFile) getContext().getContents().get(0);
		List<String> importedTypes = Lists.newArrayList();
		for(ImportDeclaration importDeclaration: buildFile.getImports()) {
			String importedTypeOrPackage = importDeclaration.getImportedNamespace();
			if (!importedTypeOrPackage.endsWith(".*")) {
				importedTypes.add(importedTypeOrPackage);
			}
		}
		Map<JvmTypeReference, Collection<String>> result = Maps.newLinkedHashMap(super.getVisibleTypesContainingStaticMethods(hierarchy));
		for(Map.Entry<JvmTypeReference, Collection<String>> entry: result.entrySet()) {
			Collection<String> copy = Sets.newLinkedHashSet(entry.getValue());
			copy.addAll(importedTypes);
			entry.setValue(copy);
		}
		return result;
	}
	
}
