/*
 * generated by Xtext
 */
package org.xtext.httprouting.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.xtext.httprouting.services.RouteGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class RouteFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		RouteGrammarAccess grammarAccess = (RouteGrammarAccess) getGrammarAccess();
		c.setLinewrap(0, 1, 2).before(grammarAccess.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(grammarAccess.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(grammarAccess.getML_COMMENTRule());
		c.setLinewrap().after(grammarAccess.getRouteRule());
	}
}