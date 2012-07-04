package org.xtext.mongobeans.scoping

import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider
import org.xtext.mongobeans.mongoBeans.MongoBean
import org.xtext.mongobeans.mongoBeans.PackageDeclaration
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.xtext.naming.QualifiedName

/**
 * Customized to return correct names for inline declared {@link MongoBeans}.
 */
class MongoQualifiedNameProvider extends XbaseQualifiedNameProvider {
	
	def qualifiedName(MongoBean mongoBean) {
		val packageDeclaration = mongoBean.getContainerOfType(typeof(PackageDeclaration))
		if(packageDeclaration != null) 
			packageDeclaration.fullyQualifiedName.append(mongoBean.name)
		else
			return QualifiedName::create(mongoBean.name)
	}
}