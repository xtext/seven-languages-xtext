/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.lib;

import java.io.File;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class DirectoryCleaner {
  public static void deleteDirectoryContents(final File file) {
    boolean _isDirectory = file.isDirectory();
    if (_isDirectory) {
      final Consumer<File> _function = (File it) -> {
        boolean _isDirectory_1 = it.isDirectory();
        if (_isDirectory_1) {
          DirectoryCleaner.deleteDirectoryContents(it);
        }
        it.delete();
      };
      ((List<File>)Conversions.doWrapArray(file.listFiles())).forEach(_function);
    } else {
      file.delete();
    }
  }
}
