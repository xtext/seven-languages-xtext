package org.xtext.tortoiseshell.scoping;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedTypes;

@SuppressWarnings("all")
public class TortoiseShellImplicitlyImportedTypes extends ImplicitlyImportedTypes {
  protected List<Class<?>> getStaticImportClasses() {
    List<Class<?>> _staticImportClasses = super.getStaticImportClasses();
    Iterable<Class<?>> _plus = Iterables.<Class<?>>concat(_staticImportClasses, Collections.<Class<?>>unmodifiableList(Lists.<Class<?>>newArrayList(Math.class, ColorConstants.class)));
    return IterableExtensions.<Class<?>>toList(_plus);
  }
}
