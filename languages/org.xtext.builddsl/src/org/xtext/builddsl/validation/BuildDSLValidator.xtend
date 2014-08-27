/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.validation

import java.util.Set
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xbase.validation.XbaseJavaValidator
import org.eclipse.xtext.xtype.XtypePackage
import org.xtext.builddsl.build.BuildPackage
import org.xtext.builddsl.build.Task

import static org.xtext.builddsl.build.BuildPackage.Literals.*

class BuildDSLValidator extends XbaseJavaValidator {
	
	public static val CYCLIC_DEPENDENCY = "build.issue.cyclicDependency"
	
	override protected getEPackages() {
	    newArrayList(
		    BuildPackage.eINSTANCE,
		    XbasePackage.eINSTANCE,
		    TypesPackage.eINSTANCE,
		    XtypePackage.eINSTANCE)
	}
	
	@Check
	def void checkNoRecursiveDependencies(Task task) {
		task.findDependentTasks [ cycle |
			if (cycle.size == 1) {
				error('''The task '«task.name»' cannot depend on itself.''', 
					  cycle.head, DECLARATION__NAME, CYCLIC_DEPENDENCY)
			} else {
				error('''There is a cyclic dependency that involves tasks «cycle.map[name].join(", ")»''', 
					  cycle.head, DECLARATION__NAME, CYCLIC_DEPENDENCY)
			}
		]
	}
	
	def private findDependentTasks(Task it, (Set<Task>) => void cycleHandler) {
		
		// 1. collect all tasks that we depend on
		val tasks = <Task>newLinkedHashSet
		findDependentTasksRec(tasks)
		
		// 2. sort them so that dependents come after dependees  
		val result = <Task>newLinkedHashSet
		var changed = true
		while (changed) {
			changed = false
			for (t : tasks.toList) 
				if (result.containsAll(t.depends)) {
					changed = true
					result.add(t)
					tasks.remove(t)
				}
		}
		if (!tasks.empty && cycleHandler != null)
			cycleHandler.apply(tasks)
		result
	}
	
	def private void findDependentTasksRec(Task task, Set<Task> set) {
		if (!set.add(task))
			return;
		for (t : task.depends) 
			findDependentTasksRec(t, set)
	}

}