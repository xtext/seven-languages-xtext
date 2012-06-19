/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.template.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration;

@SuppressWarnings("restriction")
public class TemplateHighlightingConfiguration extends XbaseHighlightingConfiguration {

	public static final String TEXT = "template.text";
	public static final String ESCAPE = "teamplate.escape";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(TEXT, "Text", staticText());
		acceptor.acceptDefaultHighlighting(ESCAPE, "Statement/Expression Escape Symbols", staticEscape());
		super.configure(acceptor);
	}

	public TextStyle staticText() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 0, 0));
		textStyle.setBackgroundColor(new RGB(220, 220, 220));
		return textStyle;
	}

	public TextStyle staticEscape() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(180, 180, 180));
		return textStyle;
	}
}
