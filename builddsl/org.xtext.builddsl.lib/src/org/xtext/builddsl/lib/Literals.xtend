package org.xtext.builddsl.lib

import java.io.File
import java.io.PrintWriter
import java.net.URLClassLoader
import java.util.Collection
import org.eclipse.jdt.core.compiler.batch.BatchCompiler
import org.eclipse.xtend.lib.Property

class Literals {

	def static File file() {
		new File("/");
	}

	def static void compileJava((JavaCompilerParams) => void init) {
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
		list.addAll(params.sources.map[toString])
		print("compiling Java files..."); // with options: "+list.join(" "))
		val result = BatchCompiler::compile(list as String[], new PrintWriter(System::out), new PrintWriter(System::err), null)
		if(result) 
			println("success.")
		else 
			println("failed.")
	}
	
	def static ClassLoader newClasspath(File ... entries) {
		new URLClassLoader(entries.map[toURI.toURL])
	}
}

class JavaCompilerParams {
	@Property Collection<File> sources = newArrayList()
	@Property Collection<File> classpath = newArrayList()
	@Property File destination; 
}