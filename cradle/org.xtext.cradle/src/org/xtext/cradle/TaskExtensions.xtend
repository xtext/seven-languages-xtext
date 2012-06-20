package org.xtext.cradle

import java.util.LinkedHashSet
import java.util.List
import org.xtext.cradle.cradle.Task

import static org.xtext.cradle.TaskExtensions.*

class TaskExtensions {
	
	def static List<? extends Task> findDependentTasks(Task it) {
		val set = <Task>newLinkedHashSet
		internalFindDependenTasks(it, set)
		return set.toList.reverseView
	}
	
	def private static void internalFindDependenTasks(Task task, LinkedHashSet<Task> set) {
		if (set.contains(task))
			return;
		for (t : task.dependsOn.map[reference]) {
			set += t
			internalFindDependenTasks(t, set)
		}
	}
}