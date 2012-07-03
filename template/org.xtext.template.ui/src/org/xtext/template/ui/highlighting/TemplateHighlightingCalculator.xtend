package org.xtext.template.ui.highlighting

import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator
import com.google.inject.Inject
import org.xtext.template.services.TemplateGrammarAccess
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import static org.xtext.template.ui.highlighting.TemplateHighlightingConfiguration.*

class TemplateHighlightingCalculator extends XbaseHighlightingCalculator {

	@Inject TemplateGrammarAccess grammarAccess

	def isText(ILeafNode node) {
		switch grammarElement: node.getGrammarElement {
			RuleCall: {
				val rule = grammarElement.rule
				return rule == grammarAccess.TEXT_EXP2EXPRule 
					|| rule == grammarAccess.TEXT_EXP2STMRule
					|| rule == grammarAccess.TEXT_STM2EXPRule 
					|| rule == grammarAccess.TEXT_STM2STMRule
			}
			default: 
				false
		}
	}

	override doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		super.doProvideHighlightingFor(resource, acceptor)
		for (leafNode : resource.parseResult.rootNode.leafNodes) {
			if (isText(leafNode)) {
				acceptor.addPosition(leafNode.offset, 2, ESCAPE)
				acceptor.addPosition(leafNode.offset + 2, leafNode.length - 4, TEXT)
				acceptor.addPosition((leafNode.offset + leafNode.length) - 2, 2, ESCAPE)
			}
		}
	}
}
