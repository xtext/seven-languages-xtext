package org.xtext.httprouting.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class MockedHttpServletRequest implements HttpServletRequest {
  private String url = "";
  
  public MockedHttpServletRequest(final String url) {
    this.url = url;
  }
  
  public String getAuthType() {
    return "FOO";
  }
  
  public String getContextPath() {
    return "FOO";
  }
  
  public Cookie[] getCookies() {
    ArrayList<Cookie> _newArrayList = CollectionLiterals.<Cookie>newArrayList();
    return ((Cookie[])Conversions.unwrapArray(_newArrayList, Cookie.class));
  }
  
  public long getDateHeader(final String arg0) {
    return 1L;
  }
  
  public String getHeader(final String arg0) {
    return "HEADER";
  }
  
  public Enumeration getHeaderNames() {
    return null;
  }
  
  public Enumeration getHeaders(final String arg0) {
    return null;
  }
  
  public int getIntHeader(final String arg0) {
    return 1;
  }
  
  public String getMethod() {
    return "GET";
  }
  
  public String getPathInfo() {
    return null;
  }
  
  public String getPathTranslated() {
    return null;
  }
  
  public String getQueryString() {
    return null;
  }
  
  public String getRemoteUser() {
    return null;
  }
  
  public String getRequestURI() {
    return null;
  }
  
  public StringBuffer getRequestURL() {
    StringBuffer _xblockexpression = null;
    {
      StringBuffer _stringBuffer = new StringBuffer();
      final StringBuffer buffer = _stringBuffer;
      buffer.append(this.url);
      _xblockexpression = (buffer);
    }
    return _xblockexpression;
  }
  
  public String getRequestedSessionId() {
    return null;
  }
  
  public String getServletPath() {
    return null;
  }
  
  public HttpSession getSession() {
    return null;
  }
  
  public HttpSession getSession(final boolean arg0) {
    return null;
  }
  
  public Principal getUserPrincipal() {
    return null;
  }
  
  public boolean isRequestedSessionIdFromCookie() {
    return true;
  }
  
  public boolean isRequestedSessionIdFromURL() {
    return true;
  }
  
  public boolean isRequestedSessionIdFromUrl() {
    return true;
  }
  
  public boolean isRequestedSessionIdValid() {
    return true;
  }
  
  public boolean isUserInRole(final String arg0) {
    return true;
  }
  
  public Object getAttribute(final String arg0) {
    return null;
  }
  
  public Enumeration getAttributeNames() {
    return null;
  }
  
  public String getCharacterEncoding() {
    return null;
  }
  
  public int getContentLength() {
    return 1;
  }
  
  public String getContentType() {
    return null;
  }
  
  public ServletInputStream getInputStream() throws IOException {
    return null;
  }
  
  public String getLocalAddr() {
    return null;
  }
  
  public String getLocalName() {
    return null;
  }
  
  public int getLocalPort() {
    return 1;
  }
  
  public Locale getLocale() {
    return null;
  }
  
  public Enumeration getLocales() {
    return null;
  }
  
  public String getParameter(final String arg0) {
    return null;
  }
  
  public Map getParameterMap() {
    return null;
  }
  
  public Enumeration getParameterNames() {
    return null;
  }
  
  public String[] getParameterValues(final String arg0) {
    return null;
  }
  
  public String getProtocol() {
    return null;
  }
  
  public BufferedReader getReader() throws IOException {
    return null;
  }
  
  public String getRealPath(final String arg0) {
    return null;
  }
  
  public String getRemoteAddr() {
    return null;
  }
  
  public String getRemoteHost() {
    return null;
  }
  
  public int getRemotePort() {
    return 1;
  }
  
  public RequestDispatcher getRequestDispatcher(final String arg0) {
    return null;
  }
  
  public String getScheme() {
    return null;
  }
  
  public String getServerName() {
    return null;
  }
  
  public int getServerPort() {
    return 1;
  }
  
  public boolean isSecure() {
    return true;
  }
  
  public void removeAttribute(final String arg0) {
  }
  
  public void setAttribute(final String arg0, final Object arg1) {
  }
  
  public void setCharacterEncoding(final String arg0) throws UnsupportedEncodingException {
  }
}
