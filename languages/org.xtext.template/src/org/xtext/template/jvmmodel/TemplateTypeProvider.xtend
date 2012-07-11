/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.template.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider
import org.xtext.template.template.RichString
import org.xtext.template.template.RichStringForLoop

import static org.eclipse.xtext.xbase.XbasePackage$Literals.*
import com.google.inject.Singleton

@Singleton
class TemplateTypeProvider extends XbaseTypeProvider {
	
	@Inject TypeReferences typeReferences
	
	def dispatch type(RichString string, JvmTypeReference typeRef, boolean isRawTypes) {
		typeReferences.getTypeForName(typeof(StringBuilder), string)
	}
	
	def dispatch type(RichStringForLoop string, JvmTypeReference typeRef, boolean isRawTypes) {
		typeReferences.getTypeForName(typeof(StringBuilder), string)
	}
	
	def dispatch expectedType(RichStringForLoop container, EReference reference, int index, boolean rawType) {
		if (reference == XFOR_LOOP_EXPRESSION__EACH_EXPRESSION)
			typeReferences.getTypeForName(typeof(Object), container)
		else
			super._expectedType(container,reference,index, rawType)
	}
}