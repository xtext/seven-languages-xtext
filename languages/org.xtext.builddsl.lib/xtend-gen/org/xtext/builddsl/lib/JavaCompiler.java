/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.lib;

import com.google.common.collect.Iterables;
import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.core.compiler.batch.BatchCompiler;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.builddsl.lib.JavaCompilerParams;

@SuppressWarnings("all")
public class JavaCompiler {
  public static void javac(final Procedure1<? super JavaCompilerParams> init) {
    final JavaCompilerParams params = new JavaCompilerParams();
    init.apply(params);
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    File _destination = params.getDestination();
    boolean _tripleEquals = (_destination == null);
    if (_tripleEquals) {
      list.add("-d");
      list.add("none");
    } else {
      list.add("-d");
      String _string = params.getDestination().toString();
      list.add(_string);
    }
    boolean _isEmpty = params.getClasspath().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      list.add("-classpath");
      String _join = IterableExtensions.join(params.getClasspath(), ":");
      list.add(_join);
    }
    final Function1<File, String> _function = (File it) -> {
      return it.toString();
    };
    Iterable<String> _map = IterableExtensions.<File, String>map(params.getSources(), _function);
    Iterables.<String>addAll(list, _map);
    InputOutput.<String>print("compiling Java files...");
    PrintWriter _printWriter = new PrintWriter(System.out);
    PrintWriter _printWriter_1 = new PrintWriter(System.err);
    final boolean result = BatchCompiler.compile(((String[]) ((String[])Conversions.unwrapArray(list, String.class))), _printWriter, _printWriter_1, null);
    if (result) {
      InputOutput.<String>println("success.");
    } else {
      InputOutput.<String>println("failed.");
    }
  }
  
  public static ClassLoader newClasspath(final File... entries) {
    final Function1<File, URL> _function = (File it) -> {
      try {
        return it.toURI().toURL();
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    List<URL> _map = ListExtensions.<File, URL>map(((List<File>)Conversions.doWrapArray(entries)), _function);
    return new URLClassLoader(((URL[])Conversions.unwrapArray(_map, URL.class)));
  }
}
