package org.xtext.httprouting.ui.outline;

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.xtext.httprouting.route.Dependency;
import org.xtext.httprouting.route.Route;

@SuppressWarnings("all")
public class RouteOutlineTreeProvider extends DefaultOutlineTreeProvider {
  public boolean _isLeaf(final Route r) {
    return true;
  }
  
  public boolean _isLeaf(final Dependency r) {
    return true;
  }
}
