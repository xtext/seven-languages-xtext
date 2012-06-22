package org.xtext.cradle.lib.impl

import org.eclipse.xtend.lib.Property

class TaskState {
	private static val state = new ThreadLocal<TaskStateImpl>()
	
	def private static getImpl() {
		state.get() ?: new TaskStateImpl() => [ state.set(it) ]
	}
	
	def static setMaySkip(boolean value) {
		impl.maySkip = value
	}	
	
	def static skipTask(String message) {
		if(impl.maySkip) {
			setMaySkip(false)
			throw new TaskSkippedException(message)
		}
	}
	
	def static addTaskFinishListener((String, Throwable)=>void listener) {
		impl.finishListeners += listener
	}
	
	def static fireFinishTask(String name, Throwable t) {
		val listeners = impl.finishListeners
		listeners.forEach[ apply(name, t) ]
		listeners.clear()
	}
}

class TaskStateImpl {
	@Property var maySkip = true
	@Property val finishListeners = <(String, Throwable)=>void>newArrayList()   
}
