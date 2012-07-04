package org.xtext.mongobeans.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.validation.XbaseJavaValidator;
import org.eclipse.xtext.xtype.XtypePackage;
import org.xtext.mongobeans.jvmmodel.MongoTypes;
import org.xtext.mongobeans.mongoBeans.MongoBean;
import org.xtext.mongobeans.mongoBeans.MongoBeansPackage;
import org.xtext.mongobeans.mongoBeans.MongoBeansPackage.Literals;
import org.xtext.mongobeans.mongoBeans.MongoProperty;
import org.xtext.mongobeans.validation.MongoBeansIssueCodes;

@SuppressWarnings("all")
public class MongoBeansValidator extends XbaseJavaValidator {
  @Inject
  private MongoTypes mongoTypes;
  
  @Check
  public void checkMongoProperty(final MongoProperty property) {
    String _name = property.getName();
    boolean _equals = Objects.equal(_name, "_dbObject");
    if (_equals) {
      this.error("Illegal property name \'_dbObject\'", Literals.ABSTRACT_FEATURE__NAME, MongoBeansIssueCodes.ILLEGAL_PROPERTY_NAME);
    }
    final JvmTypeReference type = property.getType();
    boolean _notEquals = (!Objects.equal(type, null));
    if (_notEquals) {
      boolean _isMongoType = this.mongoTypes.isMongoType(type);
      boolean _not = (!_isMongoType);
      if (_not) {
        this.error("Only MongoBeans and mappable types are allowed", Literals.MONGO_PROPERTY__TYPE, MongoBeansIssueCodes.ILLEGAL_TYPE);
      }
    } else {
      MongoBean _inlineType = property.getInlineType();
      boolean _equals_1 = Objects.equal(_inlineType, null);
      if (_equals_1) {
        this.error("Type must be set", Literals.ABSTRACT_FEATURE__NAME, MongoBeansIssueCodes.MISSING_TYPE);
      }
    }
  }
  
  public List<EPackage> getEPackages() {
    final ArrayList<EPackage> result = CollectionLiterals.<EPackage>newArrayList();
    result.add(MongoBeansPackage.eINSTANCE);
    result.add(XbasePackage.eINSTANCE);
    result.add(TypesPackage.eINSTANCE);
    result.add(XtypePackage.eINSTANCE);
    return result;
  }
}
