/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.ui.launch;

import com.google.common.base.Objects;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.RefreshTab;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class LaunchConfigurationInfo {
  private final String project;

  private final String clazz;

  private final String task;

  public String getName() {
    return Strings.lastToken(this.clazz, ".");
  }

  public ILaunchConfiguration createConfiguration() {
    try {
      ILaunchConfiguration _xblockexpression = null;
      {
        final ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
        final ILaunchConfigurationType configType = launchManager.getLaunchConfigurationType("org.xtext.builddsl.ui.BuildLaunchConfigurationType");
        final ILaunchConfigurationWorkingCopy wc = configType.newInstance(null, launchManager.generateLaunchConfigurationName(this.getName()));
        wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, this.project);
        wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, this.clazz);
        wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN, false);
        wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, this.task);
        wc.setAttribute(RefreshTab.ATTR_REFRESH_SCOPE, "${workspace}");
        wc.setAttribute(RefreshTab.ATTR_REFRESH_RECURSIVE, true);
        _xblockexpression = wc.doSave();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public boolean configEquals(final ILaunchConfiguration a) {
    try {
      return (((Objects.equal(a.getAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "X"), this.clazz) && 
        Objects.equal(a.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, "X"), this.project)) && 
        a.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, "X").contains(this.task)) && 
        Objects.equal(a.getType().getIdentifier(), "org.xtext.builddsl.ui.BuildLaunchConfigurationType"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public boolean isValid() {
    return (((!StringExtensions.isNullOrEmpty(this.clazz)) && (!StringExtensions.isNullOrEmpty(this.project))) && (!StringExtensions.isNullOrEmpty(this.task)));
  }

  public LaunchConfigurationInfo(final String project, final String clazz, final String task) {
    super();
    this.project = project;
    this.clazz = clazz;
    this.task = task;
  }

  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.project== null) ? 0 : this.project.hashCode());
    result = prime * result + ((this.clazz== null) ? 0 : this.clazz.hashCode());
    return prime * result + ((this.task== null) ? 0 : this.task.hashCode());
  }

  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    LaunchConfigurationInfo other = (LaunchConfigurationInfo) obj;
    if (this.project == null) {
      if (other.project != null)
        return false;
    } else if (!this.project.equals(other.project))
      return false;
    if (this.clazz == null) {
      if (other.clazz != null)
        return false;
    } else if (!this.clazz.equals(other.clazz))
      return false;
    if (this.task == null) {
      if (other.task != null)
        return false;
    } else if (!this.task.equals(other.task))
      return false;
    return true;
  }

  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("project", this.project);
    b.add("clazz", this.clazz);
    b.add("task", this.task);
    return b.toString();
  }

  @Pure
  public String getProject() {
    return this.project;
  }

  @Pure
  public String getClazz() {
    return this.clazz;
  }

  @Pure
  public String getTask() {
    return this.task;
  }
}
