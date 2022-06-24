package routes;

import com.google.inject.Inject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import simple.SimpleClazz;

@SuppressWarnings("serial")
public class Simple extends HttpServlet {
  @Inject
  private SimpleClazz simpleClazz;

  private static Pattern _pattern1 = Pattern.compile("/(\\w+)");

  public void _doGet1(final HttpServletRequest request, final HttpServletResponse response, final String someValue) {
    SimpleClazz.staticMethod(someValue);
  }

  private static Pattern _pattern3 = Pattern.compile("/(\\w+)");

  public void _doGet3(final HttpServletRequest request, final HttpServletResponse response, final String someValue) {
    this.simpleClazz.instanceMethod(someValue);
  }

  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
    String url =  request.getRequestURL().toString();
    {
    	Matcher _matcher = _pattern1.matcher(url);
    	if (_matcher.find()) {
    		String someValue = _matcher.group(1);
    		_doGet1(request, response, someValue);
    		return;
    	}
    }
    {
    	Matcher _matcher = _pattern3.matcher(url);
    	if (_matcher.find()) {
    		String someValue = _matcher.group(1);
    		_doGet3(request, response, someValue);
    		return;
    	}
    }
  }
}
