package org.xtext.mongobeans.examples;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class Duration {
  private int _seconds;
  
  public int getSeconds() {
    return this._seconds;
  }
  
  public void setSeconds(final int seconds) {
    this._seconds = seconds;
  }
  
  public Duration(final int seconds) {
    this.setSeconds(seconds);
  }
  
  public Duration(final String duration) {
    final String[] split = duration.split(":");
    String _get = ((List<String>)Conversions.doWrapArray(split)).get(0);
    int _parseInt = Integer.parseInt(_get);
    int _multiply = (_parseInt * 60);
    String _get_1 = ((List<String>)Conversions.doWrapArray(split)).get(1);
    int _parseInt_1 = Integer.parseInt(_get_1);
    int _plus = (_multiply + _parseInt_1);
    this.setSeconds(_plus);
  }
  
  public String toString() {
    int _seconds = this.getSeconds();
    int _divide = (_seconds / 60);
    String _string = Integer.toString(_divide);
    String _plus = (_string + ":");
    int _seconds_1 = this.getSeconds();
    int _modulo = (_seconds_1 % 60);
    String _string_1 = Integer.toString(_modulo);
    String _plus_1 = (_plus + _string_1);
    return _plus_1;
  }
  
  public Duration operator_plus(final Duration other) {
    int _seconds = this.getSeconds();
    int _seconds_1 = other.getSeconds();
    int _plus = (_seconds + _seconds_1);
    Duration _duration = new Duration(_plus);
    return _duration;
  }
}
