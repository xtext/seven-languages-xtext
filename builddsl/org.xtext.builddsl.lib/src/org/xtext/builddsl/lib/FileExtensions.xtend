package org.xtext.builddsl.lib

import com.google.common.base.Predicate
import java.io.File
import java.util.regex.Pattern
import java.util.List
import org.xtext.builddsl.lib.impl.Digest
import org.xtext.builddsl.lib.impl.FileProperties
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner
import org.eclipse.xtext.xbase.lib.Pair
import org.eclipse.emf.common.util.URI

import static extension com.google.common.base.Predicates.*
import static extension org.xtext.builddsl.lib.FileExtensions.*
import java.io.FileOutputStream
import org.eclipse.xtext.util.Strings

public class FileExtensions {
	
	def private static Predicate<File> contains(String name) {
		[ File file |
			file.directory && new File(file.getAbsolutePath() + "/" + name).exists()
		]
	}
	
	def private static Predicate<File> matches(String regex) {
		val pattern = Pattern::compile(regex);
		[ File file | 
			pattern.matcher(file.name).matches
		] as Predicate<File>
	}

	def private static void collectFiles(File root, List<File> result, Predicate<File> matcher) {
		for (File f : root.listFiles()) {
			if (matcher.apply(f))
				result.add(f);
			if (f.isDirectory())
				collectFiles(f, result, matcher);
		}
	}

	def static contained(File file, Predicate<File> predicate) {
		val files = <File>newArrayList();
		collectFiles(file, files, predicate);
		return files;
	}

	def static List<File> contained(File container, String regex) {
		return contained(container, matches(regex));
	}

	def static List<File> containedDirectories(File container, Predicate<File> predicate) {
		return contained(container, predicate && [directory]);
	}

	def static List<File> containedDirectories(File container, String regex) {
		return contained(container, matches(regex) && [directory]);
	}
	
	def static List<File> containedDirectories(File container) {
		return contained(container, [directory]);
	}

	def static List<File> containedFeatureProjects(File container) {
		return contained(container, contains(".project") && contains("feature.xml"));
	}

	def static List<File> containedFiles(File container, Predicate<File> predicate) {
		return contained(container, predicate && [file]);
	}

	def static List<File> containedFiles(File container, String regex) {
		return contained(container, matches(regex) && [file]);
	}
	
	def static List<File> containedFiles(File container) {
		return contained(container, [file]);
	}

	def static List<File> containedGitRepositories(File container) {
		return contained(container, contains(".git"));
	}

	def static List<File> containedJavaProjects(File container) {
		return contained(container, contains(".project") && contains(".classpath"));
	}

	def static List<File> containedPluginProjects(File container) {
		return contained(container, contains(".project") && contains("META-INF/MANIFEST.MF"));
	}

	def static List<File> containedProjects(File container) {
		return contained(container, contains(".project"));
	}

	def static File containingFolderWithFile(File file, String string) {
		containingFolderWithFile(file, string, null)
	}
	
	def static File containingFolderWithFile(File file, String string, String errorMessage) {
		var f = file.getAbsoluteFile();
		while (f != null) {
			if (new File(f.getAbsolutePath() + "/" + string).exists())
				return f;
			f = f.getParentFile();
		}
		if(errorMessage != null)
			throw new IllegalStateException('''«errorMessage» No parent directory of "«file.absoluteFile»" contains '«string»'.''')
		return null;
	}

	def static File containingGitRepository(File file) {
		containingFolderWithFile(file, ".git", "No Git repository found.");
	}
	
	def static File containingProject(File file) {
		containingFolderWithFile(file, ".project", "No Eclipse Project found.");
	}
	
	def static File containingWorkspace(File file) {
		containingFolderWithFile(file, ".metadata", "No Eclipse Workspace found.");
	}

	def static loadAsDigest(File file) {
		val result = new Digest();
		if (file.exists())
			result.load(file);
		return result;
	}

	def static loadAsProperties(File file) {
		return new FileProperties(file);
	}

	def static Predicate<File> operator_and(Predicate<File> left, Predicate<File> right) {
		left.and(right)	
	}
	
	def static File operator_divide(File file, String name) {
		if (!file.isDirectory())
			throw new IllegalStateException("This is not a directory: " + file);
		return new File(file.toURI().resolve(name));
	}

	def static void runAsMwe2Workflow(File file, Pair<String, String>... args) {
		val injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
		val runner = injector.getInstance(typeof(Mwe2Runner));
		runner.run(URI::createFileURI(file.getAbsolutePath()), newHashMap(args));
	}
	
	def static setFileContents(File file, String contents) {
		val out = new FileOutputStream(file)
		try {
			out.write(contents.bytes)
			out.flush
		} finally {
			out.close
		}
	}
	
	def static deleteDirectoryContents(File file) {
		if(file.directory)
			file.listFiles.forEach[delete]
	}
	
	def static fileExtension(File file) {
		Strings::lastToken(file.name, ".")
	}
	
	def static relativeTo(File target, File base) {
		new File(base.absoluteFile.toURI.relativize(target.toURI).toString)
	}

}
