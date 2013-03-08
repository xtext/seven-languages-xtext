package org.xtext.tortoiseshell.scoping;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedTypes;

@SuppressWarnings("all")
public class TortoiseShellImplicitlyImportedTypes extends ImplicitlyImportedTypes {
  protected List<Class<? extends Object>> getStaticImportClasses() {
    List<Class<? extends Object>> _staticImportClasses = super.getStaticImportClasses();
    List<? extends Class<? extends Object>> _xlistliteral = null;
    Builder<Class<? extends Object>> _builder = ImmutableList.builder();
    _builder.add(Math.class);
    _builder.add(ColorConstants.class);
    _xlistliteral = _builder.build();
    Iterable<Class<? extends Object>> _plus = Iterables.<Class<? extends Object>>concat(_staticImportClasses, _xlistliteral);
    List<Class<? extends Object>> _list = IterableExtensions.<Class<? extends Object>>toList(_plus);
    return _list;
  }
}
