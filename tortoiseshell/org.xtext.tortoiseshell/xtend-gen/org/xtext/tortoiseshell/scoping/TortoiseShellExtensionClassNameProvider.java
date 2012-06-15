package org.xtext.tortoiseshell.scoping;

import java.util.Collection;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;

@SuppressWarnings("all")
public class TortoiseShellExtensionClassNameProvider extends ExtensionClassNameProvider {
  protected Collection<String> computeLiteralClassNames() {
    Collection<String> _computeLiteralClassNames = super.computeLiteralClassNames();
    final Procedure1<Collection<String>> _function = new Procedure1<Collection<String>>() {
        public void apply(final Collection<String> it) {
          it.add("java.lang.Math");
          it.add("org.eclipse.draw2d.ColorConstants");
        }
      };
    Collection<String> _doubleArrow = ObjectExtensions.<Collection<String>>operator_doubleArrow(_computeLiteralClassNames, _function);
    return _doubleArrow;
  }
}
