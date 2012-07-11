/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.tortoiseshell.scoping

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider

class TortoiseShellExtensionClassNameProvider extends StaticImplicitMethodsFeatureForTypeProvider$ExtensionClassNameProvider {

	override protected computeLiteralClassNames() {
		super.computeLiteralClassNames => [
			it += "java.lang.Math"
			it += "org.eclipse.draw2d.ColorConstants" 
		]	
	}
}