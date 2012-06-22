package org.xtext.cradle.linking

import com.google.common.collect.Multimap
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature$Setting
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.diagnostics.IDiagnosticProducer
import org.eclipse.xtext.linking.lazy.LazyLinker
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.xbase.XBinaryOperation
import org.eclipse.xtext.xbase.XbasePackage$Literals
import org.xtext.cradle.services.CradleGrammarAccess

import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*

public class CradleLazyLinker extends LazyLinker {
	
	@Inject CradleGrammarAccess grammar

	override installProxies(EObject obj, IDiagnosticProducer producer, Multimap<EStructuralFeature$Setting, INode> settingsToLink) {
		super.installProxies(obj, producer, settingsToLink)
		val node = obj.node
		if (node == null)
			return;
		for(leaf:node.leafNodes.filter[grammarElement instanceof RuleCall && (grammarElement as RuleCall).rule == grammar.FILERule]) {
			val op = leaf.findActualSemanticObjectFor?.getContainerOfType(typeof(XBinaryOperation))
			if(op != null && op.feature == null) {
				createAndSetProxy(op, leaf, XbasePackage$Literals::XABSTRACT_FEATURE_CALL__FEATURE)
			}
		}
	}
}
