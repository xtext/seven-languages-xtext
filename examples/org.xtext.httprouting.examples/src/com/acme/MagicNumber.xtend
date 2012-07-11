/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.acme

import com.google.inject.Inject
import javax.servlet.http.HttpServletRequest
import java.util.Random

class MagicNumber {
	@Inject HttpServletRequest request
	
	def getNumber() {
		request.session.getAttribute('number') as Integer
	}
	
	def seedNumber() {
		val number = Math::abs(new Random().nextInt % 100)
		request.session.setAttribute('number', number)
	}
	
	def cleanNumber() {
		request.session.removeAttribute('number')
	}
}