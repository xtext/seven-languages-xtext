package org.xtext.cradle.lib;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.inject.Injector;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Pair;
import org.xtext.cradle.lib.impl.Digest;
import org.xtext.cradle.lib.impl.FileProperties;

@SuppressWarnings("all")
public class FileExtensions {
  private static Predicate<File> contains(final String name) {
    final Function1<File,Boolean> _function = new Function1<File,Boolean>() {
        public Boolean apply(final File file) {
          boolean _and = false;
          boolean _isDirectory = file.isDirectory();
          if (!_isDirectory) {
            _and = false;
          } else {
            String _absolutePath = file.getAbsolutePath();
            String _plus = (_absolutePath + "/");
            String _plus_1 = (_plus + name);
            File _file = new File(_plus_1);
            boolean _exists = _file.exists();
            _and = (_isDirectory && _exists);
          }
          return _and;
        }
      };
    return new Predicate<File>() {
        public boolean apply(File input) {
          return _function.apply(input);
        }
    };
  }
  
  private static Predicate<File> matches(final String regex) {
    Predicate<File> _xblockexpression = null;
    {
      final Pattern pattern = Pattern.compile(regex);
      final Function1<File,Boolean> _function = new Function1<File,Boolean>() {
          public Boolean apply(final File file) {
            String _name = file.getName();
            Matcher _matcher = pattern.matcher(_name);
            boolean _matches = _matcher.matches();
            return _matches;
          }
        };
      _xblockexpression = (((Predicate<File>) new Predicate<File>() {
          public boolean apply(File input) {
            return _function.apply(input);
          }
      }));
    }
    return _xblockexpression;
  }
  
  private static void collectFiles(final File root, final List<File> result, final Predicate<File> matcher) {
    File[] _listFiles = root.listFiles();
    for (final File f : _listFiles) {
      {
        boolean _apply = matcher.apply(f);
        if (_apply) {
          result.add(f);
        }
        boolean _isDirectory = f.isDirectory();
        if (_isDirectory) {
          FileExtensions.collectFiles(f, result, matcher);
        }
      }
    }
  }
  
  public static ArrayList<File> contained(final File file, final Predicate<File> predicate) {
    final ArrayList<File> files = CollectionLiterals.<File>newArrayList();
    FileExtensions.collectFiles(file, files, predicate);
    return files;
  }
  
  public static List<File> contained(final File container, final String regex) {
    Predicate<File> _matches = FileExtensions.matches(regex);
    return FileExtensions.contained(container, _matches);
  }
  
  public static List<File> containedDirectories(final File container, final Predicate<File> predicate) {
    final Function1<File,Boolean> _function = new Function1<File,Boolean>() {
        public Boolean apply(final File it) {
          boolean _isDirectory = it.isDirectory();
          return _isDirectory;
        }
      };
    Predicate<File> _and = FileExtensions.operator_and(predicate, new Predicate<File>() {
        public boolean apply(File input) {
          return _function.apply(input);
        }
    });
    return FileExtensions.contained(container, _and);
  }
  
  public static List<File> containedDirectories(final File container, final String regex) {
    Predicate<File> _matches = FileExtensions.matches(regex);
    final Function1<File,Boolean> _function = new Function1<File,Boolean>() {
        public Boolean apply(final File it) {
          boolean _isDirectory = it.isDirectory();
          return _isDirectory;
        }
      };
    Predicate<File> _and = FileExtensions.operator_and(_matches, new Predicate<File>() {
        public boolean apply(File input) {
          return _function.apply(input);
        }
    });
    return FileExtensions.contained(container, _and);
  }
  
  public static List<File> containedFeatureProjects(final File container) {
    Predicate<File> _contains = FileExtensions.contains(".project");
    Predicate<File> _contains_1 = FileExtensions.contains("feature.xml");
    Predicate<File> _and = FileExtensions.operator_and(_contains, _contains_1);
    return FileExtensions.contained(container, _and);
  }
  
  public static List<File> containedFiles(final File container, final Predicate<File> predicate) {
    final Function1<File,Boolean> _function = new Function1<File,Boolean>() {
        public Boolean apply(final File it) {
          boolean _isFile = it.isFile();
          return _isFile;
        }
      };
    Predicate<File> _and = FileExtensions.operator_and(predicate, new Predicate<File>() {
        public boolean apply(File input) {
          return _function.apply(input);
        }
    });
    return FileExtensions.contained(container, _and);
  }
  
  public static List<File> containedFiles(final File container, final String regex) {
    Predicate<File> _matches = FileExtensions.matches(regex);
    final Function1<File,Boolean> _function = new Function1<File,Boolean>() {
        public Boolean apply(final File it) {
          boolean _isFile = it.isFile();
          return _isFile;
        }
      };
    Predicate<File> _and = FileExtensions.operator_and(_matches, new Predicate<File>() {
        public boolean apply(File input) {
          return _function.apply(input);
        }
    });
    return FileExtensions.contained(container, _and);
  }
  
