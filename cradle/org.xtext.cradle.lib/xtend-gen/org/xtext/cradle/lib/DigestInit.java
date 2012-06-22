package org.xtext.cradle.lib;

import java.io.File;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class DigestInit {
  private final ArrayList<File> _files = new Function0<ArrayList<File>>() {
    public ArrayList<File> apply() {
      ArrayList<File> _newArrayList = CollectionLiterals.<File>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public ArrayList<File> getFiles() {
    return this._files;
  }
}
