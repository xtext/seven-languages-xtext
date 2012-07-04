package org.xtext.builddsl.validation

abstract class BuildDSLIssueCodes {
	
	public static val SELF_DEPENDENCY = typeof(BuildDSLIssueCodes).name + ".selfDependency"
	public static val CYCLIC_DEPENDENCY = typeof(BuildDSLIssueCodes).name + ".cyclicDependency"
	
}