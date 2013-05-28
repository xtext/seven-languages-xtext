/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.scoping;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedTypes;
import org.xtext.builddsl.lib.ClassExtensions;
import org.xtext.builddsl.lib.FileExtensions;

@SuppressWarnings("all")
public class BuildDSLImplicitlyImportedTypes extends ImplicitlyImportedTypes {
  /**
   * Add methods from {@link FileExtensions} and {@link ClassExtensions} to the extension scope.
   */
  protected List<Class<? extends Object>> getExtensionClasses() {
    List<Class<? extends Object>> _extensionClasses = super.getExtensionClasses();
    Iterable<Class<? extends Object>> _plus = Iterables.<Class<? extends Object>>concat(_extensionClasses, Collections.<Class<? extends Object>>unmodifiableList(Lists.<Class<? extends Object>>newArrayList(FileExtensions.class, ClassExtensions.class)));
    List<Class<? extends Object>> _list = IterableExtensions.<Class<? extends Object>>toList(_plus);
    return _list;
  }
}
