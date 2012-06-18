package org.xtext.tortoiseshell.runtime

import org.eclipse.xtext.service.AbstractGenericModule
import org.eclipse.ui.plugin.AbstractUIPlugin
import com.google.inject.Binder

class Module extends AbstractGenericModule {
	
	override configure(Binder binder) {
		binder.bind(typeof(AbstractUIPlugin)).toInstance(Activator::instance);
	}
	
}