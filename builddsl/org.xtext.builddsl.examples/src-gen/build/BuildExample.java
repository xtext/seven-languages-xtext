package build;

import com.google.common.collect.Sets;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.builddsl.lib.BuildScript;
import org.xtext.builddsl.lib.ClassExtensions;
import org.xtext.builddsl.lib.FileExtensions;
import org.xtext.builddsl.lib.JavaCompilerParams;
import org.xtext.builddsl.lib.Literals;
import org.xtext.builddsl.lib.MapExtensions;

public class BuildExample extends BuildScript {
  public File destination;
  
  public String jar;
  
  public File source;
  
  public File tmp;
  
  @Override
  protected String getScriptName() {
    return "BuildExample";
  }
  
  @Override
  protected String[] getParameterNames() {
    return new String[] {
      "destination", "jar", "source", "tmp"
    };
  }
  
  @Override
  protected String[] getTaskNames() {
    return new String[] {
      "Clean", "Compile", "Run", "Zip"
    };
  }
  
  public static void main(final String[] args) {
    BuildExample script = new BuildExample();
    if (script.showHelp(args)) {
      System.exit(HELP);
    }
    System.exit(script.build(args));
  }
  
  @Override
  protected int doBuild(final String[] args) throws Throwable {
    Set<String> tasks = Sets.newLinkedHashSet();
    int index = 0;
    while(index < args.length) {
      if("--source".equals(args[index])) {
        source = new File(args[++index]);
      } else if("--tmp".equals(args[index])) {
        tmp = new File(args[++index]);
      } else if("--destination".equals(args[index])) {
        destination = new File(args[++index]);
      } else if("--jar".equals(args[index])) {
        jar = args[++index];
      } else if("Clean".equals(args[index])) {
        tasks.add("Clean");
      } else if("Zip".equals(args[index])) {
        tasks.add("Clean");
        tasks.add("Compile");
        tasks.add("Zip");
      } else if("Compile".equals(args[index])) {
        tasks.add("Clean");
        tasks.add("Compile");
      } else if("Run".equals(args[index])) {
        tasks.add("Clean");
        tasks.add("Compile");
        tasks.add("Zip");
        tasks.add("Run");
      } else {
        System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");
        return WRONG_PARAM;
      }
      index++;
    }
    for(String task:tasks) {
      if("Clean".equals(task))
        clean();
      else if("Compile".equals(task))
        compile();
      else if("Run".equals(task))
        run();
      else if("Zip".equals(task))
        zip();
      index++;
    }return OK;
  }
  
  protected void clean() throws Throwable {
    try {
      System.out.println("running Clean...");
      _cleanImpl();
      System.out.println("success");
    } catch(Throwable throwable) {
      System.err.println(throwable.getMessage());
      throw throwable;
    }
  }
  
  protected void _cleanImpl() throws Throwable {
    FileExtensions.deleteDirectoryContents(this.tmp);
  }
  
  protected void compile() throws Throwable {
    try {
      System.out.println("running Compile...");
      _compileImpl();
      System.out.println("success");
    } catch(Throwable throwable) {
      System.err.println(throwable.getMessage());
      throw throwable;
    }
  }
  
  protected void _compileImpl() throws Throwable {
    final Procedure1<JavaCompilerParams> _function = new Procedure1<JavaCompilerParams>() {
        public void apply(final JavaCompilerParams it) {
          Collection<File> _sources = it.getSources();
          _sources.add(BuildExample.this.source);
          BuildExample.this.destination = BuildExample.this.tmp;
        }
      };
    Literals.compileJava(_function);
  }
  
  protected void run() throws Throwable {
    try {
      System.out.println("running Run...");
      _runImpl();
      System.out.println("success");
    } catch(Throwable throwable) {
      System.err.println(throwable.getMessage());
      throw throwable;
    }
  }
  
  protected void _runImpl() throws Throwable {
    File _divide = FileExtensions.operator_divide(this.destination, this.jar);
    final ClassLoader classpath = Literals.newClasspath(_divide);
    final Class<? extends Object> clazz = classpath.loadClass("org.eclipse.swt.snippets.Snippet50");
    ClassExtensions.runMain(clazz);
  }
  
  protected void zip() throws Throwable {
    try {
      System.out.println("running Zip...");
      _zipImpl();
      System.out.println("success");
    } catch(Throwable throwable) {
      System.err.println(throwable.getMessage());
      throw throwable;
    }
  }
  
  protected void _zipImpl() throws Throwable {
    List<File> _containedFiles = FileExtensions.containedFiles(this.tmp);
    final Function1<File,String> _function = new Function1<File,String>() {
        public String apply(final File it) {
          File _relativeTo = FileExtensions.relativeTo(it, BuildExample.this.tmp);
          String _path = _relativeTo.getPath();
          return _path;
        }
      };
    final Map<String,File> files = IterableExtensions.<String, File>toMap(_containedFiles, _function);
    File _divide = FileExtensions.operator_divide(this.destination, this.jar);
    MapExtensions.createJarFromFiles(files, _divide);
  }
}
