/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.ui.outline;

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
    boolean _tripleNotEquals = (_inlineType != null);
    if (_tripleNotEquals) {
      this.createNode(parentNode, property.getInlineType());
    }
  }
  
  public boolean _isLeaf(final MongoProperty property) {
    MongoBean _inlineType = property.getInlineType();
    return (_inlineType == null);
  }
}
