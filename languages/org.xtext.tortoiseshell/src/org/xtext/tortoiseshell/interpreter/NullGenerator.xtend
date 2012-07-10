package org.xtext.tortoiseshell.interpreter

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class NullGenerator implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		// don't generate anything
	}
	
}