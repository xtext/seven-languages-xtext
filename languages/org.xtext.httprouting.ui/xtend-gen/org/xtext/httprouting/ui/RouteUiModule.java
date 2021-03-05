/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.httprouting.ui;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.IOutlineTreeStructureProvider;
import org.xtext.httprouting.ui.labeling.RouteLabelProvider;
import org.xtext.httprouting.ui.outline.RouteOutlineTreeProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class RouteUiModule extends AbstractRouteUiModule {
  @Override
  public Class<? extends ILabelProvider> bindILabelProvider() {
    return RouteLabelProvider.class;
  }
  
  @Override
  public Class<? extends IOutlineTreeProvider> bindIOutlineTreeProvider() {
    return RouteOutlineTreeProvider.class;
  }
  
  @Override
  public Class<? extends IOutlineTreeStructureProvider> bindIOutlineTreeStructureProvider() {
    return RouteOutlineTreeProvider.class;
  }
  
  public RouteUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
