package org.xtext.cradle.valueconversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class FILEValueConverter implements IValueConverter {
  public String toString(final Object value) {
    String _plus = (":/" + value);
    String _plus_1 = (_plus + " ");
    return _plus_1;
  }
  
  public Object toValue(final String string, final INode node) {
    String _xifexpression = null;
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(string);
    if (_isNullOrEmpty) {
      _xifexpression = null;
    } else {
      String _xblockexpression = null;
      {
        String trimmed = string.trim();
        boolean _endsWith = trimmed.endsWith(":");
        if (_endsWith) {
          int _length = trimmed.length();
          int _minus = (_length - 1);
          String _substring = trimmed.substring(0, _minus);
          trimmed = _substring;
        }
        int _length_1 = trimmed.length();
        String _substring_1 = trimmed.substring(2, _length_1);
        _xblockexpression = (_substring_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
}
