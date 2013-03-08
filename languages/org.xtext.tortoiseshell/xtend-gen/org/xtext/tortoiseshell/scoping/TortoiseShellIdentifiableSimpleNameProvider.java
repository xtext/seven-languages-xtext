/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.scoping;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.xtext.tortoiseshell.jvmmodel.TortoiseShellJvmModelInferrer;

@SuppressWarnings("all")
public class TortoiseShellIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {
  public String getSimpleName(final JvmIdentifiableElement element) {
    String _xifexpression = null;
    String _simpleName = element.getSimpleName();
    boolean _equals = ObjectExtensions.operator_equals(_simpleName, TortoiseShellJvmModelInferrer.INFERRED_CLASS_NAME);
    if (_equals) {
      _xifexpression = "this";
    } else {
      String _simpleName_1 = super.getSimpleName(element);
      _xifexpression = _simpleName_1;
    }
    return _xifexpression;
  }
}
