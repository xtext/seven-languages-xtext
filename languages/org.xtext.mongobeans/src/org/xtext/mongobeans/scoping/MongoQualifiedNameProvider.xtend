/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.scoping

import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider
import org.xtext.mongobeans.mongoBeans.MongoBean
import org.xtext.mongobeans.mongoBeans.PackageDeclaration

import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * Customized to return correct names for inline declared {@link MongoBean}s.
 */
class MongoQualifiedNameProvider extends XbaseQualifiedNameProvider {
	
	def qualifiedName(MongoBean mongoBean) {
		val packageDeclaration = mongoBean.getContainerOfType(PackageDeclaration)
		if(packageDeclaration != null) 
			packageDeclaration.fullyQualifiedName.append(mongoBean.name)
		else
			return QualifiedName.create(mongoBean.name)
	}
}