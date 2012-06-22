package cradle;

import com.google.common.collect.Sets;
import cradle.Mwe2.Params;
import java.io.File;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.Literals;

public class Mwe2 {
  public static class Params {
    public String name = "holla";
  }
  
  
  public static void main(final String[] args) {
    int index = 0;
    while(args.length == 0 || index < args.length) {
      if(args.length == 0 || "--help".equals(args[index]) ||  "-h".equals(args[index])) {
        System.out.println("Cradle 'Mwe2'");
        System.out.println();
        System.out.println("Tasks:");
        System.out.println("  runMwe2");
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
      } else if("runMwe2".equals(args[index])) {
        tasks.add("runMwe2");
      } else {
        System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");
        return;
      }
      index++;
    }
    try {
      for(String task:tasks) {
        System.out.print("running " + task + "...");
        if("runMwe2".equals(task))
          executeRunMwe2(parameter);
        index++;
        System.out.println("success");
      }
    } catch(Throwable e) {
      System.out.println("failure: " + e.getMessage());System.out.println();e.printStackTrace();
    }
    
  }
  
  public static void runMwe2(final Procedure1<Params> paramInitializer) {
    Params p = new Params();
    paramInitializer.apply(p);
    executeRunMwe2(p);
  }
  
  protected static void executeRunMwe2(final Params it) {
    File _workspace = Literals.workspace();
    final File file = FileExtensions.operator_divide(_workspace, "org.xtext.example.mydsl/src/org/xtext/example/mydsl/GenerateMyDsl.mwe2");
    Pair<String,String> _mappedTo = Pair.<String, String>of("file.extensions", "myfoobarextension");
    FileExtensions.runAsMwe2Workflow(file, _mappedTo);
  }
}
