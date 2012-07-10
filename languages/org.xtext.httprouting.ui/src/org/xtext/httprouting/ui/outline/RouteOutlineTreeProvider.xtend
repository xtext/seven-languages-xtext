package org.xtext.httprouting.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.xtext.httprouting.route.Dependency
import org.xtext.httprouting.route.Route

class RouteOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	def _isLeaf(Route r) { true }
	def _isLeaf(Dependency r) { true }
	
}