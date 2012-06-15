package org.xtext.tortoiseshell.runtime.view;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.xtext.tortoiseshell.runtime.view.TortoiseFigure;

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
    int _minus = (endPosition.x - startPosition.x);
    int _minus_1 = (endPosition.y - startPosition.y);
    Point _point = new Point(_minus, _minus_1);
    this.delta = _point;
    this.delay = delay;
  }
  
  public Animation(final double startAngle, final double endAngle, final int delay) {
    this.startAngle = startAngle;
    double _minus = (endAngle - startAngle);
    this.deltaAngle = _minus;
    this.delay = delay;
  }
  
  public int getDelay() {
    return this.delay;
  }
  
  public void set(final TortoiseFigure figure, final double alpha) {
    boolean _notEquals = (this.deltaAngle != 0.0);
    if (_notEquals) {
      double _multiply = (alpha * this.deltaAngle);
      double _plus = (this.startAngle + _multiply);
      figure.setAngle(_plus);
    }
    boolean _notEquals_1 = (!Objects.equal(this.startPosition, null));
    if (_notEquals_1) {
      Point _point = new Point(this.delta);
      Point _scale = _point.scale(alpha);
      final Point currentLocation = _scale.translate(this.startPosition);
      figure.setTortoiseLocation(currentLocation);
      boolean _notEquals_2 = (!Objects.equal(this.line, null));
      if (_notEquals_2) {
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
