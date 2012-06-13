package org.xtext.httpRouting;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.xtext.example.actionclasses.ActionClass;

public class HttpMapperServlet extends HttpServlet {
  private final static long serialVersionUID = 1L;
  
  public void doGet0(final ActionClass it, final HttpServletRequest request, final String id) {
    int _parseInt = Integer.parseInt(id);
    it.doSomething(Integer.valueOf(_parseInt));
  }
  
  public boolean doGet0Condition(final HttpServletRequest request, final String id) {
    boolean _equals = Objects.equal(id, "42");
    return _equals;
  }
  
  @Inject
  @Named(value = "ActionClassName")
  private ActionClass key0;
  
  private static Pattern pattern0 = Pattern.compile("/client/foo/(\\w+)");
  
  public void doGet1(final ActionClass it, final HttpServletRequest request, final String id) {
    it.doSomething1(id);
  }
  
  public boolean doGet1Condition(final HttpServletRequest request, final String id) {
    boolean _equals = Objects.equal(id, "bar");
    return _equals;
  }
  
  @Inject
  @Named(value = "ActionClassName")
  private ActionClass key1;
  
  private static Pattern pattern1 = Pattern.compile("/client/foo/(\\w+)");
  
  public void doGet2(final ActionClass it, final HttpServletRequest request, final String id) {
    it.doSomething2(id);
  }
  
  public boolean doGet2Condition(final HttpServletRequest request, final String id) {
    boolean _equals = Objects.equal(id, "foo");
    return _equals;
  }
  
  @Inject
  @Named(value = "ActionClassName")
  private ActionClass key2;
  
  private static Pattern pattern2 = Pattern.compile("/client/foo/(\\w+)");
  
  public void doGet3(final ActionClass it, final HttpServletRequest request, final String bar, final String baz, final String name) {
    it.doSomething(bar, name);
  }
  
  public boolean doGet3Condition(final HttpServletRequest request, final String bar, final String baz, final String name) {
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
  private ActionClass key3;
  
  private static Pattern pattern3 = Pattern.compile("/client/:bar/foo/(\\w+)/(.+)");
  
  public void doPost4(final HttpServletRequest request, final String bar, final String rest) {
    String _plus = (bar + rest);
    ActionClass.doSomethingStatic(_plus);
  }
  
  public boolean doPost4Condition(final HttpServletRequest request, final String bar, final String rest) {
    boolean _startsWith = rest.startsWith("/action?=delete");
    return _startsWith;
  }
  
  private static Pattern pattern4 = Pattern.compile("/client/(\\w+)/file.gif/(.+)");
  
  public void doPost5(final HttpServletRequest request, final String bar, final String rest) {
    String _plus = (bar + rest);
    ActionClass.doSomethingStatic(_plus);
  }
  
  private static Pattern pattern5 = Pattern.compile("/client/(\\w+)/file.gif/(.+)");
  
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) {
    String url =  request.getRequestURI();
    Matcher matcher0 = pattern0.matcher(url);
    if(matcher0.find()){
    		String id =matcher0.group(1);
    		if(doGet0Condition(request, id))
    			doGet0(key0,request, id);
    }Matcher matcher1 = pattern1.matcher(url);
    if(matcher1.find()){
    		String id =matcher1.group(1);
    		if(doGet1Condition(request, id))
    			doGet1(key1,request, id);
    }Matcher matcher2 = pattern2.matcher(url);
    if(matcher2.find()){
    		String id =matcher2.group(1);
    		if(doGet2Condition(request, id))
    			doGet2(key2,request, id);
    }Matcher matcher3 = pattern3.matcher(url);
    if(matcher3.find()){
    		String bar =matcher3.group(1);
    		String baz =matcher3.group(2);
    		String name =matcher3.group(3);
    		if(doGet3Condition(request, bar, baz, name))
    			doGet3(key3,request, bar, baz, name);
    }
  }
  
  public void doPost(final HttpServletRequest request, final HttpServletResponse response) {
    String url =  request.getRequestURI();
    Matcher matcher4 = pattern4.matcher(url);
    if(matcher4.find()){
    		String bar =matcher4.group(1);
    		String rest =matcher4.group(2);
    		if(doPost4Condition(request, bar, rest))
    			doPost4(request, bar, rest);
    }Matcher matcher5 = pattern5.matcher(url);
    if(matcher5.find()){
    		String bar =matcher5.group(1);
    		String rest =matcher5.group(2);
    			doPost5(request, bar, rest);
    }
  }
  
  public void doPut(final HttpServletRequest request, final HttpServletResponse response) {
    
  }
  
  public void doDelete(final HttpServletRequest request, final HttpServletResponse response) {
    
  }
  
  public void doHead(final HttpServletRequest request, final HttpServletResponse response) {
    
  }
}
