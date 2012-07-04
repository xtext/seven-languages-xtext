package org.xtext.builddsl.scoping;

import com.google.common.collect.Multimap;
import java.io.File;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.xtext.builddsl.lib.ClassExtensions;
import org.xtext.builddsl.lib.FileExtensions;

@SuppressWarnings("all")
public class BuildDSLExtensionClassNameProvider extends ExtensionClassNameProvider {
  public Multimap<Class<? extends Object>,Class<? extends Object>> simpleComputeExtensionClasses() {
    Multimap<Class<? extends Object>,Class<? extends Object>> _simpleComputeExtensionClasses = super.simpleComputeExtensionClasses();
    final Procedure1<Multimap<Class<? extends Object>,Class<? extends Object>>> _function = new Procedure1<Multimap<Class<? extends Object>,Class<? extends Object>>>() {
        public void apply(final Multimap<Class<? extends Object>,Class<? extends Object>> it) {
          it.put(File.class, FileExtensions.class);
          it.put(Class.class, ClassExtensions.class);
        }
      };
    Multimap<Class<? extends Object>,Class<? extends Object>> _doubleArrow = ObjectExtensions.<Multimap<Class<? extends Object>,Class<? extends Object>>>operator_doubleArrow(_simpleComputeExtensionClasses, _function);
    return _doubleArrow;
  }
}
