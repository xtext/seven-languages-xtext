package org.guicecon.modules.validation;

import java.util.Collection;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.guicecon.modules.guiceModules.Binding;
import org.guicecon.modules.guiceModules.Key;
import org.guicecon.modules.guiceModules.Module;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.inject.BindingAnnotation;
import com.google.inject.Inject;
 

public class GuiceModulesJavaValidator extends AbstractGuiceModulesJavaValidator {

	@Inject
	private TypeConformanceComputer conformanceComputer;
	
	@Inject
	private ITypeProvider typeProvider;
	
	@Check
	public void checkBoundTypes(Key key) {
		if (key.getAnnotation()!=null) {
			EList<JvmAnnotationReference> list = key.getAnnotation().getAnnotation().getAnnotations();
			boolean found = false;
			for (JvmAnnotationReference jvmAnnotationReference : list) {
				if (jvmAnnotationReference.getAnnotation().getIdentifier().equals(BindingAnnotation.class.getName())) {
					found = true;
				}
			}
			if (!found) {
				error("The annotation is not annotated with @BindingAnnotation", key.getAnnotation(),null,null);
			}
		}
	}
	
	@Check
	public void checkDuplicateKeys(Module module) {
		Multimap<String, Binding> keys = collectKeys(module);
		for (Entry<String, Collection<Binding>> entry: keys.asMap().entrySet()) {
			if (entry.getValue().size()>1) {
				for (Binding binding : entry.getValue()) {
					String key = binding.getFrom().getType().getSimpleName();
					if (binding.getFrom().getAnnotation()!=null) {
						key = "@"+binding.getFrom().getAnnotation().getAnnotation().getSimpleName()+" "+key;
					}
					error("Duplicate key "+key,binding.getFrom(), null, null);
				}
			}
		}
	}
	
	@Check
	public void checkOverride(Module module) {
		Multimap<String, Binding> keys = HashMultimap.create();
		for (Module m : module.getMixins()) {
			keys.putAll(collectKeys(m));
		}
		Multimap<String, Binding> localKeys = collectKeys(module);
		for (Entry<String, Collection<Binding>> entry : localKeys.asMap().entrySet()) {
			if (keys.containsKey(entry.getKey())) {
				if (entry.getValue().size()==1) {
					Binding binding = entry.getValue().iterator().next();
					if (!binding.isOverride()) {
						error("The key is defined in a super module, use keyword 'override' to override.",binding, null,null);
					}
				}
			}
		}
	}

	private Multimap<String, Binding> collectKeys(Module module) {
		Multimap<String, Binding> keys = HashMultimap.create();
		for (Binding b : module.getBindings()) {
			Key k = b.getFrom();
			String key = k.getType().getIdentifier();
			if (k.getAnnotation()!=null) {
				key = "@"+k.getAnnotation().getAnnotation().getIdentifier()+" "+key;
			}
			keys.put(key, b);
		}
		return keys;
	}

	private void checkCompatibility(JvmTypeReference expectedType, JvmTypeReference type, EObject objectToBeMarked) {
		if (!conformanceComputer.isConformant(expectedType, type)) {
			error("Incompatible types : expected " + expectedType.getSimpleName() + " but was " + type.getSimpleName(),
					objectToBeMarked, null, null);
		}
	}
	
	@Check
	public void checkBoundTypes(Binding binding) {
		JvmTypeReference expectedType = binding.getFrom().getType();
		if (binding.getToInstance()!=null) {
			JvmTypeReference instanceType = typeProvider.getType(binding.getToInstance());
			if (Void.class.getName().equals(instanceType.getIdentifier()) || Void.TYPE.getName().equals(instanceType.getIdentifier())) {
				error("The expression must not be of type "+instanceType.getIdentifier(), binding.getToInstance(), null,null);
			} else {
				checkCompatibility(expectedType, instanceType, binding.getToInstance());
			}
		} else {
			checkCompatibility(expectedType, binding.getTo().getType(), binding.getTo().getType());
		}
	}

}
