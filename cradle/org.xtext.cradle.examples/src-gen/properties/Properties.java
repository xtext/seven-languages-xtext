package properties;

import com.google.common.collect.Sets;
import java.io.File;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.Literals;
import org.xtext.cradle.lib.impl.FileProperties;
import org.xtext.cradle.lib.impl.TaskSkippedException;
import org.xtext.cradle.lib.impl.TaskState;
import properties.Properties.PropertiesParams;

public class Properties {
  public static class PropertiesParams {
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
        return;
      } else
        index++;
    }
    Set<String> tasks = Sets.newLinkedHashSet();
    PropertiesParams parameter = new PropertiesParams();
    index = 0;
    while(index < args.length) {
      if("SetJavaLineWrap".equals(args[index])) {
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
        if("SetJavaLineWrap".equals(task))
          executeSetJavaLineWrap(parameter, true);
        else if("SetEncoding".equals(task))
          executeSetEncoding(parameter, true);
        else if("SetEncoding2".equals(task))
          executeSetEncoding2(parameter, true);
        else if("SetAllEncoding1".equals(task))
          executeSetAllEncoding1(parameter, true);
        else if("SetAllEncoding2".equals(task))
          executeSetAllEncoding2(parameter, true);
        index++;
      }
    } catch(Throwable e) {
      System.out.println();
      e.printStackTrace();
    }
  }
  
  public static void setJavaLineWrap(final Procedure1<PropertiesParams> init) {
    PropertiesParams p = new PropertiesParams();
    init.apply(p);
    executeSetJavaLineWrap(p, false);
  }
  
  protected static void executeSetJavaLineWrap(final PropertiesParams it, final boolean log) {
    try {
      if(log) System.out.println("running SetJavaLineWrap...");
      executeSetJavaLineWrapImpl(it);
      TaskState.fireFinishTask("SetJavaLineWrap", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("SetJavaLineWrap", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("SetJavaLineWrap", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeSetJavaLineWrapImpl(final PropertiesParams it) {
    File _project = Literals.project();
    File _divide = FileExtensions.operator_divide(_project, ".settings/org.eclipse.jdt.core.prefs");
    final FileProperties jdtprefs = FileExtensions.loadAsProperties(_divide);
    jdtprefs.setProperty("org.eclipse.jdt.core.formatter.lineSplit", "140");
    jdtprefs.save();
  }
  
  public static void setEncoding(final Procedure1<PropertiesParams> init) {
    PropertiesParams p = new PropertiesParams();
    init.apply(p);
    executeSetEncoding(p, false);
  }
  
  protected static void executeSetEncoding(final PropertiesParams it, final boolean log) {
    try {
      if(log) System.out.println("running SetEncoding...");
      executeSetEncodingImpl(it);
      TaskState.fireFinishTask("SetEncoding", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("SetEncoding", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("SetEncoding", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeSetEncodingImpl(final PropertiesParams it) {
    File _project = Literals.project();
    File _divide = FileExtensions.operator_divide(_project, ".settings/org.eclipse.core.resources.prefs");
    final FileProperties resprefs = FileExtensions.loadAsProperties(_divide);
    resprefs.setProperty("encoding/<project>", "UTF-8");
    resprefs.save();
  }
  
  public static void setEncoding2(final Procedure1<PropertiesParams> init) {
    PropertiesParams p = new PropertiesParams();
    init.apply(p);
    executeSetEncoding2(p, false);
  }
  
  protected static void executeSetEncoding2(final PropertiesParams it, final boolean log) {
    try {
      if(log) System.out.println("running SetEncoding2...");
      executeSetEncoding2Impl(it);
      TaskState.fireFinishTask("SetEncoding2", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("SetEncoding2", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("SetEncoding2", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeSetEncoding2Impl(final PropertiesParams it) {
    File _project = Literals.project();
    File _divide = FileExtensions.operator_divide(_project, ".settings/org.eclipse.core.resources.prefs");
    final FileProperties resprefs = FileExtensions.loadAsProperties(_divide);
    resprefs.setProperty("encoding/<project>", "UTF-8");
    resprefs.save();
  }
  
  public static void setAllEncoding1(final Procedure1<PropertiesParams> init) {
    PropertiesParams p = new PropertiesParams();
    init.apply(p);
    executeSetAllEncoding1(p, false);
  }
  
  protected static void executeSetAllEncoding1(final PropertiesParams it, final boolean log) {
    try {
      if(log) System.out.println("running SetAllEncoding1...");
      executeSetAllEncoding1Impl(it);
      TaskState.fireFinishTask("SetAllEncoding1", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("SetAllEncoding1", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("SetAllEncoding1", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeSetAllEncoding1Impl(final PropertiesParams it) {
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
  
  public static void setAllEncoding2(final Procedure1<PropertiesParams> init) {
    PropertiesParams p = new PropertiesParams();
    init.apply(p);
    executeSetAllEncoding2(p, false);
  }
  
  protected static void executeSetAllEncoding2(final PropertiesParams it, final boolean log) {
    try {
      if(log) System.out.println("running SetAllEncoding2...");
      executeSetAllEncoding2Impl(it);
      TaskState.fireFinishTask("SetAllEncoding2", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("SetAllEncoding2", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("SetAllEncoding2", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeSetAllEncoding2Impl(final PropertiesParams it) {
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
