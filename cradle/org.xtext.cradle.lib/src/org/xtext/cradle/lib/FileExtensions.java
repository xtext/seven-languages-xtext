package org.xtext.cradle.lib;

import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
import org.xtext.cradle.lib.impl.Digest;
import org.xtext.cradle.lib.impl.FileProperties;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.inject.Injector;

public class FileExtensions {

	private static class Contains implements Predicate<File> {
		private String name;

		public Contains(String name) {
			this.name = name;
		}

		public boolean apply(File file) {
			if (!file.isDirectory())
				return false;
			return new File(file.getAbsolutePath() + "/" + name).exists();
		}

	}

	private static class IsDirectory implements Predicate<File> {
		public boolean apply(File file) {
			return file.isDirectory();
		}
	}

	private static class IsFile implements Predicate<File> {
		public boolean apply(File file) {
			return file.isFile();
		}
	}

	private static class Matches implements Predicate<File> {
		private Pattern pattern;

		public Matches(String regex) {
			pattern = Pattern.compile(regex);
		}

		public boolean apply(File file) {
			return pattern.matcher(file.getName()).matches();
		}

	}

	private static void collectFiles(File root, List<File> result, Predicate<File> matcher) {
		for (File f : root.listFiles()) {
			if (matcher.apply(f))
				result.add(f);
			if (f.isDirectory())
				collectFiles(f, result, matcher);
		}
	}

	public static List<File> contained(File file, Predicate<File> predicate) {
		List<File> files = Lists.newArrayList();
		collectFiles(file, files, predicate);
		return files;
	}

	public static List<File> contained(File file, String regex) {
		return contained(file, new Matches(regex));
	}

	public static List<File> containedDirectories(File file, Predicate<File> predicate) {
		return contained(file, Predicates.and(new IsDirectory(), predicate));
	}

	public static List<File> containedDirectories(File file, String regex) {
		return contained(file, Predicates.and(new IsDirectory(), new Matches(regex)));
	}

	public static List<File> containedFeatureProjects(File file) {
		return contained(file, Predicates.and(new Contains(".project"), new Contains("feature.xml")));
	}

	public static List<File> containedFiles(File file, Predicate<File> predicate) {
		return contained(file, Predicates.and(new IsFile(), predicate));
	}

	public static List<File> containedFiles(File file, String regex) {
		return contained(file, Predicates.and(new IsFile(), new Matches(regex)));
	}

	public static List<File> containedGitRepositories(File file) {
		return contained(file, new Contains(".git"));
	}

	public static List<File> containedJavaProjects(File file) {
		return contained(file, Predicates.and(new Contains(".project"), new Contains(".classpath")));
	}

	public static List<File> containedPluginProjects(File file) {
		return contained(file, Predicates.and(new Contains(".project"), new Contains("META-INF/MANIFEST.MF")));
	}

	public static List<File> containedProjects(File file) {
		return contained(file, new Contains(".project"));
	}

	public static File containingFolderWithFile(File file, String string) {
		file = file.getAbsoluteFile();
		while (file != null) {
			if (new File(file.getAbsolutePath() + "/" + string).exists())
				return file;
			file = file.getParentFile();
		}
		return null;
	}

	public static File containingGitRepository(File file) {
		File result = containingFolderWithFile(file, ".git");
		if (result == null)
			throw new IllegalStateException("No Git repository found. No parent folder of " + new File(".") + " contains .git folder.");
		return result;
	}

	public static Digest loadAsDigest(File file) {
		Digest result = new Digest();
		if (file.exists())
			result.load(file);
		return result;
	}

	public static FileProperties loadAsProperties(File file) {
		return new FileProperties(file);
	}

	public static File operator_divide(File file, String name) {
		if (!file.isDirectory())
			throw new IllegalStateException("This is not a directory: " + file);
		return new File(file.toURI().resolve(name));
	}

	public static void runAsMwe2Workflow(File file, Pair<String, String>... args) {
		Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
		Mwe2Runner runner = injector.getInstance(Mwe2Runner.class);
		runner.run(URI.createFileURI(file.getAbsolutePath()), CollectionLiterals.newHashMap(args));
	}

}
