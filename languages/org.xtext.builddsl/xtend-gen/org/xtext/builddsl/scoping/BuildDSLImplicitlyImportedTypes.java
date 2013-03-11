/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.scoping;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.Iterables;
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
    List<? extends Class<? extends Object>> _xlistliteral = null;
    Builder<Class<? extends Object>> _builder = ImmutableList.builder();
    _builder.add(FileExtensions.class);
    _builder.add(ClassExtensions.class);
    _xlistliteral = _builder.build();
    Iterable<Class<? extends Object>> _plus = Iterables.<Class<? extends Object>>concat(_extensionClasses, _xlistliteral);
    List<Class<? extends Object>> _list = IterableExtensions.<Class<? extends Object>>toList(_plus);
    return _list;
  }
}
