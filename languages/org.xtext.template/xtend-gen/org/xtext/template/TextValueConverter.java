/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.template;

import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.util.Strings;

/**
 * removes the surrounding terminals in template text
 */
@SuppressWarnings("all")
public class TextValueConverter extends STRINGValueConverter {
  protected String toEscapedString(final String value) {
    String _convertToJavaString = Strings.convertToJavaString(value, false);
    String _plus = ("\u00BB" + _convertToJavaString);
    String _plus_1 = (_plus + "\u00AB");
    return _plus_1;
  }
}
