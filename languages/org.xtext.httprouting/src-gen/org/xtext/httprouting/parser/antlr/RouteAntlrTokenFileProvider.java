/*
 * generated by Xtext 2.14.0
 */
package org.xtext.httprouting.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RouteAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/httprouting/parser/antlr/internal/InternalRoute.tokens");
	}
}
