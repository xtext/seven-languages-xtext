/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.lib;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class JavaCompilerParams {
  private Collection<File> _sources = new Function0<Collection<File>>() {
    public Collection<File> apply() {
      ArrayList<File> _newArrayList = CollectionLiterals.<File>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public Collection<File> getSources() {
    return this._sources;
  }
  
  public void setSources(final Collection<File> sources) {
    this._sources = sources;
  }
  
  private Collection<File> _classpath = new Function0<Collection<File>>() {
    public Collection<File> apply() {
      ArrayList<File> _newArrayList = CollectionLiterals.<File>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public Collection<File> getClasspath() {
    return this._classpath;
  }
  
  public void setClasspath(final Collection<File> classpath) {
    this._classpath = classpath;
  }
  
  private File _destination;
  
  public File getDestination() {
    return this._destination;
  }
  
  public void setDestination(final File destination) {
    this._destination = destination;
  }
}
