package org.xtext.builddsl.lib;

import java.io.File;
import org.xtext.builddsl.lib.DigestInit;

@SuppressWarnings("all")
public class DigestInitFile extends DigestInit {
  private File _digest;
  
  public File getDigest() {
    return this._digest;
  }
  
  public void setDigest(final File digest) {
    this._digest = digest;
  }
}
