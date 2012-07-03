package org.xtext.tortoiseshell.runtime;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.xtext.tortoiseshell.runtime.ITortoiseEvent;
import org.xtext.tortoiseshell.runtime.ITortoiseEvent.Listener;
import org.xtext.tortoiseshell.runtime.MoveEvent;
import org.xtext.tortoiseshell.runtime.TurnEvent;

@SuppressWarnings("all")
public class Tortoise {
  private double angle;
  
  private double x;
  
  private double y;
  
  private int _delay = 200;
  
  public int getDelay() {
    return this._delay;
  }
  
  public void setDelay(final int delay) {
    this._delay = delay;
  }
  
  private boolean isPaint = true;
  
  private int _lineWidth = 1;
  
  public int getLineWidth() {
    return this._lineWidth;
  }
  
  public void setLineWidth(final int lineWidth) {
    this._lineWidth = lineWidth;
  }
  
  private Color _lineColor = ColorConstants.black;
  
  public Color getLineColor() {
    return this._lineColor;
  }
  
  public void setLineColor(final Color lineColor) {
    this._lineColor = lineColor;
  }
  
  private List<Listener> listeners = new Function0<List<Listener>>() {
    public List<Listener> apply() {
      ArrayList<Listener> _newArrayList = CollectionLiterals.<Listener>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public boolean addListener(final Listener listener) {
    boolean _add = this.listeners.add(listener);
    return _add;
  }
  
  public boolean removeListener(final Listener listener) {
    boolean _remove = this.listeners.remove(listener);
    return _remove;
  }
  
  public boolean penUp() {
    boolean _isPaint = this.isPaint = false;
    return _isPaint;
  }
  
  public boolean penDown() {
    boolean _isPaint = this.isPaint = true;
    return _isPaint;
  }
  
  public boolean isPaint() {
    return this.isPaint;
  }
  
  public double goTo(final double x, final double y) {
    double _xblockexpression = (double) 0;
    {
      this.x = x;
      double _y = this.y = y;
      _xblockexpression = (_y);
    }
    return _xblockexpression;
  }
  
  public Point getPosition() {
    Point _point = new Point(((int) this.x), ((int) this.y));
    return _point;
  }
  
  public void forward(final double amount) {
    final Point oldPosition = this.getPosition();
    double _sin = Math.sin(this.angle);
    double _multiply = (amount * _sin);
    double _minus = (this.x - _multiply);
    this.x = _minus;
    double _cos = Math.cos(this.angle);
    double _multiply_1 = (amount * _cos);
    double _minus_1 = (this.y - _multiply_1);
    this.y = _minus_1;
    this.fireMoveEvent(oldPosition);
  }
  
  public void back(final double amount) {
    final Point oldPosition = this.getPosition();
    double _sin = Math.sin(this.angle);
    double _multiply = (amount * _sin);
    double _plus = (this.x + _multiply);
    this.x = _plus;
    double _cos = Math.cos(this.angle);
    double _multiply_1 = (amount * _cos);
    double _plus_1 = (this.y + _multiply_1);
    this.y = _plus_1;
    this.fireMoveEvent(oldPosition);
  }
  
  public void turnLeft(final double amount) {
    final double oldAngle = this.angle;
    double _radians = Math.toRadians(amount);
    double _plus = (this.angle + _radians);
    this.angle = _plus;
    this.fireTurnEvent(oldAngle);
  }
  
  public void turnRight(final double amount) {
    final double oldAngle = this.angle;
    double _radians = Math.toRadians(amount);
    double _minus = (this.angle - _radians);
    this.angle = _minus;
    this.fireTurnEvent(oldAngle);
  }
  
  public void turnTo(final double angle) {
    final double oldAngle = this.angle;
    double _radians = Math.toRadians(angle);
    this.angle = _radians;
    this.fireTurnEvent(oldAngle);
  }
  
  public double getAngle() {
    double _degrees = Math.toDegrees(this.angle);
    return _degrees;
  }
  
  public double getAngleInRadians() {
    return this.angle;
  }
  
  protected void fireMoveEvent(final Point oldPosition) {
    MoveEvent _moveEvent = new MoveEvent(this, oldPosition);
    this.notifyListeners(_moveEvent);
  }
  
  protected void fireTurnEvent(final double oldAngle) {
    TurnEvent _turnEvent = new TurnEvent(this, oldAngle);
    this.notifyListeners(_turnEvent);
  }
  
  protected void notifyListeners(final ITortoiseEvent event) {
    for (final Listener listener : this.listeners) {
      listener.handleTortoiseEvent(event);
    }
  }
}
