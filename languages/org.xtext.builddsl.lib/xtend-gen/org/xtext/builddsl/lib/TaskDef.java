package org.xtext.builddsl.lib;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0;

@SuppressWarnings("all")
public class TaskDef {
  private Procedure0 _runnable;
  
  public Procedure0 getRunnable() {
    return this._runnable;
  }
  
  public void setRunnable(final Procedure0 runnable) {
    this._runnable = runnable;
  }
  
  private String _name;
  
  public String getName() {
    return this._name;
  }
  
  public void setName(final String name) {
    this._name = name;
  }
  
  private List<String> _prerequisitedTasks = new Function0<List<String>>() {
    public List<String> apply() {
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public List<String> getPrerequisitedTasks() {
    return this._prerequisitedTasks;
  }
  
  public void setPrerequisitedTasks(final List<String> prerequisitedTasks) {
    this._prerequisitedTasks = prerequisitedTasks;
  }
  
  private boolean _executed = false;
  
  public boolean isExecuted() {
    return this._executed;
  }
  
  public void setExecuted(final boolean executed) {
    this._executed = executed;
  }
  
  private boolean _isExecuting = false;
  
  public boolean isIsExecuting() {
    return this._isExecuting;
  }
  
  public void setIsExecuting(final boolean isExecuting) {
    this._isExecuting = isExecuting;
  }
}
