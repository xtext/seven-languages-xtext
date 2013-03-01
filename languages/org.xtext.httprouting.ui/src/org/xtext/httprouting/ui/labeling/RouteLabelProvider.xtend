/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.httprouting.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider
import org.xtext.httprouting.route.Dependency
import org.xtext.httprouting.route.Route

import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*

class RouteLabelProvider extends XbaseLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate)
	}

	def String text(Dependency dep) {
		'''«dep.type.simpleName» «dep.name»'''
	}
	
	def String text(Route route) {
		'''«route.requestType.name»«route.url.node.text»'''
	}

}