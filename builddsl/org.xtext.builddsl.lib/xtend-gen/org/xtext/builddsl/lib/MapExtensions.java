package org.xtext.builddsl.lib;

import com.google.common.io.Files;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class MapExtensions {
  public static void createJarFromFiles(final Map<String,File> files, final File zipFile) {
    try {
      FileOutputStream _fileOutputStream = new FileOutputStream(zipFile);
      BufferedOutputStream _bufferedOutputStream = new BufferedOutputStream(_fileOutputStream);
      JarOutputStream _jarOutputStream = new JarOutputStream(_bufferedOutputStream);
      final JarOutputStream out = _jarOutputStream;
      try {
        out.setMethod(JarOutputStream.DEFLATED);
        Set<Entry<String,File>> _entrySet = files.entrySet();
        for (final Entry<String,File> e : _entrySet) {
          {
            String _key = e.getKey();
            ZipEntry _zipEntry = new ZipEntry(_key);
            final ZipEntry ze = _zipEntry;
            out.putNextEntry(ze);
            File _value = e.getValue();
            Files.copy(_value, out);
            out.closeEntry();
          }
        }
        out.flush();
      } finally {
        out.close();
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
