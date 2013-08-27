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
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import routes.NumberGuessing;

@SuppressWarnings("all")
public class SuperServlet extends NumberGuessing {
  private Injector injector;
  
  private ThreadLocal<HttpServletRequest> request = new Function0<ThreadLocal<HttpServletRequest>>() {
    public ThreadLocal<HttpServletRequest> apply() {
      ThreadLocal<HttpServletRequest> _threadLocal = new ThreadLocal<HttpServletRequest>();
      return _threadLocal;
    }
  }.apply();
  
  private ThreadLocal<HttpServletResponse> response = new Function0<ThreadLocal<HttpServletResponse>>() {
    public ThreadLocal<HttpServletResponse> apply() {
      ThreadLocal<HttpServletResponse> _threadLocal = new ThreadLocal<HttpServletResponse>();
      return _threadLocal;
    }
  }.apply();
  
  public void init() throws ServletException {
    super.init();
    final Module _function = new Module() {
      public void configure(final Binder it) {
        AnnotatedBindingBuilder<HttpServletRequest> _bind = it.<HttpServletRequest>bind(HttpServletRequest.class);
        final Provider<HttpServletRequest> _function = new Provider<HttpServletRequest>() {
          public HttpServletRequest get() {
            HttpServletRequest _get = SuperServlet.this.request.get();
            return _get;
          }
        };
        _bind.toProvider(_function);
        AnnotatedBindingBuilder<HttpServletResponse> _bind_1 = it.<HttpServletResponse>bind(HttpServletResponse.class);
        final Provider<HttpServletResponse> _function_1 = new Provider<HttpServletResponse>() {
          public HttpServletResponse get() {
            HttpServletResponse _get = SuperServlet.this.response.get();
            return _get;
          }
        };
        _bind_1.toProvider(_function_1);
      }
    };
    Injector _createInjector = Guice.createInjector(_function);
    this.injector = _createInjector;
  }
  
  protected void service(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    this.request.set(req);
    this.response.set(resp);
    this.injector.injectMembers(this);
    super.service(req, resp);
  }
}
