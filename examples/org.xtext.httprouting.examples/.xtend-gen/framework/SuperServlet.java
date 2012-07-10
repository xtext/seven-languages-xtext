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
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
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
    final Procedure1<Binder> _function = new Procedure1<Binder>() {
        public void apply(final Binder it) {
          AnnotatedBindingBuilder<HttpServletRequest> _bind = it.<HttpServletRequest>bind(HttpServletRequest.class);
          final Function0<HttpServletRequest> _function = new Function0<HttpServletRequest>() {
              public HttpServletRequest apply() {
                HttpServletRequest _get = SuperServlet.this.request.get();
                return _get;
              }
            };
          _bind.toProvider(new Provider<HttpServletRequest>() {
              public HttpServletRequest get() {
                return _function.apply();
              }
          });
          AnnotatedBindingBuilder<HttpServletResponse> _bind_1 = it.<HttpServletResponse>bind(HttpServletResponse.class);
          final Function0<HttpServletResponse> _function_1 = new Function0<HttpServletResponse>() {
              public HttpServletResponse apply() {
                HttpServletResponse _get = SuperServlet.this.response.get();
                return _get;
              }
            };
          _bind_1.toProvider(new Provider<HttpServletResponse>() {
              public HttpServletResponse get() {
                return _function_1.apply();
              }
          });
        }
      };
    Injector _createInjector = Guice.createInjector(new Module() {
        public void configure(Binder binder) {
          _function.apply(binder);
        }
    });
    this.injector = _createInjector;
  }
  
  protected void service(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    this.request.set(req);
    this.response.set(resp);
    this.injector.injectMembers(this);
    super.service(req, resp);
  }
}
