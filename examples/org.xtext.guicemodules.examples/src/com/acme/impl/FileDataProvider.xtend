/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.acme.impl

import com.acme.DataProvider
import com.google.common.base.Charsets
import com.google.inject.Inject
import java.io.File

import static extension com.google.common.io.Files.*

class FileDataProvider implements DataProvider {
	@Inject @DataFile String dataFile

	override getData() {
		new File(dataFile).readLines(Charsets.UTF_8).join('\n')
	}
	
}