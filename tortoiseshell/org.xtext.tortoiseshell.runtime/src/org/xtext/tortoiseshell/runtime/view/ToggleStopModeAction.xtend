package org.xtext.tortoiseshell.runtime.view

import org.eclipse.jface.action.Action
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtext.ui.PluginImageHelper
import com.google.inject.Inject

class ToggleStopModeAction extends Action {
	
	@Inject TortoiseView view
	
	@Inject
	new(PluginImageHelper helper) {
		super("Toggle stop mode")
		setImageDescriptor(ImageDescriptor::createFromImage(helper.getImage('stopmode.gif')))
		checked = false
	}
	
	override run() {
		checked = view.tortoisePartListener.toggleStopMode
	}
	
}