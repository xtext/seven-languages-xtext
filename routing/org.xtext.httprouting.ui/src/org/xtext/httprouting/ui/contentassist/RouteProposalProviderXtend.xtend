/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.httprouting.ui.contentassist

class RouteProposalProviderXtend extends AbstractRouteProposalProvider {
//	// We do not want it as proposal in the contentAssist so we establish a FilteringScope where we filter out IEObjectDescription with the QualifiedName it
//	override completeRouteFeatureCall_Feature(EObject model,
//			Assignment assignment, ContentAssistContext context,
//			ICompletionProposalAcceptor acceptor) {
//		val proposalFactory = getProposalFactory(getFeatureCallRuleName(), context)
//		val scope = new FilteringScope(getScopeProvider().createSimpleFeatureCallScope(
//						model, XbasePackage$Literals::XABSTRACT_FEATURE_CALL__FEATURE, context.getResource(), false, -1), [input |!input.getQualifiedName().equals(XbaseScopeProvider::IT)])
//
//		getCrossReferenceProposalCreator().lookupCrossReference(scope, model, XbasePackage$Literals::XABSTRACT_FEATURE_CALL__FEATURE, acceptor,
//				getFeatureDescriptionPredicate(context), proposalFactory)
//	}
//	// As we inferred methods and field in the Inferrer with the prefix '_' to hide them in the contentAssist there is a need to filter them out
//	// Only if someone starts typing with a '_' we do schow all results
//	override getFeatureDescriptionPredicate(ContentAssistContext contentAssistContext) {
//		if (contentAssistContext.getPrefix().startsWith("_"))
//			return super.getFeatureDescriptionPredicate(contentAssistContext)
//		val delegate = super.getFeatureDescriptionPredicate(contentAssistContext)
//		return [IEObjectDescription input | !input.getName().getFirstSegment().startsWith("_") && delegate.apply(input)]
//	}
}