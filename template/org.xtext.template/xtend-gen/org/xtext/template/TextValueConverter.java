package org.xtext.template;

import com.google.common.base.Objects;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class TextValueConverter extends AbstractValueConverter<String> {
  private String postfix;
  
  private String prefix;
  
  public TextValueConverter(final String prefix, final String postfix) {
    super();
    this.prefix = prefix;
    this.postfix = postfix;
  }
  
  public String toString(final String value) {
    String _elvis = ObjectExtensions.<String>operator_elvis(value, "");
    String _plus = (this.prefix + _elvis);
    String _plus_1 = (_plus + this.postfix);
    return _plus_1;
  }
  
  public String toValue(final String string, final INode node) throws ValueConverterException {
    String _xblockexpression = null;
    {
      boolean _equals = Objects.equal(string, null);
      if (_equals) {
        return null;
      }
      String result = string;
      boolean _startsWith = result.startsWith(this.prefix);
      if (_startsWith) {
        int _length = this.prefix.length();
        String _substring = result.substring(_length);
        result = _substring;
      }
      boolean _endsWith = result.endsWith(this.postfix);
      if (_endsWith) {
        int _length_1 = result.length();
        int _length_2 = this.postfix.length();
        int _minus = (_length_1 - _length_2);
        String _substring_1 = result.substring(0, _minus);
        result = _substring_1;
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
}
