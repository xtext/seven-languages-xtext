/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
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
		// icons are stored in the 'icons' folder of this project.
		// when adding such a folder, don't forget to add it to the 'bin.includes' section in the build.properties
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