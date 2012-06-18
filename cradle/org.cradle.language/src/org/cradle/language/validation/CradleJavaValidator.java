package org.cradle.language.validation;

import java.util.List;

import org.cradle.language.TaskExtensions;
import org.cradle.language.cradle.Task;
import org.cradle.language.cradle.TaskReference;
import org.eclipse.xtext.validation.Check;
 

public class CradleJavaValidator extends AbstractCradleJavaValidator {

	@Check
	public void checkNoRecursiveDependencies(Task task) {
		for (TaskReference taskRef: task.getDependsOn()) {
			if (taskRef.getReference() == task) {
				error("The task '"+task.getName()+"' cannot depend on itself.", taskRef, null, -1);
			} else {
				List<? extends Task> tasks = TaskExtensions.findDependentTasks(taskRef.getReference());
				if (tasks.contains(task)) {
					error("Task '"+taskRef.getReference().getName()+"' already depends on '"+task.getName()+"'", taskRef, null, -1);
				}
			}
		}
	}

}
