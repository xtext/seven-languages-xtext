/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.mongobeans.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.Primitives
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.IAppendable
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
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
	
	@Inject extension TypeReferenceSerializer
	
	@Inject extension MongoTypes
	
	@Inject extension Primitives
	
	@Inject extension IJvmModelAssociations associations

	def dispatch void infer(MongoFile file, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		for(bean : file.eAllOfType(typeof(MongoBean))) {
			acceptor.accept(bean.toClass(bean.fullyQualifiedName)).initializeLater [
				documentation = bean.documentation
				superTypes += bean.newTypeRef('org.xtext.mongobeans.lib.IMongoBean')
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
		inferredType.members += bean.toConstructor [
			documentation = '''Creates a new «bean.name» wrapping the given {@link DBObject}.'''
			parameters += toParameter("dbObject", newTypeRef(bean, 'com.mongodb.DBObject'))
			body = [
				append('this._dbObject = dbObject;')
			]
		]
		inferredType.members += bean.toConstructor [
			documentation = '''Creates a new «bean.name» wrapping a new {@link BasicDBObject}.'''
			body = [
				append('_dbObject = new ')
				appendTypeRef(bean, 'com.mongodb.BasicDBObject')
				append('();').newLine
				append('''
					_dbObject.put(JAVA_CLASS_KEY, "«inferredType.identifier»");
				''')
			]
		]
	}

	def protected addDbObjectProperty(JvmDeclaredType inferredType, MongoBean bean) {
		inferredType.members += bean.toField('_dbObject', newTypeRef(bean, 'com.mongodb.DBObject'))
		inferredType.members += bean.toGetter('dbObject', '_dbObject', newTypeRef(bean, 'com.mongodb.DBObject'))
	}

	def protected addListAccessor(JvmDeclaredType inferredType, MongoProperty property) {
		if(isMongoPrimitiveType(property.jvmType)) {
			inferredType.members += property.toMethod('get' + property.name.toFirstUpper, 
				newTypeRef(property, 'java.util.List', property.jvmType.asWrapperTypeIfPrimitive)
			) [
				documentation = property.documentation
				body = [
					append('return (')
					appendTypeRef(property, 'java.util.List', property.jvmType.asWrapperTypeIfPrimitive)
					append(''') _dbObject.get("«property.name»");''')
				]
			]		
		} else {
			
			inferredType.members += property.toField('_' + property.name, 
				newTypeRef(property, 'org.xtext.mongobeans.lib.MongoBeanList', property.jvmType))
				
			inferredType.members += property.toMethod('get' + property.name.toFirstUpper,
				newTypeRef(property, 'java.util.List', property.jvmType)
			) [
				documentation = property.documentation
				body = [
					append('''
						if(_«property.name»==null)
							_«property.name» = new ''')
					appendTypeRef(property, 'org.xtext.mongobeans.lib.MongoBeanList', property.jvmType) 
					append('(_dbObject, "' + property.name + '");').newLine
					append('return _' + property.name + ';')
				]
			]
		}
	}	
	
	def protected addDelegateAccessors(JvmDeclaredType inferredType, MongoProperty property) {
		inferredType.members += property.toMethod('get' + property.name.toFirstUpper, property.jvmType) [
			documentation = property.documentation
			body = [
				append('return ')
				if(property.jvmType.mongoBean) {
					appendTypeRef(property, 'org.xtext.mongobeans.lib.WrappingUtil')
					append('.wrapAndCast((')
					appendTypeRef(property, 'com.mongodb.DBObject')
					append(''') _dbObject.get("«property.name»"));''')
				} else {
					append('(')
					appendTypeRef(property, property.jvmType.asWrapperTypeIfPrimitive)
					append(''') _dbObject.get("«property.name»");''')
				} 
			]
		]
		inferredType.members += property.toMethod('set' + property.name.toFirstUpper, null) [
			documentation = property.documentation
			parameters += toParameter(property.name, property.jvmType)
			body = [
				append(''' _dbObject.put("«property.name»", ''')
				if(property.jvmType.mongoBean) {
					appendTypeRef(property, 'org.xtext.mongobeans.lib.WrappingUtil')
					append(".unwrap(")
					append(property.name)
					append(')')
				} else {
					append(property.name)
				}
				append(');')
			]
		]
	}

	def protected addMethod(JvmDeclaredType inferredType, MongoOperation operation) {
		inferredType.members += operation.toMethod(operation.name, operation.returnType) [
			documentation = operation.documentation
			for(parameter: operation.parameters)
				parameters += parameter.toParameter(parameter.name, parameter.parameterType)
			body = operation.body
		]
	}

	def protected getJvmType(MongoProperty property) {
		if(property.inlineType != null)
			(property.inlineType.jvmElements.head as JvmDeclaredType).newTypeRef
		else		
			property.type
	}

	def protected appendTypeRef(IAppendable appendable, EObject context, String name, JvmTypeReference... typeArguments) {
		serialize(context.newTypeRef(name, typeArguments), context, appendable)
	}

	def protected appendTypeRef(IAppendable appendable, EObject context, JvmTypeReference typeRef) {
		serialize(typeRef, context, appendable)
	}
}

