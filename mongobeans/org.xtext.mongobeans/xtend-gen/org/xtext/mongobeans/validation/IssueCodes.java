package org.xtext.mongobeans.validation;

import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class IssueCodes {
  public final static String ILLEGAL_TYPE = new Function0<String>() {
    public String apply() {
      String _name = IssueCodes.class.getName();
      String _plus = (_name + ".illegalType");
      return _plus;
    }
  }.apply();
  
  public final static String MISSING_TYPE = new Function0<String>() {
    public String apply() {
      String _name = IssueCodes.class.getName();
      String _plus = (_name + ".missingType");
      return _plus;
    }
  }.apply();
  
  public final static String ILLEGAL_PROPERTY_NAME = new Function0<String>() {
    public String apply() {
      String _name = IssueCodes.class.getName();
      String _plus = (_name + ".illegalPropertyName");
      return _plus;
    }
  }.apply();
}
