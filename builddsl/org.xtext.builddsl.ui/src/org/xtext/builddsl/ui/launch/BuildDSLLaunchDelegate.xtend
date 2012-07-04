package org.xtext.builddsl.ui.launch

import org.eclipse.jdt.launching.JavaLaunchDelegate
import org.apache.log4j.Logger
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunch
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.debug.ui.RefreshTab
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.model.IProcess
import org.eclipse.debug.core.DebugEvent
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Status

class BuildDSLLaunchDelegate extends JavaLaunchDelegate {
	
	override launch(ILaunchConfiguration configuration, 
		            String mode,
		            ILaunch launch, 
		            IProgressMonitor monitor) {
		if (RefreshTab::getRefreshScope(configuration) != null) {
			DebugPlugin::getDefault.addDebugEventListener [
				for (event : it) {
					if (event.source instanceof IProcess && event.kind == DebugEvent::TERMINATE) {
						val process = event.source as IProcess
						if (configuration == process.launch.launchConfiguration) {
							DebugPlugin::getDefault.removeDebugEventListener(this)
							new RefreshJob(configuration).schedule
							return 
						}
					}
				}
			]
		}
		super.launch(configuration, mode, launch, monitor)
	}
}

class RefreshJob extends Job {

	static val Logger logger = Logger::getLogger(typeof(BuildDSLLaunchDelegate))
	
	ILaunchConfiguration configuration
	
	new(ILaunchConfiguration configuration) {
		super('Refreshing after Build launch')
		this.configuration = configuration
	}
	
	override run(IProgressMonitor monitor) {
		try {
			RefreshTab::refreshResources(configuration, monitor)
		} catch (CoreException e) {
			logger.error(e.message, e)
			return e.getStatus
		}
		Status::OK_STATUS
	}
	
}
