package org.xtext.mongobeans.ui.outline;

import com.google.common.base.Objects;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.xtext.mongobeans.mongoBeans.MongoBean;
import org.xtext.mongobeans.mongoBeans.MongoOperation;
import org.xtext.mongobeans.mongoBeans.MongoProperty;

@SuppressWarnings("all")
public class MongoBeansOutlineTreeProvider extends DefaultOutlineTreeProvider {
  public boolean _isLeaf(final MongoOperation operation) {
    return true;
  }
  
  public void _createChildren(final IOutlineNode parentNode, final MongoProperty property) {
    MongoBean _inlineType = property.getInlineType();
    boolean _notEquals = (!Objects.equal(_inlineType, null));
    if (_notEquals) {
      MongoBean _inlineType_1 = property.getInlineType();
      this.createNode(parentNode, _inlineType_1);
    }
  }
  
  public boolean _isLeaf(final MongoProperty property) {
    MongoBean _inlineType = property.getInlineType();
    boolean _equals = Objects.equal(_inlineType, null);
    return _equals;
  }
}
