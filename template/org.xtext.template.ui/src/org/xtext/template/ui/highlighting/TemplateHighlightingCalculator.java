/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.template.ui.highlighting;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator;
import org.xtext.template.services.TemplateGrammarAccess;

import com.google.inject.Inject;

public class TemplateHighlightingCalculator extends XbaseHighlightingCalculator {

	@Inject
	private TemplateGrammarAccess grammarAccess;

	private boolean isText(ILeafNode node) {
		if (node.getGrammarElement() instanceof RuleCall) {
			AbstractRule r = ((RuleCall) node.getGrammarElement()).getRule();
			return r == grammarAccess.getTEXT_EXP2EXPRule() || r == grammarAccess.getTEXT_EXP2STMRule()
					|| r == grammarAccess.getTEXT_STM2EXPRule() || r == grammarAccess.getTEXT_STM2STMRule();
		}
		return false;
	}

	@Override
	protected void doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		super.doProvideHighlightingFor(resource, acceptor);
		for (ILeafNode node : resource.getParseResult().getRootNode().getLeafNodes())
			if (isText(node)) {
				acceptor.addPosition(node.getOffset(), 2, TemplateHighlightingConfiguration.ESCAPE);
				acceptor.addPosition(node.getOffset() + 2, node.getLength() - 4, TemplateHighlightingConfiguration.TEXT);
				acceptor.addPosition((node.getOffset() + node.getLength()) - 2, 2, TemplateHighlightingConfiguration.ESCAPE);
			}
	}
}
