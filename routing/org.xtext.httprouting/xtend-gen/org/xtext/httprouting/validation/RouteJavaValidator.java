package org.xtext.httprouting.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xtype.XtypePackage;
import org.xtext.httprouting.route.Route;
import org.xtext.httprouting.route.RoutePackage;
import org.xtext.httprouting.route.RoutePackage.Literals;
import org.xtext.httprouting.route.URL;
import org.xtext.httprouting.route.Variable;

/**
 * @author Holger Schill - Initial contribution and API
 */
@SuppressWarnings("all")
public class RouteJavaValidator extends XbaseWithAnnotationsJavaValidator {
  public List<EPackage> getEPackages() {
    final ArrayList<EPackage> result = CollectionLiterals.<EPackage>newArrayList();
    result.add(RoutePackage.eINSTANCE);
    result.add(XbasePackage.eINSTANCE);
    result.add(XAnnotationsPackage.eINSTANCE);
    result.add(TypesPackage.eINSTANCE);
    result.add(XtypePackage.eINSTANCE);
    return result;
  }
  
  @Check
  public void checkVariables(final Route route) {
    final URL url = route.getUrl();
    boolean _notEquals = (!Objects.equal(url, null));
    if (_notEquals) {
      boolean wildCard = false;
      EList<Variable> _variables = url.getVariables();
      for (final Variable variable : _variables) {
        {
          if (wildCard) {
            int _minus = (-1);
            this.error("A placeholder should not be placed after a wildcard", variable, 
              Literals.VARIABLE__NAME, _minus);
          }
          boolean _and = false;
          boolean _not = (!wildCard);
          if (!_not) {
            _and = false;
          } else {
            boolean _isWildcard = variable.isWildcard();
            _and = (_not && _isWildcard);
          }
          if (_and) {
            wildCard = true;
          }
        }
      }
    }
  }
  
  protected boolean isImplicitReturn(final XExpression expr) {
    return false;
  }
}
