/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib.view;

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

@SuppressWarnings("all")
public class TortoiseFigure extends ImageFigure {
  private double _angle;
  
  public double getAngle() {
    return this._angle;
  }
  
  @Inject
  public TortoiseFigure(final PluginImageHelper imageHelper) {
    super(imageHelper.getImage("Turtle.png"), PositionConstants.NORTH_EAST);
  }
  
  protected void paintFigure(final Graphics graphics) {
    graphics.pushState();
    final Dimension size = this.getSize();
    graphics.translate((this.getLocation().x + (size.width / 2)), (this.getLocation().y + (size.width / 2)));
    graphics.rotate((-((float) Math.toDegrees(this.getAngle()))));
    graphics.translate(((-this.getLocation().x) - (size.width / 2)), ((-this.getLocation().y) - (size.width / 2)));
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
    org.eclipse.draw2d.geometry.Rectangle _rectangle = new org.eclipse.draw2d.geometry.Rectangle(
      (location.x - (minSize.width / 2)), 
      (location.y - (minSize.height / 2)), 
      minSize.width, 
      minSize.height);
    _parent.setConstraint(this, _rectangle);
  }
  
  public void setAngle(final double angle) {
    this._angle = angle;
    this.revalidate();
  }
}
