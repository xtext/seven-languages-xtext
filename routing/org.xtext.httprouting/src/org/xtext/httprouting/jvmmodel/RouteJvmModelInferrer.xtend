/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.httprouting.jvmmodel

import com.google.inject.Inject
import java.util.List
import java.util.regex.Matcher
import java.util.regex.Pattern
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmAnnotationTarget
import org.eclipse.xtext.common.types.JvmAnnotationType
import org.eclipse.xtext.common.types.JvmVoid
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.httprouting.route.Model
import org.xtext.httprouting.route.Route
import org.xtext.httprouting.route.Type
import org.xtext.httprouting.route.Variable

import static org.xtext.httprouting.jvmmodel.RouteJvmModelInferrer.*
/**
 * @author Holger Schill - Initial contribution and API
 */
class RouteJvmModelInferrer extends AbstractModelInferrer {

	private static String REQUEST = "javax.servlet.http.HttpServletRequest"

	@Inject 
	extension JvmTypesBuilder
	
	@Inject
	protected TypesFactory typesFactory;
	
	def nameOfRouteMethod(Route route, int i) {
		"do" + route.type.literal.toLowerCase.toFirstUpper + i
	}
	
   	def dispatch void infer(Model model, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(model.toClass("org.xtext.httpRouting.HttpMapperServlet"))
   			.initializeLater([
   				superTypes+= model.newTypeRef("javax.servlet.http.HttpServlet")
   				//private static final long serialVersionUID = 1L;
   				members+= model.toField("serialVersionUID", model.newTypeRef("long"))[
   					setStatic(true)
   					final = true
   					setInitializer([
   						append('''1L''')
   					])
   				]
   				var i = 0
   				val routes = model.routes
   				for(route : routes){
   					if(route.url != null){
   						val name = route.nameOfRouteMethod(i)
	   					members += route.toMethod(name, model.newTypeRef(Void::TYPE))[
	   						documentation = route.documentation
	   						if(route.validKey)
	   							parameters+=route.key.toParameter("it", route.key.type)
	   						parameters += model.toParameter("request",model.newTypeRef(REQUEST))
	   						for(variable : route.url.variables){
	   								parameters += variable.toParameter(variable.name, model.newTypeRef(typeof(String)))
	   						}
	   						body = route.call
	   					]
	   					if(route.condition != null && route.condition.expression != null){
	   						members+= route.toMethod(name + "Condition",model.newTypeRef(Boolean::TYPE))[
	   							parameters += model.toParameter("request",model.newTypeRef(REQUEST))
	   							for(variable : route.url.variables){
	   								parameters += variable.toParameter(variable.name, model.newTypeRef(typeof(String)))
	   							}
	   							body = route.condition.expression
	   						]
	   					}
	   					if(route.isValidKey){
	   						val keyField = route.key.toField("key" + i, route.key.type)
			   				keyField.addInjectAnnotation(model)
			   				route.key.annotations.translateAnnotationsTo(keyField)
		   					members+= keyField
	   					}
   						val patternField = route.url.toField("pattern" + i , model.newTypeRef(typeof(Pattern)))[
   							setStatic(true)
   							setInitializer([append('''Pattern.compile("«getRegExPattern(NodeModelUtils::getNode(route.url).text.trim,route.url.variables)»")''')])
   						]
   						members+= patternField
   					}
   					i = i + 1;
   				}
   				members+= createMethod("doGet", model, routes,Type::GET)
   				members+= createMethod("doPost", model, routes,Type::POST)
   				members+= createMethod("doPut", model, routes,Type::PUT)
   				members+= createMethod("doDelete", model, routes,Type::DELETE)
   				members+= createMethod("doHead", model, routes,Type::HEAD)
   			])
   	}
   	
   	def isValidKey(Route route){
   		route.key != null && route.key.type != null && !(route.key.type instanceof JvmVoid)
   	}
   	
   	def addInjectAnnotation(JvmAnnotationTarget target,EObject context){
   		val injectAnnotation = context.newTypeRef(typeof(Inject))
		if(injectAnnotation != null && !(injectAnnotation.type instanceof JvmVoid)){
			val inject = typesFactory.createJvmAnnotationReference();
			inject.setAnnotation(injectAnnotation.type as JvmAnnotationType)
			target.annotations += inject
		}
   	}
   	
   	def createMethod(String name, EObject element, Iterable<Route> routes, Type filterType){
   		element.toMethod(name,element.newTypeRef(Void::TYPE))[
			parameters += element.toParameter("request",element.newTypeRef(REQUEST))
			parameters += element.toParameter("response",element.newTypeRef("javax.servlet.http.HttpServletResponse"))
			body = [
				var x = 0
				if(routes.exists(e | e.type== filterType))
					append('''String url =  request.getRequestURI();
					''')
				for(route : routes){
					if(route.type == filterType)
						if(route.url != null){
							append(element.newTypeRef(typeof(Matcher)).type).append(''' matcher«x» = pattern«x».matcher(url);
							''')
							val variables = route.url.variables
							    append('''if(matcher«x».find()){
							    	''')
						    	for( variable : variables){
									append('''		String «variable.name» =matcher«x».group(«variables.indexOf(variable) + 1»);
									''')
								}
								if(route.condition != null){
									append('''		if(«route.nameOfRouteMethod(x)»Condition(request''')
					   				append('''«FOR v : route.url.variables BEFORE ", " SEPARATOR ", "»«v.name»«ENDFOR »''')
					   				append('''))
					   				''');
					   			}
								append('''			«route.nameOfRouteMethod(x)»(''')
								if(route.validKey)
									append('''key«x»,''') 
								append('''request''')
				   				append('''«FOR v : route.url.variables BEFORE ", " SEPARATOR ", " »«v.name»«ENDFOR»''')
				   				append(''');
				   				''')	
   								append('''}''');
						}
						x = x + 1
				}
				
			]
		]
   	}
   	
   	def getRegExPattern(String originalPattern, List<Variable> variables) {
		var pattern = originalPattern
		for(variable : variables){
			if(variable.wildcard)
				pattern = pattern.replaceAll("(:" + variable.name + "\\*)", "(.+)")
			else
				pattern = originalPattern.replaceAll("(:" + variable.name + ")", "(\\\\\\\\w+)")
		}
		pattern
	}
}

