package org.xtext.builddsl.validation;

import org.eclipse.xtext.xbase.lib.Functions.Function0;

/**
 * Issue codes for errors in build DSL files.
 */
@SuppressWarnings("all")
public abstract class BuildDSLIssueCodes {
  public final static String SELF_DEPENDENCY = new Function0<String>() {
    public String apply() {
      String _name = BuildDSLIssueCodes.class.getName();
      String _plus = (_name + ".selfDependency");
      return _plus;
    }
  }.apply();
  
  public final static String CYCLIC_DEPENDENCY = new Function0<String>() {
    public String apply() {
      String _name = BuildDSLIssueCodes.class.getName();
      String _plus = (_name + ".cyclicDependency");
      return _plus;
    }
  }.apply();
}
