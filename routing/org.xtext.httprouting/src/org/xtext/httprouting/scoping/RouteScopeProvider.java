/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.httprouting.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.DefaultConstructorDescriptionProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.IJvmFeatureDescriptionProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.XConstructorProvider;

import com.google.inject.Inject;
/**
 * @author Holger Schill - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class RouteScopeProvider extends XbaseScopeProvider {
	
	@Inject
	private ILogicalContainerProvider logicalContainerProvider;
	
	@Inject
	private TypeReferences typeReferences;
	
	@Override
	protected void addFeatureCallScopes(EObject featureCall,
			IScope localVariableScope,
			IJvmFeatureScopeAcceptor featureScopeDescriptions) {
//		addFeatureCallScopes(featureCall, localVariableScope, THIS, getThisPriority(), featureScopeDescriptions); 
		addFeatureCallScopes(featureCall, localVariableScope, IT, getItPriority(), featureScopeDescriptions);
		
		JvmIdentifiableElement logicalContainer = logicalContainerProvider.getNearestLogicalContainer(featureCall);
		if (logicalContainer instanceof JvmConstructor) {
			JvmConstructor constructor = (JvmConstructor) logicalContainer;
			JvmDeclaredType contextType = constructor.getDeclaringType();
			JvmTypeReference receiverType = typeReferences.createTypeRef(contextType);
			IAcceptor<IJvmFeatureDescriptionProvider> acceptor = featureScopeDescriptions.curry(receiverType, featureCall);
			DefaultConstructorDescriptionProvider defaultProvider = newDefaultConstructorDescriptionProvider();
			XConstructorProvider featureProvider = newConstructorProvider();
			defaultProvider.setContextType(contextType);
			defaultProvider.setPriority(getDefaultPriority());
			defaultProvider.setFeaturesForTypeProvider(featureProvider);
			acceptor.accept(defaultProvider);			
		}
	}
}
