/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.tortoiseshell.lib.view

import com.google.inject.Inject
import java.util.Queue
import java.util.concurrent.ConcurrentLinkedQueue
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.progress.UIJob

class Animator extends UIJob {
	
	val int UPDATE_INTERVAL = 20
	
	@Inject TortoiseView view
	
	long lastStart
	boolean isScheduled
	Queue<Animation> animationQueue = new ConcurrentLinkedQueue
	boolean isStop
	boolean isAnimated = true
	
	new() {
		super("Tortoise Animator")
		isScheduled = false
	}
	
	def void addAnimation(Animation animation) {
		if (isAnimated) {
			animationQueue.add(animation)
			if (!isScheduled && !isStop) {
				schedule(UPDATE_INTERVAL)
				isScheduled = true
				lastStart = System.currentTimeMillis
			}
		} else {
			animation.set(view.tortoiseFigure, 1)
		}
	}
	
	def setAnimated(boolean isAnimated) {
		stop()
		this.isAnimated = isAnimated
	}
	
	def stop() {
		isStop = true
		while (isScheduled && isStop) {
			if (Display.current !== null)
				Display.current.readAndDispatch
			else 
				join
		}
		animationQueue.clear
		isStop = false
		isScheduled = false
	}
	
	override runInUIThread(IProgressMonitor monitor) {
		if (isStop) {
			isStop = false
			isScheduled = false
		} else {
			val now = System.currentTimeMillis
			var currentAnimation = animationQueue.peek
			while (currentAnimation !== null && now >= lastStart + currentAnimation.delay) {
				animationQueue.poll.set(view.tortoiseFigure, 1)
				lastStart = lastStart + currentAnimation.delay
				currentAnimation = animationQueue.peek
			}
			if (currentAnimation !== null) {
				val alpha = (now - lastStart) as double / currentAnimation.delay 
				currentAnimation.set(view.tortoiseFigure, alpha)
				schedule(UPDATE_INTERVAL)
			} else {
				isScheduled = false
			}
		}
		Status.OK_STATUS
	}
}

