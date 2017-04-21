import com.google.common.base.Charsets;
import com.google.common.io.Files;
import java.io.File;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class WordCount {
  public static void main(final String... args) {
    try {
      int _size = ((List<String>)Conversions.doWrapArray(args)).size();
      boolean _equals = (_size == 0);
      if (_equals) {
        InputOutput.<String>println("Missing args: Specify file names");
      }
      for (final String arg : args) {
        {
          File _file = new File(arg);
          final List<String> lines = Files.readLines(_file, 
            Charsets.UTF_8);
          final Function1<String, Integer> _function = (String it) -> {
            return Integer.valueOf(((List<String>)Conversions.doWrapArray(it.split("\\s*"))).size());
          };
          final Function2<Integer, Integer, Integer> _function_1 = (Integer a, Integer b) -> {
            return Integer.valueOf(((a).intValue() + (b).intValue()));
          };
          Integer wordsInFile = IterableExtensions.<Integer>reduce(ListExtensions.<String, Integer>map(lines, _function), _function_1);
          int _size_1 = lines.size();
          String _plus = ((((("File " + arg) + ": ") + wordsInFile) + " words, ") + Integer.valueOf(_size_1));
          String _plus_1 = (_plus + " lines.");
          InputOutput.<String>println(_plus_1);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
