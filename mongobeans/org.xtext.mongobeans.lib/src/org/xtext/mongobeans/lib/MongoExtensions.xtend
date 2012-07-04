package org.xtext.mongobeans.lib

import com.mongodb.DBCollection
import org.xtext.mongobeans.lib.IMongoBean

import static extension org.xtext.mongobeans.lib.WrappingUtil.*

/**
 * Example wrapper methods for DB interaction.
 */
class MongoExtensions {
	
	def <T extends IMongoBean> findOne(DBCollection collection, T wrapper) {
		collection.findOne(wrapper.getDbObject)?.wrap as T
	}
	
	def save(DBCollection collection, IMongoBean wrapper) {
		collection.save(wrapper.getDbObject)
	}
	
}