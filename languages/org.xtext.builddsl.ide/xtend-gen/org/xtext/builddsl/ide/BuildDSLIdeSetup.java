/**
 * generated by Xtext 2.11.0-SNAPSHOT
 */
package org.xtext.builddsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.builddsl.BuildDSLRuntimeModule;
import org.xtext.builddsl.BuildDSLStandaloneSetup;
import org.xtext.builddsl.ide.BuildDSLIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class BuildDSLIdeSetup extends BuildDSLStandaloneSetup {
  @Override
  public Injector createInjector() {
    BuildDSLRuntimeModule _buildDSLRuntimeModule = new BuildDSLRuntimeModule();
    BuildDSLIdeModule _buildDSLIdeModule = new BuildDSLIdeModule();
    return Guice.createInjector(Modules2.mixin(_buildDSLRuntimeModule, _buildDSLIdeModule));
  }
}
