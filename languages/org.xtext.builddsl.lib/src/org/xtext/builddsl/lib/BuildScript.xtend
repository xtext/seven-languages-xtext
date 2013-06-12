/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.lib

import java.io.File
import java.lang.reflect.Field
import java.util.List
import java.util.Map

abstract class BuildScript {
	
	public static int OK = 0
	public static int HELP = 1
	public static int ERROR = 2
	public static int WRONG_PARAM = 3

	Map<String,TaskDef> _tasks
	Map<String,Field> _parameters
	
	def getTasks() {
		if (_tasks == null) {
			_tasks = newHashMap
			for (method : class.declaredMethods) {
				val taskAnnotation = method.annotations.findFirst[annotationType == DependsOn]
				if (taskAnnotation != null) {
					taskDef(method.name) [
						prerequisitedTasks = (taskAnnotation as DependsOn).value
						runnable = [|
							method.accessible = true
							method.invoke(this)
						]
					]
				}
			}
		}
		return _tasks
	}
	
	def getParameters() {
		if (_parameters == null) {
			_parameters = newHashMap
			for (field : class.declaredFields.filter[ annotations.exists[annotationType == Param] ]) {
				_parameters.put(field.name, field)
			}
		}
		return _parameters
	}
	
	def protected int doBuild(String[] args) {
		val iter = args.iterator
		val tasksToExecute = <String>newArrayList
		while (iter.hasNext) {
			val p = iter.next
			if (p.startsWith("--")) {
				if(!_initParameter(p.substring(2, p.length), iter.next)) {
					println('''Unknown parameter «p»''')
					return WRONG_PARAM
				}
			} else {
				if (!tasks.containsKey(p)) {
					println('''Unknown task «p»''')
					return WRONG_PARAM
				}
				tasksToExecute += p
			}
		}
		for (task : tasksToExecute)
			try {
				task._executeTask
			} catch (Exception e) {
				e.printStackTrace
				return ERROR
			}
		return OK
	}
	
	
	def void _executeTask(String name) {
		val task = tasks.get(name)
		if (task == null)
			throw new UnsupportedOperationException("A task '"+name+"' does not exist.")
		if (task.executed) 
			return;
		if (task.isExecuting)
			throw new IllegalStateException("Recursion detected : The task '"+name+"' already running.")
		try {
			task.isExecuting = true
			task.prerequisitedTasks.forEach[_executeTask]
			println('''[Task '«name»']''')
			task.runnable?.apply
		} finally {
			task.executed = true
			task.isExecuting = false			
		}
	}
	
	def showHelp(String[] args) {
		if (args.nullOrEmpty || args.exists [ arg | "--help" == arg || "-h" == arg]) {
			println('''
				Build '«getClass.simpleName»'
				
				Tasks:
					«FOR task: tasks.keySet.sort»
						«task»
					«ENDFOR»
				
				«IF !parameters.empty»
					Parameters:
						«FOR it: parameters.values»
							--«name» <«type.simpleName»>
						«ENDFOR»
				«ENDIF»
			''')
			return true
		}
		return false
	}
	
	def void taskDef(String name, (TaskDef)=>void init) {
		if (tasks.containsKey(name))
			throw new IllegalArgumentException("A task '"+name+"' is laready registered.")
		val task = new TaskDef
		init.apply(task)
		tasks.put(name, task)
	}
	
	def boolean _initParameter(String name, String value) {
		val field = parameters.get(name)
		if (field == null)
			return false
		field.accessible = true
		field.set(this, value._convertTo(field.type))
		return true
	}
	
	def Object _convertTo(String string, Class<? extends Object> type) {
		switch type {
			case File : new File(string)
			default : string
		}
	}

}

class TaskDef {
	@Property ()=>void runnable
	@Property String name
	@Property List<String> prerequisitedTasks = newArrayList
	@Property boolean executed = false
	@Property boolean isExecuting = false
}

