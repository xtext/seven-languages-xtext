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
			RuleCall: 
				grammarElement.rule == grammarAccess.TEXTRule
			default: 
				false
		}
	}

	override doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		super.doProvideHighlightingFor(resource, acceptor)
		acceptor.addPosition(0, 4, TEXT)
		acceptor.addPosition(4, 1, ESCAPE)
		for (leafNode : resource.parseResult.rootNode.leafNodes) {
			if (isText(leafNode)) {
				acceptor.addPosition(leafNode.offset, 1, ESCAPE)
				acceptor.addPosition(leafNode.offset + 1, leafNode.length - 2, TEXT)
				acceptor.addPosition((leafNode.offset + leafNode.length) - 1, 1, ESCAPE)
			}
		}
	}
}
