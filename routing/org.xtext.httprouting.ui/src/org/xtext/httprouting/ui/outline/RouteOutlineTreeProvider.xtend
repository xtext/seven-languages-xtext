package org.xtext.httprouting.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.xbase.XExpression
import org.xtext.httprouting.route.Key
import org.xtext.httprouting.route.Condition

class RouteOutlineTreeProvider extends DefaultOutlineTreeProvider {

	def _isLeaf(XExpression expr) {
		return true
	}

	def _isLeaf(Key key) {
		return true
	}

	def _isLeaf(Condition condition) {
		return true
	}
}
