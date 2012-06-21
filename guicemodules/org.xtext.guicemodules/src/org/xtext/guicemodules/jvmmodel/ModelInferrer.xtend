package org.xtext.guicemodules.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.Data
import org.eclipse.xtext.common.types.JvmExecutable
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.compiler.output.TreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.eclipse.xtext.xbase.lib.Pair
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

@Data class CodeGenerationContext {
  extension ReflectExtensions re = new ReflectExtensions
  EObject ctx
  TreeAppendable appendable
  ImportManager importManager
  TypeReferenceSerializer serializer
  TypeReferences typeReferences
  
  new(EObject ctx, TreeAppendable appendable, TypeReferenceSerializer serializer, TypeReferences typeReferences) {
    _typeReferences = typeReferences
    _serializer = serializer
    _ctx = ctx
    _appendable = appendable
    _importManager = appendable.get('state').get('importManager')
  }
  
  def void addImport(String qn) {
    val typeRef = type(qn)
    importManager.addImportFor(typeRef.type)
  }
  
  def JvmTypeReference type(String qn, JvmTypeReference ... typeArgs) {
    typeReferences.getTypeForName(qn, ctx, typeArgs)
  }
  
  def String _(String qn) {
    val typeRef = type(qn)
    return _(typeRef)
  }
  
  def String _(JvmTypeReference typeRef) {
    val tempAppendable = new StringBuilderBasedAppendable(importManager)
    serializer.serialize(typeRef, ctx, tempAppendable)
    return tempAppendable.toString
  }
  
  def JvmTypeReference _extends(JvmTypeReference upper) {
    _typeReferences.wildCardExtends(upper)
  }
  
  def JvmTypeReference _extends(String upper) {
    _typeReferences.wildCardExtends(upper.type)
  }
  
  def JvmTypeReference operator_lessThan(String left, JvmTypeReference right) {
    _typeReferences.createTypeRef(left.type.type, right)
  }
  def JvmTypeReference operator_lessThan(String left, String right) {
    _typeReferences.createTypeRef(left.type.type, right.type)
  }
  def JvmTypeReference operator_lessThan(JvmTypeReference left, String right) {
    _typeReferences.createTypeRef(left.type, right.type)
  }
  def JvmTypeReference operator_lessThan(JvmTypeReference left, JvmTypeReference right) {
    _typeReferences.createTypeRef(left.type, right)
  }
  
  def wildcard() {
    _typeReferences.wildCard
  }
}

class ModelInferrer extends AbstractModelInferrer {
	
	@Inject extension TypeReferences
	@Inject TypeReferenceSerializer serializer
	@Inject extension JvmTypesBuilder
	
	def (ITreeAppendable)=>void body(JvmExecutable exec, (CodeGenerationContext)=>String strategy) {
	  [append(strategy.apply(new CodeGenerationContext(exec,it as TreeAppendable, serializer, _typeReferences)))]
	}
	
	def type(EObject ctx, String qn, JvmTypeReference ... args) {
	  qn.getTypeForName(ctx, args)
	}
	
	def void parameters(JvmExecutable container, Pair<String,String> typeAndName) {
	  val typeRef = container.type(typeAndName.key)
	  val param = container.toParameter(typeAndName.value, typeRef)
	  container.parameters += param
	}
	
	def wildcard() {
    _typeReferences.wildCard
  }
}