package org.cradle.language;

import java.util.LinkedHashSet;
import java.util.List;
import org.cradle.language.cradle.Task;
import org.cradle.language.cradle.TaskReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class TaskExtensions {
  public static List<? extends Task> findDependentTasks(final Task it) {
    final LinkedHashSet<Task> set = CollectionLiterals.<Task>newLinkedHashSet();
    TaskExtensions.internalFindDependenTasks(it, set);
    List<Task> _list = IterableExtensions.<Task>toList(set);
    return ListExtensions.<Task>reverseView(_list);
  }
  
  private static void internalFindDependenTasks(final Task task, final LinkedHashSet<Task> set) {
    boolean _contains = set.contains(task);
    if (_contains) {
      return;
    }
    EList<TaskReference> _dependsOn = task.getDependsOn();
    final Function1<TaskReference,Task> _function = new Function1<TaskReference,Task>() {
        public Task apply(final TaskReference it) {
          Task _reference = it.getReference();
          return _reference;
        }
      };
    List<Task> _map = ListExtensions.<TaskReference, Task>map(_dependsOn, _function);
    for (final Task t : _map) {
      {
        set.add(t);
        TaskExtensions.internalFindDependenTasks(t, set);
      }
    }
  }
}
