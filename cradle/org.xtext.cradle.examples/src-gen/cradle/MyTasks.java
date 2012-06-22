package cradle;

import com.google.common.collect.Sets;
import cradle.MyTasks.Params;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class MyTasks {
  public static class Params {
    public String name = "Hello";
  }
  
  
  public static void main(final String[] args) {
    int index = 0;
    while(args.length == 0 || index < args.length) {
      if(args.length == 0 || "--help".equals(args[index]) ||  "-h".equals(args[index])) {
        System.out.println("Cradle 'MyTasks'");
        System.out.println();
        System.out.println("Tasks:");
        System.out.println("  Prerequisite");
        System.out.println("  MyTask");
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
      } else if("Prerequisite".equals(args[index])) {
        tasks.add("Prerequisite");
      } else if("MyTask".equals(args[index])) {
        tasks.add("Prerequisite");
        tasks.add("MyTask");
      } else {
        System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");
        return;
      }
      index++;
    }
    try {
      for(String task:tasks) {
        System.out.print("running " + task + "...");
        if("Prerequisite".equals(task))
          executePrerequisite(parameter);
        else if("MyTask".equals(task))
          executeMyTask(parameter);
        index++;
        System.out.println("success");
      }
    } catch(Throwable e) {
      System.out.println("failure: " + e.getMessage());System.out.println();e.printStackTrace();
    }
    
  }
  
  public static void Prerequisite(final Procedure1<Params> paramInitializer) {
    Params p = new Params();
    paramInitializer.apply(p);
    executePrerequisite(p);
  }
  
  protected static void executePrerequisite(final Params it) {
    InputOutput.<String>println("prerequisite");
  }
  
  public static void MyTask(final Procedure1<Params> paramInitializer) {
    Params p = new Params();
    paramInitializer.apply(p);
    executePrerequisite(p);
    executeMyTask(p);
  }
  
  protected static void executeMyTask(final Params it) {
    String _plus = ("Say: " + it.name);
    InputOutput.<String>println(_plus);
  }
}
