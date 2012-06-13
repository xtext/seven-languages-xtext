package org.xtext.mongobeans;

import com.mongodb.DBObject;

public interface IMongoBean {

	public String JAVA_CLASS_KEY = "JavaClass";

	DBObject getDbObject();
}
