package org.xtext.tortoiseshell.scoping

import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedTypes
import org.eclipse.draw2d.ColorConstants

class TortoiseShellImplicitlyImportedTypes extends ImplicitlyImportedTypes {
	
	override protected getStaticImportClasses() {
		(super.getStaticImportClasses() + #[typeof(Math), typeof(ColorConstants)])
			.toList
	}
}