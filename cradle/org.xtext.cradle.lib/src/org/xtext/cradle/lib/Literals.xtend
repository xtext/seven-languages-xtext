package org.xtext.cradle.lib

import java.io.File
import org.eclipse.xtend.lib.Property
import org.xtext.cradle.lib.impl.Digest
import org.xtext.cradle.lib.impl.TaskState

import static extension org.xtext.cradle.lib.FileExtensions.*
import org.eclipse.xtext.xbase.lib.Procedures$Procedure1

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
}

class DigestInit {
	@Property val files = <File>newArrayList();
}

class DigestInitFile extends DigestInit {
	@Property File digest;
}

