/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.httprouting.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;
import org.xtext.httprouting.route.Dependency;
import org.xtext.httprouting.route.Route;

@SuppressWarnings("all")
public class RouteLabelProvider extends XbaseLabelProvider {
  @Inject
  public RouteLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Dependency dep) {
    StringConcatenation _builder = new StringConcatenation();
    String _simpleName = dep.getType().getSimpleName();
    _builder.append(_simpleName);
    _builder.append(" ");
    String _name = dep.getName();
    _builder.append(_name);
    return _builder.toString();
  }
  
  public String text(final Route route) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = route.getRequestType().getName();
    _builder.append(_name);
    String _text = NodeModelUtils.getNode(route.getUrl()).getText();
    _builder.append(_text);
    return _builder.toString();
  }
}
