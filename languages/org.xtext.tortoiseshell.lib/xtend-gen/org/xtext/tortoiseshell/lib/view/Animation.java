/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib.view;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.xtext.tortoiseshell.lib.view.TortoiseFigure;

@SuppressWarnings("all")
public class Animation {
  private Point startPosition;
  
  private Point delta;
  
  private double startAngle;
  
  private double deltaAngle;
  
  private Polyline line;
  
  private int delay;
  
  public Animation(final Point startPosition, final Point endPosition, final Polyline line, final int delay) {
    this(startPosition, endPosition, delay);
    this.line = line;
  }
  
  public Animation(final Point startPosition, final Point endPosition, final int delay) {
    this.deltaAngle = 0.0;
    Point _copy = startPosition.getCopy();
    this.startPosition = _copy;
    Point _point = new Point((endPosition.x - startPosition.x), (endPosition.y - startPosition.y));
    this.delta = _point;
    this.delay = delay;
  }
  
  public Animation(final double startAngle, final double endAngle, final int delay) {
    this.startAngle = startAngle;
    this.deltaAngle = (endAngle - startAngle);
    this.delay = delay;
  }
  
  public int getDelay() {
    return this.delay;
  }
  
  public void set(final TortoiseFigure figure, final double alpha) {
    if ((this.deltaAngle != 0.0)) {
      figure.setAngle((this.startAngle + (alpha * this.deltaAngle)));
    }
    boolean _notEquals = (!Objects.equal(this.startPosition, null));
    if (_notEquals) {
      Point _point = new Point(this.delta);
      Point _scale = _point.scale(alpha);
      final Point currentLocation = _scale.translate(this.startPosition);
      figure.setTortoiseLocation(currentLocation);
      boolean _notEquals_1 = (!Objects.equal(this.line, null));
      if (_notEquals_1) {
        this.line.setEnd(currentLocation);
        IFigure _parent = this.line.getParent();
        boolean _equals = Objects.equal(_parent, null);
        if (_equals) {
          IFigure _parent_1 = figure.getParent();
          IFigure _parent_2 = figure.getParent();
          List _children = _parent_2.getChildren();
          int _size = _children.size();
          int _minus = (_size - 2);
          _parent_1.add(this.line, _minus);
        }
      }
    }
  }
}
