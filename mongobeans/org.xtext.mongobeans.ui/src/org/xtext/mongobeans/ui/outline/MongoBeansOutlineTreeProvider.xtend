package org.xtext.mongobeans.ui.outline

import org.xtext.mongobeans.mongoBeans.MongoOperation
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.xtext.mongobeans.mongoBeans.MongoProperty
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider

class MongoBeansOutlineTreeProvider extends DefaultOutlineTreeProvider {
	def _isLeaf(MongoOperation operation) {
		true
	}
	
	def _createChildren(IOutlineNode parentNode, MongoProperty property) {
		if(property.inlineType != null)
			parentNode.createNode(property.inlineType)
	}
	
	def _isLeaf(MongoProperty property) {
		property.inlineType == null
	}
}