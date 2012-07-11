/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.template;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.service.SingletonBinding;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.xtext.template.jvmmodel.TemplateCompiler;
import org.xtext.template.jvmmodel.TemplateTypeProvider;
import org.xtext.template.validation.TemplateValidator;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class TemplateRuntimeModule extends AbstractTemplateRuntimeModule {
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return TemplateValueConverterService.class;
	}
	
	@SingletonBinding(eager=true)	
	public Class<? extends TemplateValidator> bindTemplateValidator() {
		return TemplateValidator.class;
	}
	
	@Override
	public Class<? extends ITypeProvider> bindITypeProvider() {
		return TemplateTypeProvider.class;
	}
	
	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return TemplateCompiler.class;
	}

}
