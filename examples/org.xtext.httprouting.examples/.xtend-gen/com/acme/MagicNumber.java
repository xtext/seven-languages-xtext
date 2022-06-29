/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.acme;

import com.google.inject.Inject;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;

@SuppressWarnings("all")
public class MagicNumber {
  @Inject
  private HttpServletRequest request;

  public Integer getNumber() {
    Object _attribute = this.request.getSession().getAttribute("number");
    return ((Integer) _attribute);
  }

  public void seedNumber() {
    int _nextInt = new Random().nextInt();
    int _modulo = (_nextInt % 100);
    final int number = Math.abs(_modulo);
    this.request.getSession().setAttribute("number", Integer.valueOf(number));
  }

  public void cleanNumber() {
    this.request.getSession().removeAttribute("number");
  }
}
