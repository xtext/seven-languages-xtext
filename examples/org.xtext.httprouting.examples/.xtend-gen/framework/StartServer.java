/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package framework;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class StartServer {
  /**
   * http://localhost:8080
   * http://localhost:8080/guess/50
   */
  public static void main(final String[] args) {
    try {
      final Server server = new Server(8080);
      final ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
      context.setContextPath("/");
      server.setHandler(context);
      SuperServlet _superServlet = new SuperServlet();
      ServletHolder _servletHolder = new ServletHolder(_superServlet);
      context.addServlet(_servletHolder, "/*");
      server.start();
      server.join();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
