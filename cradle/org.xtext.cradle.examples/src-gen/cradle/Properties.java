package cradle;

import com.google.common.collect.Sets;
import cradle.Properties.Params;
import java.io.File;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.Literals;
import org.xtext.cradle.lib.impl.FileProperties;

public class Properties {
  public static class Params {
    public String name = "holla";
  }
  
  
  public static void main(final String[] args) {
    int index = 0;
    while(args.length == 0 || index < args.length) {
      if(args.length == 0 || "--help".equals(args[index]) ||  "-h".equals(args[index])) {
        System.out.println("Cradle 'Properties'");
        System.out.println();
        System.out.println("Tasks:");
        System.out.println("  SetJavaLineWrap");
        System.out.println("  SetEncoding");
        System.out.println("  SetEncoding2");
        System.out.println("  SetAllEncoding1");
        System.out.println("  SetAllEncoding2");
        System.out.println();
        System.out.println("Parameters:");
        System.out.println("  --name <String>");
        return;
      } else
        index++;
    }
    Set<String> tasks = Sets.newLinkedHashSet();
    Params parameter = new Params();
    index = 0;
    while(index < args.length) {
      if("--name".equals(args[index])) {
        parameter.name = args[++index];
      } else if("SetJavaLineWrap".equals(args[index])) {
        tasks.add("SetJavaLineWrap");
      } else if("SetEncoding".equals(args[index])) {
        tasks.add("SetEncoding");
      } else if("SetEncoding2".equals(args[index])) {
        tasks.add("SetEncoding2");
      } else if("SetAllEncoding1".equals(args[index])) {
        tasks.add("SetAllEncoding1");
      } else if("SetAllEncoding2".equals(args[index])) {
        tasks.add("SetAllEncoding2");
      } else {
        System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");
        return;
      }
      index++;
    }
    try {
      for(String task:tasks) {
        System.out.print("running " + task + "...");
        if("SetJavaLineWrap".equals(task))
          executeSetJavaLineWrap(parameter);
        else if("SetEncoding".equals(task))
          executeSetEncoding(parameter);
        else if("SetEncoding2".equals(task))
          executeSetEncoding2(parameter);
        else if("SetAllEncoding1".equals(task))
          executeSetAllEncoding1(parameter);
        else if("SetAllEncoding2".equals(task))
          executeSetAllEncoding2(parameter);
        index++;
        System.out.println("success");
      }
    } catch(Throwable e) {
      System.out.println("failure: " + e.getMessage());System.out.println();e.printStackTrace();
    }
    
  }
  
  public static void SetJavaLineWrap(final Procedure1<Params> paramInitializer) {
    Params p = new Params();
    paramInitializer.apply(p);
    executeSetJavaLineWrap(p);
  }
  
  protected static void executeSetJavaLineWrap(final Params it) {
    File _project = Literals.project();
    File _divide = FileExtensions.operator_divide(_project, ".settings/org.eclipse.jdt.core.prefs");
    final FileProperties jdtprefs = FileExtensions.loadAsProperties(_divide);
    jdtprefs.setProperty("org.eclipse.jdt.core.formatter.lineSplit", "140");
    jdtprefs.save();
  }
  
  public static void SetEncoding(final Procedure1<Params> paramInitializer) {
    Params p = new Params();
    paramInitializer.apply(p);
    executeSetEncoding(p);
  }
  
  protected static void executeSetEncoding(final Params it) {
    File _project = Literals.project();
    File _divide = FileExtensions.operator_divide(_project, ".settings/org.eclipse.core.resources.prefs");
    final FileProperties resprefs = FileExtensions.loadAsProperties(_divide);
    resprefs.setProperty("encoding/<project>", "UTF-8");
    resprefs.save();
  }
  
  public static void SetEncoding2(final Procedure1<Params> paramInitializer) {
    Params p = new Params();
    paramInitializer.apply(p);
    executeSetEncoding2(p);
  }
  
  protected static void executeSetEncoding2(final Params it) {
    File _project = Literals.project();
    File _divide = FileExtensions.operator_divide(_project, ".settings/org.eclipse.core.resources.prefs");
    final FileProperties resprefs = FileExtensions.loadAsProperties(_divide);
    resprefs.setProperty("encoding/<project>", "UTF-8");
    resprefs.save();
  }
  
  public static void SetAllEncoding1(final Procedure1<Params> paramInitializer) {
    Params p = new Params();
    paramInitializer.apply(p);
    executeSetAllEncoding1(p);
  }
  
  protected static void executeSetAllEncoding1(final Params it) {
    File _workspace = Literals.workspace();
    final List<File> projects = FileExtensions.containedJavaProjects(_workspace);
    final Function1<File,FileProperties> _function = new Function1<File,FileProperties>() {
        public FileProperties apply(final File it) {
          File _divide = FileExtensions.operator_divide(it, ".settings/org.eclipse.core.resources.prefs");
          FileProperties _loadAsProperties = FileExtensions.loadAsProperties(_divide);
          return _loadAsProperties;
        }
      };
    final List<FileProperties> propertyFiles = ListExtensions.<File, FileProperties>map(projects, _function);
    final Procedure1<FileProperties> _function_1 = new Procedure1<FileProperties>() {
        public void apply(final FileProperties it) {
          it.setProperty("encoding/<project>", "UTF-8");
        }
      };
    IterableExtensions.<FileProperties>forEach(propertyFiles, _function_1);
    final Procedure1<FileProperties> _function_2 = new Procedure1<FileProperties>() {
        public void apply(final FileProperties it) {
          it.save();
        }
      };
    IterableExtensions.<FileProperties>forEach(propertyFiles, _function_2);
  }
  
  public static void SetAllEncoding2(final Procedure1<Params> paramInitializer) {
    Params p = new Params();
    paramInitializer.apply(p);
    executeSetAllEncoding2(p);
  }
  
  protected static void executeSetAllEncoding2(final Params it) {
    File _workspace = Literals.workspace();
    List<File> _containedJavaProjects = FileExtensions.containedJavaProjects(_workspace);
    for (final File proj : _containedJavaProjects) {
      {
        File _divide = FileExtensions.operator_divide(proj, ".settings/org.eclipse.core.resources.prefs");
        final FileProperties properties = FileExtensions.loadAsProperties(_divide);
        properties.setProperty("encoding/<project>", "UTF-8");
        properties.save();
      }
    }
  }
}
