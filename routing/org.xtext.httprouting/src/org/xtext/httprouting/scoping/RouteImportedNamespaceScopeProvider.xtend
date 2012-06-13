/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.httprouting.scoping

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider
import org.xtext.httprouting.route.Model
import org.xtext.httprouting.route.Route
/**
 * @author Holger Schill - Initial contribution and API
 */
class RouteImportedNamespaceScopeProvider extends XbaseImportedNamespaceScopeProvider {
	override internalGetImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
		if (!(context instanceof Route))
			return emptyList();
		val model = EcoreUtil2::getContainerOfType(context, typeof(Model))
		val List<ImportNormalizer> importedNamespaceResolvers = newArrayList();
		for (imp :model.imports) {
			if(imp.importedType != null){
				val value = imp.importedType.qualifiedName
				val resolver = createImportedNamespaceResolver(value, ignoreCase);
				if (resolver != null)
					importedNamespaceResolvers.add(resolver);
			}
		}
		importedNamespaceResolvers;
	}
}