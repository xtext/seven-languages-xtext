/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.mongobeans.scoping;

import com.google.common.base.Objects;
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
      boolean _notEquals = (!Objects.equal(packageDeclaration, null));
      if (_notEquals) {
        QualifiedName _fullyQualifiedName = this.getFullyQualifiedName(packageDeclaration);
        String _name = mongoBean.getName();
        _xifexpression = _fullyQualifiedName.append(_name);
      } else {
        String _name_1 = mongoBean.getName();
        return QualifiedName.create(_name_1);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
