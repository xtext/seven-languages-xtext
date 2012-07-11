/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.template.validation

import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator

class TemplateValidator extends XbaseWithAnnotationsJavaValidator {

	override protected isImplicitReturn(XExpression expr) {
		// workaround for https://bugs.eclipse.org/bugs/show_bug.cgi?id=382879
		false
	}
	
	override checkInnerExpressions(XExpression expr) {
		// disabled
	}
}
