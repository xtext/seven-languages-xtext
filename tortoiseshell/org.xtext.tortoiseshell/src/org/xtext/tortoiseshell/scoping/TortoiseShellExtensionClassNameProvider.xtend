package org.xtext.tortoiseshell.scoping

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider

class TortoiseShellExtensionClassNameProvider extends StaticImplicitMethodsFeatureForTypeProvider$ExtensionClassNameProvider {

	override protected computeLiteralClassNames() {
		super.computeLiteralClassNames() => [
			it += "java.lang.Math"
			it += "org.eclipse.draw2d.ColorConstants" 
		]	
	}
}