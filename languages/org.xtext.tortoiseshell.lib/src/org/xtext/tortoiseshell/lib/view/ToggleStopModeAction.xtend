/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.tortoiseshell.lib.view

import org.eclipse.jface.action.Action
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtext.ui.PluginImageHelper
import com.google.inject.Inject

class ToggleStopModeAction extends Action {
	
	@Inject TortoiseView view
	
	@Inject
	new(PluginImageHelper helper) {
		super("Toggle stop mode")
		setImageDescriptor(ImageDescriptor.createFromImage(helper.getImage('stopmode.gif')))
		checked = false
	}
	
	override run() {
		checked = view.tortoisePartListener.toggleStopMode
	}
	
}