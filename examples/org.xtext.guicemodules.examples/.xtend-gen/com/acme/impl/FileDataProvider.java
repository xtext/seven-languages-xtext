/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.acme.impl;

import com.acme.DataProvider;
import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.inject.Inject;
import java.io.File;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FileDataProvider implements DataProvider {
  @Inject
  @DataFile
  private String dataFile;
  
  @Override
  public String getData() {
    try {
      return IterableExtensions.join(Files.readLines(new File(this.dataFile), Charsets.UTF_8), "\n");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
