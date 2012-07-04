package org.xtext.builddsl.lib.impl;

import java.lang.reflect.Method;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class RunUtil {
  public static void runMain(final Class<? extends Object> clazz, final String[] argument) {
    try {
      Class<? extends Object> _forName = Class.forName("[Ljava.lang.String;");
      final Method mainMethod = clazz.getDeclaredMethod("main", _forName);
      final Object[] args = ((Object[])Conversions.unwrapArray(Collections.<Object>singletonList(((Object) argument)), Object.class));
      mainMethod.invoke(null, args);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
