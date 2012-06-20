package org.xtext.cradle;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.cradle.Task;

@SuppressWarnings("all")
public class TaskExtensions {
  public static Collection<Task> findDependentTasks(final Task it) {
    Collection<Task> _findDependentTasks = TaskExtensions.findDependentTasks(it, null);
    return _findDependentTasks;
  }
  
  public static Collection<Task> findDependentTasks(final Task it, final Procedure1<? super Set<Task>> cycleHandler) {
    LinkedHashSet<Task> _xblockexpression = null;
    {
      final LinkedHashSet<Task> tasks = CollectionLiterals.<Task>newLinkedHashSet();
      TaskExtensions.internalFindDependenTasks(it, tasks);
      final LinkedHashSet<Task> result = CollectionLiterals.<Task>newLinkedHashSet();
      boolean changed = true;
      boolean _while = changed;
      while (_while) {
        {
          changed = false;
          List<Task> _list = IterableExtensions.<Task>toList(tasks);
          for (final Task t : _list) {
            EList<Task> _dependsOn = t.getDependsOn();
            boolean _containsAll = result.containsAll(_dependsOn);
            if (_containsAll) {
              changed = true;
              result.add(t);
              tasks.remove(t);
            }
          }
        }
        _while = changed;
      }
      boolean _and = false;
      boolean _isEmpty = tasks.isEmpty();
      boolean _not = (!_isEmpty);
      if (!_not) {
        _and = false;
      } else {
        boolean _notEquals = (!Objects.equal(cycleHandler, null));
        _and = (_not && _notEquals);
      }
      if (_and) {
        cycleHandler.apply(tasks);
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  private static void internalFindDependenTasks(final Task task, final Set<Task> set) {
    boolean _add = set.add(task);
    boolean _not = (!_add);
    if (_not) {
      return;
    }
    EList<Task> _dependsOn = task.getDependsOn();
    for (final Task t : _dependsOn) {
      TaskExtensions.internalFindDependenTasks(t, set);
    }
  }
}
