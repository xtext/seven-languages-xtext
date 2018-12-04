/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.validation;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.validation.XbaseValidator;
import org.eclipse.xtext.xtype.XtypePackage;
import org.xtext.builddsl.build.BuildPackage;
import org.xtext.builddsl.build.Task;

@SuppressWarnings("all")
public class BuildDSLValidator extends XbaseValidator {
  public static final String CYCLIC_DEPENDENCY = "build.issue.cyclicDependency";
  
  @Override
  protected List<EPackage> getEPackages() {
    return CollectionLiterals.<EPackage>newArrayList(
      BuildPackage.eINSTANCE, 
      XbasePackage.eINSTANCE, 
      TypesPackage.eINSTANCE, 
      XtypePackage.eINSTANCE);
  }
  
  @Check
  public void checkNoRecursiveDependencies(final Task task) {
    final Procedure1<Set<Task>> _function = (Set<Task> cycle) -> {
      int _size = cycle.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The task \'");
        String _name = task.getName();
        _builder.append(_name);
        _builder.append("\' cannot depend on itself.");
        this.error(_builder.toString(), 
          IterableExtensions.<Task>head(cycle), BuildPackage.Literals.DECLARATION__NAME, BuildDSLValidator.CYCLIC_DEPENDENCY);
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("There is a cyclic dependency that involves tasks ");
        final Function1<Task, String> _function_1 = (Task it) -> {
          return it.getName();
        };
        String _join = IterableExtensions.join(IterableExtensions.<Task, String>map(cycle, _function_1), ", ");
        _builder_1.append(_join);
        this.error(_builder_1.toString(), 
          IterableExtensions.<Task>head(cycle), BuildPackage.Literals.DECLARATION__NAME, BuildDSLValidator.CYCLIC_DEPENDENCY);
      }
    };
    this.findDependentTasks(task, _function);
  }
  
  private Collection<Task> findDependentTasks(final Task it, final Procedure1<? super Set<Task>> cycleHandler) {
    LinkedHashSet<Task> _xblockexpression = null;
    {
      final LinkedHashSet<Task> tasks = CollectionLiterals.<Task>newLinkedHashSet();
      this.internalFindDependentTasksRec(it, tasks);
      final LinkedHashSet<Task> result = CollectionLiterals.<Task>newLinkedHashSet();
      boolean changed = true;
      while (changed) {
        {
          changed = false;
          List<Task> _list = IterableExtensions.<Task>toList(tasks);
          for (final Task t : _list) {
            boolean _containsAll = result.containsAll(t.getDepends());
            if (_containsAll) {
              changed = true;
              result.add(t);
              tasks.remove(t);
            }
          }
        }
      }
      if (((!tasks.isEmpty()) && (cycleHandler != null))) {
        cycleHandler.apply(tasks);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private void internalFindDependentTasksRec(final Task task, final Set<Task> set) {
    boolean _add = set.add(task);
    boolean _not = (!_add);
    if (_not) {
      return;
    }
    EList<Task> _depends = task.getDepends();
    for (final Task t : _depends) {
      this.internalFindDependentTasksRec(t, set);
    }
  }
}
