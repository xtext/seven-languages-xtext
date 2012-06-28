package org.xtext.builddsl.lib

import org.xtext.builddsl.lib.impl.RunUtil

class ClassExtensions {
	def public static void runMain(Class<? extends Object> clazz) {
		RunUtil::runMain(clazz, emptyList)
	}
}