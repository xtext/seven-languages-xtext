/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.RawSuperTypes

/** 
 * Helper methods to decide if types are compatible with the mongoDB driver. 
 */
class MongoTypes {
	@Inject extension RawSuperTypes
	
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
		return type.collectNames.contains('org.xtext.mongobeans.lib.IMongoBean')
	}

}