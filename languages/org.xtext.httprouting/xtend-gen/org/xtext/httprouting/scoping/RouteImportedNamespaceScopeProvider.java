package org.xtext.httprouting.scoping;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;
import org.xtext.httprouting.route.Import;
import org.xtext.httprouting.route.Model;

/**
 * Adds the imports
 */
@SuppressWarnings("all")
public class RouteImportedNamespaceScopeProvider extends XbaseImportedNamespaceScopeProvider {
  public List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    final Model model = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
    EList<Import> _imports = model.getImports();
    final Function1<Import,ImportNormalizer> _function = new Function1<Import,ImportNormalizer>() {
        public ImportNormalizer apply(final Import it) {
          JvmType _importedType = it.getImportedType();
          String _qualifiedName = _importedType.getQualifiedName();
          ImportNormalizer _createImportedNamespaceResolver = RouteImportedNamespaceScopeProvider.this.createImportedNamespaceResolver(_qualifiedName, ignoreCase);
          return _createImportedNamespaceResolver;
        }
      };
    List<ImportNormalizer> _map = ListExtensions.<Import, ImportNormalizer>map(_imports, _function);
    Iterable<ImportNormalizer> _filterNull = IterableExtensions.<ImportNormalizer>filterNull(_map);
    return IterableExtensions.<ImportNormalizer>toList(_filterNull);
  }
}
