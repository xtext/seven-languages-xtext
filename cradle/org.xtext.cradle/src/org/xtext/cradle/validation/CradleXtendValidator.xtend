package org.xtext.cradle.validation

import org.eclipse.xtext.validation.Check
import org.xtext.cradle.cradle.Task
import static extension org.xtext.cradle.TaskExtensions.*
import static org.xtext.cradle.cradle.CradlePackage$Literals.*

class CradleXtendValidator extends AbstractCradleJavaValidator {

	@Check
	def void checkNoRecursiveDependencies(Task task) {
		for (taskRef : task.getDependsOn())
			if (taskRef == task) {
				error('''The task '«task.name»' cannot depend on itself.''', taskRef, DECLARATION__NAME, -1)
				return;
			}
		task.findDependentTasks [ cycle |
			error('''There is a cyclic dependency that involves tasks «cycle.map[name].join(", ")»''', task, DECLARATION__NAME, -1);
		]
	}
	
}