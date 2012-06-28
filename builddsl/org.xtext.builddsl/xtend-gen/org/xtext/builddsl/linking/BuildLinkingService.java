package org.xtext.builddsl.linking;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.xtext.builddsl.services.BuildDSLGrammarAccess;

@SuppressWarnings("all")
public class BuildLinkingService extends DefaultLinkingService {
  @Inject
  private BuildDSLGrammarAccess grammar;
  
  public String getCrossRefNodeAsString(final INode node) throws IllegalNodeException {
    String _xifexpression = null;
    boolean _and = false;
    EObject _grammarElement = node.getGrammarElement();
    if (!(_grammarElement instanceof RuleCall)) {
      _and = false;
    } else {
      EObject _grammarElement_1 = node.getGrammarElement();
      AbstractRule _rule = ((RuleCall) _grammarElement_1).getRule();
      TerminalRule _fILERule = this.grammar.getFILERule();
      boolean _equals = Objects.equal(_rule, _fILERule);
      _and = ((_grammarElement instanceof RuleCall) && _equals);
    }
    if (_and) {
      _xifexpression = "/";
    } else {
      String _crossRefNodeAsString = super.getCrossRefNodeAsString(node);
      _xifexpression = _crossRefNodeAsString;
    }
    return _xifexpression;
  }
}
