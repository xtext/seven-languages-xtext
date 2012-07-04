package org.xtext.template.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xtype.XtypePackage;
import org.xtext.template.template.TemplatePackage;

@SuppressWarnings("all")
public class TemplateValidator extends XbaseWithAnnotationsJavaValidator {
  protected boolean isImplicitReturn(final XExpression expr) {
    return false;
  }
  
  public void checkInnerExpressions(final XExpression expr) {
  }
  
  public List<EPackage> getEPackages() {
    ArrayList<EPackage> _xblockexpression = null;
    {
      final ArrayList<EPackage> result = CollectionLiterals.<EPackage>newArrayList();
      result.add(TemplatePackage.eINSTANCE);
      result.add(XAnnotationsPackage.eINSTANCE);
      result.add(XbasePackage.eINSTANCE);
      result.add(TypesPackage.eINSTANCE);
      result.add(XtypePackage.eINSTANCE);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
}
