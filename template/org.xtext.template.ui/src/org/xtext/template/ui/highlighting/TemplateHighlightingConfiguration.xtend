package org.xtext.template.ui.highlighting

import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB

class TemplateHighlightingConfiguration extends XbaseHighlightingConfiguration {

	public static val TEXT = 'template.text'
	public static val ESCAPE = 'teamplate.escape'

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(TEXT, 'Text', staticText)
		acceptor.acceptDefaultHighlighting(ESCAPE, 'Statement/Expression Escape Symbols', staticEscape)
		super.configure(acceptor)
	}

	def TextStyle staticText() {
		defaultTextStyle.copy => [
			color= new RGB(0, 0, 0)
			backgroundColor = new RGB(220, 220, 220)
		]
	}

	def TextStyle staticEscape() {
		defaultTextStyle.copy => [
			color = new RGB(180, 180, 180)
		]
	}
}
