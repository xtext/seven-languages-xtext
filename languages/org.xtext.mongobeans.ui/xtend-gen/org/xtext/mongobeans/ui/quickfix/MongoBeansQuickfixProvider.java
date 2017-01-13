/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.ui.quickfix;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.annotations.ui.quickfix.XbaseWithAnnotationsQuickfixProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.mongobeans.validation.MongoBeansValidator;

@SuppressWarnings("all")
public class MongoBeansQuickfixProvider extends XbaseWithAnnotationsQuickfixProvider {
  @Fix(MongoBeansValidator.ILLEGAL_PROPERTY_NAME)
  public void capitalizeName(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String _head = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(issue.getData())));
    String _plus = ("Rename to " + _head);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Rename property to ");
    String _head_1 = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(issue.getData())));
    _builder.append(_head_1);
    _builder.append(".");
    final IModification _function = new IModification() {
      @Override
      public void apply(final IModificationContext it) throws Exception {
        it.getXtextDocument().replace((issue.getOffset()).intValue(), (issue.getLength()).intValue(), IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(issue.getData()))));
      }
    };
    acceptor.accept(issue, _plus, _builder.toString(), null, _function);
  }
}
