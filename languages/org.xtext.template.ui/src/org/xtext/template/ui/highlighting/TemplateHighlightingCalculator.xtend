/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.template.ui.highlighting

import com.google.inject.Inject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.xbase.ide.highlighting.XbaseHighlightingCalculator
import org.xtext.template.services.TemplateGrammarAccess

import static org.xtext.template.ui.highlighting.TemplateHighlightingConfiguration.*
import org.eclipse.xtext.util.CancelIndicator

class TemplateHighlightingCalculator extends XbaseHighlightingCalculator {

	@Inject TemplateGrammarAccess grammarAccess

	def isText(ILeafNode node) {
		switch grammarElement: node.getGrammarElement {
			RuleCall: 
				grammarElement.rule == grammarAccess.TEXTRule
			default: 
				false
		}
	}

	override protected doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		super.doProvideHighlightingFor(resource, acceptor, cancelIndicator)
		acceptor.addPosition(0, 4, TEXT)
		acceptor.addPosition(4, 1, ESCAPE)
		for (leafNode : resource.parseResult.rootNode.leafNodes) {
			if (leafNode.isText) {
				acceptor.addPosition(leafNode.offset, 1, ESCAPE)
				acceptor.addPosition(leafNode.offset + 1, leafNode.length - 2, TEXT)
				acceptor.addPosition((leafNode.offset + leafNode.length) - 1, 1, ESCAPE)
			}
		}
	}
}
