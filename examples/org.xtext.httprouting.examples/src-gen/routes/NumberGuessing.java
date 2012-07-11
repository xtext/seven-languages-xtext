package routes;

import com.acme.GuessTheNumber;
import com.google.inject.Inject;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class NumberGuessing extends HttpServlet {
  @Inject
  private GuessTheNumber controller;
  
  private static Pattern _pattern2 = Pattern.compile("/guess");
  
  public void _doGet2(final HttpServletRequest request, final HttpServletResponse response) {
    String _parameter = request.getParameter("theGuess");
    this.controller.handleGuess(_parameter);
  }
  
  private static Pattern _pattern3 = Pattern.compile("/guess/(\\w+)");
  
  public void _doGet3(final HttpServletRequest request, final HttpServletResponse response, final String theGuess) {
    this.controller.handleGuess(theGuess);
  }
  
  private static Pattern _pattern4 = Pattern.compile("/");
  
  public void _doGet4(final HttpServletRequest request, final HttpServletResponse response) {
    this.controller.handleGuess(null);
  }
  
  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
    String url =  request.getRequestURL().toString();
    {
    	java.util.regex.Matcher _matcher = _pattern2.matcher(url);
    	if (_matcher.find()) {
    		_doGet2(request, response);
    	}
    }
    {
    	java.util.regex.Matcher _matcher = _pattern3.matcher(url);
    	if (_matcher.find()) {
    		String theGuess = _matcher.group(1);
    		_doGet3(request, response, theGuess);
    	}
    }
    {
    	java.util.regex.Matcher _matcher = _pattern4.matcher(url);
    	if (_matcher.find()) {
    		_doGet4(request, response);
    	}
    }
    
  }
}
