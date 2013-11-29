/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib.view;

import com.google.common.base.Objects;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

@SuppressWarnings("all")
public class RootLayer extends FreeformLayer {
  public RootLayer() {
    FreeformLayout _freeformLayout = new FreeformLayout();
    this.setLayoutManager(_freeformLayout);
  }
  
  public Rectangle getFreeformExtent() {
    Rectangle _xblockexpression = null;
    {
      final Rectangle freeformExtent = super.getFreeformExtent();
      final Viewport parentViewport = this.findViewport(this);
      Rectangle _xifexpression = null;
      boolean _notEquals = (!Objects.equal(parentViewport, null));
      if (_notEquals) {
        Rectangle _xblockexpression_1 = null;
        {
          IFigure _parent = parentViewport.getParent();
          Rectangle _bounds = _parent.getBounds();
          final Dimension viewDimension = _bounds.getSize();
          parentViewport.translateToAbsolute(viewDimension);
          this.translateToRelative(viewDimension);
          Dimension _size = freeformExtent.getSize();
          Dimension _size_1 = freeformExtent.getSize();
          viewDimension.shrink(_size.width, _size_1.height);
          int _max = Math.max(0, viewDimension.width);
          viewDimension.width = _max;
          int _max_1 = Math.max(0, viewDimension.height);
          viewDimension.height = _max_1;
          Insets _insets = new Insets(viewDimension.height, viewDimension.width, viewDimension.height, 
            viewDimension.width);
          Rectangle _expanded = freeformExtent.getExpanded(_insets);
          _xblockexpression_1 = (_expanded);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = freeformExtent;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected Viewport findViewport(final IFigure figure) {
    Viewport _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(figure,null)) {
        _matched=true;
        _switchResult = null;
      }
    }
    if (!_matched) {
      if (figure instanceof Viewport) {
        _matched=true;
        _switchResult = ((Viewport)figure);
      }
    }
    if (!_matched) {
      IFigure _parent = figure.getParent();
      Viewport _findViewport = this.findViewport(_parent);
      _switchResult = _findViewport;
    }
    return _switchResult;
  }
}
