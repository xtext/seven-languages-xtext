package cradle;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import cradle.Mwe2IfNeeded.Mwe2IfNeededParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.lib.DigestInit;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.Literals;
import org.xtext.cradle.lib.impl.Digest;
import org.xtext.cradle.lib.impl.TaskSkippedException;
import org.xtext.cradle.lib.impl.TaskState;

public class Mwe2IfNeeded {
  public static class Mwe2IfNeededParams {
    public String name = "holla";
  }
  
  
  public static void main(final String[] args) {
    int index = 0;
    while(args.length == 0 || index < args.length) {
      if(args.length == 0 || "--help".equals(args[index]) ||  "-h".equals(args[index])) {
        System.out.println("Cradle 'Mwe2IfNeeded'");
        System.out.println();
        System.out.println("Tasks:");
        System.out.println("  runMwe2IfNeeded");
        System.out.println();
        System.out.println("Parameters:");
        System.out.println("  --name <String>");
        return;
      } else
        index++;
    }
    Set<String> tasks = Sets.newLinkedHashSet();
    Mwe2IfNeededParams parameter = new Mwe2IfNeededParams();
    index = 0;
    while(index < args.length) {
      if("--name".equals(args[index])) {
        parameter.name = args[++index];
      } else if("runMwe2IfNeeded".equals(args[index])) {
        tasks.add("runMwe2IfNeeded");
      } else {
        System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");
        return;
      }
      index++;
    }
    try {
      for(String task:tasks) {
        if("runMwe2IfNeeded".equals(task))
          executeRunMwe2IfNeeded(parameter, true);
        index++;
      }
    } catch(Throwable e) {
      System.out.println();
      e.printStackTrace();
    }
  }
  
  public static void runMwe2IfNeeded(final Procedure1<Mwe2IfNeededParams> init) {
    Mwe2IfNeededParams p = new Mwe2IfNeededParams();
    init.apply(p);
    executeRunMwe2IfNeeded(p, false);
  }
  
  protected static void executeRunMwe2IfNeeded(final Mwe2IfNeededParams it, final boolean log) {
    try {
      if(log) System.out.println("running runMwe2IfNeeded...");
      executeRunMwe2IfNeededImpl(it);
      TaskState.fireFinishTask("runMwe2IfNeeded", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("runMwe2IfNeeded", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("runMwe2IfNeeded", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeRunMwe2IfNeededImpl(final Mwe2IfNeededParams it) {
    File _workspace = Literals.workspace();
    final File myDSL = FileExtensions.operator_divide(_workspace, "org.xtext.example.mydsl");
    final File workflowFile = FileExtensions.operator_divide(myDSL, "src/org/xtext/example/mydsl/GenerateMyDsl.mwe2");
    final File grammarFile = FileExtensions.operator_divide(myDSL, "src/org/xtext/example/mydsl/MyDsl.xtext");
    final File digestFile = FileExtensions.operator_divide(myDSL, "src-gen/digest.txt");
    final Digest oldDigest = FileExtensions.loadAsDigest(digestFile);
    final Procedure1<DigestInit> _function = new Procedure1<DigestInit>() {
        public void apply(final DigestInit it) {
          ArrayList<File> _files = it.getFiles();
          _files.add(workflowFile);
          ArrayList<File> _files_1 = it.getFiles();
          _files_1.add(grammarFile);
        }
      };
    final Digest newDigest = Literals.newDigest(_function);
    boolean _equals = Objects.equal(newDigest, oldDigest);
    if (_equals) {
      Literals.skipTask();
    }
    Pair<String,String> _mappedTo = Pair.<String, String>of("file.extensions", "myfoobarextension");
    FileExtensions.runAsMwe2Workflow(workflowFile, _mappedTo);
    newDigest.saveAs(digestFile);
  }
}
