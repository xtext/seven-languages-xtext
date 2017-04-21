package org.xtext.tortoiseshell.scoping;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures;

@SuppressWarnings("all")
public class TortoiseShellImplicitlyImportedFeatures extends ImplicitlyImportedFeatures {
  @Override
  protected List<Class<?>> getStaticImportClasses() {
    List<Class<?>> _staticImportClasses = super.getStaticImportClasses();
    return IterableExtensions.<Class<?>>toList(Iterables.<Class<?>>concat(_staticImportClasses, Collections.<Class<?>>unmodifiableList(CollectionLiterals.<Class<?>>newArrayList(Math.class, ColorConstants.class))));
  }
}
