package org.xtext.template.ui.highlighting;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator;
import org.xtext.template.services.TemplateGrammarAccess;
import org.xtext.template.ui.highlighting.TemplateHighlightingConfiguration;

@SuppressWarnings("all")
public class TemplateHighlightingCalculator extends XbaseHighlightingCalculator {
  @Inject
  private TemplateGrammarAccess grammarAccess;
  
  public boolean isText(final ILeafNode node) {
    boolean _switchResult = false;
    EObject _grammarElement = node.getGrammarElement();
    final EObject grammarElement = _grammarElement;
    boolean _matched = false;
    if (!_matched) {
      if (grammarElement instanceof RuleCall) {
        final RuleCall _ruleCall = (RuleCall)grammarElement;
        _matched=true;
        final AbstractRule rule = _ruleCall.getRule();
        boolean _or = false;
        boolean _or_1 = false;
        boolean _or_2 = false;
        TerminalRule _tEXT_EXP2EXPRule = this.grammarAccess.getTEXT_EXP2EXPRule();
        boolean _equals = Objects.equal(rule, _tEXT_EXP2EXPRule);
        if (_equals) {
          _or_2 = true;
        } else {
          TerminalRule _tEXT_EXP2STMRule = this.grammarAccess.getTEXT_EXP2STMRule();
          boolean _equals_1 = Objects.equal(rule, _tEXT_EXP2STMRule);
          _or_2 = (_equals || _equals_1);
        }
        if (_or_2) {
          _or_1 = true;
        } else {
          TerminalRule _tEXT_STM2EXPRule = this.grammarAccess.getTEXT_STM2EXPRule();
          boolean _equals_2 = Objects.equal(rule, _tEXT_STM2EXPRule);
          _or_1 = (_or_2 || _equals_2);
        }
        if (_or_1) {
          _or = true;
        } else {
          TerminalRule _tEXT_STM2STMRule = this.grammarAccess.getTEXT_STM2STMRule();
          boolean _equals_3 = Objects.equal(rule, _tEXT_STM2STMRule);
          _or = (_or_1 || _equals_3);
        }
        return _or;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return Boolean.valueOf(_switchResult);
  }
  
  public void doProvideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    super.doProvideHighlightingFor(resource, acceptor);
    IParseResult _parseResult = resource.getParseResult();
    ICompositeNode _rootNode = _parseResult.getRootNode();
    Iterable<ILeafNode> _leafNodes = _rootNode.getLeafNodes();
    for (final ILeafNode leafNode : _leafNodes) {
      boolean _isText = this.isText(leafNode);
      if (_isText) {
        int _offset = leafNode.getOffset();
        acceptor.addPosition(_offset, 2, TemplateHighlightingConfiguration.ESCAPE);
        int _offset_1 = leafNode.getOffset();
        int _plus = (_offset_1 + 2);
        int _length = leafNode.getLength();
        int _minus = (_length - 4);
        acceptor.addPosition(_plus, _minus, TemplateHighlightingConfiguration.TEXT);
        int _offset_2 = leafNode.getOffset();
        int _length_1 = leafNode.getLength();
        int _plus_1 = (_offset_2 + _length_1);
        int _minus_1 = (_plus_1 - 2);
        acceptor.addPosition(_minus_1, 2, TemplateHighlightingConfiguration.ESCAPE);
      }
    }
  }
}
