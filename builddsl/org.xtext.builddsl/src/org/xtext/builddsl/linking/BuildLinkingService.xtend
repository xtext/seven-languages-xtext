package org.xtext.builddsl.linking

import com.google.inject.Inject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.linking.impl.DefaultLinkingService
import org.eclipse.xtext.linking.impl.IllegalNodeException
import org.eclipse.xtext.nodemodel.INode
import org.xtext.builddsl.services.BuildDSLGrammarAccess

class BuildLinkingService extends DefaultLinkingService {
	
	@Inject BuildDSLGrammarAccess grammar
	
	override getCrossRefNodeAsString(INode node) throws IllegalNodeException {
		if(node.grammarElement instanceof RuleCall && (node.grammarElement as RuleCall).rule == grammar.FILERule)
			"/"
		else 
			super.getCrossRefNodeAsString(node)
	}
	
}