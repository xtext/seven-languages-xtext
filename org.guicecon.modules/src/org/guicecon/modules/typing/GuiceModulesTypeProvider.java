package org.guicecon.modules.typing;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.guicecon.modules.guiceModules.Binding;
import org.guicecon.modules.guiceModules.GuiceModulesPackage;

import com.google.inject.Singleton;
@Singleton
public class GuiceModulesTypeProvider extends XbaseTypeProvider {
	
	protected JvmTypeReference _expectedType(Binding container,
			EReference reference, int index, boolean rawType) {
		if (reference == GuiceModulesPackage.Literals.BINDING__TO_INSTANCE) {
			return container.getFrom().getType();
		}
		return super._expectedType(container, reference, index, rawType);
	}
}
