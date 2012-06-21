/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.httprouting.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 * 
 * @author Holger Schill - Initial contribution and API
 *
 */
public class RouteProposalProvider extends AbstractRouteProposalProvider {

	public void completeRouteFeatureCall_Feature(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		
		Function<IEObjectDescription, ICompletionProposal> proposalFactory = getProposalFactory(getFeatureCallRuleName(), context);
		IScope scope = new FilteringScope(getScopeProvider().createSimpleFeatureCallScope(model, XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE, context.getResource(), false, -1), new Predicate<IEObjectDescription>() {
			public boolean apply(IEObjectDescription input) {
				return !input.getQualifiedName().equals(XbaseScopeProvider.IT);
			}
		});
		getCrossReferenceProposalCreator().lookupCrossReference(scope, model, XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE, acceptor, getFeatureDescriptionPredicate(context), proposalFactory);
	}

	@Override
	protected Predicate<IEObjectDescription> getFeatureDescriptionPredicate(ContentAssistContext contentAssistContext) {
		if (contentAssistContext.getPrefix().startsWith("_"))
			return super.getFeatureDescriptionPredicate(contentAssistContext);
		final Predicate<IEObjectDescription> delegate = super.getFeatureDescriptionPredicate(contentAssistContext);
		return new Predicate<IEObjectDescription>() {

			public boolean apply(IEObjectDescription input) {
				return !input.getName().getFirstSegment().startsWith("_") && delegate.apply(input);
			}

		};
	}
}
