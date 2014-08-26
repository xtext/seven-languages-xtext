/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.lib

import com.mongodb.DBObject

/**
 * Mongobeans <-> DBObject conversion methods.
 */
class WrappingUtil {
	
	def static IMongoBean wrap(DBObject dbObject) {
		val javaClassName = dbObject.get(IMongoBean.JAVA_CLASS_KEY)?.toString
		val javaClass = classLoader.loadClass(javaClassName)
		if(IMongoBean.isAssignableFrom(javaClass)) {
			val constructor = javaClass.getConstructor(DBObject)
			constructor.newInstance(dbObject) as IMongoBean
		} else {
			throw new IllegalStateException('''Stored javaClass '«javaClassName»' does not extend '«IMongoBean.simpleName»'.''')
		}
	}
	
	def static <T extends IMongoBean> T wrapAndCast(DBObject dbObject) {
		wrap(dbObject) as T
	} 
	
	def static DBObject unwrap(Object wrapper) {
		if(!(wrapper instanceof IMongoBean))
			throw new IllegalArgumentException("Invalid type")
		else 
			(wrapper as IMongoBean).getDbObject
	}
	
	static ClassLoader _classLoader = typeof(WrappingUtil).classLoader
	
	def static getClassLoader() {
		_classLoader
	} 
	
	def static setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader
	}
}