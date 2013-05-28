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
  protected List<Class<? extends Object>> getStaticImportClasses() {
    List<Class<? extends Object>> _staticImportClasses = super.getStaticImportClasses();
    Iterable<Class<? extends Object>> _plus = Iterables.<Class<? extends Object>>concat(_staticImportClasses, Collections.<Class<? extends Object>>unmodifiableList(Lists.<Class<? extends Object>>newArrayList(Math.class, ColorConstants.class)));
    List<Class<? extends Object>> _list = IterableExtensions.<Class<? extends Object>>toList(_plus);
    return _list;
  }
}
