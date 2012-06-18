package org.xtext.template.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.template.template.BlockStmt
import org.xtext.template.template.ExpressionStmt
import org.xtext.template.template.TemplateFile
import org.xtext.template.template.TextStmt

import static extension org.eclipse.xtext.EcoreUtil2.*
import java.util.Map
import org.eclipse.xtext.xbase.lib.util.ToStringHelper
import org.xtext.template.template.IfStmt
import org.eclipse.xtext.xbase.XExpression

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
   		val expressionNames = element.expressionNames
   		acceptor.accept(element.toClass(qualifiedName))
   			.initializeLater([
   				for(p:element.params) {
   					val field = p.toField(p.name, p.type)
//   					translateAnnotationsTo(p.annotations, field)
   					members += field
   				}
   				
   				
   				members += element.toMethod("generate", element.newTypeRef(typeof(String))) [
   					body = [
   						val type = findDeclaredType(typeof(StringBuilder), element)
   						append(type)
   						append(" out = new ")
   						append(type)
   						append("();");
   						newLine 
   						element.body.genStatement(new Context(expressionNames, it))
   						newLine
   						append("return out.toString();");
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
   				
   				for(es:element.getAllContentsOfType(typeof(ExpressionStmt))) {
   					members += element.toMethod(expressionNames.get(es.expresson), element.newTypeRef(typeof(String))) [
   						body = 	es.expresson
   					] 
   				}
   				
   				for(es:element.getAllContentsOfType(typeof(IfStmt))) {
   					members += element.toMethod(expressionNames.get(es.^if), element.newTypeRef("boolean")) [
   						body = 	es.^if
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
   	
   	def getExpressionNames(TemplateFile file) {
   		val result = <XExpression, String>newHashMap()
   		var i = -1
   		for(es:file.eAllContentsAsList)
   			switch(es) {
   				ExpressionStmt: result.put(es.expresson, "stmt" + (i = i + 1)) 
   				IfStmt: result.put(es.^if, "ifcondition" + (i = i + 1)) 
   			}
   		result
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
   		out.append(textStmt.text.replace("\n", "\\n").replace("\r", "\\r"))
   		out.append("\");")
   	}
   	
   	def dispatch void genStatement(ExpressionStmt exprStmt, Context it) {
   		out.append("out.append(")
   		out.append(expressionNames.get(exprStmt.expresson))
   		out.append("());")
   	}
   	
   	def dispatch void genStatement(IfStmt ifStmt, Context it) {
   		out.append("if(")
   		out.append(expressionNames.get(ifStmt.^if))
   		out.append("()) {")
   		out.increaseIndentation
   		out.newLine
   		genStatement(ifStmt.then, it)
   		if(ifStmt.^else != null) {
   			out.decreaseIndentation
   			out.newLine
   			out.append("} else {")
   			out.increaseIndentation
   			out.newLine
   			genStatement(ifStmt.^else, it)
   		}
   		out.decreaseIndentation
   		out.newLine
   		out.append("}")
   	}
}

@Data class Context {
	Map<XExpression, String> expressionNames
	ITreeAppendable out
}

