package routes;

import com.acme.GuessTheNumber;
import com.google.inject.Inject;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("serial")
public class NumberGuessing extends HttpServlet {
  @Inject
  private GuessTheNumber controller;
  
  private static Pattern _pattern2 = Pattern.compile("/guess/(\\w+)");
  
  public void _doGet2(final HttpServletRequest request, final HttpServletResponse response, final String myGuess) {
    this.controller.handleGuess(myGuess);
  }
  
  private static Pattern _pattern3 = Pattern.compile("/guess");
  
  public void _doGet3(final HttpServletRequest request, final HttpServletResponse response) {
    String _parameter = request.getParameter("theGuess");
    this.controller.handleGuess(_parameter);
  }
  
  private static Pattern _pattern4 = Pattern.compile("/");
  
  public void _doGet4(final HttpServletRequest request, final HttpServletResponse response) {
    InputOutput.<String>println("Redirecting!");
    try {
      response.sendRedirect("/guess");
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
    String url =  request.getRequestURL().toString();
    {
    	java.util.regex.Matcher _matcher = _pattern2.matcher(url);
    	if (_matcher.find()) {
    		String myGuess = _matcher.group(1);
    		_doGet2(request, response, myGuess);
    		return;
    	}
    }
    {
    	java.util.regex.Matcher _matcher = _pattern3.matcher(url);
    	if (_matcher.find()) {
    		_doGet3(request, response);
    		return;
    	}
    }
    {
    	java.util.regex.Matcher _matcher = _pattern4.matcher(url);
    	if (_matcher.find()) {
    		_doGet4(request, response);
    		return;
    	}
    }
    
  }
}
