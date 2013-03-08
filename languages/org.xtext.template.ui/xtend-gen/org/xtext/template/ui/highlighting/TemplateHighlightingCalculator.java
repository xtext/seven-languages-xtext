/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.template.ui.highlighting;

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
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
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
        AbstractRule _rule = _ruleCall.getRule();
        TerminalRule _tEXTRule = this.grammarAccess.getTEXTRule();
        boolean _equals = ObjectExtensions.operator_equals(_rule, _tEXTRule);
        _switchResult = _equals;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  public void doProvideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    super.doProvideHighlightingFor(resource, acceptor);
    acceptor.addPosition(0, 4, TemplateHighlightingConfiguration.TEXT);
    acceptor.addPosition(4, 1, TemplateHighlightingConfiguration.ESCAPE);
    IParseResult _parseResult = resource.getParseResult();
    ICompositeNode _rootNode = _parseResult.getRootNode();
    Iterable<ILeafNode> _leafNodes = _rootNode.getLeafNodes();
    for (final ILeafNode leafNode : _leafNodes) {
      boolean _isText = this.isText(leafNode);
      if (_isText) {
        int _offset = leafNode.getOffset();
        acceptor.addPosition(_offset, 1, TemplateHighlightingConfiguration.ESCAPE);
        int _offset_1 = leafNode.getOffset();
        int _plus = (_offset_1 + 1);
        int _length = leafNode.getLength();
        int _minus = (_length - 2);
        acceptor.addPosition(_plus, _minus, TemplateHighlightingConfiguration.TEXT);
        int _offset_2 = leafNode.getOffset();
        int _length_1 = leafNode.getLength();
        int _plus_1 = (_offset_2 + _length_1);
        int _minus_1 = (_plus_1 - 1);
        acceptor.addPosition(_minus_1, 1, TemplateHighlightingConfiguration.ESCAPE);
      }
    }
  }
}
