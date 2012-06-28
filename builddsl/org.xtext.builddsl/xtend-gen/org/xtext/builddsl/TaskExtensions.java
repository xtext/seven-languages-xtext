package org.xtext.builddsl;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.builddsl.build.BuildFile;
import org.xtext.builddsl.build.Task;

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
  
  public static String getJavaClassName(final BuildFile file) {
    String _xifexpression = null;
    String _name = file.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      Resource _eResource = file.eResource();
      URI _uRI = _eResource.getURI();
      URI _trimFileExtension = _uRI.trimFileExtension();
      String _lastSegment = _trimFileExtension.lastSegment();
      _xifexpression = _lastSegment;
    } else {
      String _name_1 = file.getName();
      String _plus = (_name_1 + ".");
      Resource _eResource_1 = file.eResource();
      URI _uRI_1 = _eResource_1.getURI();
      URI _trimFileExtension_1 = _uRI_1.trimFileExtension();
      String _lastSegment_1 = _trimFileExtension_1.lastSegment();
      String _plus_1 = (_plus + _lastSegment_1);
      _xifexpression = _plus_1;
    }
    return _xifexpression;
  }
}
