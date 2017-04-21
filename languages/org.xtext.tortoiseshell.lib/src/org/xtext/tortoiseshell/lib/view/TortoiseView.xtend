/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.tortoiseshell.lib.view

import com.google.inject.Inject
import com.google.inject.Singleton
import org.apache.log4j.Logger
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.FigureCanvas
import org.eclipse.draw2d.FreeformLayeredPane
import org.eclipse.draw2d.FreeformViewport
import org.eclipse.draw2d.Polyline
import org.eclipse.draw2d.geometry.Point
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IViewSite
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.util.DisplayRunHelper
import org.xtext.tortoiseshell.lib.ITortoiseEvent
import org.xtext.tortoiseshell.lib.ITortoiseInterpreter
import org.xtext.tortoiseshell.lib.MoveEvent
import org.xtext.tortoiseshell.lib.Tortoise
import org.xtext.tortoiseshell.lib.TurnEvent

@Singleton
class TortoiseView extends ViewPart implements ITortoiseEvent.Listener {
	
	static val LOGGER = Logger.getLogger(TortoiseView)
	 
	FigureCanvas canvas
	
	@Inject ToggleStopModeAction action
	@Inject RootLayer rootFigure
	@Inject TortoiseFigure tortoiseFigure 
	@Inject TortoisePartListener listener
	@Inject Animator animator
	
	override createPartControl(Composite parent) {
		canvas = new FigureCanvas(parent, SWT.DOUBLE_BUFFERED)
		canvas.viewport = new FreeformViewport
		canvas.background = ColorConstants.white
		val pane = new FreeformLayeredPane
		pane.font = parent.font
		canvas.contents = pane
		pane.add(rootFigure, 'primary')
		reset
		site.page.addPartListener(listener) 
		(site as IViewSite).actionBars.toolBarManager.add(action)
	}

	override setFocus() {
		canvas.setFocus
	}

	def getTortoiseFigure() {
		tortoiseFigure
	}
	
	def getTortoisePartListener() {
		listener
	}

	def reset() {
		rootFigure.removeAll
		rootFigure.add(tortoiseFigure)
		tortoiseFigure.tortoiseLocation = new Point(0,0)
		tortoiseFigure.angle = 0
		val viewportSize = canvas.size	
		canvas.scrollTo(-viewportSize.x / 2, -viewportSize.y/ 2)
	}
	
	def void show(XtextEditor tortoiseEditor, int stopAtLine) {
		animator.setAnimated(stopAtLine < 0)
		DisplayRunHelper.runSyncInDisplayThread[reset]
		tortoiseEditor.document.readOnly [
			if(it !== null && !tortoiseEditor.hasError) {
				val tortoise = new Tortoise
				tortoise.addListener(this)
				val interpreter = resourceServiceProvider.get(ITortoiseInterpreter)
				if(interpreter !== null && !contents.empty) {
					try {
						interpreter.run(tortoise, contents.get(0), stopAtLine)
					} catch (Exception e) {
						MessageDialog.openError(site.shell, "Error during Execution", '''
						Error during execution:
						  «e.message»
						See log for details''')
						LOGGER.error("Error executing TortoiseScript", e)
					}
				}
				tortoise.removeListener(this)
			}
			return null
		]
	}
	
	def hasError(XtextEditor tortoiseEditor) {
		val annotations = tortoiseEditor.documentProvider?.getAnnotationModel(tortoiseEditor.editorInput)?.annotationIterator
		while(annotations !== null && annotations.hasNext) {
			val annotation = annotations.next
			if(annotation.type == XtextEditor.ERROR_ANNOTATION_TYPE) 
				return true
		}
		false
	}
	
	override void handleTortoiseEvent(ITortoiseEvent event) {
		switch event {
			MoveEvent: { 
				if(event.tortoise.paint) {
					val line = new Polyline
					line.foregroundColor = event.tortoise.lineColor
					line.lineWidth = event.tortoise.lineWidth
					line.setEndpoints(event.oldPosition, event.oldPosition)
					animator.addAnimation(new Animation(event.oldPosition, event.tortoise.position, line, event.tortoise.delay)) 					
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

