package org.xtext.tortoiseshell.runtime.view

import com.google.inject.Inject
import org.eclipse.draw2d.Graphics
import org.eclipse.draw2d.ImageFigure
import org.eclipse.draw2d.PositionConstants
import org.eclipse.draw2d.geometry.Dimension
import org.eclipse.draw2d.geometry.Point
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.xtend.lib.Property
import org.eclipse.xtext.ui.PluginImageHelper

class TortoiseFigure extends ImageFigure {

	@Property double angle

	@Inject 
	new(PluginImageHelper imageHelper) {
		super(imageHelper.getImage('Turtle.png'), PositionConstants::NORTH_EAST)
	}
	
	override protected paintFigure(Graphics graphics) {
		graphics.pushState
		val size = size
		graphics.translate(location.x + size.width/2, location.y + size.width/2)
		graphics.rotate(-Math::toDegrees(angle) as float) 
		graphics.translate(-location.x - size.width/2, -location.y - size.width/2)
		super.paintFigure(graphics)
		graphics.popState 
	}
  
	override getMinimumSize(int wHint, int hHint) {
		val bounds = image.bounds
		new Dimension(bounds.width, bounds.height)
	}
	
	def setTortoiseLocation(Point location) {
		val minSize = getMinimumSize()
		parent.setConstraint(this, new Rectangle(
			location.x - minSize.width / 2, 
			location.y - minSize.height / 2,
			minSize.width,
			minSize.height
		))
	}

	def setAngle(double angle) {
		_angle = angle
		revalidate
	}

}
