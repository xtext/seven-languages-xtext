import com.google.common.base.Objects;
import java.math.BigInteger;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Language {
  public static void main(final String... args) {
    /* null */
    /* "Hello World" */
    /* 42 */
    /* 0.42e2 */
    /* true */
    /* false */
    /* String.class */
    /* CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(7)); */
    /* CollectionLiterals.<String>newHashSet("foo", "bar", "baz"); */
    Pair<Integer, String> _mappedTo = Pair.<Integer, String>of(Integer.valueOf(1), "one");
    Pair<Integer, String> _mappedTo_1 = Pair.<Integer, String>of(Integer.valueOf(2), "two");
    Pair<Integer, String> _mappedTo_2 = Pair.<Integer, String>of(Integer.valueOf(3), "three");
    /* CollectionLiterals.<Integer, String>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2); */
    final String x = "A final value";
    String y = "A non-final variable";
    final String s = "my String";
    /* (1 + 2); */
    /* (1 - 2); */
    /* (1 / 2); */
    /* (1 * 2); */
    boolean _and = false;
    if (!true) {
      _and = false;
    } else {
      _and = false;
    }
    boolean _or = false;
    if (true) {
      _or = true;
    } else {
      _or = false;
    }
    /* (1 == 2); */
    /* (1 != 2); */
    /* (1 > 2); */
    /* (1 < 2); */
    /* (1 >= 2); */
    /* (1 <= 2); */
    /* Pair.<String, String>of("first", "second"); */
    /* new IntegerRange(1, 30); */
    String _elvis = null;
    if (null != null) {
      _elvis = null;
    } else {
      _elvis = "default";
    }
    final Procedure1<String> _function = (String it) -> {
      InputOutput.<Character>println(Character.valueOf(it.charAt(0)));
    };
    ObjectExtensions.<String>operator_doubleArrow(
      "foo", _function);
    if (((String) null)!=null) {
      ((String) null).toLowerCase();
    }
    /* StringExtensions.isNullOrEmpty("foo bar"); */
    final String z = "Hello ";
    final Function1<String, String> _function_1 = (String e) -> {
      return (z + e);
    };
    final Function1<String, String> f = _function_1;
    f.apply("World!");
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList("a", "b", "c");
    final Function1<String, String> _function_2 = (String e) -> {
      return e.toUpperCase();
    };
    /* ListExtensions.<String, String>map(list, _function_2); */
    final Function1<String, String> _function_3 = (String it) -> {
      return it.toUpperCase();
    };
    /* ListExtensions.<String, String>map(list, _function_3); */
    String _xifexpression = null;
    int _length = "foo".length();
    boolean _greaterThan = (_length > 3);
    if (_greaterThan) {
      _xifexpression = "never true!";
    } else {
      _xifexpression = "always true!";
    }
    final String myString = _xifexpression;
    final ArrayList<Object> itemis = CollectionLiterals.<Object>newArrayList("foo", "bar", Integer.valueOf(123), BigInteger.valueOf(123456789L));
    for (final Object i : itemis) {
      boolean _matched = false;
      if (Objects.equal(i, "foo")) {
        _matched=true;
        /* "it\'s foo" */
      }
      if (!_matched) {
        if (Objects.equal(i, "bar")) {
          _matched=true;
          /* "a bar" */
        }
      }
      if (!_matched) {
        if (i instanceof Integer) {
          if (Objects.equal(i, 123)) {
            _matched=true;
            /* "found integer" */
          }
        }
      }
      if (!_matched) {
        if (i instanceof BigInteger) {
          _matched=true;
          int _bitLength = ((BigInteger)i).bitLength();
          /* ("it\'s huge, soo long:" + Integer.valueOf(_bitLength)); */
        }
      }
      if (!_matched) {
        /* "don\'t know" */
      }
    }
    InputOutput.<String>println(x);
    InputOutput.<String>println(y);
    InputOutput.<String>println(myString);
    InputOutput.<String>println(s);
  }
}
