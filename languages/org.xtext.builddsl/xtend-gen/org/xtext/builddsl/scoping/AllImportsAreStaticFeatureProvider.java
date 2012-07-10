package org.xtext.builddsl.scoping;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider;
import org.xtext.builddsl.build.BuildFile;
import org.xtext.builddsl.build.ImportDeclaration;

/**
 * Handle all imports as static imports.
 */
@SuppressWarnings("all")
public class AllImportsAreStaticFeatureProvider extends StaticImplicitMethodsFeatureForTypeProvider {
  public Map<JvmTypeReference,Collection<String>> getVisibleTypesContainingStaticMethods(final Iterable<JvmTypeReference> hierarchy) {
    EList<EObject> _contents = this.context.getContents();
    EObject _get = _contents.get(0);
    final BuildFile buildFile = ((BuildFile) _get);
    final ArrayList<String> importedTypes = CollectionLiterals.<String>newArrayList();
    EList<ImportDeclaration> _imports = buildFile.getImports();
    for (final ImportDeclaration importDeclaration : _imports) {
      {
        final String importedTypeOrPackage = importDeclaration.getImportedNamespace();
        boolean _endsWith = importedTypeOrPackage.endsWith(".*");
        boolean _not = (!_endsWith);
        if (_not) {
          importedTypes.add(importedTypeOrPackage);
        }
      }
    }
    Map<JvmTypeReference,Collection<String>> _visibleTypesContainingStaticMethods = super.getVisibleTypesContainingStaticMethods(hierarchy);
    final LinkedHashMap<JvmTypeReference,Collection<String>> result = Maps.<JvmTypeReference, Collection<String>>newLinkedHashMap(_visibleTypesContainingStaticMethods);
    Set<Entry<JvmTypeReference,Collection<String>>> _entrySet = result.entrySet();
    for (final Entry<JvmTypeReference,Collection<String>> entry : _entrySet) {
      {
        Collection<String> _value = entry.getValue();
        final LinkedHashSet<String> copy = Sets.<String>newLinkedHashSet(_value);
        Iterables.<String>addAll(copy, importedTypes);
        entry.setValue(copy);
      }
    }
    return result;
  }
}
