package org.xtext.builddsl.ui.launch

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup
import org.eclipse.debug.ui.CommonTab
import org.eclipse.debug.ui.EnvironmentTab
import org.eclipse.debug.ui.ILaunchConfigurationDialog
import org.eclipse.debug.ui.RefreshTab
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaArgumentsTab
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaClasspathTab
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaJRETab
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaMainTab

class BuildDSLLaunchTabGroup extends AbstractLaunchConfigurationTabGroup {

	override createTabs(ILaunchConfigurationDialog dialog, String mode) {
		val tabs = newArrayList(
			new JavaMainTab,
			new RefreshTab,
			new JavaArgumentsTab,
			new JavaJRETab,
			new JavaClasspathTab,
			new SourceLookupTab,
			new EnvironmentTab,
			new CommonTab
		)
		setTabs(tabs);
	}
}