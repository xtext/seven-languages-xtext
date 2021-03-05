/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.httprouting;

import org.eclipse.xtext.service.SingletonBinding;
import org.xtext.httprouting.validation.RouteValidator;

/**
 * Use this class to register components to be used at runtime.
 */
@SuppressWarnings("all")
public class RouteRuntimeModule extends AbstractRouteRuntimeModule {
  @SingletonBinding(eager = true)
  public Class<? extends RouteValidator> bindRouteJavaValidator() {
    return RouteValidator.class;
  }
}
