package org.xtext.tortoiseshell.runtime.view

import java.util.Queue
import java.util.concurrent.ConcurrentLinkedQueue
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.ui.progress.UIJob
import org.eclipse.swt.widgets.Display

class Animator extends UIJob {
	
	val int UPDATE_INTERVAL = 20
	
	long lastStart
	boolean isScheduled
	TortoiseFigure figure
	Queue<Animation> animationQueue = new ConcurrentLinkedQueue
	boolean isStop
	
	new(TortoiseFigure figure) {
		super("Tortoise Animator")
		this.figure = figure
		isScheduled = false
	}
	
	def addAnimation(Animation animation) {
		animationQueue.add(animation)
		if(!isScheduled && !isStop) {
			schedule(UPDATE_INTERVAL)
			isScheduled = true
			lastStart = System::currentTimeMillis
		}
	}
	
	def stop() {
		isStop = true
		while(isScheduled && isStop) 
			Display::current.readAndDispatch
		animationQueue.clear
		isStop = false
		isScheduled = false
	}
	
	override runInUIThread(IProgressMonitor monitor) {
		if(isStop) {
			isStop = false
			isScheduled = false
		} else {
			val now = System::currentTimeMillis
			var currentAnimation = animationQueue.peek()
			while(currentAnimation != null && now >= lastStart + currentAnimation.delay) {
				animationQueue.poll.set(figure, 1)
				lastStart = lastStart + currentAnimation.delay
				currentAnimation = animationQueue.peek
			}
			if(currentAnimation != null) {
				val alpha = (now - lastStart) as double / currentAnimation.delay 
				currentAnimation.set(figure, alpha)
				schedule(UPDATE_INTERVAL)
			} else {
				isScheduled = false
			}
		}
		Status::OK_STATUS
	}
}

