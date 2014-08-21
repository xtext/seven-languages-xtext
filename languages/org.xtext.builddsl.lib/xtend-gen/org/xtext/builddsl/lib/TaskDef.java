/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.lib;

import java.util.List;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class TaskDef {
  @Property
  private Procedure0 _runnable;
  
  @Property
  private String _name;
  
  @Property
  private List<String> _prerequisitedTasks = CollectionLiterals.<String>newArrayList();
  
  @Property
  private boolean _executed = false;
  
  @Property
  private boolean _isExecuting = false;
  
  @Pure
  public Procedure0 getRunnable() {
    return this._runnable;
  }
  
  public void setRunnable(final Procedure0 runnable) {
    this._runnable = runnable;
  }
  
  @Pure
  public String getName() {
    return this._name;
  }
  
  public void setName(final String name) {
    this._name = name;
  }
  
  @Pure
  public List<String> getPrerequisitedTasks() {
    return this._prerequisitedTasks;
  }
  
  public void setPrerequisitedTasks(final List<String> prerequisitedTasks) {
    this._prerequisitedTasks = prerequisitedTasks;
  }
  
  @Pure
  public boolean isExecuted() {
    return this._executed;
  }
  
  public void setExecuted(final boolean executed) {
    this._executed = executed;
  }
  
  @Pure
  public boolean isIsExecuting() {
    return this._isExecuting;
  }
  
  public void setIsExecuting(final boolean isExecuting) {
    this._isExecuting = isExecuting;
  }
}
