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

  @Override
  public Rectangle getFreeformExtent() {
    Rectangle _xblockexpression = null;
    {
      final Rectangle freeformExtent = super.getFreeformExtent();
      final Viewport parentViewport = this.findViewport(this);
      Rectangle _xifexpression = null;
      if ((parentViewport != null)) {
        Rectangle _xblockexpression_1 = null;
        {
          final Dimension viewDimension = parentViewport.getParent().getBounds().getSize();
          parentViewport.translateToAbsolute(viewDimension);
          this.translateToRelative(viewDimension);
          viewDimension.shrink(freeformExtent.getSize().width, freeformExtent.getSize().height);
          viewDimension.width = Math.max(0, viewDimension.width);
          viewDimension.height = Math.max(0, viewDimension.height);
          Insets _insets = new Insets(viewDimension.height, viewDimension.width, viewDimension.height, 
            viewDimension.width);
          _xblockexpression_1 = freeformExtent.getExpanded(_insets);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = freeformExtent;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  protected Viewport findViewport(final IFigure figure) {
    Viewport _switchResult = null;
    boolean _matched = false;
    if (Objects.equal(figure, null)) {
      _matched=true;
      _switchResult = null;
    }
    if (!_matched) {
      if (figure instanceof Viewport) {
        _matched=true;
        _switchResult = ((Viewport)figure);
      }
    }
    if (!_matched) {
      _switchResult = this.findViewport(figure.getParent());
    }
    return _switchResult;
  }
}
