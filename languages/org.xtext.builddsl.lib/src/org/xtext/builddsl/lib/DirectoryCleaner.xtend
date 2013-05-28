/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.lib

import java.io.File

class DirectoryCleaner {
	
	static def void deleteDirectoryContents(File file) {
		if(file.directory) {
			file.listFiles.forEach [
				if(directory)  
					deleteDirectoryContents
				delete
			]
		} else {
			file.delete
		}
	}
}