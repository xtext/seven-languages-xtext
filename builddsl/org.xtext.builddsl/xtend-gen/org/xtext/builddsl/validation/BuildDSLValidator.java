package org.xtext.builddsl.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
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
import org.eclipse.xtext.xbase.validation.XbaseJavaValidator;
import org.eclipse.xtext.xtype.XtypePackage;
import org.xtext.builddsl.TaskExtensions;
import org.xtext.builddsl.build.BuildPackage;
import org.xtext.builddsl.build.BuildPackage.Literals;
import org.xtext.builddsl.build.Task;

@SuppressWarnings("all")
public class BuildDSLValidator extends XbaseJavaValidator {
  @Check
  public void checkNoRecursiveDependencies(final Task task) {
    EList<Task> _dependsOn = task.getDependsOn();
    for (final Task taskRef : _dependsOn) {
      boolean _equals = Objects.equal(taskRef, task);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The task \'");
        String _name = task.getName();
        _builder.append(_name, "");
        _builder.append("\' cannot depend on itself.");
        int _minus = (-1);
        this.error(_builder.toString(), taskRef, Literals.DECLARATION__NAME, _minus);
        return;
      }
    }
    final Procedure1<Set<Task>> _function = new Procedure1<Set<Task>>() {
        public void apply(final Set<Task> cycle) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("There is a cyclic dependency that involves tasks ");
          final Function1<Task,String> _function = new Function1<Task,String>() {
              public String apply(final Task it) {
                String _name = it.getName();
                return _name;
              }
            };
          Iterable<String> _map = IterableExtensions.<Task, String>map(cycle, _function);
          String _join = IterableExtensions.join(_map, ", ");
          _builder.append(_join, "");
          int _minus = (-1);
          BuildDSLValidator.this.error(_builder.toString(), task, Literals.DECLARATION__NAME, _minus);
        }
      };
    TaskExtensions.findDependentTasks(task, _function);
  }
  
  protected List<EPackage> getEPackages() {
    final ArrayList<EPackage> result = CollectionLiterals.<EPackage>newArrayList();
    result.add(BuildPackage.eINSTANCE);
    result.add(XbasePackage.eINSTANCE);
    result.add(TypesPackage.eINSTANCE);
    result.add(XtypePackage.eINSTANCE);
    return result;
  }
}
