package org.xtext.cradle.tests;

import java.lang.reflect.Method;

public class RunUtil {
	public static void runMain(Class<?> clazz, String[] argument)
			throws Exception {
		Method mainMethod = clazz.getDeclaredMethod("main", String[].class);
		mainMethod.invoke(null, (Object[]) new String[][] { argument });
	}
}
