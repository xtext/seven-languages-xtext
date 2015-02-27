/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package framework;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.binder.AnnotatedBindingBuilder;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import routes.NumberGuessing;

@SuppressWarnings("all")
public class SuperServlet extends NumberGuessing {
  private Injector injector;
  
  private ThreadLocal<HttpServletRequest> request = new ThreadLocal<HttpServletRequest>();
  
  private ThreadLocal<HttpServletResponse> response = new ThreadLocal<HttpServletResponse>();
  
  @Override
  public void init() throws ServletException {
    super.init();
    final Module _function = new Module() {
      @Override
      public void configure(final Binder it) {
        AnnotatedBindingBuilder<HttpServletRequest> _bind = it.<HttpServletRequest>bind(HttpServletRequest.class);
        final Provider<HttpServletRequest> _function = new Provider<HttpServletRequest>() {
          @Override
          public HttpServletRequest get() {
            return SuperServlet.this.request.get();
          }
        };
        _bind.toProvider(_function);
        AnnotatedBindingBuilder<HttpServletResponse> _bind_1 = it.<HttpServletResponse>bind(HttpServletResponse.class);
        final Provider<HttpServletResponse> _function_1 = new Provider<HttpServletResponse>() {
          @Override
          public HttpServletResponse get() {
            return SuperServlet.this.response.get();
          }
        };
        _bind_1.toProvider(_function_1);
      }
    };
    Injector _createInjector = Guice.createInjector(_function);
    this.injector = _createInjector;
  }
  
  @Override
  protected void service(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    this.request.set(req);
    this.response.set(resp);
    this.injector.injectMembers(this);
    super.service(req, resp);
  }
}
