package xtend;

import com.google.common.collect.Sets;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.lib.impl.TaskSkippedException;
import org.xtext.cradle.lib.impl.TaskState;
import xtend.MyTasks.MyTasksParams;

public class MyTasks {
  public static class MyTasksParams {
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
    MyTasksParams parameter = new MyTasksParams();
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
        if("Prerequisite".equals(task))
          executePrerequisite(parameter, true);
        else if("MyTask".equals(task))
          executeMyTask(parameter, true);
        index++;
      }
    } catch(Throwable e) {
      System.out.println();
      e.printStackTrace();
    }
  }
  
  public static void prerequisite(final Procedure1<MyTasksParams> init) {
    MyTasksParams p = new MyTasksParams();
    init.apply(p);
    executePrerequisite(p, false);
  }
  
  protected static void executePrerequisite(final MyTasksParams it, final boolean log) {
    try {
      if(log) System.out.println("running Prerequisite...");
      executePrerequisiteImpl(it);
      TaskState.fireFinishTask("Prerequisite", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("Prerequisite", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("Prerequisite", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executePrerequisiteImpl(final MyTasksParams it) throws Throwable {
    InputOutput.<String>println("prerequisite");
  }
  
  public static void myTask(final Procedure1<MyTasksParams> init) {
    MyTasksParams p = new MyTasksParams();
    init.apply(p);
    executePrerequisite(p, false);
    executeMyTask(p, false);
  }
  
  protected static void executeMyTask(final MyTasksParams it, final boolean log) {
    try {
      if(log) System.out.println("running MyTask...");
      executeMyTaskImpl(it);
      TaskState.fireFinishTask("MyTask", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("MyTask", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("MyTask", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeMyTaskImpl(final MyTasksParams it) throws Throwable {
    String _plus = ("Say: " + it.name);
    InputOutput.<String>println(_plus);
  }
}
