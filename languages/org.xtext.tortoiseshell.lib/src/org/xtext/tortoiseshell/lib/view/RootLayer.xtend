/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.tortoiseshell.lib.view

import org.eclipse.draw2d.FreeformLayer
import org.eclipse.draw2d.FreeformLayout
import org.eclipse.draw2d.IFigure
import org.eclipse.draw2d.Viewport
import org.eclipse.draw2d.geometry.Insets

class RootLayer extends FreeformLayer {

	new() {
		layoutManager = new FreeformLayout
	}

	override getFreeformExtent() {
		val freeformExtent = super.freeformExtent
		val parentViewport = findViewport(this)
		if (parentViewport !== null) {
			val viewDimension = parentViewport.parent.bounds.size
			parentViewport.translateToAbsolute(viewDimension)
			translateToRelative(viewDimension)
			viewDimension.shrink(freeformExtent.size.width, freeformExtent.size.height)
			viewDimension.width = Math.max(0, viewDimension.width)
			viewDimension.height = Math.max(0, viewDimension.height)
			freeformExtent.getExpanded(new Insets(viewDimension.height, viewDimension.width, viewDimension.height,
					viewDimension.width))
		} else { 
			 freeformExtent
		}
	}

	def protected Viewport findViewport(IFigure figure) {
		switch figure {
			case null: null
			Viewport: figure
			default: figure.parent.findViewport
		}
	}
}