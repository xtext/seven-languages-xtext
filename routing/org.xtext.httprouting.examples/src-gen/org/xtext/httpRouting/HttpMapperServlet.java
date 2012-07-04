package org.xtext.httpRouting;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.xtext.example.ActionClass;
import org.xtext.example.TimeSheetController;
import org.xtext.example.UserController;

@SuppressWarnings("serial")
public class HttpMapperServlet extends HttpServlet {
  private static Pattern _pattern4 = Pattern.compile("/user/(\\w+)");
  
  @Inject
  private UserController _key4;
  
  public void _doGet4(final UserController it, final HttpServletRequest request, final String id) {
    int _parseInt = Integer.parseInt(id);
    it.showUser(_parseInt);
  }
  
  private static Pattern _pattern5 = Pattern.compile("/timesheet/user/(\\w+)");
  
  @Inject
  private TimeSheetController _key5;
  
  public boolean _doGet5Condition(final HttpServletRequest request, final String id) {
    boolean _equals = Objects.equal(id, "admin");
    return _equals;
  }
  
  public void _doGet5(final TimeSheetController it, final HttpServletRequest request, final String id) {
    it.forUser(id);
  }
  
  private static Pattern _pattern6 = Pattern.compile("/timesheet/month/:year/(\\w+)");
  
  @Inject
  private TimeSheetController _key6;
  
  public void _doGet6(final TimeSheetController it, final HttpServletRequest request, final String year, final String month) {
    int _parseInt = Integer.parseInt(year);
    int _parseInt_1 = Integer.parseInt(month);
    it.forMonth(_parseInt, _parseInt_1);
  }
  
  private static Pattern _pattern7 = Pattern.compile("/client/:bar/foo/(\\w+)/(.+)");
  
  @Inject
  @Named(value = "Action")
  private ActionClass _key7;
  
  public boolean _doGet7Condition(final HttpServletRequest request, final String bar, final String baz, final String name) {
    boolean _and = false;
    boolean _equals = Objects.equal(bar, "Some");
    if (!_equals) {
      _and = false;
    } else {
      String _plus = (bar + baz);
      boolean _equals_1 = Objects.equal(_plus, "SomeString");
      _and = (_equals && _equals_1);
    }
    return _and;
  }
  
  public void _doGet7(final ActionClass it, final HttpServletRequest request, final String bar, final String baz, final String name) {
    it.doSomething(bar, name);
  }
  
  private static Pattern _pattern8 = Pattern.compile("/client/(\\w+)/file.gif/(.+)");
  
  public boolean _doPost8Condition(final HttpServletRequest request, final String bar, final String rest) {
    boolean _startsWith = rest.startsWith("action?=delete");
    return _startsWith;
  }
  
  public void _doPost8(final HttpServletRequest request, final String bar, final String rest) {
    String _plus = (bar + rest);
    ActionClass.doSomethingStatic(_plus);
  }
  
  private static Pattern _pattern9 = Pattern.compile("/client/(\\w+)/file.gif/(.+)");
  
  public void _doPost9(final HttpServletRequest request, final String bar, final String rest) {
    String _plus = (bar + rest);
    ActionClass.doSomethingStatic(_plus);
  }
  
  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
    String url =  request.getRequestURL().toString();
    {
    	java.util.regex.Matcher _matcher = _pattern4.matcher(url);
    	if (_matcher.find()) {
    		String id = _matcher.group(1);
    		_doGet4(_key4,
    				request, 
    				id);
    	}
    }
    {
    	java.util.regex.Matcher _matcher = _pattern5.matcher(url);
    	if (_matcher.find()) {
    		String id = _matcher.group(1);
    		if (_doGet5Condition(request, id))
    		_doGet5(_key5,
    				request, 
    				id);
    	}
    }
    {
    	java.util.regex.Matcher _matcher = _pattern6.matcher(url);
    	if (_matcher.find()) {
    		String year = _matcher.group(1);
    		String month = _matcher.group(2);
    		_doGet6(_key6,
    				request, 
    				year, 
    				month);
    	}
    }
    {
    	java.util.regex.Matcher _matcher = _pattern7.matcher(url);
    	if (_matcher.find()) {
    		String bar = _matcher.group(1);
    		String baz = _matcher.group(2);
    		String name = _matcher.group(3);
    		if (_doGet7Condition(request, bar, baz, name))
    		_doGet7(_key7,
    				request, 
    				bar, 
    				baz, 
    				name);
    	}
    }
    
  }
  
  @Override
  public void doPost(final HttpServletRequest request, final HttpServletResponse response) {
    String url =  request.getRequestURL().toString();
    {
    	java.util.regex.Matcher _matcher = _pattern8.matcher(url);
    	if (_matcher.find()) {
    		String bar = _matcher.group(1);
    		String rest = _matcher.group(2);
    		if (_doPost8Condition(request, bar, rest))
    		_doPost8(request, 
    				bar, 
    				rest);
    	}
    }
    {
    	java.util.regex.Matcher _matcher = _pattern9.matcher(url);
    	if (_matcher.find()) {
    		String bar = _matcher.group(1);
    		String rest = _matcher.group(2);
    		_doPost9(request, 
    				bar, 
    				rest);
    	}
    }
    
  }
}
