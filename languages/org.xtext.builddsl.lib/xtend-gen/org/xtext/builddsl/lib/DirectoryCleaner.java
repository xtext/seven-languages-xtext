/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.lib;

import java.io.File;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DirectoryCleaner {
  public static void deleteDirectoryContents(final File file) {
    boolean _isDirectory = file.isDirectory();
    if (_isDirectory) {
      final Procedure1<File> _function = new Procedure1<File>() {
        @Override
        public void apply(final File it) {
          boolean _isDirectory = it.isDirectory();
          if (_isDirectory) {
            DirectoryCleaner.deleteDirectoryContents(it);
          }
          it.delete();
        }
      };
      IterableExtensions.<File>forEach(((Iterable<File>)Conversions.doWrapArray(file.listFiles())), _function);
    } else {
      file.delete();
    }
  }
}