  public static List<File> containedGitRepositories(final File container) {
    Predicate<File> _contains = FileExtensions.contains(".git");
    return FileExtensions.contained(container, _contains);
  }
  
  public static List<File> containedJavaProjects(final File container) {
    Predicate<File> _contains = FileExtensions.contains(".project");
    Predicate<File> _contains_1 = FileExtensions.contains(".classpath");
    Predicate<File> _and = FileExtensions.operator_and(_contains, _contains_1);
    return FileExtensions.contained(container, _and);
  }
  
  public static List<File> containedPluginProjects(final File container) {
    Predicate<File> _contains = FileExtensions.contains(".project");
    Predicate<File> _contains_1 = FileExtensions.contains("META-INF/MANIFEST.MF");
    Predicate<File> _and = FileExtensions.operator_and(_contains, _contains_1);
    return FileExtensions.contained(container, _and);
  }
  
  public static List<File> containedProjects(final File container) {
    Predicate<File> _contains = FileExtensions.contains(".project");
    return FileExtensions.contained(container, _contains);
  }
  
  public static File containingFolderWithFile(final File file, final String string) {
    File _containingFolderWithFile = FileExtensions.containingFolderWithFile(file, string, null);
    return _containingFolderWithFile;
  }
  
  public static File containingFolderWithFile(final File file, final String string, final String errorMessage) {
    File f = file.getAbsoluteFile();
    boolean _notEquals = (!Objects.equal(f, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        String _absolutePath = f.getAbsolutePath();
        String _plus = (_absolutePath + "/");
        String _plus_1 = (_plus + string);
        File _file = new File(_plus_1);
        boolean _exists = _file.exists();
        if (_exists) {
          return f;
        }
        File _parentFile = f.getParentFile();
        f = _parentFile;
      }
      boolean _notEquals_1 = (!Objects.equal(f, null));
      _while = _notEquals_1;
    }
    boolean _notEquals_1 = (!Objects.equal(errorMessage, null));
    if (_notEquals_1) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(errorMessage, "");
      _builder.append(" No parent directory of \"");
      File _absoluteFile = file.getAbsoluteFile();
      _builder.append(_absoluteFile, "");
      _builder.append("\" contains \'");
      _builder.append(string, "");
      _builder.append("\'.");
      IllegalStateException _illegalStateException = new IllegalStateException(_builder.toString());
      throw _illegalStateException;
    }
    return null;
  }
  
  public static File containingGitRepository(final File file) {
    File _containingFolderWithFile = FileExtensions.containingFolderWithFile(file, ".git", "No Git repository found.");
    return _containingFolderWithFile;
  }
  
  public static File containingProject(final File file) {
    File _containingFolderWithFile = FileExtensions.containingFolderWithFile(file, ".project", "No Eclipse Project found.");
    return _containingFolderWithFile;
  }
  
  public static File containingWorkspace(final File file) {
    File _containingFolderWithFile = FileExtensions.containingFolderWithFile(file, ".metadata", "No Eclipse Workspace found.");
    return _containingFolderWithFile;
  }
  
  public static Digest loadAsDigest(final File file) {
    Digest _digest = new Digest();
    final Digest result = _digest;
    boolean _exists = file.exists();
    if (_exists) {
      result.load(file);
    }
    return result;
  }
  
  public static FileProperties loadAsProperties(final File file) {
    FileProperties _fileProperties = new FileProperties(file);
    return _fileProperties;
  }
  
  public static Predicate<File> operator_and(final Predicate<File> left, final Predicate<File> right) {
    Predicate<File> _and = Predicates.<File>and(left, right);
    return _and;
  }
  
  public static File operator_divide(final File file, final String name) {
    boolean _isDirectory = file.isDirectory();
    boolean _not = (!_isDirectory);
    if (_not) {
      String _plus = ("This is not a directory: " + file);
      IllegalStateException _illegalStateException = new IllegalStateException(_plus);
      throw _illegalStateException;
    }
    URI _uRI = file.toURI();
    URI _resolve = _uRI.resolve(name);
    File _file = new File(_resolve);
    return _file;
  }
  
  public static void runAsMwe2Workflow(final File file, final Pair<String,String>... args) {
    Mwe2StandaloneSetup _mwe2StandaloneSetup = new Mwe2StandaloneSetup();
    final Injector injector = _mwe2StandaloneSetup.createInjectorAndDoEMFRegistration();
    final Mwe2Runner runner = injector.<Mwe2Runner>getInstance(Mwe2Runner.class);
    String _absolutePath = file.getAbsolutePath();
    org.eclipse.emf.common.util.URI _createFileURI = org.eclipse.emf.common.util.URI.createFileURI(_absolutePath);
    HashMap<String,String> _newHashMap = CollectionLiterals.<String, String>newHashMap(args);
    runner.run(_createFileURI, _newHashMap);
  }
}
