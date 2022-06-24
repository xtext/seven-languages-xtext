/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.template.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration;

@SuppressWarnings("all")
public class TemplateHighlightingConfiguration extends XbaseHighlightingConfiguration {
  public static final String TEXT = "template.text";

  public static final String ESCAPE = "teamplate.escape";

  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    acceptor.acceptDefaultHighlighting(TemplateHighlightingConfiguration.TEXT, "Text", this.staticText());
    acceptor.acceptDefaultHighlighting(TemplateHighlightingConfiguration.ESCAPE, "Statement/Expression Escape Symbols", this.staticEscape());
    final IHighlightingConfigurationAcceptor _function = (String id, String name, TextStyle style) -> {
      RGB _rGB = new RGB(230, 230, 230);
      style.setBackgroundColor(_rGB);
      acceptor.acceptDefaultHighlighting(id, name, style);
    };
    super.configure(_function);
  }

  public TextStyle staticText() {
    TextStyle _copy = this.defaultTextStyle().copy();
    final Procedure1<TextStyle> _function = (TextStyle it) -> {
      RGB _rGB = new RGB(0, 0, 0);
      it.setColor(_rGB);
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }

  public TextStyle staticEscape() {
    TextStyle _copy = this.defaultTextStyle().copy();
    final Procedure1<TextStyle> _function = (TextStyle it) -> {
      RGB _rGB = new RGB(180, 180, 180);
      it.setColor(_rGB);
      RGB _rGB_1 = new RGB(230, 230, 230);
      it.setBackgroundColor(_rGB_1);
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }
}
