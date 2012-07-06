package org.xtext.httprouting.ui.outline;

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.xbase.XExpression;

@SuppressWarnings("all")
public class RouteOutlineTreeProvider extends DefaultOutlineTreeProvider {
  public boolean _isLeaf(final XExpression expr) {
    return true;
  }
}
