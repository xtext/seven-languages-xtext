/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.lib;

import com.google.common.base.Objects;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.builddsl.lib.DependsOn;
import org.xtext.builddsl.lib.Param;
import org.xtext.builddsl.lib.TaskDef;

@SuppressWarnings("all")
public abstract class BuildScript {
  public static int OK = 0;
  
  public static int HELP = 1;
  
  public static int ERROR = 2;
  
  public static int WRONG_PARAM = 3;
  
  private Map<String, TaskDef> _tasks;
  
  private Map<String, Field> _parameters;
  
  public Map<String, TaskDef> getTasks() {
    if ((this._tasks == null)) {
      this._tasks = CollectionLiterals.<String, TaskDef>newHashMap();
      Method[] _declaredMethods = this.getClass().getDeclaredMethods();
      for (final Method method : _declaredMethods) {
        {
          final Function1<Annotation, Boolean> _function = (Annotation it) -> {
            Class<? extends Annotation> _annotationType = it.annotationType();
            return Boolean.valueOf(Objects.equal(_annotationType, DependsOn.class));
          };
          final Annotation taskAnnotation = IterableExtensions.<Annotation>findFirst(((Iterable<Annotation>)Conversions.doWrapArray(method.getAnnotations())), _function);
          if ((taskAnnotation != null)) {
            final Procedure1<TaskDef> _function_1 = (TaskDef it) -> {
              it.setPrerequisitedTasks(((List<String>)Conversions.doWrapArray(((DependsOn) taskAnnotation).value())));
              final Procedure0 _function_2 = () -> {
                try {
                  method.setAccessible(true);
                  method.invoke(this);
                } catch (Throwable _e) {
                  throw Exceptions.sneakyThrow(_e);
                }
              };
              it.setRunnable(_function_2);
            };
            this.taskDef(method.getName(), _function_1);
          }
        }
      }
    }
    return this._tasks;
  }
  
  public Map<String, Field> getParameters() {
    if ((this._parameters == null)) {
      this._parameters = CollectionLiterals.<String, Field>newHashMap();
      final Function1<Field, Boolean> _function = (Field it) -> {
        final Function1<Annotation, Boolean> _function_1 = (Annotation it_1) -> {
          Class<? extends Annotation> _annotationType = it_1.annotationType();
          return Boolean.valueOf(Objects.equal(_annotationType, Param.class));
        };
        return Boolean.valueOf(IterableExtensions.<Annotation>exists(((Iterable<Annotation>)Conversions.doWrapArray(it.getAnnotations())), _function_1));
      };
      Iterable<Field> _filter = IterableExtensions.<Field>filter(((Iterable<Field>)Conversions.doWrapArray(this.getClass().getDeclaredFields())), _function);
      for (final Field field : _filter) {
        this._parameters.put(field.getName(), field);
      }
    }
    return this._parameters;
  }
  
  protected int doBuild(final String[] args) {
    final Iterator<String> iter = ((List<String>)Conversions.doWrapArray(args)).iterator();
    final ArrayList<String> tasksToExecute = CollectionLiterals.<String>newArrayList();
    while (iter.hasNext()) {
      {
        final String p = iter.next();
        boolean _startsWith = p.startsWith("--");
        if (_startsWith) {
          boolean __initParameter = this._initParameter(p.substring(2, p.length()), iter.next());
          boolean _not = (!__initParameter);
          if (_not) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Unknown parameter ");
            _builder.append(p);
            InputOutput.<String>println(_builder.toString());
            return BuildScript.WRONG_PARAM;
          }
        } else {
          boolean _containsKey = this.getTasks().containsKey(p);
          boolean _not_1 = (!_containsKey);
          if (_not_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Unknown task ");
            _builder_1.append(p);
            InputOutput.<String>println(_builder_1.toString());
            return BuildScript.WRONG_PARAM;
          }
          tasksToExecute.add(p);
        }
      }
    }
    for (final String task : tasksToExecute) {
      try {
        this._executeTask(task);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          e.printStackTrace();
          return BuildScript.ERROR;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    return BuildScript.OK;
  }
  
  public void _executeTask(final String name) {
    final TaskDef task = this.getTasks().get(name);
    if ((task == null)) {
      throw new UnsupportedOperationException((("A task \'" + name) + "\' does not exist."));
    }
    boolean _isExecuted = task.isExecuted();
    if (_isExecuted) {
      return;
    }
    boolean _isExecuting = task.isExecuting();
    if (_isExecuting) {
      throw new IllegalStateException((("Recursion detected : The task \'" + name) + "\' already running."));
    }
    try {
      task.setIsExecuting(true);
      final Consumer<String> _function = (String it) -> {
        this._executeTask(it);
      };
      task.getPrerequisitedTasks().forEach(_function);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[Task \'");
      _builder.append(name);
      _builder.append("\']");
      InputOutput.<String>println(_builder.toString());
      Procedure0 _runnable = task.getRunnable();
      if (_runnable!=null) {
        _runnable.apply();
      }
    } finally {
      task.setExecuted(true);
      task.setIsExecuting(false);
    }
  }
  
  public boolean showHelp(final String[] args) {
    if ((IterableExtensions.isNullOrEmpty(((Iterable<?>)Conversions.doWrapArray(args))) || IterableExtensions.<String>exists(((Iterable<String>)Conversions.doWrapArray(args)), ((Function1<String, Boolean>) (String arg) -> {
      return Boolean.valueOf((Objects.equal("--help", arg) || Objects.equal("-h", arg)));
    })))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Build \'");
      String _simpleName = this.getClass().getSimpleName();
      _builder.append(_simpleName);
      _builder.append("\'");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("Tasks:");
      _builder.newLine();
      {
        List<String> _sort = IterableExtensions.<String>sort(this.getTasks().keySet());
        for(final String task : _sort) {
          _builder.append("\t");
          _builder.append(task, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        boolean _isEmpty = this.getParameters().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          _builder.append("Parameters:");
          _builder.newLine();
          {
            Collection<Field> _values = this.getParameters().values();
            for(final Field it : _values) {
              _builder.append("\t");
              _builder.append("--");
              String _name = it.getName();
              _builder.append(_name, "\t");
              _builder.append(" <");
              String _simpleName_1 = it.getType().getSimpleName();
              _builder.append(_simpleName_1, "\t");
              _builder.append(">");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      InputOutput.<String>println(_builder.toString());
      return true;
    }
    return false;
  }
  
  public void taskDef(final String name, final Procedure1<? super TaskDef> init) {
    boolean _containsKey = this.getTasks().containsKey(name);
    if (_containsKey) {
      throw new IllegalArgumentException((("A task \'" + name) + "\' is laready registered."));
    }
    final TaskDef task = new TaskDef();
    init.apply(task);
    this.getTasks().put(name, task);
  }
  
  public boolean _initParameter(final String name, final String value) {
    try {
      final Field field = this.getParameters().get(name);
      if ((field == null)) {
        return false;
      }
      field.setAccessible(true);
      field.set(this, this._convertTo(value, field.getType()));
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object _convertTo(final String string, final Class<?> type) {
    Object _switchResult = null;
    boolean _matched = false;
    if (Objects.equal(type, File.class)) {
      _matched=true;
      _switchResult = new File(string);
    }
    if (!_matched) {
      _switchResult = string;
    }
    return _switchResult;
  }
}
