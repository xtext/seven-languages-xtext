/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.lib;

import java.io.File;
import java.util.Collection;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class JavaCompilerParams {
  private Collection<File> sources = CollectionLiterals.<File>newArrayList();

  private Collection<File> classpath = CollectionLiterals.<File>newArrayList();

  private File destination;

  @Pure
  public Collection<File> getSources() {
    return this.sources;
  }

  public void setSources(final Collection<File> sources) {
    this.sources = sources;
  }

  @Pure
  public Collection<File> getClasspath() {
    return this.classpath;
  }

  public void setClasspath(final Collection<File> classpath) {
    this.classpath = classpath;
  }

  @Pure
  public File getDestination() {
    return this.destination;
  }

  public void setDestination(final File destination) {
    this.destination = destination;
  }
}
