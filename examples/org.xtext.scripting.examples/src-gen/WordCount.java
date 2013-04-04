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
          final Function1<String,Integer> _function = new Function1<String,Integer>() {
              public Integer apply(final String it) {
                String[] _split = it.split("\\s*");
                int _size = ((List<String>)Conversions.doWrapArray(_split)).size();
                return Integer.valueOf(_size);
              }
            };
          List<Integer> _map = ListExtensions.<String, Integer>map(lines, _function);
          final Function2<Integer,Integer,Integer> _function_1 = new Function2<Integer,Integer,Integer>() {
              public Integer apply(final Integer a, final Integer b) {
                int _plus = ((a).intValue() + (b).intValue());
                return Integer.valueOf(_plus);
              }
            };
          Integer wordsInFile = IterableExtensions.<Integer>reduce(_map, _function_1);
          String _plus = ("File " + arg);
          String _plus_1 = (_plus + ": ");
          String _plus_2 = (_plus_1 + wordsInFile);
          String _plus_3 = (_plus_2 + " words, ");
          int _size_1 = lines.size();
          String _plus_4 = (_plus_3 + Integer.valueOf(_size_1));
          String _plus_5 = (_plus_4 + " lines.");
          InputOutput.<String>println(_plus_5);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
