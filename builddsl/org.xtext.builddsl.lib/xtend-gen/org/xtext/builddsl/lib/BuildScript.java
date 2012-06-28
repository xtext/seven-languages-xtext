package org.xtext.builddsl.lib;

import com.google.common.base.Objects;
import java.lang.reflect.Field;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class BuildScript {
  public static int OK = 0;
  
  public static int HELP = 1;
  
  public static int ERROR = 2;
  
  public static int WRONG_PARAM = 3;
  
  protected abstract String getScriptName();
  
  protected abstract String[] getParameterNames();
  
  protected abstract String[] getTaskNames();
  
  public Class<? extends Object> getParameterType(final String name) {
    try {
      Class<? extends Object> _xblockexpression = null;
      {
        Class<? extends Object> _class = this.getClass();
        final Field field = _class.getField(name);
        Class<? extends Object> _type = field.getType();
        _xblockexpression = (_type);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected abstract int doBuild(final String[] args) throws Throwable;
  
  protected int build(final String[] args) {
    try {
      try {
        return this.doBuild(args);
      } catch (Exception _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    } catch (final Throwable _t) {
      if (_t instanceof Throwable) {
        final Throwable throwable = (Throwable)_t;
        InputOutput.println();
        throwable.printStackTrace();
        return BuildScript.ERROR;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public boolean showHelp(final String[] args) {
    boolean _or = false;
    boolean _isEmpty = ((List<String>)Conversions.doWrapArray(args)).isEmpty();
    if (_isEmpty) {
      _or = true;
    } else {
      final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
          public Boolean apply(final String arg) {
            boolean _or = false;
            boolean _equals = Objects.equal("--help", arg);
            if (_equals) {
              _or = true;
            } else {
              boolean _equals_1 = Objects.equal("-h", arg);
              _or = (_equals || _equals_1);
            }
            return Boolean.valueOf(_or);
          }
        };
      boolean _exists = IterableExtensions.<String>exists(((Iterable<String>)Conversions.doWrapArray(args)), _function);
      _or = (_isEmpty || _exists);
    }
    if (_or) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Build \'");
      String _scriptName = this.getScriptName();
      _builder.append(_scriptName, "");
      _builder.append("\'");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("Tasks:");
      _builder.newLine();
      {
        String[] _taskNames = this.getTaskNames();
        for(final String task : _taskNames) {
          _builder.append("\t");
          _builder.append(task, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      {
        String[] _parameterNames = this.getParameterNames();
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(((Iterable<? extends Object>)Conversions.doWrapArray(_parameterNames)));
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
          _builder.append("Parameters:");
          _builder.newLine();
          {
            String[] _parameterNames_1 = this.getParameterNames();
            for(final String it : _parameterNames_1) {
              _builder.append("\t");
              _builder.append("--");
              _builder.append(it, "	");
              _builder.append(" <");
              Class<? extends Object> _parameterType = this.getParameterType(it);
              String _simpleName = _parameterType.getSimpleName();
              _builder.append(_simpleName, "	");
              _builder.append(">");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      InputOutput.<CharSequence>println(_builder);
      return true;
    }
    return false;
  }
}
