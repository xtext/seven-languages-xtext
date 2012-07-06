/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.mongobeans.example

class Duration {

	@Property int seconds

	new(int seconds) {
		this.seconds = seconds
	}

	new(String duration) {
		val split = duration.split(':')
		seconds = Integer::parseInt(split.get(0)) * 60 + Integer::parseInt(split.get(1))
	}		
		
	override String toString() {
		Integer::toString(seconds / 60) + ':' + Integer::toString(seconds % 60)
	}
		
	def Duration operator_plus(Duration other) {
		new Duration(this.seconds + other.seconds)
    }
}