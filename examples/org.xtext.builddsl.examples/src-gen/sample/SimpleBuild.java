package sample;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.builddsl.lib.BuildScript;
import org.xtext.builddsl.lib.DependsOn;
import org.xtext.builddsl.lib.Param;

public class SimpleBuild extends BuildScript {
  @Param
  public String name;
  
  public static void main(final String[] args) {
    SimpleBuild script = new SimpleBuild();
    if (script.showHelp(args)) {
    	System.exit(HELP);
    }
    System.exit(script.doBuild(args));
    
  }
  
  @DependsOn()
  protected void prepare() {
    InputOutput.<String>print("Hello ");
  }
  
  @DependsOn("prepare")
  protected void print() {
    InputOutput.<String>print(this.name);
  }
}
