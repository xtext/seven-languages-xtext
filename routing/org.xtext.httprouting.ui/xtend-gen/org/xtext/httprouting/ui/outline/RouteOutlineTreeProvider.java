package org.xtext.httprouting.ui.outline;

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.xbase.XExpression;
import org.xtext.httprouting.route.Condition;
import org.xtext.httprouting.route.Key;

@SuppressWarnings("all")
public class RouteOutlineTreeProvider extends DefaultOutlineTreeProvider {
  public boolean _isLeaf(final XExpression expr) {
    return true;
  }

  public boolean _isLeaf(final Key key) {
    return true;
  }

  public boolean _isLeaf(final Condition condition) {
    return true;
  }
}
