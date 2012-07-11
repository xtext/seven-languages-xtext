/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.IOutlineTreeStructureProvider;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.xtext.mongobeans.ui.labeling.MongoBeansLabelProvider;
import org.xtext.mongobeans.ui.outline.MongoBeansOutlineTreeProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class MongoBeansUiModule extends org.xtext.mongobeans.ui.AbstractMongoBeansUiModule {
	
	public MongoBeansUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IOutlineTreeProvider> bindIOutlineTreeProvider() {
		return MongoBeansOutlineTreeProvider.class;
	}
	
	public Class<? extends IOutlineTreeStructureProvider> bindIOutlineTreeStructureProvider() {
		return MongoBeansOutlineTreeProvider.class;
	}
	
	@Override
	public Class<? extends org.eclipse.jface.viewers.ILabelProvider> bindILabelProvider() {
		return MongoBeansLabelProvider.class;
	}

	@Override
	public Class<? extends IssueResolutionProvider> bindIssueResolutionProvider() {
		return org.xtext.mongobeans.ui.quickfix.MongoBeansQuickfixProvider.class;
	}
}
