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
import java.util.HashSet
import java.util.Set
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
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
	@Inject extension TypeReferences

	def dispatch void infer(ModuleAST module, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		// leave if Guice is not on the classpath
		if(module.newTypeRef(Key) == null) return;
		
		// declare the needed types :
		val keyType = module.newTypeRef(Key).type
		val moduleType = module.newTypeRef(Module).type
		val binderType = module.newTypeRef(Binder).type
		val hashSetType = module.newTypeRef(HashSet).type
		val setType = module.newTypeRef(Set).type
		val voidType = module.newTypeRef('void').type

		
		// create a class for a module
		acceptor.accept( module.toClass( module.fullyQualifiedName ) ).initializeLater [
			documentation = module.documentation
			superTypes += moduleType.createTypeRef
			
			// declare a field for each mixed-in module
			for (mixin : module.mixins) {
				if (!mixin.eIsProxy)
					members += mixin.toField( mixin.simpleName, newTypeRef(mixin.fullyQualifiedName.toString)) [
						setInitializer [
							append('''new «mixin.name»()''')
						]
					]
			}
			
			for (binding : module.bindings) {
				// if it's a toInstance binding, create a synthetic method to give the expression a proper scope
				if (binding.toInstance != null) {
					members += binding.toMethod( binding.syntheticToInstanceName, binding.from.type) [
						visibility = JvmVisibility::PRIVATE
						body = binding.toInstance
					]
				} 
				// if a key has an annotation, declare a field so we can use that annotation via reflection later.
				if (binding.to?.annotation != null) {
					members += binding.toField(binding.to.syntheticName, binding.to.type) [
						newHashSet(binding.to.annotation).translateAnnotationsTo(it)
						visibility = JvmVisibility::PRIVATE
					]
				}
				if (binding.from.annotation != null) {
					members += binding.toField(binding.from.syntheticName, binding.from.type) [
						newHashSet(binding.from.annotation).translateAnnotationsTo(it)
						visibility = JvmVisibility::PRIVATE
					]
				}
			}
			
			// the main configure delegates to one accepting a set for the already bound keys.
			members += module.toMethod("configure", voidType.createTypeRef) [
				parameters += module.toParameter("binder", binderType.createTypeRef)
				body = [append('''
					configure(binder, new «hashSetType.createTypeRef(keyType.createTypeRef(wildCard)).identifier»());
				''')]
			]
			
			members += module.toMethod("configure", voidType.createTypeRef) [
				documentation = 'Registers bindings for keys not present in the given set.'
				parameters += module.toParameter("bind", binderType.createTypeRef)
				parameters += module.toParameter("usedKeys", setType.createTypeRef( keyType.createTypeRef(wildCard)))
				body = [append('''
					try {
						«FOR b : module.bindings»
							{
								«keyType.createTypeRef(b.from.type).identifier» key = 
									«b.from.guiceKey»;
								if (usedKeys.add(key)) {
									«IF b.toInstance != null»
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
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				''')]
			]
			
		]
	}
	
	def guiceKey(KeyAST it) '''
		com.google.inject.Key.get(new com.google.inject.TypeLiteral<«type.identifier»>(){}«
		IF annotation != null
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
