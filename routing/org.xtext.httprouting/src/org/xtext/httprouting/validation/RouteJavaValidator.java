package org.xtext.httprouting.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.httprouting.route.Route;
import org.xtext.httprouting.route.RoutePackage;
import org.xtext.httprouting.route.URL;
import org.xtext.httprouting.route.Variable;

public class RouteJavaValidator extends AbstractRouteJavaValidator {

	@Check
	public void checkVaraibles(Route route) {
		URL url = route.getUrl();
		if (url != null) {
			boolean wildCard = false;
			for (Variable var : url.getVariables()) {
				if (wildCard)
					error("Nothing allowed after an asterisk", var,
							RoutePackage.Literals.VARIABLE__NAME, -1);
				if (!wildCard && var.isWildcard())
					wildCard = true;
			}
		}
	}

}
