/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.ui.outline

import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.xtext.mongobeans.mongoBeans.MongoOperation
import org.xtext.mongobeans.mongoBeans.MongoProperty

class MongoBeansOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	// don't show children of operations
	def _isLeaf(MongoOperation operation) {
		true
	}
	
	// show inline declared MongoBeans
	def _createChildren(IOutlineNode parentNode, MongoProperty property) {
		if(property.inlineType != null)
			parentNode.createNode(property.inlineType)
	}
	
	def _isLeaf(MongoProperty property) {
		property.inlineType == null
	}
}