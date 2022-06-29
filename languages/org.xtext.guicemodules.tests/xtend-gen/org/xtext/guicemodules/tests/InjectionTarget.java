/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.guicemodules.tests;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import java.util.Collection;

@SuppressWarnings("all")
public class InjectionTarget {
  @Inject
  @Named("foo-bar")
  public String s;

  @Inject
  public Collection<?> col;
}
