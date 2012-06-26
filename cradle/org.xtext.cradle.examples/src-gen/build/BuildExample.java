package build;

import build.BuildExample.BuildExampleParams;
import com.google.common.collect.Sets;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.lib.ClassExtensions;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.JavaCompilerParams;
import org.xtext.cradle.lib.Literals;
import org.xtext.cradle.lib.MapExtensions;
import org.xtext.cradle.lib.impl.TaskSkippedException;
import org.xtext.cradle.lib.impl.TaskState;

public class BuildExample {
  public static class BuildExampleParams {
    public File source = new Function0<File>() {
      public File apply() {
        File _project = Literals.project();
        File _divide = FileExtensions.operator_divide(_project, "java-src");
        return _divide;
      }
    }.apply();
    
    public File tmp = new Function0<File>() {
      public File apply() {
        File _project = Literals.project();
        File _divide = FileExtensions.operator_divide(_project, "tmp");
        return _divide;
      }
    }.apply();
    
    public File destination = new Function0<File>() {
      public File apply() {
        File _project = Literals.project();
        File _divide = FileExtensions.operator_divide(_project, "target/");
        return _divide;
      }
    }.apply();
    
    public String jar = "MyJarFile.jar";
  }
  
  
  public static void main(final String[] args) {
    int index = 0;
    while(args.length == 0 || index < args.length) {
      if(args.length == 0 || "--help".equals(args[index]) ||  "-h".equals(args[index])) {
        System.out.println("Cradle 'BuildExample'");
        System.out.println();
        System.out.println("Tasks:");
        System.out.println("  Clean");
        System.out.println("  CompileAndZip");
        System.out.println("  Run");
        System.out.println();
        System.out.println("Parameters:");
        System.out.println("  --source <File>");
        System.out.println("  --tmp <File>");
        System.out.println("  --destination <File>");
        System.out.println("  --jar <String>");
        return;
      } else
        index++;
    }
    Set<String> tasks = Sets.newLinkedHashSet();
    BuildExampleParams parameter = new BuildExampleParams();
    index = 0;
    while(index < args.length) {
      if("--source".equals(args[index])) {
        parameter.source = new File(args[++index]);
      } else if("--tmp".equals(args[index])) {
        parameter.tmp = new File(args[++index]);
      } else if("--destination".equals(args[index])) {
        parameter.destination = new File(args[++index]);
      } else if("--jar".equals(args[index])) {
        parameter.jar = args[++index];
      } else if("Clean".equals(args[index])) {
        tasks.add("Clean");
      } else if("CompileAndZip".equals(args[index])) {
        tasks.add("Clean");
        tasks.add("CompileAndZip");
      } else if("Run".equals(args[index])) {
        tasks.add("Clean");
        tasks.add("CompileAndZip");
        tasks.add("Run");
      } else {
        System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");
        return;
      }
      index++;
    }
    try {
      for(String task:tasks) {
        if("Clean".equals(task))
          executeClean(parameter, true);
        else if("CompileAndZip".equals(task))
          executeCompileAndZip(parameter, true);
        else if("Run".equals(task))
          executeRun(parameter, true);
        index++;
      }
    } catch(Throwable e) {
      System.out.println();
      e.printStackTrace();
    }
  }
  
  public static void clean(final Procedure1<BuildExampleParams> init) {
    BuildExampleParams p = new BuildExampleParams();
    init.apply(p);
    executeClean(p, false);
  }
  
  protected static void executeClean(final BuildExampleParams it, final boolean log) {
    try {
      if(log) System.out.println("running Clean...");
      executeCleanImpl(it);
      TaskState.fireFinishTask("Clean", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("Clean", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("Clean", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeCleanImpl(final BuildExampleParams it) throws Throwable {
    FileExtensions.deleteDirectoryContents(it.tmp);
  }
  
  public static void compileAndZip(final Procedure1<BuildExampleParams> init) {
    BuildExampleParams p = new BuildExampleParams();
    init.apply(p);
    executeClean(p, false);
    executeCompileAndZip(p, false);
  }
  
  protected static void executeCompileAndZip(final BuildExampleParams it, final boolean log) {
    try {
      if(log) System.out.println("running CompileAndZip...");
      executeCompileAndZipImpl(it);
      TaskState.fireFinishTask("CompileAndZip", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("CompileAndZip", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("CompileAndZip", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeCompileAndZipImpl(final BuildExampleParams it) throws Throwable {
    final BuildExampleParams params = it;
    final Procedure1<JavaCompilerParams> _function = new Procedure1<JavaCompilerParams>() {
        public void apply(final JavaCompilerParams it) {
          Collection<File> _sources = it.getSources();
          _sources.add(params.source);
          it.setDestination(params.tmp);
        }
      };
    Literals.compileJava(_function);
    List<File> _containedFiles = FileExtensions.containedFiles(it.tmp);
    final Function1<File,String> _function_1 = new Function1<File,String>() {
        public String apply(final File it) {
          File _relativeTo = FileExtensions.relativeTo(it, params.tmp);
          String _path = _relativeTo.getPath();
          return _path;
        }
      };
    final Map<String,File> files = IterableExtensions.<String, File>toMap(_containedFiles, _function_1);
    File _divide = FileExtensions.operator_divide(it.destination, it.jar);
    MapExtensions.createJarFromFiles(files, _divide);
  }
  
  public static void run(final Procedure1<BuildExampleParams> init) {
    BuildExampleParams p = new BuildExampleParams();
    init.apply(p);
    executeClean(p, false);
    executeCompileAndZip(p, false);
    executeRun(p, false);
  }
  
  protected static void executeRun(final BuildExampleParams it, final boolean log) {
    try {
      if(log) System.out.println("running Run...");
      executeRunImpl(it);
      TaskState.fireFinishTask("Run", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("Run", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("Run", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeRunImpl(final BuildExampleParams it) throws Throwable {
    File _divide = FileExtensions.operator_divide(it.destination, it.jar);
    final ClassLoader classpath = Literals.newClasspath(_divide);
    final Class<? extends Object> clazz = classpath.loadClass("org.eclipse.swt.snippets.Snippet50");
    ClassExtensions.runMain(clazz);
  }
}
