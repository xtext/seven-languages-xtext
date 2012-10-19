import com.google.common.base.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class Language {
  public static void main(final String[] args) {
    /* null */
    /* "Hello World" */
    /* 42 */
    /* 0.42e2 */
    /* true */
    /* false */
    /* String.class */
    /*CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(7));*/
    /*CollectionLiterals.<String>newHashSet("foo", "bar", "baz");*/
    Pair<Integer,String> _mappedTo = Pair.<Integer, String>of(Integer.valueOf(1), "one");
    Pair<Integer,String> _mappedTo_1 = Pair.<Integer, String>of(Integer.valueOf(2), "two");
    Pair<Integer,String> _mappedTo_2 = Pair.<Integer, String>of(Integer.valueOf(3), "three");
    /*CollectionLiterals.<Integer, String>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2);*/
    /* new BigInteger("beefbeefbeefbeefbeef", 16) */
    /* new BigDecimal("0.123456789123456789123456789123456789e4242") */
    final String x = "A final value";
    String y = "A non-final variable";
    final String s = "my String";
    /*(1 + 2);*/
    /*(1 - 2);*/
    /*(1 / 2);*/
    /*(1 * 2);*/
    /*(1 % 2);*/
    /*Math.pow(1, 2);*/
    boolean _and = false;
    if (!true) {
      _and = false;
    } else {
      _and = (true && false);
    }
    boolean _or = false;
    if (true) {
      _or = true;
    } else {
      _or = (true || false);
    }
    /*(1 == 2);*/
    /*(1 != 2);*/
    /*(1 > 2);*/
    /*(1 < 2);*/
    /*(1 >= 2);*/
    /*(1 <= 2);*/
    /*(1 << 2);*/
    /*(1 >> 2);*/
    /*Pair.<String, String>of("first", "second");*/
    /*new IntegerRange(1, 30);*/
    /*ObjectExtensions.<String>operator_elvis(
      null, "default");*/
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          char _charAt = it.charAt(0);
          InputOutput.<Character>println(Character.valueOf(_charAt));
        }
      };
    ObjectExtensions.<String>operator_doubleArrow(
      "foo", _function);
    if (((String) null)!=null) ((String) null).length();
    /*StringExtensions.isNullOrEmpty("foo bar");*/
    final String x_1 = "Hello ";
    final Function1<String,String> _function_1 = new Function1<String,String>() {
        public String apply(final String e) {
          String _plus = (x + e);
          return _plus;
        }
      };
    final Function1<String,String> f = _function_1;
    f.apply("World!");
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList("a", "b", "c");
    final Function1<String,String> _function_2 = new Function1<String,String>() {
        public String apply(final String e) {
          String _upperCase = e.toUpperCase();
          return _upperCase;
        }
      };
    /*ListExtensions.<String, String>map(list, _function_2);*/
    final Function1<String,String> _function_3 = new Function1<String,String>() {
        public String apply(final String it) {
          String _upperCase = it.toUpperCase();
          return _upperCase;
        }
      };
    /*ListExtensions.<String, String>map(list, _function_3);*/
    int _length = "foo".length();
    boolean _greaterThan = (_length > 3);
    if (_greaterThan) {
      /* "never true!" */
    } else {
      /* "always true!" */
    }
    final ArrayList<String> list_1 = CollectionLiterals.<String>newArrayList("foo", "bar", "baz");
    ArrayList<String> _arrayList = new ArrayList<String>();
    final ArrayList<String> result = _arrayList;
    List<String> _reverse = ListExtensions.<String>reverse(list);
    for (final String x_2 : _reverse) {
      String _upperCase = x_2.toUpperCase();
      result.add(_upperCase);
    }
    /*result;*/
    int i = 0;
    int _size = list.size();
    boolean _lessThan = (i < _size);
    boolean _while = _lessThan;
    while (_while) {
      {
        String _get = list.get(i);
        String _plus = ("whiled-" + _get);
        result.add(_plus);
        int _plus_1 = (i + 1);
        i = _plus_1;
      }
      int _size_1 = list.size();
      boolean _lessThan_1 = (i < _size_1);
      _while = _lessThan_1;
    }
    /*result;*/
    final ArrayList<Object> itemis = CollectionLiterals.<Object>newArrayList("foo", "bar", Integer.valueOf(123), BigInteger.valueOf(123456789L));
    for (final Object i_1 : itemis) {
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(i_1,"foo")) {
          _matched=true;
          /* "it\'s foo" */
        }
      }
      if (!_matched) {
        if (Objects.equal(i_1,"bar")) {
          _matched=true;
          /* "a bar" */
        }
      }
      if (!_matched) {
        if (i_1 instanceof Integer) {
          final Integer _integer = (Integer)i_1;
          if (Objects.equal(i_1,123)) {
            _matched=true;
            /* "found integer" */
          }
        }
      }
      if (!_matched) {
        if (i_1 instanceof BigInteger) {
          final BigInteger _bigInteger = (BigInteger)i_1;
          _matched=true;
          int _bitLength = _bigInteger.bitLength();
          /*("it\'s huge, soo long:" + Integer.valueOf(_bitLength));*/
        }
      }
      if (!_matched) {
        /* "don\'t know" */
      }
    }
  }
}
