package org.xtext.guicemodules.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.guicemodules.guiceModules.Binding
import org.xtext.guicemodules.guiceModules.Module
import org.eclipse.xtext.common.types.JvmVisibility
 

class GuiceModulesJvmModelInferrer extends ModelInferrer {

  @Inject extension JvmTypesBuilder builder
  @Inject extension IQualifiedNameProvider

  def dispatch void infer(Module module, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
    // leave if Guice in not on the classpath
    if(module.type('com.google.inject.Key') == null) return;
    
    // create a class for a module
    acceptor.accept( module.toClass( module.fullyQualifiedName ) ).initializeLater [
      documentation = module.documentation
      superTypes += module.type('com.google.inject.Module')
      
      for (mixin : module.mixins) {
        members += module.toField( mixin.name.toFirstLower, type(mixin.fullyQualifiedName.toString)) [
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
      
      members += module.toMethod("configure", module.type('void')) [
        parameters += module.toParameter("binder", module.type('com.google.inject.Binder'))
        body ['''
          configure(binder, new java.util.HashSet<com.google.inject.Key<?>>());
        ''']
      ]
      
      members+= module.toMethod("configure", module.type('void')) [
        parameters('com.google.inject.Binder' -> "bind")
        parameters += module.toParameter("bind", module.type("com.google.inject.Binder"))
        parameters += module.toParameter("usedKeys", module.type("java.util.Set", module.type('com.google.inject.Key', wildcard )))
        body ['''
          «FOR b : module.bindings»
            «_(type('com.google.inject.Key', b.from.type))»> key = 
              «_('com.google.inject.Key')».get(new «_(type('com.google.inject.TypeLiteral', b.from.type))»(){});
            if (usedKeys.add(key)) {
              «IF b.toInstance != null»
                bind.bind(key).toInstance(«methods.get(b)»());
              «ELSE»
                bind.bind(key).to(«_('com.google.inject.Key')».get(new <«_(type('com.google.inject.TypeLiteral', b.to.type))»(){}));
              «ENDIF»
            }
          «ENDFOR»
          «FOR mix : module.mixins»
            «mix.name.toFirstLower».configure(bind, usedKeys);
          «ENDFOR»
        ''']
      ]
      
    ]
  }
  
  
}
