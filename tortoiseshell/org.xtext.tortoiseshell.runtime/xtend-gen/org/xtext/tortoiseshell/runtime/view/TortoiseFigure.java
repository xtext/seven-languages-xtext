package org.xtext.tortoiseshell.runtime.view;

import com.google.inject.Inject;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class TortoiseFigure extends ImageFigure {
  private double _angle;
  
  public double getAngle() {
    return this._angle;
  }
  
  @Inject
  public TortoiseFigure(final PluginImageHelper imageHelper) {
    super(new Function0<Image>() {
      public Image apply() {
        Image _image = imageHelper.getImage("Turtle.png");
        return _image;
      }
    }.apply(), PositionConstants.NORTH_EAST);
  }
  
  protected void paintFigure(final Graphics graphics) {
    graphics.pushState();
    final Dimension size = this.getSize();
    Point _location = this.getLocation();
    int _divide = (size.width / 2);
    int _plus = (_location.x + _divide);
    Point _location_1 = this.getLocation();
    int _divide_1 = (size.width / 2);
    int _plus_1 = (_location_1.y + _divide_1);
    graphics.translate(_plus, _plus_1);
    double _angle = this.getAngle();
    double _degrees = Math.toDegrees(_angle);
    float _minus = (-((float) _degrees));
    graphics.rotate(_minus);
    Point _location_2 = this.getLocation();
    int _minus_1 = (-_location_2.x);
    int _divide_2 = (size.width / 2);
    int _minus_2 = (_minus_1 - _divide_2);
    Point _location_3 = this.getLocation();
    int _minus_3 = (-_location_3.y);
    int _divide_3 = (size.width / 2);
    int _minus_4 = (_minus_3 - _divide_3);
    graphics.translate(_minus_2, _minus_4);
    super.paintFigure(graphics);
    graphics.popState();
  }
  
  public Dimension getMinimumSize(final int wHint, final int hHint) {
    Dimension _xblockexpression = null;
    {
      Image _image = this.getImage();
      final Rectangle bounds = _image.getBounds();
      Dimension _dimension = new Dimension(bounds.width, bounds.height);
      _xblockexpression = (_dimension);
    }
    return _xblockexpression;
  }
  
  public void setTortoiseLocation(final Point location) {
    final Dimension minSize = this.getMinimumSize();
    IFigure _parent = this.getParent();
    int _divide = (minSize.width / 2);
    int _minus = (location.x - _divide);
    int _divide_1 = (minSize.height / 2);
    int _minus_1 = (location.y - _divide_1);
    org.eclipse.draw2d.geometry.Rectangle _rectangle = new org.eclipse.draw2d.geometry.Rectangle(_minus, _minus_1, 
      minSize.width, 
      minSize.height);
    _parent.setConstraint(this, _rectangle);
  }
  
  public void setAngle(final double angle) {
    this._angle = angle;
    this.revalidate();
  }
}
