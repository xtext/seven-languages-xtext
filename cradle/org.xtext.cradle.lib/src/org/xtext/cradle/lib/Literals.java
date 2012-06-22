package org.xtext.cradle.lib;

import java.io.File;
import java.util.List;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.lib.impl.Digest;
import org.xtext.cradle.lib.impl.TaskSkippedException;

import com.google.common.collect.Lists;

public class Literals {

	public static class DigestInit {
		public List<File> files = Lists.newArrayList();
	}

	public static class DigestInitFile extends DigestInit {
		public File digest;
	}

	public static File file() {
		return new File("/");
	}

	public static File git() {
		return FileExtensions.containingGitRepository(new File("."));
	}

	public static Digest newDigest(Procedure1<DigestInit> init) {
		DigestInit di = new DigestInit();
		init.apply(di);
		Digest result = new Digest();
		for (File f : di.files)
			result.addFile(f);
		return result;
	}

	public static File project() {
		File result = FileExtensions.containingFolderWithFile(new File("."), ".project");
		if (result == null)
			throw new IllegalStateException("No Eclipse Project found. No parent folder of " + new File(".") + " contains .project file.");
		return result;
	}

	public static void skipTask() {
		TaskSkippedException.skipTask("Task Skipped");
	}

	public static void skipTaskIfDigestUnchanged(Procedure1<DigestInitFile> init) {
		DigestInitFile di = new DigestInitFile();
		init.apply(di);
		Digest newDigest = new Digest();
		for (File f : di.files)
			newDigest.addFile(f);
		Digest oldDigest = FileExtensions.loadAsDigest(di.digest);
		if (newDigest.equals(oldDigest))
			TaskSkippedException.skipTask("Skipped because digest is unchanged");
		newDigest.saveAs(di.digest);
	}

	public static File workspace() {
		File result = FileExtensions.containingFolderWithFile(new File("."), ".metadata");
		if (result == null)
			throw new IllegalStateException("No Eclipse Workspace found. No parent folder of " + new File(".")
					+ " contains .metadata folder.");
		return result;
	}

}
