package routes;

import com.acme.GuessTheNumber;
import com.google.inject.Inject;
import java.util.regex.Matcher;
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
  
  public boolean _doGet2Condition(final HttpServletRequest request, final HttpServletResponse response, final String myGuess) {
    boolean _equals = myGuess.equals("42");
    return _equals;
  }
  
  public void _doGet2(final HttpServletRequest request, final HttpServletResponse response, final String myGuess) {
    this.controller.handleAnswerToEverything();
  }
  
  private static Pattern _pattern3 = Pattern.compile("/guess");
  
  public boolean _doGet3Condition(final HttpServletRequest request, final HttpServletResponse response) {
    String _parameter = request.getParameter("theGuess");
    boolean _equals = false;
    if (_parameter!=null) {
      _equals=_parameter.equals("42");
    }
    return _equals;
  }
  
  public void _doGet3(final HttpServletRequest request, final HttpServletResponse response) {
    this.controller.handleAnswerToEverything();
  }
  
  private static Pattern _pattern4 = Pattern.compile("/guess/(\\w+)");
  
  public void _doGet4(final HttpServletRequest request, final HttpServletResponse response, final String myGuess) {
    this.controller.handleGuess(myGuess);
  }
  
  private static Pattern _pattern5 = Pattern.compile("/guess");
  
  public void _doGet5(final HttpServletRequest request, final HttpServletResponse response) {
    this.controller.handleGuess(request.getParameter("theGuess"));
  }
  
  private static Pattern _pattern6 = Pattern.compile("/");
  
  public void _doGet6(final HttpServletRequest request, final HttpServletResponse response) {
    try {
      InputOutput.<String>println("Redirecting!");
      response.sendRedirect("/guess");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
    String url =  request.getRequestURL().toString();
    {
    	Matcher _matcher = _pattern2.matcher(url);
    	if (_matcher.find()) {
    		String myGuess = _matcher.group(1);
    		if (_doGet2Condition(request, response, myGuess)) {
    			_doGet2(request, response, myGuess);
    			return;
    		}
    	}
    }
    {
    	Matcher _matcher = _pattern3.matcher(url);
    	if (_matcher.find()) {
    		if (_doGet3Condition(request, response)) {
    			_doGet3(request, response);
    			return;
    		}
    	}
    }
    {
    	Matcher _matcher = _pattern4.matcher(url);
    	if (_matcher.find()) {
    		String myGuess = _matcher.group(1);
    		_doGet4(request, response, myGuess);
    		return;
    	}
    }
    {
    	Matcher _matcher = _pattern5.matcher(url);
    	if (_matcher.find()) {
    		_doGet5(request, response);
    		return;
    	}
    }
    {
    	Matcher _matcher = _pattern6.matcher(url);
    	if (_matcher.find()) {
    		_doGet6(request, response);
    		return;
    	}
    }
  }
}
