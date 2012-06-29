package org.xtext.builddsl.scoping;

import java.io.File;

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.xtext.builddsl.lib.ClassExtensions;
import org.xtext.builddsl.lib.FileExtensions;

import com.google.common.collect.Multimap;

public class BuildDSLExtensionClassNameProvider extends
		ExtensionClassNameProvider {

	@Override
	protected Multimap<Class<?>, Class<?>> simpleComputeExtensionClasses() {
		Multimap<Class<?>, Class<?>> classes = super.simpleComputeExtensionClasses();
		classes.put(File.class, FileExtensions.class);
		classes.put(Class.class, ClassExtensions.class);
		return classes;
	}

}
