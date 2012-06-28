package org.xtext.builddsl.lib

import java.io.File
import org.eclipse.xtend.lib.Property
import org.xtext.builddsl.lib.impl.Digest
import org.xtext.builddsl.lib.impl.TaskState

import static extension org.xtext.builddsl.lib.FileExtensions.*
import org.eclipse.xtext.xbase.lib.Procedures$Procedure1
import java.util.Collection
import org.eclipse.jdt.core.compiler.batch.BatchCompiler
import java.io.PrintWriter
import java.net.URLClassLoader

class Literals {

	def static File file() {
		new File("/");
	}

	def static File git() {
		new File(".").containingGitRepository;
	}

	def static File project() {
		new File(".").containingProject
	}
	
	def static File workspace() {
		new File(".").containingWorkspace
	}
	
	def static Digest newDigest((DigestInit)=>void init) {
		val di = new DigestInit();
		init.apply(di);
		val result = new Digest();
		di.files.forEach [ result.addFile(it) ]
		return result;
	}
	
	def static void skipTask() {
		TaskState::skipTask("Task Skipped");
	}

	def static void skipTaskIfDigestUnchanged(Procedures$Procedure1<DigestInitFile> init) {
		val di = new DigestInitFile();
		init.apply(di);
		val newDigest = new Digest();
		di.files.forEach[ newDigest.addFile(it) ]
		val oldDigest = di.digest.loadAsDigest;
		if (newDigest == oldDigest)
			TaskState::skipTask("Skipped because digest is unchanged");
		TaskState::addTaskFinishListener[ msg, t | if(t==null) newDigest.saveAs(di.digest) ]
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

class DigestInit {
	@Property val files = <File>newArrayList();
}

class DigestInitFile extends DigestInit {
	@Property File digest;
}

class JavaCompilerParams {
	@Property Collection<File> sources = newArrayList()
	@Property Collection<File> classpath = newArrayList()
	@Property File destination; 
}