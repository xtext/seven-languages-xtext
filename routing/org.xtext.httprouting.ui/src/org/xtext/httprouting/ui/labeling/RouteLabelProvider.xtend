package org.xtext.httprouting.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider
import org.xtext.httprouting.route.Route
import org.xtext.httprouting.route.URL
import org.xtext.httprouting.route.Variable

class RouteLabelProvider extends XbaseLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate)
	}

	def text(Route route) {
		var result = route.getRequestType().getName();
		if(route.getUrl() != null) {
			result = result + " " + getText(route.getUrl())
		}
		return result;
	}

	def text(Variable v){
		return v.getName();
	}
	def image(Variable v){

	}

	def text(URL url){
		val node = NodeModelUtils::getNode(url);
		return node.getText();
	}
	def image(URL url){

	}

}