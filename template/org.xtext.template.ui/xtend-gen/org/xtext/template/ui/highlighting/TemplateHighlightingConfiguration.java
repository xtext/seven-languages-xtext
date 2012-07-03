package org.xtext.template.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration;

@SuppressWarnings("all")
public class TemplateHighlightingConfiguration extends XbaseHighlightingConfiguration {
  public final static String TEXT = "template.text";
  
  public final static String ESCAPE = "teamplate.escape";
  
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    TextStyle _staticText = this.staticText();
    acceptor.acceptDefaultHighlighting(TemplateHighlightingConfiguration.TEXT, "Text", _staticText);
    TextStyle _staticEscape = this.staticEscape();
    acceptor.acceptDefaultHighlighting(TemplateHighlightingConfiguration.ESCAPE, "Statement/Expression Escape Symbols", _staticEscape);
    super.configure(acceptor);
  }
  
  public TextStyle staticText() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    TextStyle _copy = _defaultTextStyle.copy();
    final Procedure1<TextStyle> _function = new Procedure1<TextStyle>() {
        public void apply(final TextStyle it) {
          RGB _rGB = new RGB(0, 0, 0);
          it.setColor(_rGB);
          RGB _rGB_1 = new RGB(220, 220, 220);
          it.setBackgroundColor(_rGB_1);
        }
      };
    TextStyle _doubleArrow = ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
    return _doubleArrow;
  }
  
  public TextStyle staticEscape() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    TextStyle _copy = _defaultTextStyle.copy();
    final Procedure1<TextStyle> _function = new Procedure1<TextStyle>() {
        public void apply(final TextStyle it) {
          RGB _rGB = new RGB(180, 180, 180);
          it.setColor(_rGB);
        }
      };
    TextStyle _doubleArrow = ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
    return _doubleArrow;
  }
}
