package org.xtext.tortoiseshell.scoping

import org.eclipse.draw2d.ColorConstants
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures

class TortoiseShellImplicitlyImportedFeatures extends ImplicitlyImportedFeatures {
	
	override protected getStaticImportClasses() {
		(super.getStaticImportClasses() + #[Math, ColorConstants]).toList
	}
}