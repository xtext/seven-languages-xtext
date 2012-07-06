package org.xtext.httprouting.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.xbase.XExpression

class RouteOutlineTreeProvider extends DefaultOutlineTreeProvider {

	def _isLeaf(XExpression expr) {
		return true
	}

}
