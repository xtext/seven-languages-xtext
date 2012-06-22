package org.xtext.cradle.linking

import org.eclipse.xtext.linking.impl.DefaultLinkingService
import org.eclipse.xtext.linking.impl.IllegalNodeException
import org.eclipse.xtext.nodemodel.INode
import org.xtext.cradle.services.CradleGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.RuleCall

class CradleLinkingService extends DefaultLinkingService {
	
	@Inject CradleGrammarAccess grammar
	
	override getCrossRefNodeAsString(INode node) throws IllegalNodeException {
		if(node.grammarElement instanceof RuleCall && (node.grammarElement as RuleCall).rule == grammar.FILERule)
			"/"
		else 
			super.getCrossRefNodeAsString(node)
	}
	
}