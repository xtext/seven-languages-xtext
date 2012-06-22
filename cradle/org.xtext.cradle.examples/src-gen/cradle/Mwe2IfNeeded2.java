package cradle;

import com.google.common.collect.Sets;
import cradle.Mwe2IfNeeded2.Params;
import java.io.File;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.Literals;
import org.xtext.cradle.lib.Literals.DigestInitFile;

public class Mwe2IfNeeded2 {
  public static class Params {
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
    Params parameter = new Params();
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
        System.out.print("running " + task + "...");
        if("runMwe2IfNeeded2".equals(task))
          executeRunMwe2IfNeeded2(parameter);
        index++;
        System.out.println("success");
      }
    } catch(Throwable e) {
      System.out.println("failure: " + e.getMessage());System.out.println();e.printStackTrace();
    }
    
  }
  
  public static void runMwe2IfNeeded2(final Procedure1<Params> paramInitializer) {
    Params p = new Params();
    paramInitializer.apply(p);
    executeRunMwe2IfNeeded2(p);
  }
  
  protected static void executeRunMwe2IfNeeded2(final Params it) {
    File _workspace = Literals.workspace();
    final File myDSL = FileExtensions.operator_divide(_workspace, "org.xtext.example.mydsl");
    final File workflowFile = FileExtensions.operator_divide(myDSL, "src/org/xtext/example/mydsl/GenerateMyDsl.mwe2");
    final Procedure1<DigestInitFile> _function = new Procedure1<DigestInitFile>() {
        public void apply(final DigestInitFile it) {
          File _divide = FileExtensions.operator_divide(myDSL, ".digest");
          it.digest = _divide;
          File _divide_1 = FileExtensions.operator_divide(myDSL, "src/org/xtext/example/mydsl/MyDsl.xtext");
          it.files.add(_divide_1);
          it.files.add(workflowFile);
        }
      };
    Literals.skipTaskIfDigestUnchanged(_function);
    Pair<String,String> _mappedTo = Pair.<String, String>of("file.extensions", "myfoobarextension");
    FileExtensions.runAsMwe2Workflow(workflowFile, _mappedTo);
  }
}
