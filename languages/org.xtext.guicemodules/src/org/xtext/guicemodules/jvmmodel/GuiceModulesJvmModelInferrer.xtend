/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.guicemodules.jvmmodel

import com.google.inject.Binder
import com.google.inject.Inject
import com.google.inject.Key
import com.google.inject.Module
import com.google.inject.TypeLiteral
import java.util.HashSet
import java.util.Set
import org.eclipse.xtend2.lib.StringConcatenationClient
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.guicemodules.guiceModules.BindingAST
import org.xtext.guicemodules.guiceModules.KeyAST
import org.xtext.guicemodules.guiceModules.ModuleAST

class GuiceModulesJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder builder
	@Inject extension IQualifiedNameProvider

	def dispatch void infer(ModuleAST module, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		// create a class for a module
		acceptor.accept( module.toClass( module.fullyQualifiedName ) ) [
			documentation = module.documentation
			superTypes += typeRef(Module)
			
			// declare a field for each mixed-in module
			for (mixin : module.mixins) {
				if (!mixin.eIsProxy)
					members += mixin.toField( mixin.simpleName, typeRef(mixin.fullyQualifiedName.toString)) [
						initializer = '''new «mixin.name»()'''
					]
			}
			
			for (binding : module.bindings) {
				// if it's a toInstance binding, create a synthetic method to give the expression a proper scope
				if (binding.toInstance !== null) {
					members += binding.toMethod( binding.syntheticToInstanceName, binding.from.type) [
						visibility = JvmVisibility.PRIVATE
						body = binding.toInstance
					]
				} 
				// if a key has an annotation, declare a field so we can use that annotation via reflection later.
				if (binding.to?.annotation !== null) {
					members += binding.toField(binding.to.syntheticName, binding.to.type) [
						addAnnotation(binding.to.annotation)
						visibility = JvmVisibility.PRIVATE
					]
				}
				if (binding.from.annotation !== null) {
					members += binding.toField(binding.from.syntheticName, binding.from.type) [
						addAnnotation(binding.from.annotation)
						visibility = JvmVisibility.PRIVATE
					]
				}
			}
			
			// the main configure delegates to one accepting a set for the already bound keys.
			members += module.toMethod("configure", typeRef(void)) [
				parameters += module.toParameter("binder", typeRef(Binder))
				body = '''
					configure(binder, new «HashSet»<«typeRef(Key, wildcard)»>());
				'''
			]
			
			members += module.toMethod("configure", typeRef(void)) [
				documentation = 'Registers bindings for keys not present in the given set.'
				parameters += module.toParameter("bind", typeRef(Binder))
				parameters += module.toParameter("usedKeys", typeRef(Set, typeRef(Key, wildcard)))
				body = '''
					try {
						«FOR b : module.bindings»
							{
								«typeRef(Key, b.from.type)» key = «b.from.guiceKey»;
								if (usedKeys.add(key)) {
									«IF b.toInstance !== null»
										bind.bind(key).toInstance(«b.syntheticToInstanceName»());
									«ELSE»
										bind.bind(key).to(«b.to.guiceKey»);
									«ENDIF»
								}
							}
						«ENDFOR»
						«FOR mix : module.mixins»
							«mix.simpleName».configure(bind, usedKeys);
						«ENDFOR»
					} catch («Exception» e) {
						throw new «RuntimeException»(e);
					}
				'''
			]
			
		]
	}
	
	def StringConcatenationClient guiceKey(KeyAST it) '''
		«Key».get(new «TypeLiteral»<«type»>(){}«
		IF annotation !== null
				», getClass().getDeclaredField("«syntheticName»").getAnnotations()[0]«
		ENDIF»)'''
	
	def syntheticName(KeyAST b) {
		val binding = b.eContainer
		return '_' + b.eContainingFeature.name + binding.eContainer.eContents.indexOf(binding)
	}
	
	def syntheticToInstanceName(BindingAST binding) {
		return '_toInstance' + binding.eContainer.eContents.indexOf(binding)
	}
	
	def simpleName(ModuleAST module) {
		module.name.split("\\.").last.toFirstLower
	}
}
