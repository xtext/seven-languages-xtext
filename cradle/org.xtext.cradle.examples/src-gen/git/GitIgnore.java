package git;

import com.google.common.collect.Sets;
import git.GitIgnore.GitIgnoreParams;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.Literals;
import org.xtext.cradle.lib.impl.TaskSkippedException;
import org.xtext.cradle.lib.impl.TaskState;

public class GitIgnore {
  public static class GitIgnoreParams {
  }
  
  
  public static void main(final String[] args) {
    int index = 0;
    while(args.length == 0 || index < args.length) {
      if(args.length == 0 || "--help".equals(args[index]) ||  "-h".equals(args[index])) {
        System.out.println("Cradle 'GitIgnore'");
        System.out.println();
        System.out.println("Tasks:");
        System.out.println("  SetGitignore");
        return;
      } else
        index++;
    }
    Set<String> tasks = Sets.newLinkedHashSet();
    GitIgnoreParams parameter = new GitIgnoreParams();
    index = 0;
    while(index < args.length) {
      if("SetGitignore".equals(args[index])) {
        tasks.add("SetGitignore");
      } else {
        System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");
        return;
      }
      index++;
    }
    try {
      for(String task:tasks) {
        if("SetGitignore".equals(task))
          executeSetGitignore(parameter, true);
        index++;
      }
    } catch(Throwable e) {
      System.out.println();
      e.printStackTrace();
    }
  }
  
  public static void setGitignore(final Procedure1<GitIgnoreParams> init) {
    GitIgnoreParams p = new GitIgnoreParams();
    init.apply(p);
    executeSetGitignore(p, false);
  }
  
  protected static void executeSetGitignore(final GitIgnoreParams it, final boolean log) {
    try {
      if(log) System.out.println("running SetGitignore...");
      executeSetGitignoreImpl(it);
      TaskState.fireFinishTask("SetGitignore", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("SetGitignore", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("SetGitignore", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeSetGitignoreImpl(final GitIgnoreParams it) throws Throwable {
    File _git = Literals.git();
    List<File> _containedJavaProjects = FileExtensions.containedJavaProjects(_git);
    for (final File proj : _containedJavaProjects) {
      File _divide = FileExtensions.operator_divide(proj, "src-gen");
      File _divide_1 = FileExtensions.operator_divide(proj, "xtend-gen");
      ArrayList<File> _newArrayList = CollectionLiterals.<File>newArrayList(_divide, _divide_1);
      for (final File dir : _newArrayList) {
        boolean _exists = dir.exists();
        if (_exists) {
          String _plus = ("processing " + dir);
          InputOutput.<String>println(_plus);
        }
      }
    }
  }
}
