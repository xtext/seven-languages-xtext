/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.scoping;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures;
import org.xtext.builddsl.lib.ClassExtensions;
import org.xtext.builddsl.lib.FileExtensions;

@SuppressWarnings("all")
public class BuildDSLImplicitlyImportedFeatures extends ImplicitlyImportedFeatures {
  /**
   * Add methods from {@link FileExtensions} and {@link ClassExtensions} to the extension scope.
   */
  @Override
  protected List<Class<?>> getExtensionClasses() {
    List<Class<?>> _extensionClasses = super.getExtensionClasses();
    return IterableExtensions.<Class<?>>toList(Iterables.<Class<?>>concat(_extensionClasses, Collections.<Class<?>>unmodifiableList(CollectionLiterals.<Class<?>>newArrayList(FileExtensions.class, ClassExtensions.class))));
  }
}
