package org.guicecon.modules.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.guicecon.modules.guiceModules.Module
import com.google.inject.Binder
import com.google.inject.TypeLiteral
import com.google.inject.Key
import java.util.HashSet
import org.eclipse.xtext.common.types.util.TypeReferences
import org.guicecon.modules.guiceModules.Binding


class GuiceModulesJvmModelInferrer extends  AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject TypeReferences typeReferences

	def dispatch void infer(Module m, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		//Prove if Guice in on the classpath
		if(m.newTypeRef("com.google.inject.Key")== null)
			return
		else
		acceptor.accept(m.toClass(m.fullyQualifiedName)).initializeLater[
			documentation = m.documentation
			superTypes += m.newTypeRef(typeof(com.google.inject.Module))
			members += m.toConstructor() [] 
			
			for( mix : m.mixins){
				val field =  mix.toField(mix.name.toFirstLower, mix.newTypeRef(mix.name))
				members+= field
				field.setInitializer[append('''new «mix.name»()''')]
			}

			members += m.toMethod("configure",m.newTypeRef(Void::TYPE),[
					parameters += m.toParameter("binder", m.newTypeRef(typeof(Binder)))
					body = [append('''configure(binder, new ''')
							append(m.newTypeRef(typeof(HashSet)).type)
							append('''<Key<?>>());''')]
				])
			members+= m.toMethod("configure",m.newTypeRef(Void::TYPE),[
				parameters += m.toParameter("bind", m.newTypeRef(typeof(Binder)))
				parameters += m.toParameter("usedKeys",m.newTypeRef("java.util.Set",m.newTypeRef("com.google.inject.Key",typeReferences.wildCard)))
				body = [
						for(b : m.bindings){
							append('''
								if (usedKeys.add(''')append((m.newTypeRef(typeof(Key)).type))
							append('''.get(new ''').append(m.newTypeRef(typeof(TypeLiteral)).type).append('''<''').append(b.from.type.type)
							append('''>(){}))) {
	bind.bind(Key.get(new TypeLiteral<''').append(b.from.type.type).append('''>(){}))''')
							if(b.toInstance != null){
								append('''.toInstance(«b.getNameForInstanceMethod»())''')
							} else {
								append('''.to(Key.get(new TypeLiteral<''').append(b.to.type.type).append('''>(){}));''')
							}
							append('''	// End bindings	
}
	''') 
						}
						
						for(mix : m.mixins) {
append('''«mix.name.toFirstLower».configure(bind, usedKeys);''')
						}
					]
			])
			for(b : m.bindings){
				if(b.toInstance != null){
					members+= b.toMethod(b.getNameForInstanceMethod,b.from.type,[body=b.toInstance])
				}
			}
			
		]
	}
	
	def getNameForInstanceMethod(Binding b){
		"getInstanceFor" + b.from.type.type.simpleName
	}
	
}
