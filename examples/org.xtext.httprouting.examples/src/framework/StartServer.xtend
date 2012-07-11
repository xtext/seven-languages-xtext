/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package framework

import com.google.inject.Guice
import com.google.inject.Injector
import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.servlet.ServletHolder
import routes.NumberGuessing

class StartServer {
	def static void main(String[] args) {
		val server = new Server(8080)
 
        val context = new ServletContextHandler(ServletContextHandler::SESSIONS)
        context.contextPath = "/"
        server.handler = context
 
        context.addServlet(new ServletHolder(new SuperServlet),"/*");
 
        server.start();
        server.join();
	}
}

class SuperServlet extends NumberGuessing {
	
	Injector injector
	var ThreadLocal<HttpServletRequest> request = new ThreadLocal<HttpServletRequest>
	var ThreadLocal<HttpServletResponse> response = new ThreadLocal<HttpServletResponse>
	
	override init() throws ServletException {
		super.init()
		injector = Guice::createInjector [
			bind(typeof(HttpServletRequest)).toProvider [|request.get]
			bind(typeof(HttpServletResponse)).toProvider[|response.get]
		]
	}
	
	override protected service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		request.set(req)
		response.set(resp)
		injector.injectMembers(this)
		super.service(req, resp)
	}
	
}