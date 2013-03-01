/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.scoping;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsBatchScopeProvider;
import org.eclipse.xtext.xbase.imports.IImportsConfiguration;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;

@SuppressWarnings("all")
public class BuildDSLBatchScopeProvider extends XbaseWithAnnotationsBatchScopeProvider {
  @Inject
  private IImportsConfiguration importsConfig;
  
  public IFeatureScopeSession newSession(final Resource context) {
    IFeatureScopeSession _xblockexpression = null;
    {
      IFeatureScopeSession result = super.newSession(context);
      final XImportSection importSection = this.importsConfig.getImportSection(((XtextResource) context));
      boolean _notEquals = ObjectExtensions.operator_notEquals(importSection, null);
      if (_notEquals) {
        EList<XImportDeclaration> _importDeclarations = importSection.getImportDeclarations();
        final Function1<XImportDeclaration,Boolean> _function = new Function1<XImportDeclaration,Boolean>() {
            public Boolean apply(final XImportDeclaration it) {
              boolean _isStatic = it.isStatic();
              boolean _not = (!_isStatic);
              return Boolean.valueOf(_not);
            }
          };
        Iterable<XImportDeclaration> _filter = IterableExtensions.<XImportDeclaration>filter(_importDeclarations, _function);
        final Function1<XImportDeclaration,JvmDeclaredType> _function_1 = new Function1<XImportDeclaration,JvmDeclaredType>() {
            public JvmDeclaredType apply(final XImportDeclaration it) {
              JvmDeclaredType _importedType = it.getImportedType();
              return _importedType;
            }
          };
        Iterable<JvmDeclaredType> _map = IterableExtensions.<XImportDeclaration, JvmDeclaredType>map(_filter, _function_1);
        final List<JvmDeclaredType> plainImportedTypes = IterableExtensions.<JvmDeclaredType>toList(_map);
        IFeatureScopeSession _addTypesToStaticScope = result.addTypesToStaticScope(plainImportedTypes, plainImportedTypes);
        result = _addTypesToStaticScope;
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
}
