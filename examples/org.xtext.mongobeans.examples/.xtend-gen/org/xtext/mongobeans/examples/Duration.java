/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.examples;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Duration {
  @Accessors
  private int seconds;
  
  public Duration(final int seconds) {
    this.seconds = seconds;
  }
  
  public Duration(final String duration) {
    final String[] split = duration.split(":");
    String _get = split[0];
    int _parseInt = Integer.parseInt(_get);
    int _multiply = (_parseInt * 60);
    String _get_1 = split[1];
    int _parseInt_1 = Integer.parseInt(_get_1);
    int _plus = (_multiply + _parseInt_1);
    this.seconds = _plus;
  }
  
  public String toString() {
    String _string = Integer.toString((this.seconds / 60));
    String _plus = (_string + ":");
    String _string_1 = Integer.toString((this.seconds % 60));
    return (_plus + _string_1);
  }
  
  public Duration operator_plus(final Duration other) {
    return new Duration((this.seconds + other.seconds));
  }
  
  @Pure
  public int getSeconds() {
    return this.seconds;
  }
  
  public void setSeconds(final int seconds) {
    this.seconds = seconds;
  }
}
