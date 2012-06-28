package mwe2;

import com.google.common.collect.Sets;
import java.io.File;
import java.util.Set;
import mwe2.Mwe2.Mwe2Params;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.builddsl.lib.FileExtensions;
import org.xtext.builddsl.lib.Literals;
import org.xtext.builddsl.lib.impl.TaskSkippedException;
import org.xtext.builddsl.lib.impl.TaskState;

public class Mwe2 {
  public static class Mwe2Params {
  }
  
  
  public static void main(final String[] args) {
    int index = 0;
    while(args.length == 0 || index < args.length) {
      if(args.length == 0 || "--help".equals(args[index]) ||  "-h".equals(args[index])) {
        System.out.println("Build 'Mwe2'");
        System.out.println();
        System.out.println("Tasks:");
        System.out.println("  runMwe2");
        return;
      } else
        index++;
    }
    Set<String> tasks = Sets.newLinkedHashSet();
    Mwe2Params parameter = new Mwe2Params();
    index = 0;
    while(index < args.length) {
      if("runMwe2".equals(args[index])) {
        tasks.add("runMwe2");
      } else {
        System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");
        return;
      }
      index++;
    }
    try {
      for(String task:tasks) {
        if("runMwe2".equals(task))
          executeRunMwe2(parameter, true);
        index++;
      }
    } catch(Throwable e) {
      System.out.println();
      e.printStackTrace();
    }
  }
  
  public static void runMwe2(final Procedure1<Mwe2Params> init) {
    Mwe2Params p = new Mwe2Params();
    init.apply(p);
    executeRunMwe2(p, false);
  }
  
  protected static void executeRunMwe2(final Mwe2Params it, final boolean log) {
    try {
      if(log) System.out.println("running runMwe2...");
      executeRunMwe2Impl(it);
      TaskState.fireFinishTask("runMwe2", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("runMwe2", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("runMwe2", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeRunMwe2Impl(final Mwe2Params it) throws Throwable {
    File _workspace = Literals.workspace();
    final File file = FileExtensions.operator_divide(_workspace, "org.xtext.example.mydsl/src/org/xtext/example/mydsl/GenerateMyDsl.mwe2");
    Pair<String,String> _mappedTo = Pair.<String, String>of("file.extensions", "myfoobarextension");
    FileExtensions.runAsMwe2Workflow(file, _mappedTo);
  }
}
