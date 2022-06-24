/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib;

import java.util.List;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Tortoise {
  private double angle;

  private double x;

  private double y;

  @Accessors
  private int delay = 200;

  private boolean isPaint = true;

  @Accessors
  private int lineWidth = 1;

  @Accessors
  private Color lineColor = ColorConstants.black;

  private List<ITortoiseEvent.Listener> listeners = CollectionLiterals.<ITortoiseEvent.Listener>newArrayList();

  public boolean addListener(final ITortoiseEvent.Listener listener) {
    return this.listeners.add(listener);
  }

  public boolean removeListener(final ITortoiseEvent.Listener listener) {
    return this.listeners.remove(listener);
  }

  public boolean penUp() {
    return this.isPaint = false;
  }

  public boolean penDown() {
    return this.isPaint = true;
  }

  public boolean isPaint() {
    return this.isPaint;
  }

  public double goTo(final double x, final double y) {
    double _xblockexpression = (double) 0;
    {
      this.x = x;
      _xblockexpression = this.y = y;
    }
    return _xblockexpression;
  }

  public Point getPosition() {
    return new Point(((int) this.x), ((int) this.y));
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
    this.angle = Math.toRadians(angle);
    this.fireTurnEvent(oldAngle);
  }

  public double getAngle() {
    return Math.toDegrees(this.angle);
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
    for (final ITortoiseEvent.Listener listener : this.listeners) {
      listener.handleTortoiseEvent(event);
    }
  }

  @Pure
  public int getDelay() {
    return this.delay;
  }

  public void setDelay(final int delay) {
    this.delay = delay;
  }

  @Pure
  public int getLineWidth() {
    return this.lineWidth;
  }

  public void setLineWidth(final int lineWidth) {
    this.lineWidth = lineWidth;
  }

  @Pure
  public Color getLineColor() {
    return this.lineColor;
  }

  public void setLineColor(final Color lineColor) {
    this.lineColor = lineColor;
  }
}
