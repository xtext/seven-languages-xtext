/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.jvmmodel

import java.util.Set
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference

/** 
 * Helper methods to decide if types are compatible with the mongoDB driver. 
 */
class MongoTypes {
	
	public static val mongoPrimitiveTypes = #{
		'double',
		'java.lang.Double',
		'java.lang.String',
		'byte[]',
		'boolean',
		'java.lang.Boolean',
		'java.util.Date',
		'void',
		'java.lang.Void',
		'java.util.regex.Pattern',
		'int',
		'java.lang.Integer',
		'long',
		'java.lang.Long'
	}
	
	def isMongoPrimitiveType(JvmTypeReference typeRef) {
		mongoPrimitiveTypes.contains(typeRef.qualifiedName)
	}
	
	def isMongoType(JvmTypeReference typeRef) {
		typeRef.isMongoPrimitiveType || typeRef.type.isMongoBean
	}
	
	def isMongoBean(JvmType type) {
		return internalIsMongoBean(type, newHashSet)
	}
	
	def boolean internalIsMongoBean(JvmType type, Set<JvmType> checked) {
		if (!checked.add(type))
			return false;
		return type.qualifiedName == 'org.xtext.mongobeans.lib.IMongoBean'
	}
	
}