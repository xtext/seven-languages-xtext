package org.xtext.builddsl.ui.highlighting

import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration

@SuppressWarnings("restriction")
public class BuildHighlightingConfiguration extends XbaseHighlightingConfiguration {

	public static val FILE_SEGMENT_PRESEND = "file.segment.present";
	public static val FILE_SEGMENT_ABSENT = "file.segment.absent";
	public static val FILE_SEGMENT_UNKNOWN = "file.segment.unknown";

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(FILE_SEGMENT_PRESEND, "Existing File", presentFile());
		acceptor.acceptDefaultHighlighting(FILE_SEGMENT_ABSENT, "Non-Existing File", absentFile());
		acceptor.acceptDefaultHighlighting(FILE_SEGMENT_UNKNOWN, "File with Undetermined Existence", unknownFile());
		super.configure(acceptor);
	}

	def TextStyle presentFile() {
		val textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 150, 0));
		return textStyle;
	}
	
	def TextStyle absentFile() {
		val textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(255, 0, 0));
		return textStyle;
	}
	
	def TextStyle unknownFile() {
		val textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(42, 0, 255));
		return textStyle;
	}

}
