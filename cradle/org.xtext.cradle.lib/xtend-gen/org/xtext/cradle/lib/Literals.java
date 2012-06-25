package org.xtext.cradle.lib;

import com.google.common.base.Objects;
import java.io.File;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.xtext.cradle.lib.DigestInit;
import org.xtext.cradle.lib.DigestInitFile;
import org.xtext.cradle.lib.FileExtensions;
import org.xtext.cradle.lib.impl.Digest;
import org.xtext.cradle.lib.impl.TaskState;

@SuppressWarnings("all")
public class Literals {
  public static File file() {
    File _file = new File("/");
    return _file;
  }
  
  public static File git() {
    File _file = new File(".");
    File _containingGitRepository = FileExtensions.containingGitRepository(_file);
    return _containingGitRepository;
  }
  
  public static File project() {
    File _file = new File(".");
    File _containingProject = FileExtensions.containingProject(_file);
    return _containingProject;
  }
  
  public static File workspace() {
    File _file = new File(".");
    File _containingWorkspace = FileExtensions.containingWorkspace(_file);
    return _containingWorkspace;
  }
  
  public static Digest newDigest(final Procedure1<? super DigestInit> init) {
    DigestInit _digestInit = new DigestInit();
    final DigestInit di = _digestInit;
    init.apply(di);
    Digest _digest = new Digest();
    final Digest result = _digest;
    ArrayList<File> _files = di.getFiles();
    final Procedure1<File> _function = new Procedure1<File>() {
        public void apply(final File it) {
          result.addFile(it);
        }
      };
    IterableExtensions.<File>forEach(_files, _function);
    return result;
  }
  
  public static void skipTask() {
    TaskState.skipTask("Task Skipped");
  }
  
  public static void skipTaskIfDigestUnchanged(final Procedure1<DigestInitFile> init) {
    DigestInitFile _digestInitFile = new DigestInitFile();
    final DigestInitFile di = _digestInitFile;
    init.apply(di);
    Digest _digest = new Digest();
    final Digest newDigest = _digest;
    ArrayList<File> _files = di.getFiles();
    final Procedure1<File> _function = new Procedure1<File>() {
        public void apply(final File it) {
          newDigest.addFile(it);
        }
      };
    IterableExtensions.<File>forEach(_files, _function);
    File _digest_1 = di.getDigest();
    final Digest oldDigest = FileExtensions.loadAsDigest(_digest_1);
    boolean _equals = Objects.equal(newDigest, oldDigest);
    if (_equals) {
      TaskState.skipTask("Skipped because digest is unchanged");
    }
    final Procedure2<String,Throwable> _function_1 = new Procedure2<String,Throwable>() {
        public void apply(final String msg, final Throwable t) {
          boolean _equals = Objects.equal(t, null);
          if (_equals) {
            File _digest = di.getDigest();
            newDigest.saveAs(_digest);
          }
        }
      };
    TaskState.addTaskFinishListener(_function_1);
  }
}
