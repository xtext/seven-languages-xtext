/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.lib

import java.io.File
import java.io.PrintWriter
import java.net.URLClassLoader
import java.util.Collection
import org.eclipse.jdt.core.compiler.batch.BatchCompiler
import org.eclipse.xtend.lib.annotations.Accessors

class JavaCompiler {
	
	def static void javac((JavaCompilerParams) => void init) {
		val params = new JavaCompilerParams
		init.apply(params)
		val list = <String>newArrayList
		if(params.destination == null) { 
			list += "-d"
			list += "none"
		} else {
			list += "-d"
			list += params.destination.toString
		}
		if(!params.classpath.empty) {
			list += "-classpath"
			list += params.classpath.join(":")
		}
		list += params.sources.map [toString]
		print("compiling Java files...")
		val result = BatchCompiler.compile(list as String[], new PrintWriter(System.out), new PrintWriter(System.err), null)
		if(result) 
			println("success.")
		else 
			println("failed.")
	}
	
	def static ClassLoader newClasspath(File ... entries) {
		new URLClassLoader(entries.map[toURI.toURL])
	}
}
@Accessors
class JavaCompilerParams {
	Collection<File> sources = newArrayList()
	Collection<File> classpath = newArrayList()
	File destination; 
}