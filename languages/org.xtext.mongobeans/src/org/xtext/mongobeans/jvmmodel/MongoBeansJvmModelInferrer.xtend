/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.jvmmodel

import com.google.inject.Inject
import com.mongodb.BasicDBObject
import com.mongodb.DBObject
import java.util.List
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.util.Primitives
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.mongobeans.lib.IMongoBean
import org.xtext.mongobeans.lib.MongoBeanList
import org.xtext.mongobeans.lib.WrappingUtil
import org.xtext.mongobeans.mongoBeans.MongoBean
import org.xtext.mongobeans.mongoBeans.MongoFile
import org.xtext.mongobeans.mongoBeans.MongoOperation
import org.xtext.mongobeans.mongoBeans.MongoProperty

import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * Infers a Java class for each {@link MongoBean} in the given {@link MongoFile}.
 * The class wraps a {@link DBObject}. 
 */
class MongoBeansJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder

	@Inject extension IQualifiedNameProvider
	
	@Inject extension MongoTypes
	
	@Inject extension Primitives
	
	@Inject extension IJvmModelAssociations associations

	def dispatch void infer(MongoFile file, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		for(bean : file.eAllOfType(MongoBean)) {
			acceptor.accept(bean.toClass(bean.fullyQualifiedName)) [
				documentation = bean.documentation
				superTypes += typeRef(IMongoBean)
				addConstructors(bean)
				addDbObjectProperty(bean)
				for(feature: bean.features) {
					switch feature {
						MongoProperty:
							if (feature.many)
								addListAccessor(feature)
							else
								addDelegateAccessors(feature)
						MongoOperation:
							addMethod(feature)
					}
				}
			]
		}
	}
	
	def protected addConstructors(JvmDeclaredType inferredType, MongoBean bean) {
		val typeRef1 = typeRef(DBObject)
		inferredType.members += bean.toConstructor [
			documentation = '''Creates a new «bean.name» wrapping the given {@link «DBObject.name»}.'''
			parameters += bean.toParameter("dbObject", typeRef1)

			body = '''
				this._dbObject = dbObject;
			'''
		]
		inferredType.members += bean.toConstructor [
			documentation = '''Creates a new «bean.name» wrapping a new {@link «BasicDBObject.name»}.'''
			body = '''
				_dbObject = new «BasicDBObject»();
				_dbObject.put(JAVA_CLASS_KEY, "«inferredType.identifier»");
			'''
		]
	}

	def protected addDbObjectProperty(JvmDeclaredType inferredType, MongoBean bean) {
		inferredType.members += bean.toField('_dbObject', typeRef(DBObject))
		inferredType.members += bean.toGetter('dbObject', '_dbObject', typeRef(DBObject))
	}

	def protected addListAccessor(JvmDeclaredType inferredType, MongoProperty property) {
		val propertyType = property.jvmType.asWrapperTypeIfPrimitive
		if(propertyType.isMongoPrimitiveType) {
			inferredType.members += property.toMethod('get' + property.name.toFirstUpper, 
				typeRef(List, propertyType)
			) [
				documentation = property.documentation
				body = '''
					return («List»<«propertyType»>) _dbObject.get("«property.name»");
				'''
			]		
		} else {
			
			inferredType.members += property.toField('_' + property.name, 
				typeRef(MongoBeanList, propertyType))
				
			inferredType.members += property.toMethod('get' + property.name.toFirstUpper,
				typeRef(List, propertyType)
			) [
				documentation = property.documentation
				body = '''
					if(_«property.name»==null)
						_«property.name» = new «MongoBeanList»<«propertyType»>(_dbObject, "«property.name»");
					return _«property.name»;
				'''
			]
		}
	}	
	
	def protected addDelegateAccessors(JvmDeclaredType inferredType, MongoProperty property) {
		inferredType.members += property.toMethod('get' + property.name.toFirstUpper, property.jvmType) [
			documentation = property.documentation
			body = '''
				«IF property.jvmType.type.isMongoBean»
					return «WrappingUtil».wrapAndCast((«DBObject») _dbObject.get("«property.name»"));
				«ELSE»
					return («property.jvmType.asWrapperTypeIfPrimitive») _dbObject.get("«property.name»");
				«ENDIF»
			'''
		]
		inferredType.members += property.toMethod('set' + property.name.toFirstUpper, typeRef(Void.TYPE)) [
			documentation = property.documentation
			parameters += property.toParameter(property.name, property.jvmType)
			body = '''
				«IF property.jvmType.type.isMongoBean»
					_dbObject.put("«property.name»", «WrappingUtil».unwrap(«property.name»));
				«ELSE»
					_dbObject.put("«property.name»", «property.name»);
				«ENDIF»
			'''
		]
	}

	def protected addMethod(JvmDeclaredType inferredType, MongoOperation operation) {
		inferredType.members += operation.toMethod(operation.name, operation.returnType) [
			documentation = operation.documentation
			parameters += operation.parameters.map[operation.toParameter(name, parameterType)]
			body = operation.body
		]
	}

	def protected getJvmType(MongoProperty property) {
		if(property.inlineType !== null)
			typeRef(property.inlineType.jvmElements.head as JvmDeclaredType)
		else		
			property.type
	}

}

