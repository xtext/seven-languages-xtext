package org.xtext.template.jvmmodel

import com.google.inject.Inject
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.Data
import org.eclipse.xtext.common.types.JvmFormalParameter
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
import org.xtext.template.template.BlockStmt
import org.xtext.template.template.ExpressionStmt
import org.xtext.template.template.ForStmt
import org.xtext.template.template.IfStmt
import org.xtext.template.template.IfStmtBody
import org.xtext.template.template.TemplateFile
import org.xtext.template.template.TextStmt

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class TemplateJvmModelInferrer extends AbstractModelInferrer {

       /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	
	@Inject extension TypeReferences
	
	@Inject extension TypeReferenceSerializer

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
   	def dispatch void infer(TemplateFile element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		val simpleName = element.eResource.URI.trimFileExtension.lastSegment
   		val qualifiedName = if(element.^package != null) 
   				element.^package + "." + simpleName
   			else 
   				simpleName
		val root = element.toClass(qualifiedName)
   		acceptor.accept(root).initializeLater([
   				
   				val expressions  = element.allExpressions
   				
   				for(p:element.params) {
   					val field = p.toField(p.name, p.type)
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
   				
   				members += element.toMethod("generate", element.newTypeRef(typeof(String))) [
   					body = [
   						val type = findDeclaredType(typeof(StringBuilder), element)
   						append(type)
   						append(" out = new ")
   						append(type)
   						append("();");
   						newLine 
   						element.body.genStatement(new Context(expressions, it))
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
   				    val method = element.toMethod("set" +p.name.toFirstUpper, element.newTypeRef("void")) [
   				    	parameters += p.toParameter(p.name, p.type)
   				    	body = [
   				    		append('''this.«p.name» = «p.name»;''')
   				    	]	
   					]
   					translateAnnotationsTo(p.annotations, method)
   					members += method
   				}
   				
   				for(es:expressions.values) {
   					members += element.toMethod(es.name, es.type) [
   						visibility = JvmVisibility::PRIVATE
   						for(p: es.params)
   							parameters += element.toParameter(p.name, p.parameterType)
   						body = es.expression
   					] 
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
   	
   	def getAllExpressions(TemplateFile file) {
   		val it = <XExpression, ExpressionInfo>newLinkedHashMap()
   		var i = -1
   		for(es:file.eAllContentsAsList)
   			switch(es) {
   				ExpressionStmt: put(es.expresson, new ExpressionInfo(file.newTypeRef(typeof(Object)), "exp" + (i = i+1), es.expresson.allParameters.toList, es.expresson))
   				IfStmtBody: put(es.condition, new ExpressionInfo(file.newTypeRef("boolean"), "cond" + (i = i+1), es.condition.allParameters.toList, es.condition))
   				ForStmt: put(es.list, new ExpressionInfo(file.newTypeRef(typeof(Iterable), wildCardExtends(es.param.parameterType.copy)), "loop" + (i = i+1), es.list.allParameters.toList, es.list))
   			}
   		it
   	}
   	
   	def Iterable<JvmFormalParameter> getAllParameters(EObject exp){
   		val cnt = exp.eContainer
   		switch(cnt) {
   			TemplateFile: emptyList
   			ForStmt case(cnt.list != exp): cnt.allParameters + newArrayList(cnt.param)
   			default: cnt.allParameters
   		}
   	}
   	
   	def dispatch void genStatement(BlockStmt blockStmt, Context ctx) {
   		for(s:blockStmt.statements) {
   			if(s != blockStmt.statements.head)
   				ctx.out.newLine 
   			genStatement(s, ctx)
   		}
   	}
   	
   	def dispatch void genStatement(TextStmt textStmt, Context it) {
   		out.append("out.append(\"")
   		out.append(textStmt.text.replace("\n", "\\n").replace("\r", "\\r").replace("\"", "\\\""))
   		out.append("\");")
   	}
   	
   	def dispatch void genStatement(ExpressionStmt exprStmt, Context it) {
   		out.append("out.append(")
   		genExpressionCall(exprStmt.expresson, it)
   		out.append(");")
   	}
   	
   	def dispatch void genStatement(IfStmt ifStmt, Context it) {
   		for(body:ifStmt.ifbodies) {
   			if(body != ifStmt.ifbodies.head)
   				out.append(" else ")
	   		out.append("if(")
	   		genExpressionCall(body.condition, it)
	   		out.append(") {")
	   		out.increaseIndentation.newLine
	   		genStatement(body.body, it)
	   		out.decreaseIndentation.newLine
	   		out.append("}")
   		}
   		if(ifStmt.elsebody != null) {
   			out.append(" else {")
   			out.increaseIndentation.newLine
   			genStatement(ifStmt.elsebody, it)
	   		out.decreaseIndentation.newLine
	   		out.append("}")
   		}
   	}
   	
   	def dispatch void genStatement(ForStmt forStmt, Context it) {
   		out.append("for(")
   		forStmt.param.parameterType.serialize(forStmt, out)
   		out.append(" ")
   		out.append(forStmt.param.name)
   		out.append(" : ")
   		genExpressionCall(forStmt.list, it)
   		out.append(") {")
   		out.increaseIndentation
   		out.newLine
   		genStatement(forStmt.stmt, it)
   		out.decreaseIndentation
   		out.newLine
   		out.append("}")
   	}
   	
   	def genExpressionCall(XExpression exp, Context it) {
   		val info = expressions.get(exp)
   		out.append(info.name)
   		out.append("(")
   		out.append(info.params.map[name].join(", "))
   		out.append(")")
   	}
}

@Data class Context {
	Map<XExpression, ExpressionInfo> expressions
	ITreeAppendable out
}

@Data class ExpressionInfo {
	JvmTypeReference type
	String name
	Iterable<JvmFormalParameter> params
	XExpression expression
}