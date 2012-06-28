package org.xtext.builddsl.scoping;

import java.io.File;
import java.util.Collection;
import java.util.Map;

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.xtext.builddsl.lib.ClassExtensions;
import org.xtext.builddsl.lib.FileExtensions;
import org.xtext.builddsl.lib.Literals;
import org.xtext.builddsl.lib.MapExtensions;

import com.google.common.collect.Multimap;

public class BuildDSLExtensionClassNameProvider extends
		ExtensionClassNameProvider {

	@Override
	protected Collection<String> computeLiteralClassNames() {
		Collection<String> names = super.computeLiteralClassNames();
		names.add(Literals.class.getName());
		return names;
	}

	@Override
	protected Multimap<Class<?>, Class<?>> simpleComputeExtensionClasses() {
		Multimap<Class<?>, Class<?>> classes = super.simpleComputeExtensionClasses();
		classes.put(File.class, FileExtensions.class);
		classes.put(Map.class, MapExtensions.class);
		classes.put(Class.class, ClassExtensions.class);
		return classes;
	}

}
