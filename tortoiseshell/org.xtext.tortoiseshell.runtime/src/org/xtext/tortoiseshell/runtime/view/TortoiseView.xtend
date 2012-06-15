package org.xtext.tortoiseshell.runtime.view

import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.Figure
import org.eclipse.draw2d.FigureCanvas
import org.eclipse.draw2d.FreeformLayeredPane
import org.eclipse.draw2d.FreeformViewport
import org.eclipse.draw2d.Polyline
import org.eclipse.draw2d.geometry.Point
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.part.ViewPart
import org.xtext.tortoiseshell.runtime.ITortoiseEvent
import org.xtext.tortoiseshell.runtime.ITortoiseEvent$Listener
import org.xtext.tortoiseshell.runtime.MoveEvent
import org.xtext.tortoiseshell.runtime.TurnEvent
import org.eclipse.xtext.ui.editor.XtextEditor
import org.xtext.tortoiseshell.runtime.Tortoise
import org.xtext.tortoiseshell.runtime.ITortoiseInterpreter
import org.eclipse.jface.text.source.Annotation

class TortoiseView extends ViewPart implements ITortoiseEvent$Listener {
	
	FigureCanvas canvas
	Figure rootFigure
	TortoiseFigure tortoiseFigure 
	TortoisePartListener listener
	Animator animator
	
	override createPartControl(Composite parent) {
		canvas = new FigureCanvas(parent, SWT::DOUBLE_BUFFERED)
		canvas.viewport = new FreeformViewport
		canvas.background = ColorConstants::white
		val pane = new FreeformLayeredPane
		pane.font = parent.font
		canvas.contents = pane
		rootFigure = new RootLayer
		pane.add(rootFigure, 'primary')
		
		tortoiseFigure = new TortoiseFigure
		reset
		listener = new TortoisePartListener(this)
		site.page.addPartListener(listener) 
		animator = new org.xtext.tortoiseshell.runtime.view.Animator(tortoiseFigure)
	}

	override setFocus() {
		canvas.setFocus
	}

	def reset() {
		rootFigure.removeAll
		rootFigure.add(tortoiseFigure)
		tortoiseFigure.tortoiseLocation = new Point(0,0)
		tortoiseFigure.angle = 0
		canvas.scrollTo(-canvas.viewport.bounds.center.x, -canvas.viewport.bounds.center.y)
	}
	
	def show(XtextEditor tortoiseEditor) {
		animator.stop
		reset
		tortoiseEditor.document.readOnly [
			if(!tortoiseEditor.hasError) {
				val tortoise = new Tortoise
				tortoise.addListener(this)
				val interpreter = resourceServiceProvider.get(typeof(ITortoiseInterpreter))
				if(interpreter != null) {
					interpreter.execute(tortoise, it)
				}
				tortoise.removeListener(this)
			}
		]
	}
	
	def hasError(XtextEditor tortoiseEditor) {
		val annotations = tortoiseEditor.documentProvider?.getAnnotationModel(tortoiseEditor.editorInput)?.annotationIterator
		while(annotations != null && annotations.hasNext) {
			val annotation = annotations.next
			if(annotation instanceof Annotation && 
				(annotation as Annotation).type == XtextEditor::ERROR_ANNOTATION_TYPE) 
				return true
		}
		false
	}
	
	override void handleTortoiseEvent(ITortoiseEvent event) {
		switch event {
			MoveEvent: { 
				if(event.tortoise.paint) {
					val line = new Polyline()
					line.foregroundColor = event.tortoise.lineColor
					line.lineWidth = event.tortoise.lineWidth
					line.setEndpoints(event.oldPosition, event.oldPosition)
					animator.addAnimation(new org.xtext.tortoiseshell.runtime.view.Animation(event.oldPosition, event.tortoise.position, line, event.tortoise.delay)) 					
				} else {
					animator.addAnimation(new Animation(event.oldPosition, event.tortoise.position, event.tortoise.delay))
				}
			}
			TurnEvent: {
				animator.addAnimation(new Animation(event.oldAngle, event.tortoise.angleInRadians, event.tortoise.delay))
			} 
		}
	}	
}

