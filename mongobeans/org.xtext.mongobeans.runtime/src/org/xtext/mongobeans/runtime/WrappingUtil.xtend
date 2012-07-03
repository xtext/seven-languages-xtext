package org.xtext.mongobeans.runtime

import com.mongodb.DBObject

import static org.xtext.mongobeans.runtime.WrappingUtil.*

class WrappingUtil {
	
	def static IMongoBean wrap(DBObject dbObject) {
		val javaClassName = dbObject.get(org::xtext::mongobeans::runtime::IMongoBean::JAVA_CLASS_KEY)?.toString
		val javaClass = classLoader.loadClass(javaClassName)
		if(typeof(IMongoBean).isAssignableFrom(javaClass)) {
			val constructor = javaClass.getConstructor(typeof(DBObject))
			constructor.newInstance(dbObject) as IMongoBean
		} else {
			throw new IllegalStateException('''Stored javaClass '«javaClassName»' does not extend '«typeof(IMongoBean).simpleName»'.''')
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