package org.xtext.template.jvmmodel

import com.google.inject.Inject
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.Data
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.lib.Exceptions
import org.eclipse.xtext.xbase.lib.Procedures$Procedure1
import org.eclipse.xtext.xbase.lib.util.ToStringHelper
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.xtext.template.template.BlockStmt
import org.xtext.template.template.ExpressionStmt
import org.xtext.template.template.ForStmt
import org.xtext.template.template.IfStmt
import org.xtext.template.template.IfStmtBody
import org.xtext.template.template.TemplateFile
import org.xtext.template.template.TextStmt

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference

/**
 * <p>Infers a JVM model from the source model.</p> 
 */
class TemplateJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	
	@Inject extension TypeReferences
	
	@Inject extension TypeReferenceSerializer
	
	@Inject extension ITypeProvider

   	def dispatch void infer(TemplateFile element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val simpleName = element.eResource.URI.trimFileExtension.lastSegment
   		val qualifiedName = if(element.^package != null) 
   				element.^package + "." + simpleName
   			else 
   				simpleName
		val root = element.toClass(qualifiedName)
   		acceptor.accept(root).initializeLater([
   				
   				for(p:element.params) {
   					val field = p.toField(p.name, p.type ?: p.defaultexp.type)
   					if(p.defaultexp != null)
   						field.initializer = p.defaultexp
   					members += field
   				}
   				
   				members += element.toConstructor()[]
   				
   				members += element.toConstructor()[
   					parameters += element.toParameter("other", newTypeRef(root))
   					if(!element.params.empty)
	   					body = [
	   						for(p:element.params) {
	   							if(p != element.params.head)
	   								newLine
								append('''this.«p.name» = other.«p.name»;''')
	   						}
	   					]
   				]
   				
   				val expr2call = <XExpression, String>newHashMap()
   				for(expr : element.eAllContents.toIterable)
   					genExpression(new ExpCtx(members, expr2call), expr)
   				
   				members += element.toMethod("generate", element.newTypeRef(typeof(String))) [
   					body = [
   						val type = findDeclaredType(typeof(StringBuilder), element)
   						append(type)
   						append(" out = new ")
   						append(type)
   						append("();");
   						newLine 
   						genStatement(new StmtCtx(it, expr2call), element.body)
   						newLine
   						append("return out.toString();");
   					]
   				]
   				
   				members += element.toMethod("generate", element.newTypeRef(typeof(String))) [
   					parameters += element.toParameter("init", element.newTypeRef(typeof(Procedures$Procedure1), newTypeRef(root)))
   					body = [
   						append("try {").increaseIndentation.newLine
   						append(root)
   						append(" tpl = getClass().getConstructor(getClass()).newInstance(this);").newLine
   						append("init.apply(tpl);").newLine
   						append("return tpl.generate();")
   						decreaseIndentation.newLine.append("} catch(Exception e) {").increaseIndentation.newLine
   						append("throw ")
   						append(findDeclaredType(typeof(Exceptions), element))
   						append(".sneakyThrow(e);")
   						decreaseIndentation.newLine.append("}")
   					]
   				]
   				
				for(p:element.params) {
   				    val method = element.toMethod("set" +p.name.toFirstUpper, element.newTypeRef(Void::TYPE)) [
   				    	parameters += p.toParameter(p.name, p.type ?: p.defaultexp.type)
   				    	body = [
						append('''this.«p.name» = «p.name»;''')
   				    	]	
   					]
   					translateAnnotationsTo(p.annotations, method)
   					members += method
   				}
   				
   				members += element.toMethod("toString", element.newTypeRef(typeof(String))) [
   					body = [
   						val type = findDeclaredType(typeof(ToStringHelper), element)
   						append("return new ")
   						append(type)
   						append("().toString(this);");
   					]
   				]
   			])
   	}
   	
   	def Iterable<ForStmt> getAllParameters(EObject exp){
   		val cnt = exp.eContainer
   		switch(cnt) {
   			TemplateFile: emptyList
   			ForStmt case(cnt.source != exp): cnt.allParameters + newArrayList(cnt)
   			default: cnt.allParameters
   		}
   	}
   	
   	def dispatch void genStatement(StmtCtx it, BlockStmt blockStmt) {
   		for(s:blockStmt.statements) {
   			if(s != blockStmt.statements.head)
   				out.newLine 
   			genStatement(s)
   		}
   	}
   	
   	def dispatch void genStatement(StmtCtx it, TextStmt textStmt) {
   		out.append("out.append(\"")
   		out.append(textStmt.text.replace("\n", "\\n").replace("\r", "\\r").replace("\"", "\\\""))
   		out.append("\");")
   	}
   	
   	def dispatch void genStatement(StmtCtx it, ExpressionStmt exprStmt) {
   		out.append("out.append(")
   		out.append(expr2call.get(exprStmt.body))
   		out.append(");")
   	}
   	
   	def dispatch void genStatement(StmtCtx it, IfStmt ifStmt) {
   		for(body:ifStmt.ifbodies) {
   			if(body != ifStmt.ifbodies.head)
   				out.append(" else ")
	   		out.append("if(")
	   		out.append(expr2call.get(body.condition))
	   		out.append(") {")
	   		out.increaseIndentation.newLine
	   		genStatement(body.body)
	   		out.decreaseIndentation.newLine
	   		out.append("}")
   		}
   		if(ifStmt.elsebody != null) {
   			out.append(" else {")
   			out.increaseIndentation.newLine
   			genStatement(ifStmt.elsebody)
	   		out.decreaseIndentation.newLine
	   		out.append("}")
   		}
   	}
   	
   	def dispatch void genStatement(StmtCtx it, ForStmt forStmt) {
   		out.append("for(")
   		forStmt.parameterType.serialize(forStmt, out)
   		out.append(" ")
   		out.append(forStmt.param.name)
   		out.append(" : ")
   		out.append(expr2call.get(forStmt.source))
   		out.append(") {")
   		out.increaseIndentation
   		out.newLine
   		genStatement(forStmt.body)
   		out.decreaseIndentation
   		out.newLine
   		out.append("}")
   	}
   	
   	def dispatch void genExpression(ExpCtx it, ForStmt forStmt) {
   		genExpression("loop", forStmt.source, forStmt.newTypeRef(typeof(Iterable), wildCardExtends(forStmt.parameterType)))
   	}
   	
   	def dispatch void genExpression(ExpCtx it, IfStmtBody ifStmt) {
   		genExpression("cond", ifStmt.condition, ifStmt.newTypeRef(Boolean::TYPE))
   	}
   	
   	def dispatch void genExpression(ExpCtx it, ExpressionStmt expStmt) {
   		genExpression("exp", expStmt.body, expStmt.newTypeRef(typeof(Object)))
   	}
   	
   	def dispatch void genExpression(ExpCtx it, EObject expStmt) {
   	}
   	
   	def genExpression(ExpCtx it, String prefix, XExpression exp, JvmTypeReference type) {
   		val name = newMemberName(members, prefix)
   		val params = exp.allParameters
   		members += exp.toMethod(name, type) [
			visibility = JvmVisibility::PRIVATE
			for(p: params)
				parameters += exp.toParameter(p.param.name, p.parameterType)
			body = exp
		]
		getExpr2call.put(exp, name + "(" + params.map[param.name].join(", ") + ")") 
   	}
   	
   	def newMemberName(List<JvmMember> members, String prefix) { 
		val names = members.map[simpleName].toSet
		prefix + (0..Integer::MAX_VALUE).findFirst[!names.contains(prefix + it)]
	}
	
	def getParameterType(ForStmt stmt) {
		if(stmt.param.parameterType != null)
			stmt.param.parameterType.cloneWithProxies
		else {
			val type = stmt.source.getType()
			if(type instanceof JvmParameterizedTypeReference)
				(type as JvmParameterizedTypeReference).arguments.get(0)
			else {
				println("invalid for-expression-type: " + type)
				null as JvmTypeReference
			}
		}
	}
}

@Data class ExpCtx {
	List<JvmMember> members
	Map<XExpression, String> expr2call
}

@Data class StmtCtx {
	ITreeAppendable out
	Map<XExpression, String> expr2call
}