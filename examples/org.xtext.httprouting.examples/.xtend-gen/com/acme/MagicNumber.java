package com.acme;

import com.google.inject.Inject;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@SuppressWarnings("all")
public class MagicNumber {
  @Inject
  private HttpServletRequest request;
  
  public Integer getNumber() {
    HttpSession _session = this.request.getSession();
    Object _attribute = _session.getAttribute("number");
    return ((Integer) _attribute);
  }
  
  public void seedNumber() {
    Random _random = new Random();
    int _nextInt = _random.nextInt();
    int _modulo = (_nextInt % 100);
    final int number = Math.abs(_modulo);
    HttpSession _session = this.request.getSession();
    _session.setAttribute("number", Integer.valueOf(number));
  }
  
  public void cleanNumber() {
    HttpSession _session = this.request.getSession();
    _session.removeAttribute("number");
  }
}
