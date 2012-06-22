package org.xtext.httprouting.tests

import java.io.IOException
import java.io.UnsupportedEncodingException
import javax.servlet.http.HttpServletRequest
 
class MockedHttpServletRequest implements HttpServletRequest{
	String url = "";
	new(String url){
		this.url = url 
	}

	 
	override getAuthType() {
		"FOO"
	}
	
	override getContextPath() {
		"FOO"
	}
	
	override getCookies() {
		newArrayList()
	}
	
	override getDateHeader(String arg0) {
		1L
	}
	
	override getHeader(String arg0) {
		"HEADER"
	}
	
	override getHeaderNames() {
		null
	}
	
	override getHeaders(String arg0) {
		null
	}
	
	override getIntHeader(String arg0) {
		1
	}
	
	override getMethod() {
		"GET"
	}
	
	override getPathInfo() {
		null
	}
	
	override getPathTranslated() {
		null
	}
	
	override getQueryString() {
		null
	}
	
	override getRemoteUser() {
		null
	}
	
	override getRequestURI() {
		null
	}
	
	override getRequestURL() {
		val buffer = new StringBuffer()
		buffer.append(url)
		buffer
	}
	
	override getRequestedSessionId() {
		null
	}
	
	override getServletPath() {
		null
	}
	
	override getSession() {
		null
	}
	
	override getSession(boolean arg0) {
		null
	}
	
	override getUserPrincipal() {
		null
	}
	
	override isRequestedSessionIdFromCookie() {
		true
	}
	
	override isRequestedSessionIdFromURL() {
		true
	}
	
	override isRequestedSessionIdFromUrl() {
		true
	}
	
	override isRequestedSessionIdValid() {
		true
	}
	
	override isUserInRole(String arg0) {
		true
	}
	
	override getAttribute(String arg0) {
		null
	}
	
	override getAttributeNames() {
		null
	}
	
	override getCharacterEncoding() {
		null
	}
	
	override getContentLength() {
		1
	}
	
	override getContentType() {
		null
	}
	
	override getInputStream() throws IOException {
		null
	}
	
	override getLocalAddr() {
		null
	}
	
	override getLocalName() {
		null
	}
	
	override getLocalPort() {
		1
	}
	
	override getLocale() {
		null
	}
	
	override getLocales() {
		null
	}
	
	override getParameter(String arg0) {
		null
	}
	
	override getParameterMap() {
		null
	}
	
	override getParameterNames() {
		null
	}
	
	override getParameterValues(String arg0) {
		null
	}
	
	override getProtocol() {
		null
	}
	
	override getReader() throws IOException {
		null
	}
	
	override getRealPath(String arg0) {
		null
	}
	
	override getRemoteAddr() {
		null
	}
	
	override getRemoteHost() {
		null
	}
	
	override getRemotePort() {
		1
	}
	
	override getRequestDispatcher(String arg0) {
		null
	}
	
	override getScheme() {
		null
	}
	
	override getServerName() {
		null
	}
	
	override getServerPort() {
		1
	}
	
	override isSecure() {
		true
	}
	
	override removeAttribute(String arg0) {
		
	}
	
	override setAttribute(String arg0, Object arg1) {
		
	}
	
	override setCharacterEncoding(String arg0) throws UnsupportedEncodingException {
		
	}
	
}