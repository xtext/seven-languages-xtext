package org.xtext.mongobeans.lib;

import com.mongodb.DBObject;

/**
 * Base interface for all generated mongobeans.
 */
public interface IMongoBean {

	public String JAVA_CLASS_KEY = "JavaClass";

	DBObject getDbObject();
}
