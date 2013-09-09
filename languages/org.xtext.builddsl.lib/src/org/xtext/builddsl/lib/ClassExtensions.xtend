/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.lib

import org.xtext.builddsl.lib.impl.RunUtil

class ClassExtensions {
	
	def static void runMain(Class<? extends Object> clazz) {
		RunUtil.runMain(clazz, emptyList)
	}
	
}	 