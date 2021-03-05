/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.template;

import com.google.inject.Inject;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;

@SuppressWarnings("all")
public class TemplateValueConverterService extends XbaseValueConverterService {
  @Inject
  private TextValueConverter textValueConverter;
  
  @ValueConverter(rule = "TEXT")
  public IValueConverter<String> TEXT() {
    return this.textValueConverter;
  }
}
