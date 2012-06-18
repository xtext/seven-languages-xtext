package org.guicecon.modules.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.guicecon.modules.guiceModules.Module;

import com.google.inject.Inject;

public class GuiceModulesQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	
	public QualifiedName qualifiedName(Module m){
		return qualifiedNameConverter.toQualifiedName(m.getPackageName() + "." + m.getName());
	}
}
