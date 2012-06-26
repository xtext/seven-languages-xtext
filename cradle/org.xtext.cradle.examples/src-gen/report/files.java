package report;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.Literals;
import org.xtext.cradle.lib.impl.TaskSkippedException;
import org.xtext.cradle.lib.impl.TaskState;
import report.files.filesParams;

public class files {
  public static class filesParams {
  }
  
  
  public static void main(final String[] args) {
    int index = 0;
    while(args.length == 0 || index < args.length) {
      if(args.length == 0 || "--help".equals(args[index]) ||  "-h".equals(args[index])) {
        System.out.println("Cradle 'files'");
        System.out.println();
        System.out.println("Tasks:");
        System.out.println("  CountFileExtensions");
        return;
      } else
        index++;
    }
    Set<String> tasks = Sets.newLinkedHashSet();
    filesParams parameter = new filesParams();
    index = 0;
    while(index < args.length) {
      if("CountFileExtensions".equals(args[index])) {
        tasks.add("CountFileExtensions");
      } else {
        System.out.println("Unknown task/parameter '" + args[index] + "'. Run program with --help to list available tasks/parameters");
        return;
      }
      index++;
    }
    try {
      for(String task:tasks) {
        if("CountFileExtensions".equals(task))
          executeCountFileExtensions(parameter, true);
        index++;
      }
    } catch(Throwable e) {
      System.out.println();
      e.printStackTrace();
    }
  }
  
  public static void countFileExtensions(final Procedure1<filesParams> init) {
    filesParams p = new filesParams();
    init.apply(p);
    executeCountFileExtensions(p, false);
  }
  
  protected static void executeCountFileExtensions(final filesParams it, final boolean log) {
    try {
      if(log) System.out.println("running CountFileExtensions...");
      executeCountFileExtensionsImpl(it);
      TaskState.fireFinishTask("CountFileExtensions", null);
      if(log) System.out.println("success");
    } catch(TaskSkippedException e) {
      TaskState.fireFinishTask("CountFileExtensions", e);
      if(log) System.out.println("skipped: " + e.getMessage());
    } catch(Throwable e) {
      TaskState.setMaySkip(false);
      TaskState.fireFinishTask("CountFileExtensions", e);
      if(log) System.out.println("error: "+e.getMessage());
      Exceptions.sneakyThrow(e);
    }
  }
  
  protected static void executeCountFileExtensionsImpl(final filesParams it) throws Throwable {
    final HashMap<String,Integer> counter = CollectionLiterals.<String, Integer>newHashMap();
    File _git = Literals.git();
    final Function1<File,Boolean> _function = new Function1<File,Boolean>() {
        public Boolean apply(final File it) {
          String _name = it.getName();
          boolean _contains = _name.contains(".");
          return _contains;
        }
      };
    List<File> _containedFiles = FileExtensions.containedFiles(_git, new Predicate<File>() {
        public boolean apply(File input) {
          return _function.apply(input);
        }
    });
    for (final File file : _containedFiles) {
      {
        String _fileExtension = FileExtensions.fileExtension(file);
        final Integer count = counter.get(_fileExtension);
        String _fileExtension_1 = FileExtensions.fileExtension(file);
        int _xifexpression = (int) 0;
        boolean _equals = Objects.equal(count, null);
        if (_equals) {
          _xifexpression = 1;
        } else {
          int _plus = ((count).intValue() + 1);
          _xifexpression = _plus;
        }
        counter.put(_fileExtension_1, Integer.valueOf(_xifexpression));
      }
    }
    Collection<Integer> _values = counter.values();
    final Function2<Integer,Integer,Integer> _function_1 = new Function2<Integer,Integer,Integer>() {
        public Integer apply(final Integer i, final Integer j) {
          int _plus = ((i).intValue() + (j).intValue());
          return Integer.valueOf(_plus);
        }
      };
    Integer _reduce = IterableExtensions.<Integer>reduce(_values, _function_1);
    final int total = ((_reduce).intValue() / 100);
    Set<Entry<String,Integer>> _entrySet = counter.entrySet();
    final Function1<Entry<String,Integer>,Integer> _function_2 = new Function1<Entry<String,Integer>,Integer>() {
        public Integer apply(final Entry<String,Integer> it) {
          Integer _value = it.getValue();
          int _minus = (-_value);
          return Integer.valueOf(_minus);
        }
      };
    List<Entry<String,Integer>> _sortBy = IterableExtensions.<Entry<String,Integer>, Integer>sortBy(_entrySet, _function_2);
    final Function1<Entry<String,Integer>,String> _function_3 = new Function1<Entry<String,Integer>,String>() {
        public String apply(final Entry<String,Integer> it) {
          String _key = it.getKey();
          String _plus = (_key + ": ");
          Integer _value = it.getValue();
          String _plus_1 = (_plus + _value);
          String _plus_2 = (_plus_1 + " (");
          Integer _value_1 = it.getValue();
          int _divide = ((_value_1).intValue() / total);
          String _plus_3 = (_plus_2 + Integer.valueOf(_divide));
          String _plus_4 = (_plus_3 + "%)");
          return _plus_4;
        }
      };
    List<String> _map = ListExtensions.<Entry<String,Integer>, String>map(_sortBy, _function_3);
    String _join = IterableExtensions.join(_map, "\n");
    InputOutput.<String>println(_join);
  }
}
