/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.lib

import java.io.BufferedOutputStream
import java.io.File
import java.io.FileOutputStream
import java.util.List
import java.util.jar.JarOutputStream
import java.util.zip.ZipEntry

import static extension com.google.common.io.Files.*

class FileExtensions {
	
	def private static void collectFiles(File root, List<File> result) {
		for (it : root.listFiles) {
			if (isFile)
				result += it
			else if (isDirectory)
				collectFiles(it, result)
		}
	}

	def static listAllFiles(File file) {
		val files = <File>newArrayList
		collectFiles(file, files)
		files
	}
	
	def static void zip(File directory, File zipFile) {
		val files = directory.listAllFiles
		val out =  new JarOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile)))
		try {
			out.method = JarOutputStream.DEFLATED
			files.forEach [ file |
				val entry = new ZipEntry(file.relativeTo(directory).path)
				out.putNextEntry(entry)
				file.copy(out)
				out.closeEntry
			]
			out.flush
		} finally {
			out.close
		}
		
	}
	
	def static File operator_divide(File dir, String name) {
		if (!dir.isDirectory)
			throw new IllegalStateException("This is not a directory: " + dir)
		new File(dir.toURI.resolve(name))
	}
	
	def static File operator_divide(String dir, String post) {
		if (!dir.file.directory)
			throw new IllegalStateException("This is not a directory: " + dir)
		new File(dir.file, post)
	}
	
	def static File file(String path) {
		new File(path)
	}

	def static relativeTo(File target, File base) {
		new File(base.absoluteFile.toURI.relativize(target.toURI).toString)
	}

}
