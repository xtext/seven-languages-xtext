/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.xtext.mongobeans.scoping.MongoQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class MongoBeansRuntimeModule extends org.xtext.mongobeans.AbstractMongoBeansRuntimeModule {

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return MongoQualifiedNameProvider.class;
	}
	
}
