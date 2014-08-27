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
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
    boolean _equals = Objects.equal(this._tasks, null);
    if (_equals) {
      HashMap<String, TaskDef> _newHashMap = CollectionLiterals.<String, TaskDef>newHashMap();
      this._tasks = _newHashMap;
      Class<? extends BuildScript> _class = this.getClass();
      Method[] _declaredMethods = _class.getDeclaredMethods();
      for (final Method method : _declaredMethods) {
        {
          final DependsOn taskAnnotation = method.<DependsOn>getAnnotation(DependsOn.class);
          boolean _notEquals = (!Objects.equal(taskAnnotation, null));
          if (_notEquals) {
            String _name = method.getName();
            final Procedure1<TaskDef> _function = new Procedure1<TaskDef>() {
              public void apply(final TaskDef it) {
                String[] _value = taskAnnotation.value();
                it.setPrerequisitedTasks(((List<String>)Conversions.doWrapArray(_value)));
                final Procedure0 _function = new Procedure0() {
                  public void apply() {
                    try {
                      method.setAccessible(true);
                      method.invoke(BuildScript.this);
                    } catch (Throwable _e) {
                      throw Exceptions.sneakyThrow(_e);
                    }
                  }
                };
                it.setRunnable(_function);
              }
            };
            this.taskDef(_name, _function);
          }
        }
      }
    }
    return this._tasks;
  }
  
  public Map<String, Field> getParameters() {
    boolean _equals = Objects.equal(this._parameters, null);
    if (_equals) {
      HashMap<String, Field> _newHashMap = CollectionLiterals.<String, Field>newHashMap();
      this._parameters = _newHashMap;
      Class<? extends BuildScript> _class = this.getClass();
      Field[] _declaredFields = _class.getDeclaredFields();
      final Function1<Field, Boolean> _function = new Function1<Field, Boolean>() {
        public Boolean apply(final Field it) {
          return Boolean.valueOf(it.isAnnotationPresent(Param.class));
        }
      };
      Iterable<Field> _filter = IterableExtensions.<Field>filter(((Iterable<Field>)Conversions.doWrapArray(_declaredFields)), _function);
      for (final Field field : _filter) {
        String _name = field.getName();
        this._parameters.put(_name, field);
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
          int _length = p.length();
          String _substring = p.substring(2, _length);
          String _next = iter.next();
          boolean __initParameter = this._initParameter(_substring, _next);
          boolean _not = (!__initParameter);
          if (_not) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Unknown parameter ");
            _builder.append(p, "");
            InputOutput.<String>println(_builder.toString());
            return BuildScript.WRONG_PARAM;
          }
        } else {
          Map<String, TaskDef> _tasks = this.getTasks();
          boolean _containsKey = _tasks.containsKey(p);
          boolean _not_1 = (!_containsKey);
          if (_not_1) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("Unknown task ");
            _builder_1.append(p, "");
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
    Map<String, TaskDef> _tasks = this.getTasks();
    final TaskDef task = _tasks.get(name);
    boolean _equals = Objects.equal(task, null);
    if (_equals) {
      throw new UnsupportedOperationException((("A task \'" + name) + "\' does not exist."));
    }
    boolean _isExecuted = task.isExecuted();
    if (_isExecuted) {
      return;
    }
    boolean _isIsExecuting = task.isIsExecuting();
    if (_isIsExecuting) {
      throw new IllegalStateException((("Recursion detected : The task \'" + name) + "\' already running."));
    }
    try {
      task.setIsExecuting(true);
      List<String> _prerequisitedTasks = task.getPrerequisitedTasks();
      final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          BuildScript.this._executeTask(it);
        }
      };
      IterableExtensions.<String>forEach(_prerequisitedTasks, _function);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[Task \'");
      _builder.append(name, "");
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
    boolean _or = false;
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(((Iterable<?>)Conversions.doWrapArray(args)));
    if (_isNullOrEmpty) {
      _or = true;
    } else {
      final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
        public Boolean apply(final String arg) {
          boolean _or = false;
          boolean _equals = Objects.equal("--help", arg);
          if (_equals) {
            _or = true;
          } else {
            boolean _equals_1 = Objects.equal("-h", arg);
            _or = _equals_1;
          }
          return Boolean.valueOf(_or);
        }
      };
      boolean _exists = IterableExtensions.<String>exists(((Iterable<String>)Conversions.doWrapArray(args)), _function);
      _or = _exists;
    }
    if (_or) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Build \'");
      Class<? extends BuildScript> _class = this.getClass();
      String _simpleName = _class.getSimpleName();
      _builder.append(_simpleName, "");
      _builder.append("\'");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("Tasks:");
      _builder.newLine();
      {
        Map<String, TaskDef> _tasks = this.getTasks();
        Set<String> _keySet = _tasks.keySet();
        List<String> _sort = IterableExtensions.<String>sort(_keySet);
        for(final String task : _sort) {
          _builder.append("\t");
          _builder.append(task, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        Map<String, Field> _parameters = this.getParameters();
        boolean _isEmpty = _parameters.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          _builder.append("Parameters:");
          _builder.newLine();
          {
            Map<String, Field> _parameters_1 = this.getParameters();
            Collection<Field> _values = _parameters_1.values();
            for(final Field it : _values) {
              _builder.append("\t");
              _builder.append("--");
              String _name = it.getName();
              _builder.append(_name, "\t");
              _builder.append(" <");
              Class<?> _type = it.getType();
              String _simpleName_1 = _type.getSimpleName();
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
    Map<String, TaskDef> _tasks = this.getTasks();
    boolean _containsKey = _tasks.containsKey(name);
    if (_containsKey) {
      throw new IllegalArgumentException((("A task \'" + name) + "\' is laready registered."));
    }
    final TaskDef task = new TaskDef();
    init.apply(task);
    Map<String, TaskDef> _tasks_1 = this.getTasks();
    _tasks_1.put(name, task);
  }
  
  public boolean _initParameter(final String name, final String value) {
    try {
      Map<String, Field> _parameters = this.getParameters();
      final Field field = _parameters.get(name);
      boolean _equals = Objects.equal(field, null);
      if (_equals) {
        return false;
      }
      field.setAccessible(true);
      Class<?> _type = field.getType();
      Object __convertTo = this._convertTo(value, _type);
      field.set(this, __convertTo);
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object _convertTo(final String string, final Class<?> type) {
    Object _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(type, File.class)) {
        _matched=true;
        _switchResult = new File(string);
      }
    }
    if (!_matched) {
      _switchResult = string;
    }
    return ((Serializable)_switchResult);
  }
}
