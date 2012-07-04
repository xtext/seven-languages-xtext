package org.xtext.mongobeans.validation;

import org.eclipse.xtext.xbase.lib.Functions.Function0;

/**
 * Error codes for mongobeans validation.
 */
@SuppressWarnings("all")
public abstract class MongoBeansIssueCodes {
  public final static String ILLEGAL_TYPE = new Function0<String>() {
    public String apply() {
      String _name = MongoBeansIssueCodes.class.getName();
      String _plus = (_name + ".illegalType");
      return _plus;
    }
  }.apply();
  
  public final static String MISSING_TYPE = new Function0<String>() {
    public String apply() {
      String _name = MongoBeansIssueCodes.class.getName();
      String _plus = (_name + ".missingType");
      return _plus;
    }
  }.apply();
  
  public final static String ILLEGAL_PROPERTY_NAME = new Function0<String>() {
    public String apply() {
      String _name = MongoBeansIssueCodes.class.getName();
      String _plus = (_name + ".illegalPropertyName");
      return _plus;
    }
  }.apply();
}
