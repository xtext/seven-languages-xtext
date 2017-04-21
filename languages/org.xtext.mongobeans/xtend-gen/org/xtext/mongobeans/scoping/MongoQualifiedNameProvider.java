/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.scoping;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.xtext.mongobeans.mongoBeans.MongoBean;
import org.xtext.mongobeans.mongoBeans.PackageDeclaration;

/**
 * Customized to return correct names for inline declared {@link MongoBean}s.
 */
@SuppressWarnings("all")
public class MongoQualifiedNameProvider extends XbaseQualifiedNameProvider {
  public QualifiedName qualifiedName(final MongoBean mongoBean) {
    QualifiedName _xblockexpression = null;
    {
      final PackageDeclaration packageDeclaration = EcoreUtil2.<PackageDeclaration>getContainerOfType(mongoBean, PackageDeclaration.class);
      QualifiedName _xifexpression = null;
      if ((packageDeclaration != null)) {
        _xifexpression = this.getFullyQualifiedName(packageDeclaration).append(mongoBean.getName());
      } else {
        return QualifiedName.create(mongoBean.getName());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
