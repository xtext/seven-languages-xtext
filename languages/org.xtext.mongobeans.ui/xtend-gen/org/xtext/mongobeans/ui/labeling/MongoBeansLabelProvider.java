/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;
import org.xtext.mongobeans.mongoBeans.MongoBean;
import org.xtext.mongobeans.mongoBeans.MongoOperation;
import org.xtext.mongobeans.mongoBeans.MongoProperty;
import org.xtext.mongobeans.mongoBeans.PackageDeclaration;

@SuppressWarnings("all")
public class MongoBeansLabelProvider extends XbaseLabelProvider {
  @Inject
  public MongoBeansLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  @Override
  protected Object doGetImage(final Object element) {
    Object _switchResult = null;
    boolean _matched = false;
    if (element instanceof MongoBean) {
      _matched=true;
      _switchResult = "Letter-B-blue-icon.png";
    }
    if (!_matched) {
      if (element instanceof MongoProperty) {
        _matched=true;
        _switchResult = "Letter-P-orange-icon.png";
      }
    }
    if (!_matched) {
      if (element instanceof MongoOperation) {
        _matched=true;
        _switchResult = "Letter-O-red-icon.png";
      }
    }
    if (!_matched) {
      if (element instanceof PackageDeclaration) {
        _matched=true;
        _switchResult = "package_obj.gif";
      }
    }
    if (!_matched) {
      _switchResult = super.doGetImage(element);
    }
    return _switchResult;
  }
}
