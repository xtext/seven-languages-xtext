package org.xtext.mongobeans.validation

/**
 * Error codes for mongobeans validation.
 */
abstract class MongoBeansIssueCodes {
	
	public static val ILLEGAL_TYPE = typeof(MongoBeansIssueCodes).name + '.illegalType'
	public static val MISSING_TYPE = typeof(MongoBeansIssueCodes).name + '.missingType'
	public static val ILLEGAL_PROPERTY_NAME = typeof(MongoBeansIssueCodes).name + '.illegalPropertyName'
	
}