/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.httprouting.jvmmodel

import com.google.inject.Inject
import java.util.List
import java.util.regex.Pattern
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.httprouting.route.Dependency
import org.xtext.httprouting.route.Model
import org.xtext.httprouting.route.RequestType
import org.xtext.httprouting.route.Route
import org.xtext.httprouting.route.Variable

import static org.xtext.httprouting.jvmmodel.RouteJvmModelInferrer.*

import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*
import org.xtext.httprouting.route.URL

/**
 * Translates a file of routes to a Java Servlet class with 
 * the desired dispatching logic.
 */
class RouteJvmModelInferrer extends AbstractModelInferrer {

	static val String HTTP_REQUEST = "javax.servlet.http.HttpServletRequest"
	static val String HTTP_RESPONSE = "javax.servlet.http.HttpServletResponse"
	static val String HTTP_SERVLET = "javax.servlet.http.HttpServlet"

	@Inject extension JvmTypesBuilder

	/**
	 * The main entry point for this class.
	 */
	def dispatch void infer(Model model, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(model.toClass(model.javaClassName))
			.initializeLater [
				superTypes += model.newTypeRef(HTTP_SERVLET)
				// get rid of the annoying serial warning
				annotations += model.toAnnotation(typeof(SuppressWarnings), "serial")

				// translate the dependencies to fields annotated with @Inejct
				for (field : model.declarations.filter(typeof(Dependency))) {
					members += field.toField(field.name, field.type) [
						annotations += field.toAnnotation(typeof(Inject))
						field.annotations.translateAnnotationsTo(it)
					]
				}

				// declare fields for the URL regexp, a method for each when-part 
				// and of course the call part of a route
				for (route : model.routes.filter[ url != null ]) {
					members += route.toRoutePatternField
					if (route.condition != null)
						members += route.toRouteConditionMethod
					members += route.toRouteCallMethod
				}
				
				// implement the servlet handler methods depending on the request type
				val getRoutes = model.routes.filter[ requestType == RequestType::GET ]
				if (!getRoutes.empty)
					members += model.toRequestHandlerMethod("doGet",  getRoutes)
					
				val postRoutes = model.routes.filter[ requestType == RequestType::POST ]
				if (!postRoutes.empty)
					members += model.toRequestHandlerMethod("doPost", postRoutes)
				
				val putRoutes = model.routes.filter[ requestType == RequestType::PUT ]
				if (!putRoutes.empty)
					members += model.toRequestHandlerMethod("doPut",  putRoutes)
				
				val deleteRoutes = model.routes.filter[ requestType == RequestType::DELETE ]
				if (!deleteRoutes.empty)
					members += model.toRequestHandlerMethod("doDelete", deleteRoutes)
				
				val headRoutes = model.routes.filter[ requestType == RequestType::HEAD ]
				if (!headRoutes.empty)
					members += model.toRequestHandlerMethod("doHead", headRoutes)
			]
	}

	/**
	 * computes the Servlet name
	 */
	def javaClassName(Model it) {
		'routes.'+eResource.URI.trimFileExtension.lastSegment
	}
	
	/**
	 * Creates a method for the route's target call.
	 * Gives scope and live to the expression.
	 */
	def protected toRouteCallMethod(Route route) {
		route.toMethod(route.nameOfRouteMethod, route.newTypeRef(Void::TYPE)) [
			parameters += route.toParameter("request", route.newTypeRef(HTTP_REQUEST))
			parameters += route.toParameter("response", route.newTypeRef(HTTP_RESPONSE))
			for (variable : route.url.variables) {
				parameters += variable.toParameter(variable.name, route.newTypeRef(typeof(String)))
			}
			body = route.call
		]
	}

	/**
	 * Creates a field for the URL pattern
	 */
	def protected toRoutePatternField(Route route) {
		route.url.toField("_pattern" + route.index , route.newTypeRef(typeof(Pattern))) [
			setStatic(true)
			setInitializer [
				append('''Pattern.compile("«getRegExPattern(route.url.node.text.trim, route.url.variables)»")''')
			]
		]
	}

	/**
	 * Creates a method for a route's when-part.
	 * Gives scope and live to the expression.
	 */
	def protected toRouteConditionMethod(Route route) {
		route.toMethod(route.nameOfRouteMethod + "Condition", route.newTypeRef(Boolean::TYPE)) [
			parameters += route.toParameter("request", route.newTypeRef(HTTP_REQUEST))
			parameters += route.toParameter("response", route.newTypeRef(HTTP_RESPONSE))
			for (variable : route.url.variables){
				parameters += variable.toParameter(variable.name, route.newTypeRef(typeof(String)))
			}
			body = route.condition
		]
	}

	/**
	 * Creates a servlet request handling method for the given routes
	 */
	def protected toRequestHandlerMethod(Model model, String name, Iterable<Route> routes) {
		model.toMethod(name,model.newTypeRef(Void::TYPE)) [
			annotations += model.toAnnotation(typeof(Override))
			parameters += model.toParameter("request", model.newTypeRef(HTTP_REQUEST))
			parameters += model.toParameter("response", model.newTypeRef(HTTP_RESPONSE))
			body = [append('''
				String url =  request.getRequestURL().toString();
				«FOR route : routes»
					{
						java.util.regex.Matcher _matcher = _pattern«route.index».matcher(url);
						if (_matcher.find()) {
							«FOR variable : route.url.variables»
									String «variable.name» = _matcher.group(«variable.index + 1»);
							«ENDFOR»
							«IF route.condition != null»
								if («route.nameOfRouteMethod»Condition(request, response«FOR v : route.url.variables BEFORE ", " SEPARATOR ", "»«v.name»«ENDFOR»))
							«ENDIF»
							«route.nameOfRouteMethod»(request, response«FOR v : route.url.variables», «v.name»«ENDFOR»);
						}
					}
				«ENDFOR»
			''')]
		]
	}

	def protected nameOfRouteMethod(Route route) {
		"_do" + route.requestType.literal.toLowerCase.toFirstUpper + route.index
	}

	/**
	 * a generic method computing the index of an AST object between its siblings
	 */
	def protected index(EObject obj) {
		obj.eContainer.eContents.indexOf(obj)
	}

	def protected getRegExPattern(String originalPattern, List<Variable> variables) {
		var pattern = originalPattern
		for (variable : variables) {
			if (variable.isWildcard)
				pattern = pattern.replaceAll("(:" + variable.name + "\\*)", "(.+)")
			else
				pattern = originalPattern.replaceAll("(:" + variable.name + ")", "(\\\\\\\\w+)")
		}
		return pattern
	}

	def routes(Model model) {
		model.declarations.filter(typeof(Route))
	}

	def isWildcard(Variable it) {
		switch eContainer {
			URL : eContainer.variables.last == it && eContainer.wildcard
			default : false
		}
	}
}

