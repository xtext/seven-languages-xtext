/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.httprouting.ui;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.IOutlineTreeStructureProvider;
import org.eclipse.xtext.ui.validation.AbstractValidatorConfigurationBlock;
import org.eclipse.xtext.xbase.ui.validation.XbaseValidationConfigurationBlock;
import org.xtext.httprouting.ui.labeling.RouteLabelProvider;
import org.xtext.httprouting.ui.outline.RouteOutlineTreeProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class RouteUiModule extends org.xtext.httprouting.ui.AbstractRouteUiModule {
	public RouteUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends ILabelProvider> bindILabelProvider() {
		return RouteLabelProvider.class;
	}

	public Class<? extends IOutlineTreeProvider> bindIOutlineTreeProvider() {
		return RouteOutlineTreeProvider.class;
	}

	public Class<? extends IOutlineTreeStructureProvider> bindIOutlineTreeStructureProvider() {
		return RouteOutlineTreeProvider.class;
	}
	
	public Class<? extends AbstractValidatorConfigurationBlock> bindAbstractValidatorConfigurationBlock() {
		return XbaseValidationConfigurationBlock.class;
	}
}
