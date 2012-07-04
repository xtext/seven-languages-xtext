package org.xtext.builddsl.ui.launch;

import java.util.ArrayList;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.RefreshTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaArgumentsTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaClasspathTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaJRETab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaMainTab;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class BuildDSLLaunchTabGroup extends AbstractLaunchConfigurationTabGroup {
  public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
    JavaMainTab _javaMainTab = new JavaMainTab();
    RefreshTab _refreshTab = new RefreshTab();
    JavaArgumentsTab _javaArgumentsTab = new JavaArgumentsTab();
    JavaJRETab _javaJRETab = new JavaJRETab();
    JavaClasspathTab _javaClasspathTab = new JavaClasspathTab();
    SourceLookupTab _sourceLookupTab = new SourceLookupTab();
    EnvironmentTab _environmentTab = new EnvironmentTab();
    CommonTab _commonTab = new CommonTab();
    final ArrayList<AbstractLaunchConfigurationTab> tabs = CollectionLiterals.<AbstractLaunchConfigurationTab>newArrayList(_javaMainTab, _refreshTab, _javaArgumentsTab, _javaJRETab, _javaClasspathTab, _sourceLookupTab, _environmentTab, _commonTab);
    this.setTabs(((ILaunchConfigurationTab[])Conversions.unwrapArray(tabs, ILaunchConfigurationTab.class)));
  }
}
