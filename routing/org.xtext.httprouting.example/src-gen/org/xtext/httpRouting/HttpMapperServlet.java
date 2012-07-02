package org.xtext.httpRouting;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.xtext.example.ActionClass;
import org.xtext.example.TimeSheetController;
import org.xtext.example.UserController;

@SuppressWarnings("serial")
public class HttpMapperServlet extends HttpServlet {
  public void _doGet0(final UserController it, final HttpServletRequest request, final String id) {
    int _parseInt = Integer.parseInt(id);
    it.showUser(_parseInt);
  }
  
  @Inject
  private UserController _key0;
  
  private static Pattern _pattern0 = Pattern.compile("/user/(\\w+)");
  
  public void _doGet1(final TimeSheetController it, final HttpServletRequest request, final String id) {
    it.forUser(id);
  }
  
  public boolean _doGet1Condition(final HttpServletRequest request, final String id) {
    boolean _equals = Objects.equal(id, "admin");
    return _equals;
  }
  
  @Inject
  private TimeSheetController _key1;
  
  private static Pattern _pattern1 = Pattern.compile("/timesheet/user/(\\w+)");
  
  public void _doGet2(final TimeSheetController it, final HttpServletRequest request, final String year, final String month) {
    int _parseInt = Integer.parseInt(year);
    int _parseInt_1 = Integer.parseInt(month);
    it.forMonth(_parseInt, _parseInt_1);
  }
  
  @Inject
  private TimeSheetController _key2;
  
  private static Pattern _pattern2 = Pattern.compile("/timesheet/month/:year/(\\w+)");
  
  public void _doGet3(final ActionClass it, final HttpServletRequest request, final String bar, final String baz, final String name) {
    it.doSomething(bar, name);
  }
  
  public boolean _doGet3Condition(final HttpServletRequest request, final String bar, final String baz, final String name) {
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
  
  @Inject
  @Named(value = "Action")
  private ActionClass _key3;
  
  private static Pattern _pattern3 = Pattern.compile("/client/:bar/foo/(\\w+)/(.+)");
  
  public void _doPost4(final HttpServletRequest request, final String bar, final String rest) {
    String _plus = (bar + rest);
    ActionClass.doSomethingStatic(_plus);
  }
  
  public boolean _doPost4Condition(final HttpServletRequest request, final String bar, final String rest) {
    boolean _startsWith = rest.startsWith("action?=delete");
    return _startsWith;
  }
  
  private static Pattern _pattern4 = Pattern.compile("/client/(\\w+)/file.gif/(.+)");
  
  public void _doPost5(final HttpServletRequest request, final String bar, final String rest) {
    String _plus = (bar + rest);
    ActionClass.doSomethingStatic(_plus);
  }
  
  private static Pattern _pattern5 = Pattern.compile("/client/(\\w+)/file.gif/(.+)");
  
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
    String url =  request.getRequestURL().toString();
    Matcher _matcher0 = _pattern0.matcher(url);
    if (_matcher0.find()) {
    		String id = _matcher0.group(1);
    			_doGet0(_key0,request, id);
    }
    Matcher _matcher1 = _pattern1.matcher(url);
    if (_matcher1.find()) {
    		String id = _matcher1.group(1);
    		if (_doGet1Condition(request, id))
    			_doGet1(_key1,request, id);
    }
    Matcher _matcher2 = _pattern2.matcher(url);
    if (_matcher2.find()) {
    		String year = _matcher2.group(1);
    		String month = _matcher2.group(2);
    			_doGet2(_key2,request, year, month);
    }
    Matcher _matcher3 = _pattern3.matcher(url);
    if (_matcher3.find()) {
    		String bar = _matcher3.group(1);
    		String baz = _matcher3.group(2);
    		String name = _matcher3.group(3);
    		if (_doGet3Condition(request, bar, baz, name))
    			_doGet3(_key3,request, bar, baz, name);
    }
    
  }
  
  public void doPost(final HttpServletRequest request, final HttpServletResponse response) {
    String url =  request.getRequestURL().toString();
    Matcher _matcher4 = _pattern4.matcher(url);
    if (_matcher4.find()) {
    		String bar = _matcher4.group(1);
    		String rest = _matcher4.group(2);
    		if (_doPost4Condition(request, bar, rest))
    			_doPost4(request, bar, rest);
    }
    Matcher _matcher5 = _pattern5.matcher(url);
    if (_matcher5.find()) {
    		String bar = _matcher5.group(1);
    		String rest = _matcher5.group(2);
    			_doPost5(request, bar, rest);
    }
    
  }
  
  public void doPut(final HttpServletRequest request, final HttpServletResponse response) {
    
  }
  
  public void doDelete(final HttpServletRequest request, final HttpServletResponse response) {
    
  }
  
  public void doHead(final HttpServletRequest request, final HttpServletResponse response) {
    
  }
}
