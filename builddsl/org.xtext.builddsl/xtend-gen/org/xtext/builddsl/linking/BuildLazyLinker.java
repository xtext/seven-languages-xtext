package org.xtext.builddsl.linking;

import com.google.common.base.Objects;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.diagnostics.IDiagnosticProducer;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XbasePackage.Literals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.builddsl.services.BuildDSLGrammarAccess;

@SuppressWarnings("all")
public class BuildLazyLinker extends LazyLinker {
  @Inject
  private BuildDSLGrammarAccess grammar;
  
  public void installProxies(final EObject obj, final IDiagnosticProducer producer, final Multimap<Setting,INode> settingsToLink) {
    super.installProxies(obj, producer, settingsToLink);
    final ICompositeNode node = NodeModelUtils.getNode(obj);
    boolean _equals = Objects.equal(node, null);
    if (_equals) {
      return;
    }
    Iterable<ILeafNode> _leafNodes = node.getLeafNodes();
    final Function1<ILeafNode,Boolean> _function = new Function1<ILeafNode,Boolean>() {
        public Boolean apply(final ILeafNode it) {
          boolean _and = false;
          EObject _grammarElement = it.getGrammarElement();
          if (!(_grammarElement instanceof RuleCall)) {
            _and = false;
          } else {
            EObject _grammarElement_1 = it.getGrammarElement();
            AbstractRule _rule = ((RuleCall) _grammarElement_1).getRule();
            TerminalRule _fILERule = BuildLazyLinker.this.grammar.getFILERule();
            boolean _equals = Objects.equal(_rule, _fILERule);
            _and = ((_grammarElement instanceof RuleCall) && _equals);
          }
          return Boolean.valueOf(_and);
        }
      };
    Iterable<ILeafNode> _filter = IterableExtensions.<ILeafNode>filter(_leafNodes, _function);
    for (final ILeafNode leaf : _filter) {
      {
        EObject _findActualSemanticObjectFor = NodeModelUtils.findActualSemanticObjectFor(leaf);
        final XBinaryOperation op = _findActualSemanticObjectFor==null?(XBinaryOperation)null:EcoreUtil2.<XBinaryOperation>getContainerOfType(_findActualSemanticObjectFor, XBinaryOperation.class);
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(op, null));
        if (!_notEquals) {
          _and = false;
        } else {
          JvmIdentifiableElement _feature = op.getFeature();
          boolean _equals_1 = Objects.equal(_feature, null);
          _and = (_notEquals && _equals_1);
        }
        if (_and) {
          this.createAndSetProxy(op, leaf, Literals.XABSTRACT_FEATURE_CALL__FEATURE);
        }
      }
    }
  }
}
