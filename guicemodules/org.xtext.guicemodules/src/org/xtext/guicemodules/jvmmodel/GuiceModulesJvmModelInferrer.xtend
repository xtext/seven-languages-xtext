package org.xtext.guicemodules.jvmmodel

import com.google.inject.Binder
import com.google.inject.Inject
import com.google.inject.Key
import com.google.inject.TypeLiteral
import java.util.HashSet
import java.util.Set
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.guicemodules.guiceModules.Binding
import org.xtext.guicemodules.guiceModules.Module

class GuiceModulesJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder builder
	@Inject extension IQualifiedNameProvider
	@Inject extension TypeReferences

	def dispatch void infer(Module module, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		// declare the needed types :
		val keyType = module.newTypeRef(typeof(Key)).type
		val moduleType = module.newTypeRef(typeof(com.google.inject.Module)).type
		val binderType = module.newTypeRef(typeof(Binder)).type
		val typeLiteralType = module.newTypeRef(typeof(TypeLiteral)).type
		val hashSetType = module.newTypeRef(typeof(HashSet)).type
		val setType = module.newTypeRef(typeof(Set)).type
		val voidType = module.newTypeRef('void').type

		// leave if Guice in not on the classpath
		if(keyType == null) return;
		
		// create a class for a module
		acceptor.accept( module.toClass( module.fullyQualifiedName ) ).initializeLater [
			documentation = module.documentation
			superTypes += moduleType.createTypeRef
			
			for (mixin : module.mixins) {
				members += module.toField( mixin.name.toFirstLower, newTypeRef(mixin.fullyQualifiedName.toString)) [
					setInitializer [
						append('''new «mixin.name»()''')
					]
				]
			}
			
			// create synthetic methods
			val methods = <Binding, String>newHashMap
			for (binding : module.bindings.filter[ toInstance != null ]) {
				val name = "_"+methods.size
				methods.put( binding, name )
				members += binding.toMethod( name, binding.from.type) [
					visibility = JvmVisibility::PRIVATE
					body = binding.toInstance
				]
			}
			
			members += module.toMethod("configure", voidType.createTypeRef) [
				parameters += module.toParameter("binder", binderType.createTypeRef)
				body = [append('''
					configure(binder, new «hashSetType.createTypeRef(keyType.createTypeRef(wildCard)).identifier»());
				''')]
			]
			
			members+= module.toMethod("configure", voidType.createTypeRef) [
				parameters += module.toParameter("bind", binderType.createTypeRef)
				parameters += module.toParameter("usedKeys", setType.createTypeRef( keyType.createTypeRef(wildCard)))
				body = [append('''
					«FOR b : module.bindings»
						{
							«keyType.createTypeRef(b.from.type).identifier» key = 
								«keyType.simpleName».get(new «typeLiteralType.createTypeRef(b.from.type).identifier»(){});
							if (usedKeys.add(key)) {
								«IF b.toInstance != null»
									bind.bind(key).toInstance(«methods.get(b)»());
								«ELSE»
									bind.bind(key).to(«keyType.simpleName».get(new «typeLiteralType.createTypeRef(b.to.type).identifier»(){}));
								«ENDIF»
							}
						}
					«ENDFOR»
					«FOR mix : module.mixins»
						«mix.name.toFirstLower».configure(bind, usedKeys);
					«ENDFOR»
				''')]
			]
			
		]
	}
	
}
