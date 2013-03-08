/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib.view;

import com.google.inject.Inject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.xtext.tortoiseshell.lib.view.TortoisePartListener;
import org.xtext.tortoiseshell.lib.view.TortoiseView;

@SuppressWarnings("all")
public class ToggleStopModeAction extends Action {
  @Inject
  private TortoiseView view;
  
  @Inject
  public ToggleStopModeAction(final PluginImageHelper helper) {
    super("Toggle stop mode");
    Image _image = helper.getImage("stopmode.gif");
    ImageDescriptor _createFromImage = ImageDescriptor.createFromImage(_image);
    this.setImageDescriptor(_createFromImage);
    this.setChecked(false);
  }
  
  public void run() {
    TortoisePartListener _tortoisePartListener = this.view.getTortoisePartListener();
    boolean _ggleStopMode = _tortoisePartListener.toggleStopMode();
    this.setChecked(_ggleStopMode);
  }
}
