/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.lib;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class TaskDef {
  private Procedure0 runnable;

  private String name;

  private List<String> prerequisitedTasks = CollectionLiterals.<String>newArrayList();

  private boolean executed = false;

  private boolean isExecuting = false;

  @Pure
  public Procedure0 getRunnable() {
    return this.runnable;
  }

  public void setRunnable(final Procedure0 runnable) {
    this.runnable = runnable;
  }

  @Pure
  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Pure
  public List<String> getPrerequisitedTasks() {
    return this.prerequisitedTasks;
  }

  public void setPrerequisitedTasks(final List<String> prerequisitedTasks) {
    this.prerequisitedTasks = prerequisitedTasks;
  }

  @Pure
  public boolean isExecuted() {
    return this.executed;
  }

  public void setExecuted(final boolean executed) {
    this.executed = executed;
  }

  @Pure
  public boolean isExecuting() {
    return this.isExecuting;
  }

  public void setIsExecuting(final boolean isExecuting) {
    this.isExecuting = isExecuting;
  }
}
