package org.xtext.builddsl.lib.impl

import static java.util.Collections.*

class RunUtil {
	
	def static void runMain(Class<?> clazz, String[] argument) {
		val mainMethod = clazz.getDeclaredMethod("main", Class::forName('[Ljava.lang.String;'))
		val Object[] args = singletonList(argument as Object) 
		mainMethod.invoke(null, args)
	}

}