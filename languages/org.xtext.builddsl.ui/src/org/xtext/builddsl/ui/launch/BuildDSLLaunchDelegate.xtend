/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.ui.launch

import org.apache.log4j.Logger
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.debug.core.DebugEvent
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.model.IProcess
import org.eclipse.debug.ui.RefreshTab
import org.eclipse.jdt.launching.JavaLaunchDelegate

class BuildDSLLaunchDelegate extends JavaLaunchDelegate {
	
	override launch(ILaunchConfiguration configuration, 
		            String mode,
		            ILaunch launch, 
		            IProgressMonitor monitor) {
		if (RefreshTab.getRefreshScope(configuration) != null) {
			DebugPlugin.getDefault.addDebugEventListener [events|
				for (event : events) {
					if (event.source instanceof IProcess && event.kind == DebugEvent.TERMINATE) {
						val process = event.source as IProcess
						if (configuration == process.launch.launchConfiguration) {
							DebugPlugin.getDefault.removeDebugEventListener(self)
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

	static val Logger logger = Logger.getLogger(BuildDSLLaunchDelegate)
	
	ILaunchConfiguration configuration
	
	new(ILaunchConfiguration configuration) {
		super('Refreshing after Build launch')
		this.configuration = configuration
	}
	
	override run(IProgressMonitor monitor) {
		try {
			RefreshTab.refreshResources(configuration, monitor)
		} catch (CoreException e) {
			logger.error(e.message, e)
			return e.status
		}
		Status.OK_STATUS
	}
	
}
