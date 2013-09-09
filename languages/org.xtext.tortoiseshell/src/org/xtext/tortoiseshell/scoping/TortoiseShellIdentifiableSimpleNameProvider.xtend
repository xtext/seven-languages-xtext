/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.tortoiseshell.scoping

import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider
import org.xtext.tortoiseshell.jvmmodel.TortoiseShellJvmModelInferrer

class TortoiseShellIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {
	
	override getSimpleName(JvmIdentifiableElement element) {
		if (element.simpleName == TortoiseShellJvmModelInferrer.INFERRED_CLASS_NAME)
			'this'
		else
			super.getSimpleName(element)
	}
	
}