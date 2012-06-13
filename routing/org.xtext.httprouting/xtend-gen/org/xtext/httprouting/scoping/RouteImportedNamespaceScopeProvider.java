package org.xtext.httprouting.scoping;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;
import org.xtext.httprouting.route.Import;
import org.xtext.httprouting.route.Model;
import org.xtext.httprouting.route.Route;

/**
 * @author Holger Schill - Initial contribution and API
 */
@SuppressWarnings("all")
public class RouteImportedNamespaceScopeProvider extends XbaseImportedNamespaceScopeProvider {
  public List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    List<ImportNormalizer> _xblockexpression = null;
    {
      boolean _not = (!(context instanceof Route));
      if (_not) {
        return CollectionLiterals.<ImportNormalizer>emptyList();
      }
      final Model model = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      final List<ImportNormalizer> importedNamespaceResolvers = CollectionLiterals.<ImportNormalizer>newArrayList();
      EList<Import> _imports = model.getImports();
      for (final Import imp : _imports) {
        JvmType _importedType = imp.getImportedType();
        boolean _notEquals = (!Objects.equal(_importedType, null));
        if (_notEquals) {
          JvmType _importedType_1 = imp.getImportedType();
          final String value = _importedType_1.getQualifiedName();
          final ImportNormalizer resolver = this.createImportedNamespaceResolver(value, ignoreCase);
          boolean _notEquals_1 = (!Objects.equal(resolver, null));
          if (_notEquals_1) {
            importedNamespaceResolvers.add(resolver);
          }
        }
      }
      _xblockexpression = (importedNamespaceResolvers);
    }
    return _xblockexpression;
  }
}
