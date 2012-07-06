package org.xtext.mongobeans.ui.quickfix;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.annotations.ui.quickfix.XbaseWithAnnotationsQuickfixProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.mongobeans.validation.MongoBeansValidator;

@SuppressWarnings("all")
public class MongoBeansQuickfixProvider extends XbaseWithAnnotationsQuickfixProvider {
  @Fix(value = MongoBeansValidator.ILLEGAL_PROPERTY_NAME)
  public void capitalizeName(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _head = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(_data)));
    String _plus = ("Rename to " + _head);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Rename property to ");
    String[] _data_1 = issue.getData();
    String _head_1 = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(_data_1)));
    _builder.append(_head_1, "");
    _builder.append(".");
    final Procedure1<IModificationContext> _function = new Procedure1<IModificationContext>() {
        public void apply(final IModificationContext it) {
          try {
            IXtextDocument _xtextDocument = it.getXtextDocument();
            Integer _offset = issue.getOffset();
            Integer _length = issue.getLength();
            String[] _data = issue.getData();
            String _head = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(_data)));
            _xtextDocument.replace((_offset).intValue(), (_length).intValue(), _head);
          } catch (Exception _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
    acceptor.accept(issue, _plus, _builder.toString(), null, new IModification() {
        public void apply(IModificationContext context) {
          _function.apply(context);
        }
    });
  }
}
