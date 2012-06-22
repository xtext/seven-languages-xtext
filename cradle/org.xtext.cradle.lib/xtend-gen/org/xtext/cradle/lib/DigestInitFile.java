package org.xtext.cradle.lib;

import java.io.File;
import org.xtext.cradle.lib.DigestInit;

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
