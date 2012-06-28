package org.xtext.builddsl.ui.highlighting

import com.google.inject.Inject
import java.io.File
import org.eclipse.xtend.lib.Data
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.xbase.XBinaryOperation
import org.eclipse.xtext.xbase.XStringLiteral
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator
import org.xtext.builddsl.services.BuildDSLGrammarAccess

import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*

@SuppressWarnings("restriction")
public class BuildHighlightingCalculator extends XbaseHighlightingCalculator {

	@Inject BuildDSLGrammarAccess grammar;
	
	@Inject FileInterpreter interpreter

	override doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		super.doProvideHighlightingFor(resource, acceptor);
		for(leaf:resource.parseResult.rootNode.leafNodes) 
			if(leaf.grammarElement instanceof RuleCall) {
				val rule = (leaf.grammarElement as RuleCall).rule
				if(rule == grammar.FILERule || rule == grammar.STRINGRule)
					highlightFileToken(leaf, acceptor)
			}
	}
	
	def private highlightFileToken(ILeafNode leaf, IHighlightedPositionAcceptor acceptor) {
		val obj = leaf.findActualSemanticObjectFor
		if(obj instanceof XStringLiteral && obj.eContainer instanceof XBinaryOperation) {
			var file = interpreter.getFile((obj.eContainer as XBinaryOperation).leftOperand)
			val segments = leaf.parse
			for(seg:segments) {
				file = file.enter(seg.name)
				if(file == null)
					acceptor.addPosition(seg.offset, seg.name.length, BuildHighlightingConfiguration::FILE_SEGMENT_UNKNOWN)
				else if(file.exists)
					acceptor.addPosition(seg.offset, seg.name.length, BuildHighlightingConfiguration::FILE_SEGMENT_PRESEND)
				else
					acceptor.addPosition(seg.offset, seg.name.length, BuildHighlightingConfiguration::FILE_SEGMENT_ABSENT) 
			}
		}
	}
	
	def private parse(ILeafNode path) {
		val result = <Segment>newArrayList()
		var offset = path.offset
		var text = path.text
		if(text.startsWith('"')) {
			offset = offset + 1
			text = text.substring(1, text.length)
		} else if(text.startsWith(':/')) {
			offset = offset + 2
			text = text.substring(2, text.length)
		}
		if(text.endsWith('"')) 
			text = text.substring(0, text.length - 1)
		else if(text.endsWith(':')) 
			text = text.substring(0, text.length - 1)
		for(seg:text.split("/")) {
			if(!seg.empty && seg != ":")
				result += new Segment(seg.trim, offset)
			offset = offset + seg.length + 1
		}
		result
	}
	
	def private enter(File parent, String child) {
		if(parent == null)
			null
		else
			new File(parent.absolutePath + "/" + child) 
	}	
}

@Data class Segment {
	String name
	int offset
}
