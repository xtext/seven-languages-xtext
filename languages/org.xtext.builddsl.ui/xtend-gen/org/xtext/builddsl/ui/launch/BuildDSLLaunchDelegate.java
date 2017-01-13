/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.ui.launch;

import com.google.common.base.Objects;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.ui.RefreshTab;
import org.eclipse.jdt.launching.JavaLaunchDelegate;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.builddsl.ui.launch.RefreshJob;

@SuppressWarnings("all")
public class BuildDSLLaunchDelegate extends JavaLaunchDelegate {
  @Override
  public void launch(final ILaunchConfiguration configuration, final String mode, final ILaunch launch, final IProgressMonitor monitor) {
    try {
      String _refreshScope = RefreshTab.getRefreshScope(configuration);
      boolean _tripleNotEquals = (_refreshScope != null);
      if (_tripleNotEquals) {
        final IDebugEventSetListener _function = new IDebugEventSetListener() {
          @Override
          public void handleDebugEvents(final DebugEvent[] it) {
            for (final DebugEvent event : it) {
              if (((event.getSource() instanceof IProcess) && (event.getKind() == DebugEvent.TERMINATE))) {
                Object _source = event.getSource();
                final IProcess process = ((IProcess) _source);
                ILaunchConfiguration _launchConfiguration = process.getLaunch().getLaunchConfiguration();
                boolean _equals = Objects.equal(configuration, _launchConfiguration);
                if (_equals) {
                  DebugPlugin.getDefault().removeDebugEventListener(this);
                  new RefreshJob(configuration).schedule();
                  return;
                }
              }
            }
          }
        };
        DebugPlugin.getDefault().addDebugEventListener(_function);
      }
      super.launch(configuration, mode, launch, monitor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
