/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib.view;

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
    this.startPosition = startPosition.getCopy();
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
    if ((this.startPosition != null)) {
      final Point currentLocation = new Point(this.delta).scale(alpha).translate(this.startPosition);
      figure.setTortoiseLocation(currentLocation);
      if ((this.line != null)) {
        this.line.setEnd(currentLocation);
        IFigure _parent = this.line.getParent();
        boolean _tripleEquals = (_parent == null);
        if (_tripleEquals) {
          IFigure _parent_1 = figure.getParent();
          int _size = figure.getParent().getChildren().size();
          int _minus = (_size - 2);
          _parent_1.add(this.line, _minus);
        }
      }
    }
  }
}
