package org.xtext.mongobeans.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.xbase.annotations.ui.quickfix.XbaseWithAnnotationsQuickfixProvider
import org.xtext.mongobeans.validation.MongoBeansValidator

class MongoBeansQuickfixProvider extends XbaseWithAnnotationsQuickfixProvider {

	@Fix(MongoBeansValidator::ILLEGAL_PROPERTY_NAME)
	def void capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Rename to ' + issue.data.head, '''Rename property to «issue.data.head».''', null) [
			xtextDocument.replace(issue.offset, issue.length, issue.data.head)	
		]
	}
}