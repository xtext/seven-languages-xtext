package org.xtext.cradle.scoping;

import java.io.File;
import java.util.Collection;
import java.util.Map;

import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.xtext.cradle.lib.ClassExtensions;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.Literals;
import org.xtext.cradle.lib.MapExtensions;

import com.google.common.collect.Multimap;

public class CradleExtensionClassNameProvider extends
		ExtensionClassNameProvider {

	@Override
	protected Collection<String> computeLiteralClassNames() {
		Collection<String> names = super.computeLiteralClassNames();
		names.add(Literals.class.getName());
		return names;
	}

	@Override
	protected Multimap<Class<?>, Class<?>> simpleComputeExtensionClasses() {
		Multimap<Class<?>, Class<?>> classes = super
				.simpleComputeExtensionClasses();
		classes.put(File.class, FileExtensions.class);
		classes.put(Map.class, MapExtensions.class);
		classes.put(Class.class, ClassExtensions.class);
		return classes;
	}

}
