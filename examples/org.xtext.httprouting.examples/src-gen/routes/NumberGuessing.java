package routes;

import com.acme.GuessTheNumber;
import com.google.inject.Inject;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("serial")
public class NumberGuessing extends HttpServlet {
  @Inject
  private GuessTheNumber controller;
  
  private static Pattern _pattern3 = Pattern.compile("/guess");
  
  /**
   * the guess might be a parameter
   */
  public void _doGet3(final HttpServletRequest request, final HttpServletResponse response) {
    Integer _guess = this.controller.getGuess();
    this.controller.handleGuess(_guess);
  }
  
  private static Pattern _pattern4 = Pattern.compile("/guess/(.+)");
  
  /**
   * the same but having the guess as part of URL
   */
  public void _doGet4(final HttpServletRequest request, final HttpServletResponse response, final String guess) {
    try {
      int _parseInt = Integer.parseInt(guess);
      this.controller.handleGuess(Integer.valueOf(_parseInt));
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        final NumberFormatException e = (NumberFormatException)_t;
        this.controller.handleGuess(null);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
    String url =  request.getRequestURL().toString();
    {
    	java.util.regex.Matcher _matcher = _pattern3.matcher(url);
    	if (_matcher.find()) {
    		_doGet3(request, response);
    	}
    }
    {
    	java.util.regex.Matcher _matcher = _pattern4.matcher(url);
    	if (_matcher.find()) {
    		String guess = _matcher.group(1);
    		_doGet4(request, response, guess);
    	}
    }
    
  }
}
