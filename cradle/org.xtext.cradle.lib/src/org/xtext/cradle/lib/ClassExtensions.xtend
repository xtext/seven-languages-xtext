package org.xtext.cradle.lib

import org.xtext.cradle.lib.impl.RunUtil

class ClassExtensions {
	def public static void runMain(Class<? extends Object> clazz) {
		RunUtil::runMain(clazz, emptyList)
	}
}