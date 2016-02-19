/** 
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.ui

import org.eclipse.jface.viewers.ILabelProvider
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.IOutlineTreeStructureProvider
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider
import org.xtext.mongobeans.ui.labeling.MongoBeansLabelProvider
import org.xtext.mongobeans.ui.outline.MongoBeansOutlineTreeProvider
import org.xtext.mongobeans.ui.quickfix.MongoBeansQuickfixProvider

/** 
 * Use this class to register components to be used within the IDE.
 */
@FinalFieldsConstructor
class MongoBeansUiModule extends AbstractMongoBeansUiModule {

	override Class<? extends IOutlineTreeProvider> bindIOutlineTreeProvider() {
		return MongoBeansOutlineTreeProvider
	}

	override Class<? extends IOutlineTreeStructureProvider> bindIOutlineTreeStructureProvider() {
		return MongoBeansOutlineTreeProvider
	}

	override Class<? extends ILabelProvider> bindILabelProvider() {
		return MongoBeansLabelProvider
	}

	override Class<? extends IssueResolutionProvider> bindIssueResolutionProvider() {
		return MongoBeansQuickfixProvider
	}
}
