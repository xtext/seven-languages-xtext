package com.acme.impl;

import com.acme.DataProvider;
import com.acme.impl.DataFile;
import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.inject.Inject;
import java.io.File;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FileDataProvider implements DataProvider {
  @Inject
  @DataFile
  private String dataFile;
  
  public String getData() {
    try {
      File _file = new File(this.dataFile);
      List<String> _readLines = Files.readLines(_file, Charsets.UTF_8);
      String _join = IterableExtensions.join(_readLines, "\n");
      return _join;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
