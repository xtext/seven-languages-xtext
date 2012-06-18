package org.xtext.tortoiseshell.scoping

import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider
import org.xtext.tortoiseshell.jvmmodel.TortoiseShellJvmModelInferrer

class TortoiseShellIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {
	
	override getSimpleName(JvmIdentifiableElement element) {
		if(element.simpleName == TortoiseShellJvmModelInferrer::INFERRED_CLASS_NAME)
			'this'
		else
			super.getSimpleName(element)
	}
	
}