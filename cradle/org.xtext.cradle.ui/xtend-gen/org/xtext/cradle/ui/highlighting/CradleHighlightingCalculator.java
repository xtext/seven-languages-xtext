package org.xtext.cradle.ui.highlighting;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.File;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator;
import org.xtext.cradle.services.CradleGrammarAccess;
import org.xtext.cradle.ui.highlighting.CradleHighlightingConfiguration;
import org.xtext.cradle.ui.highlighting.FileInterpreter;
import org.xtext.cradle.ui.highlighting.Segment;

@SuppressWarnings(value = "restriction")
public class CradleHighlightingCalculator extends XbaseHighlightingCalculator {
  @Inject
  private CradleGrammarAccess grammar;
  
  @Inject
  private FileInterpreter interpreter;
  
  public void doProvideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    super.doProvideHighlightingFor(resource, acceptor);
    IParseResult _parseResult = resource.getParseResult();
    ICompositeNode _rootNode = _parseResult.getRootNode();
    Iterable<ILeafNode> _leafNodes = _rootNode.getLeafNodes();
    for (final ILeafNode leaf : _leafNodes) {
      EObject _grammarElement = leaf.getGrammarElement();
      if ((_grammarElement instanceof RuleCall)) {
        EObject _grammarElement_1 = leaf.getGrammarElement();
        final AbstractRule rule = ((RuleCall) _grammarElement_1).getRule();
        boolean _or = false;
        TerminalRule _fILERule = this.grammar.getFILERule();
        boolean _equals = Objects.equal(rule, _fILERule);
        if (_equals) {
          _or = true;
        } else {
          TerminalRule _sTRINGRule = this.grammar.getSTRINGRule();
          boolean _equals_1 = Objects.equal(rule, _sTRINGRule);
          _or = (_equals || _equals_1);
        }
        if (_or) {
          this.highlightFileToken(leaf, acceptor);
        }
      }
    }
  }
  
  private void highlightFileToken(final ILeafNode leaf, final IHighlightedPositionAcceptor acceptor) {
    final EObject obj = NodeModelUtils.findActualSemanticObjectFor(leaf);
    boolean _and = false;
    if (!(obj instanceof XStringLiteral)) {
      _and = false;
    } else {
      EObject _eContainer = obj.eContainer();
      _and = ((obj instanceof XStringLiteral) && (_eContainer instanceof XBinaryOperation));
    }
    if (_and) {
      EObject _eContainer_1 = obj.eContainer();
      XExpression _leftOperand = ((XBinaryOperation) _eContainer_1).getLeftOperand();
      File file = this.interpreter.getFile(_leftOperand);
      final ArrayList<Segment> segments = this.parse(leaf);
      for (final Segment seg : segments) {
        {
          String _name = seg.getName();
          File _enter = this.enter(file, _name);
          file = _enter;
          boolean _equals = Objects.equal(file, null);
          if (_equals) {
            int _offset = seg.getOffset();
            String _name_1 = seg.getName();
            int _length = _name_1.length();
            acceptor.addPosition(_offset, _length, CradleHighlightingConfiguration.FILE_SEGMENT_UNKNOWN);
          } else {
            boolean _exists = file.exists();
            if (_exists) {
              int _offset_1 = seg.getOffset();
              String _name_2 = seg.getName();
              int _length_1 = _name_2.length();
              acceptor.addPosition(_offset_1, _length_1, CradleHighlightingConfiguration.FILE_SEGMENT_PRESEND);
            } else {
              int _offset_2 = seg.getOffset();
              String _name_3 = seg.getName();
              int _length_2 = _name_3.length();
              acceptor.addPosition(_offset_2, _length_2, CradleHighlightingConfiguration.FILE_SEGMENT_ABSENT);
            }
          }
        }
      }
    }
  }
  
  private ArrayList<Segment> parse(final ILeafNode path) {
    ArrayList<Segment> _xblockexpression = null;
    {
      final ArrayList<Segment> result = CollectionLiterals.<Segment>newArrayList();
      int offset = path.getOffset();
      String text = path.getText();
      boolean _startsWith = text.startsWith("\"");
      if (_startsWith) {
        int _plus = (offset + 1);
        offset = _plus;
        int _length = text.length();
        String _substring = text.substring(1, _length);
        text = _substring;
      } else {
        boolean _startsWith_1 = text.startsWith(":/");
        if (_startsWith_1) {
          int _plus_1 = (offset + 2);
          offset = _plus_1;
          int _length_1 = text.length();
          String _substring_1 = text.substring(2, _length_1);
          text = _substring_1;
        }
      }
      boolean _endsWith = text.endsWith("\"");
      if (_endsWith) {
        int _length_2 = text.length();
        int _minus = (_length_2 - 1);
        String _substring_2 = text.substring(0, _minus);
        text = _substring_2;
      } else {
        boolean _endsWith_1 = text.endsWith(":");
        if (_endsWith_1) {
          int _length_3 = text.length();
          int _minus_1 = (_length_3 - 1);
          String _substring_3 = text.substring(0, _minus_1);
          text = _substring_3;
        }
      }
      String[] _split = text.split("/");
      for (final String seg : _split) {
        {
          boolean _and = false;
          boolean _isEmpty = seg.isEmpty();
          boolean _not = (!_isEmpty);
          if (!_not) {
            _and = false;
          } else {
            boolean _notEquals = (!Objects.equal(seg, ":"));
            _and = (_not && _notEquals);
          }
          if (_and) {
            String _trim = seg.trim();
            Segment _segment = new Segment(_trim, offset);
            result.add(_segment);
          }
          int _length_4 = seg.length();
          int _plus_2 = (offset + _length_4);
          int _plus_3 = (_plus_2 + 1);
          offset = _plus_3;
        }
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  private File enter(final File parent, final String child) {
    File _xifexpression = null;
    boolean _equals = Objects.equal(parent, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      String _absolutePath = parent.getAbsolutePath();
      String _plus = (_absolutePath + "/");
      String _plus_1 = (_plus + child);
      File _file = new File(_plus_1);
      _xifexpression = _file;
    }
    return _xifexpression;
  }
}
