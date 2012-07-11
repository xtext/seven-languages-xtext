/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.httprouting;

import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.service.SingletonBinding;
import org.xtext.httprouting.scoping.RouteImportedNamespaceScopeProvider;
import org.xtext.httprouting.validation.RouteJavaValidator;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime.
 */
public class RouteRuntimeModule extends
		org.xtext.httprouting.AbstractRouteRuntimeModule {
	
	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(RouteImportedNamespaceScopeProvider.class);
	}

	@SingletonBinding(eager = true)
	public Class<? extends RouteJavaValidator> bindRouteJavaValidator() {
		return RouteJavaValidator.class;
	}
}
