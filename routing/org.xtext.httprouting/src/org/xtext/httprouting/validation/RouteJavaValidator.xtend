/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.httprouting.validation

import org.xtext.httprouting.route.RoutePackage
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator
import org.eclipse.xtext.validation.Check
import org.xtext.httprouting.route.Route
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.xtype.XtypePackage
import org.eclipse.xtext.xbase.XExpression

/**
 * @author Holger Schill - Initial contribution and API
 */
class RouteJavaValidator extends XbaseWithAnnotationsJavaValidator{

	override getEPackages() {
	    val result = <EPackage>newArrayList()
	    result+=RoutePackage::eINSTANCE
	    result+=XbasePackage::eINSTANCE
	    result+=XAnnotationsPackage::eINSTANCE
	    result+=TypesPackage::eINSTANCE
	    result+=XtypePackage::eINSTANCE
		return result;
	}

	@Check
	def void checkVariables(Route route) {
		val url = route.getUrl()
		if (url != null) {
			var wildCard = false
			for (variable : url.getVariables()) {
				if (wildCard)
					error("A placeholder should not be placed after a wildcard", variable,
							RoutePackage$Literals::VARIABLE__NAME, -1)
				if (!wildCard && variable.isWildcard())
					wildCard = true
			}
		}
	}
	
	override protected isImplicitReturn(XExpression expr) {
		false
	}
	
}