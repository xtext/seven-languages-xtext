/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.template.ui.highlighting;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.ide.highlighting.XbaseHighlightingCalculator;
import org.xtext.template.services.TemplateGrammarAccess;

@SuppressWarnings("all")
public class TemplateHighlightingCalculator extends XbaseHighlightingCalculator {
  @Inject
  private TemplateGrammarAccess grammarAccess;
  
  public boolean isText(final ILeafNode node) {
    boolean _switchResult = false;
    EObject _grammarElement = node.getGrammarElement();
    final EObject grammarElement = _grammarElement;
    boolean _matched = false;
    if (grammarElement instanceof RuleCall) {
      _matched=true;
      AbstractRule _rule = ((RuleCall)grammarElement).getRule();
      TerminalRule _tEXTRule = this.grammarAccess.getTEXTRule();
      _switchResult = Objects.equal(_rule, _tEXTRule);
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
  
  @Override
  protected void doProvideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    super.doProvideHighlightingFor(resource, acceptor, cancelIndicator);
    acceptor.addPosition(0, 4, TemplateHighlightingConfiguration.TEXT);
    acceptor.addPosition(4, 1, TemplateHighlightingConfiguration.ESCAPE);
    Iterable<ILeafNode> _leafNodes = resource.getParseResult().getRootNode().getLeafNodes();
    for (final ILeafNode leafNode : _leafNodes) {
      boolean _isText = this.isText(leafNode);
      if (_isText) {
        acceptor.addPosition(leafNode.getOffset(), 1, TemplateHighlightingConfiguration.ESCAPE);
        int _offset = leafNode.getOffset();
        int _plus = (_offset + 1);
        int _length = leafNode.getLength();
        int _minus = (_length - 2);
        acceptor.addPosition(_plus, _minus, TemplateHighlightingConfiguration.TEXT);
        int _offset_1 = leafNode.getOffset();
        int _length_1 = leafNode.getLength();
        int _plus_1 = (_offset_1 + _length_1);
        int _minus_1 = (_plus_1 - 1);
        acceptor.addPosition(_minus_1, 1, TemplateHighlightingConfiguration.ESCAPE);
      }
    }
  }
}
