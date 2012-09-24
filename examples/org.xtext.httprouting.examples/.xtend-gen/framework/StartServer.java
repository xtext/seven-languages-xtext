package framework;

import framework.SuperServlet;
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
      Server _server = new Server(8080);
      final Server server = _server;
      ServletContextHandler _servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
      final ServletContextHandler context = _servletContextHandler;
      context.setContextPath("/");
      server.setHandler(context);
      SuperServlet _superServlet = new SuperServlet();
      ServletHolder _servletHolder = new ServletHolder(_superServlet);
      context.addServlet(_servletHolder, "/*");
      server.start();
      server.join();
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
