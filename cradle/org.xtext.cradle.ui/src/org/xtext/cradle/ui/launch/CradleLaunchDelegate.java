package org.xtext.cradle.ui.launch;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.ui.RefreshTab;
import org.eclipse.jdt.launching.JavaLaunchDelegate;

public class CradleLaunchDelegate extends JavaLaunchDelegate {

	private static final Logger logger = Logger.getLogger(CradleLaunchDelegate.class);
	
	@Override
	public void launch(final ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		if (RefreshTab.getRefreshScope(configuration) != null) {
			DebugPlugin.getDefault().addDebugEventListener(new IDebugEventSetListener() {
				public void handleDebugEvents(DebugEvent[] events) {
					for (int i = 0; i < events.length; i++) {
						DebugEvent event = events[i];
						if (event.getSource() instanceof IProcess && event.getKind() == DebugEvent.TERMINATE) {
							IProcess process = (IProcess) event.getSource();
							if (configuration == process.getLaunch().getLaunchConfiguration()) {
								DebugPlugin.getDefault().removeDebugEventListener(this);
								Job job = new Job("Refreshing after Cradle launch") {
									public IStatus run(IProgressMonitor monitor) {
										try {
											RefreshTab.refreshResources(configuration, monitor);
										} catch (CoreException e) {
											logger.error(e.getMessage(), e);
											return e.getStatus();
										}
										return Status.OK_STATUS;
									}
								};
								job.schedule();
								return;
							}
						}
					}
				}
			});
		}
		super.launch(configuration, mode, launch, monitor);
	}

}
