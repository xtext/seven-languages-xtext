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
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class LaunchConfigurationInfo {
  private final String _project;
  
  private final String _clazz;
  
  private final String _task;
  
  public String getName() {
    String _clazz = this.getClazz();
    return Strings.lastToken(_clazz, ".");
  }
  
  public ILaunchConfiguration createConfiguration() {
    try {
      ILaunchConfiguration _xblockexpression = null;
      {
        DebugPlugin _default = DebugPlugin.getDefault();
        final ILaunchManager launchManager = _default.getLaunchManager();
        final ILaunchConfigurationType configType = launchManager.getLaunchConfigurationType("org.xtext.builddsl.ui.BuildLaunchConfigurationType");
        String _name = this.getName();
        String _generateUniqueLaunchConfigurationNameFrom = launchManager.generateUniqueLaunchConfigurationNameFrom(_name);
        final ILaunchConfigurationWorkingCopy wc = configType.newInstance(null, _generateUniqueLaunchConfigurationNameFrom);
        String _project = this.getProject();
        wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, _project);
        String _clazz = this.getClazz();
        wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, _clazz);
        wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN, false);
        String _task = this.getTask();
        wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, _task);
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
      boolean _and = false;
      boolean _and_1 = false;
      boolean _and_2 = false;
      String _attribute = a.getAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "X");
      String _clazz = this.getClazz();
      boolean _equals = Objects.equal(_attribute, _clazz);
      if (!_equals) {
        _and_2 = false;
      } else {
        String _attribute_1 = a.getAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "X");
        String _project = this.getProject();
        boolean _equals_1 = Objects.equal(_attribute_1, _project);
        _and_2 = _equals_1;
      }
      if (!_and_2) {
        _and_1 = false;
      } else {
        String _attribute_2 = a.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, "X");
        String _task = this.getTask();
        boolean _contains = _attribute_2.contains(_task);
        _and_1 = _contains;
      }
      if (!_and_1) {
        _and = false;
      } else {
        ILaunchConfigurationType _type = a.getType();
        String _identifier = _type.getIdentifier();
        boolean _equals_2 = Objects.equal(_identifier, "org.xtext.builddsl.ui.BuildLaunchConfigurationType");
        _and = _equals_2;
      }
      return _and;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean isValid() {
    boolean _and = false;
    boolean _and_1 = false;
    String _clazz = this.getClazz();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_clazz);
    boolean _not = (!_isNullOrEmpty);
    if (!_not) {
      _and_1 = false;
    } else {
      String _project = this.getProject();
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_project);
      boolean _not_1 = (!_isNullOrEmpty_1);
      _and_1 = _not_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      String _task = this.getTask();
      boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_task);
      boolean _not_2 = (!_isNullOrEmpty_2);
      _and = _not_2;
    }
    return _and;
  }
  
  public LaunchConfigurationInfo(final String project, final String clazz, final String task) {
    super();
    this._project = project;
    this._clazz = clazz;
    this._task = task;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._project== null) ? 0 : this._project.hashCode());
    result = prime * result + ((this._clazz== null) ? 0 : this._clazz.hashCode());
    result = prime * result + ((this._task== null) ? 0 : this._task.hashCode());
    return result;
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
    if (this._project == null) {
      if (other._project != null)
        return false;
    } else if (!this._project.equals(other._project))
      return false;
    if (this._clazz == null) {
      if (other._clazz != null)
        return false;
    } else if (!this._clazz.equals(other._clazz))
      return false;
    if (this._task == null) {
      if (other._task != null)
        return false;
    } else if (!this._task.equals(other._task))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
  
  @Pure
  public String getProject() {
    return this._project;
  }
  
  @Pure
  public String getClazz() {
    return this._clazz;
  }
  
  @Pure
  public String getTask() {
    return this._task;
  }
}
