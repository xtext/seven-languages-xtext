/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.lib;

import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.builddsl.lib.impl.RunUtil;

@SuppressWarnings("all")
public class ClassExtensions {
  public static void runMain(final Class<?> clazz) {
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    RunUtil.runMain(clazz, ((String[])Conversions.unwrapArray(_emptyList, String.class)));
  }
}
