package foo;

import com.google.common.collect.Sets;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.builddsl.lib.BuildScript;

public class Test extends BuildScript {
  public String projectName = "Hello";
  
  @Override
  protected String getScriptName() {
    return "Test";
  }
  
  @Override
  protected String[] getParameterNames() {
    return new String[] {
      "projectName"
    };
  }
  
  @Override
  protected String[] getTaskNames() {
    return new String[] {
      "Start"
    };
  }
  
  public static void main(final String[] args) {
    Test script = new Test();
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
      if("--projectName".equals(args[index])) {
        projectName = args[++index];
      } else if("Start".equals(args[index])) {
        tasks.add("Start");
      } else {
        System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");
        return WRONG_PARAM;
      }
      index++;
    }
    for(String task:tasks) {
      if("Start".equals(task))
        start();
      index++;
    }return OK;
  }
  
  protected void start() throws Throwable {
    try {
      System.out.println("running Start...");
      _startImpl();
      System.out.println("success");
    } catch(Throwable throwable) {
      System.err.println(throwable.getMessage());
      throw throwable;
    }
  }
  
  protected void _startImpl() throws Throwable {
    InputOutput.<String>println(this.projectName);
  }
}
