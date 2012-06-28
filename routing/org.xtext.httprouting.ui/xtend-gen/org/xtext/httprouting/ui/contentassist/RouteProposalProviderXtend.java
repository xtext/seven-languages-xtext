package org.xtext.httprouting.ui.contentassist;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.eclipse.xtext.ui.editor.contentassist.AbstractJavaBasedContentProposalProvider.ReferenceProposalCreator;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.XbasePackage.Literals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.xtext.httprouting.ui.contentassist.AbstractRouteProposalProvider;

@SuppressWarnings("all")
public class RouteProposalProviderXtend extends AbstractRouteProposalProvider {
  public void completeRouteFeatureCall_Feature(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    String _featureCallRuleName = this.getFeatureCallRuleName();
    final Function<IEObjectDescription,ICompletionProposal> proposalFactory = this.getProposalFactory(_featureCallRuleName, context);
    XbaseScopeProvider _scopeProvider = this.getScopeProvider();
    XtextResource _resource = context.getResource();
    int _minus = (-1);
    IScope _createSimpleFeatureCallScope = _scopeProvider.createSimpleFeatureCallScope(model, Literals.XABSTRACT_FEATURE_CALL__FEATURE, _resource, false, _minus);
    final Function1<IEObjectDescription,Boolean> _function = new Function1<IEObjectDescription,Boolean>() {
        public Boolean apply(final IEObjectDescription input) {
          QualifiedName _qualifiedName = input.getQualifiedName();
          boolean _equals = _qualifiedName.equals(XbaseScopeProvider.IT);
          boolean _not = (!_equals);
          return _not;
        }
      };
    FilteringScope _filteringScope = new FilteringScope(_createSimpleFeatureCallScope, new Predicate<IEObjectDescription>() {
        public boolean apply(IEObjectDescription input) {
          return _function.apply(input);
        }
    });
    final FilteringScope scope = _filteringScope;
    ReferenceProposalCreator _crossReferenceProposalCreator = this.getCrossReferenceProposalCreator();
    Predicate<IEObjectDescription> _featureDescriptionPredicate = this.getFeatureDescriptionPredicate(context);
    _crossReferenceProposalCreator.lookupCrossReference(scope, model, Literals.XABSTRACT_FEATURE_CALL__FEATURE, acceptor, _featureDescriptionPredicate, proposalFactory);
  }
  
  public Predicate<IEObjectDescription> getFeatureDescriptionPredicate(final ContentAssistContext contentAssistContext) {
    String _prefix = contentAssistContext.getPrefix();
    boolean _startsWith = _prefix.startsWith("_");
    if (_startsWith) {
      return super.getFeatureDescriptionPredicate(contentAssistContext);
    }
    final Predicate<IEObjectDescription> delegate = super.getFeatureDescriptionPredicate(contentAssistContext);
    final Function1<IEObjectDescription,Boolean> _function = new Function1<IEObjectDescription,Boolean>() {
        public Boolean apply(final IEObjectDescription input) {
          boolean _and = false;
          QualifiedName _name = input.getName();
          String _firstSegment = _name.getFirstSegment();
          boolean _startsWith = _firstSegment.startsWith("_");
          boolean _not = (!_startsWith);
          if (!_not) {
            _and = false;
          } else {
            boolean _apply = delegate.apply(input);
            _and = (_not && _apply);
          }
          return _and;
        }
      };
    return new Predicate<IEObjectDescription>() {
        public boolean apply(IEObjectDescription input) {
          return _function.apply(input);
        }
    };
  }
}
