package mwe2;

import com.google.common.collect.Sets;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import mwe2.Mwe2IfNeeded2.Mwe2IfNeeded2Params;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.lib.DigestInitFile;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.Literals;
import org.xtext.cradle.lib.impl.TaskSkippedException;
import org.xtext.cradle.lib.impl.TaskState;

public class Mwe2IfNeeded2 {
  public static class Mwe2IfNeeded2Params {
  }
  
  
  public static void main(final String[] args) {
    int index = 0;
    while(args.length == 0 || index < args.length) {
      if(args.length == 0 || "--help".equals(args[index]) ||  "-h".equals(args[index])) {
        System.out.println("Cradle 'Mwe2IfNeeded2'");
        System.out.println();
        System.out.println("Tasks:");
        System.out.println("  runMwe2IfNeeded2");
        return;
      } else
        index++;
    }
    Set<String> tasks = Sets.newLinkedHashSet();
    Mwe2IfNeeded2Params parameter = new Mwe2IfNeeded2Params();
    index = 0;
    while(index < args.length) {
      if("runMwe2IfNeeded2".equals(args[index])) {
        tasks.add("runMwe2IfNeeded2");
      } else {
        System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");
        return;
      }
      index++;
    }
    try {
      for(String task:tasks) {
        if("runMwe2IfNeeded2".equals(task))
          executeRunMwe2IfNeeded2(parameter, true);
        index++;
      }
    } catch(Throwable e) {
      System.out.println();
      e.printStackTrace();
    }
  }
  
  public static void runMwe2IfNeeded2(final Procedure1<Mwe2IfNeeded2Params> init) {
    Mwe2IfNeeded2Params p = new Mwe2IfNeeded2Params();
    init.apply(p);
    executeRunMwe2IfNeeded2(p, false);
  }
  
  protected static void executeRunMwe2IfNeeded2(final Mwe2IfNeeded2Params it, final boolean log) {
    try {
      if(log) System.out.println("running runMwe2IfNeeded2...");
      executeRunMwe2IfNeeded2Impl(it);
      TaskState.fireFinishTask("runMwe2IfNeeded2", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("runMwe2IfNeeded2", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("runMwe2IfNeeded2", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeRunMwe2IfNeeded2Impl(final Mwe2IfNeeded2Params it) throws Throwable {
    File _workspace = Literals.workspace();
    final File myDSL = FileExtensions.operator_divide(_workspace, "org.xtext.example.mydsl");
    final File workflowFile = FileExtensions.operator_divide(myDSL, "src/org/xtext/example/mydsl/GenerateMyDsl.mwe2");
    final Procedure1<DigestInitFile> _function = new Procedure1<DigestInitFile>() {
        public void apply(final DigestInitFile it) {
          File _divide = FileExtensions.operator_divide(myDSL, ".digest");
          it.setDigest(_divide);
          ArrayList<File> _files = it.getFiles();
          File _divide_1 = FileExtensions.operator_divide(myDSL, "src/org/xtext/example/mydsl/MyDsl.xtext");
          _files.add(_divide_1);
          ArrayList<File> _files_1 = it.getFiles();
          _files_1.add(workflowFile);
        }
      };
    Literals.skipTaskIfDigestUnchanged(_function);
    Pair<String,String> _mappedTo = Pair.<String, String>of("file.extensions", "myfoobarextension");
    FileExtensions.runAsMwe2Workflow(workflowFile, _mappedTo);
  }
}
