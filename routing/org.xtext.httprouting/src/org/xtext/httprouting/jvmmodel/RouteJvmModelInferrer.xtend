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
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmVoid
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

	static val String HTTP_REQUEST = "javax.servlet.http.HttpServletRequest"

	@Inject extension JvmTypesBuilder
	
   	def dispatch void infer(Model model, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(model.toClass("org.xtext.httpRouting.HttpMapperServlet"))
   			.initializeLater [
   				superTypes += model.newTypeRef("javax.servlet.http.HttpServlet")
   				annotations += model.toAnnotation(typeof(SuppressWarnings), "serial")
   				val routes = model.routes
   				var routeCounter = 0
   				for (route : routes) {
   					if (route.url != null) {
	   					addRouteMethod(route, routeCounter)
	   					addRouteConditionMethod(route, routeCounter)
	   					addRouteKeyField(route, routeCounter)
		   				addRoutePatternField(route, routeCounter)
	   				}
					routeCounter = routeCounter + 1
   				}
   				addMethod("doGet", model, routes,Type::GET)
   				addMethod("doPost", model, routes,Type::POST)
   				addMethod("doPut", model, routes,Type::PUT)
   				addMethod("doDelete", model, routes,Type::DELETE)
   				addMethod("doHead", model, routes,Type::HEAD)
   			]
   	}
   	
   	def protected addRouteMethod(JvmDeclaredType servlet, Route route, int routeCounter) {
   		val name = route.nameOfRouteMethod(routeCounter)
		servlet.members += route.toMethod(name, route.newTypeRef(Void::TYPE)) [
			documentation = route.documentation
			if (route.hasValidKey)
				parameters += route.key.toParameter("it", route.key.type)
			parameters += route.toParameter("request", route.newTypeRef(HTTP_REQUEST))
			for (variable : route.url.variables) {
				parameters += variable.toParameter(variable.name, route.newTypeRef(typeof(String)))
			}
			body = route.call
		]
   	}
   	
   	def protected addRouteConditionMethod(JvmDeclaredType servlet, Route route, int routeCounter) {
		if (route.condition != null && route.condition.expression != null) {
		   	val name = route.nameOfRouteMethod(routeCounter)
			servlet.members += route.toMethod(name + "Condition", route.newTypeRef(Boolean::TYPE)) [
				parameters += route.toParameter("request", route.newTypeRef(HTTP_REQUEST))
				for (variable : route.url.variables){
					parameters += variable.toParameter(variable.name, route.newTypeRef(typeof(String)))
				}
				body = route.condition.expression
			]
		}
   	}
   	
   	def protected addRouteKeyField(JvmDeclaredType servlet, Route route, int routeCounter) {
		if (route.hasValidKey){
			servlet.members += route.key.toField("_key" + routeCounter, route.key.type) => [
				annotations += route.toAnnotation(typeof(Inject))
				route.key.annotations.translateAnnotationsTo(it)
			]
		}
   	}
   	
   	def protected addRoutePatternField(JvmDeclaredType servlet, Route route, int routeCounter) {
		val patternField = route.url.toField("_pattern" + routeCounter , route.newTypeRef(typeof(Pattern))) [
			setStatic(true)
			setInitializer [
				append('Pattern.compile("')
				append(getRegExPattern(NodeModelUtils::getNode(route.url).text.trim, route.url.variables))
				append('")')
			]
		]
		servlet.members += patternField
   	}
   	
   	def protected addMethod(JvmDeclaredType servlet, String name, EObject element, Iterable<Route> routes, Type filterType) {
   		servlet.members += element.toMethod(name,element.newTypeRef(Void::TYPE)) [
			parameters += element.toParameter("request", element.newTypeRef(HTTP_REQUEST))
			parameters += element.toParameter("response", element.newTypeRef("javax.servlet.http.HttpServletResponse"))
			body = [
				var x = 0
				if (routes.exists[e | e.type == filterType]) 
					append('String url =  request.getRequestURI();').newLine
				for (route : routes) {
					if (route.type == filterType) {
						if (route.url != null) {
							append(element.newTypeRef(typeof(Matcher)).type)
							append(''' _matcher«x» = _pattern«x».matcher(url);''')
							newLine
							val variables = route.url.variables
						    append('''if (_matcher«x».find()) {''').newLine
					    	for (variable : variables) {
								append('''		String «variable.name» = _matcher«x».group(«variables.indexOf(variable) + 1»);''')
								newLine
							}
							if (route.condition != null) {
								append('''		if («route.nameOfRouteMethod(x)»Condition(request''')
				   				append('''«FOR v : route.url.variables BEFORE ", " SEPARATOR ", "»«v.name»«ENDFOR»''')
				   				append('''))''')
				   				newLine
				   			}
							append('''			«route.nameOfRouteMethod(x)»(''')
							if(route.hasValidKey)
								append('''_key«x»,''')
							append('''request''')
			   				append('''«FOR v : route.url.variables BEFORE ", " SEPARATOR ", " »«v.name»«ENDFOR»''')
			   				append(''');''')
			   				newLine
							append('''}''')
							newLine
						}
					}
					x = x + 1
				}
			]
		]
   	}
   	
   	def protected nameOfRouteMethod(Route route, int routeCounter) {
		"_do" + route.type.literal.toLowerCase.toFirstUpper + routeCounter
	}
	
	def protected hasValidKey(Route route){
   		route.key != null && route.key.type != null && !(route.key.type instanceof JvmVoid)
   	}
	
   	def protected getRegExPattern(String originalPattern, List<Variable> variables) {
		var pattern = originalPattern
		for (variable : variables) {
			if (variable.wildcard)
				pattern = pattern.replaceAll("(:" + variable.name + "\\*)", "(.+)")
			else
				pattern = originalPattern.replaceAll("(:" + variable.name + ")", "(\\\\\\\\w+)")
		}
		pattern
	}
}

