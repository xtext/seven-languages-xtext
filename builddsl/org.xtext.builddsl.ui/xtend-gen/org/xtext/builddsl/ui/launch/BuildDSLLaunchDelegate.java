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
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.builddsl.ui.launch.RefreshJob;

@SuppressWarnings("all")
public class BuildDSLLaunchDelegate extends JavaLaunchDelegate {
  public void launch(final ILaunchConfiguration configuration, final String mode, final ILaunch launch, final IProgressMonitor monitor) {
    try {
      String _refreshScope = RefreshTab.getRefreshScope(configuration);
      boolean _notEquals = (!Objects.equal(_refreshScope, null));
      if (_notEquals) {
        DebugPlugin _default = DebugPlugin.getDefault();
        final Procedure1<DebugEvent[]> _function = new Procedure1<DebugEvent[]>() {
            public void apply(final DebugEvent[] it) {
              for (final DebugEvent event : it) {
                boolean _and = false;
                Object _source = event.getSource();
                if (!(_source instanceof IProcess)) {
                  _and = false;
                } else {
                  int _kind = event.getKind();
                  boolean _equals = (_kind == DebugEvent.TERMINATE);
                  _and = ((_source instanceof IProcess) && _equals);
                }
                if (_and) {
                  Object _source_1 = event.getSource();
                  final IProcess process = ((IProcess) _source_1);
                  ILaunch _launch = process.getLaunch();
                  ILaunchConfiguration _launchConfiguration = _launch.getLaunchConfiguration();
                  boolean _equals_1 = Objects.equal(configuration, _launchConfiguration);
                  if (_equals_1) {
                    DebugPlugin _default = DebugPlugin.getDefault();
                    _default.removeDebugEventListener(BuildDSLLaunchDelegate.this);
                    RefreshJob _refreshJob = new RefreshJob(configuration);
                    _refreshJob.schedule();
                    return;
                  }
                }
              }
            }
          };
        _default.addDebugEventListener(new IDebugEventSetListener() {
            public void handleDebugEvents(DebugEvent[] events) {
              _function.apply(events);
            }
        });
      }
      super.launch(configuration, mode, launch, monitor);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
