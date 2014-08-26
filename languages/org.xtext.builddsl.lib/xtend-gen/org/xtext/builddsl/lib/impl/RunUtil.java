/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.lib.impl;

import java.lang.reflect.Method;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class RunUtil {
  public static void runMain(final Class<?> clazz, final String[] arguments) {
    try {
      final Method mainMethod = clazz.getDeclaredMethod("main", String[].class);
      mainMethod.invoke(null, new Object[] { arguments });
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
