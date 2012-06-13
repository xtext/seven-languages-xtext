package org.xtext.mongobeans.ui.labeling

import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.xtext.mongobeans.mongoBeans.PackageDeclaration
import org.xtext.mongobeans.mongoBeans.Import
import org.xtext.mongobeans.mongoBeans.MongoProperty
import org.xtext.mongobeans.mongoBeans.MongoOperation
import org.xtext.mongobeans.mongoBeans.MongoBean
import com.google.inject.Inject

class MongoBeansLabelProvider extends XbaseLabelProvider {
	
	@Inject new(AdapterFactoryLabelProvider delegate) {
		super(delegate)
	}
	
	override image(Object element) {
		switch element {
			MongoBean: 'Letter-B-blue-icon.png'
			MongoProperty: 'Letter-P-orange-icon.png'
			MongoOperation: 'Letter-O-red-icon.png'
			Import: 'imp_obj.gif'
			PackageDeclaration: 'package_obj.gif'
			default:
				super.image(element)
		}
	}
	
}