package org.xtext.cradle.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration;

@SuppressWarnings(value = "restriction")
public class CradleHighlightingConfiguration extends XbaseHighlightingConfiguration {
  public final static String FILE_SEGMENT_PRESEND = "file.segment.present";
  
  public final static String FILE_SEGMENT_ABSENT = "file.segment.absent";
  
  public final static String FILE_SEGMENT_UNKNOWN = "file.segment.unknown";
  
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    TextStyle _presentFile = this.presentFile();
    acceptor.acceptDefaultHighlighting(CradleHighlightingConfiguration.FILE_SEGMENT_PRESEND, "Existing File", _presentFile);
    TextStyle _absentFile = this.absentFile();
    acceptor.acceptDefaultHighlighting(CradleHighlightingConfiguration.FILE_SEGMENT_ABSENT, "Non-Existing File", _absentFile);
    TextStyle _unknownFile = this.unknownFile();
    acceptor.acceptDefaultHighlighting(CradleHighlightingConfiguration.FILE_SEGMENT_UNKNOWN, "File with Undetermined Existence", _unknownFile);
    super.configure(acceptor);
  }
  
  public TextStyle presentFile() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(0, 150, 0);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle absentFile() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(255, 0, 0);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle unknownFile() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    RGB _rGB = new RGB(42, 0, 255);
    textStyle.setColor(_rGB);
    return textStyle;
  }
}
