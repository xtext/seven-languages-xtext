package build;

import java.io.File;
import java.util.Collection;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.builddsl.lib.BuildScript;
import org.xtext.builddsl.lib.ClassExtensions;
import org.xtext.builddsl.lib.DependsOn;
import org.xtext.builddsl.lib.DirectoryCleaner;
import org.xtext.builddsl.lib.FileExtensions;
import org.xtext.builddsl.lib.JavaCompiler;
import org.xtext.builddsl.lib.JavaCompilerParams;
import org.xtext.builddsl.lib.Param;

@SuppressWarnings("all")
public class BuildExample extends BuildScript {
  @Param
  public File project = FileExtensions.file("example-project");

  @Param
  public File source = FileExtensions.operator_divide(this.project, "src");

  @Param
  public File target = FileExtensions.operator_divide(this.project, "target");

  @Param
  public File jar = FileExtensions.operator_divide(FileExtensions.operator_divide(this.project, "result"), "foo.jar");

  public static void main(final String... args) {
    BuildExample script = new BuildExample();
    if (script.showHelp(args)) {
    	System.exit(HELP);
    }
    System.exit(script.doBuild(args));
  }

  @DependsOn("Compile")
  protected void Jar() {
    FileExtensions.zip(this.target, this.jar);
  }

  @DependsOn("Clean")
  protected void Compile() {
    final Procedure1<JavaCompilerParams> _function = (JavaCompilerParams it) -> {
      Collection<File> _sources = it.getSources();
      _sources.add(this.source);
      it.setDestination(this.target);
    };
    JavaCompiler.javac(_function);
  }

  @DependsOn("Jar")
  protected void Run() {
    try {
      final ClassLoader classpath = JavaCompiler.newClasspath(this.jar);
      final Class<?> clazz = classpath.loadClass("helloworld.HelloWorld");
      ClassExtensions.runMain(clazz);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @DependsOn
  protected void Clean() {
    DirectoryCleaner.deleteDirectoryContents(this.target);
    this.jar.delete();
  }
}
