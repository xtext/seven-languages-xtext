package org.xtext.builddsl.lib;

import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.builddsl.lib.impl.RunUtil;

@SuppressWarnings("all")
public class ClassExtensions {
  public static void runMain(final Class<? extends Object> clazz) {
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    RunUtil.runMain(clazz, ((String[])Conversions.unwrapArray(_emptyList, String.class)));
  }
}
