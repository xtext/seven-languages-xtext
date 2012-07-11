package com.acme;

import com.acme.MagicNumber;
import com.google.common.base.Objects;
import com.google.common.io.CharStreams;
import com.google.common.io.OutputSupplier;
import com.google.inject.Inject;
import java.io.OutputStreamWriter;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class GuessTheNumber {
  @Inject
  private MagicNumber _magicNumber;
  
  @Inject
  private HttpServletResponse response;
  
  public void handleGuess(final String theGuess) {
    int _xtrycatchfinallyexpression = (int) 0;
    try {
      int _parseInt = theGuess==null?0:Integer.parseInt(theGuess);
      _xtrycatchfinallyexpression = _parseInt;
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        final NumberFormatException e = (NumberFormatException)_t;
        String _plus = (theGuess + " is not a number.");
        this.sendAnswer(_plus);
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    final int guess = _xtrycatchfinallyexpression;
    boolean _or = false;
    boolean _equals = Objects.equal(Integer.valueOf(guess), null);
    if (_equals) {
      _or = true;
    } else {
      Integer _number = this._magicNumber.getNumber();
      boolean _equals_1 = Objects.equal(_number, null);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      this._magicNumber.seedNumber();
      this.sendAnswer(null);
    } else {
      Integer _number_1 = this._magicNumber.getNumber();
      boolean _equals_2 = (guess == (_number_1).intValue());
      if (_equals_2) {
        String _plus_1 = ("You did it! The correct number is " + Integer.valueOf(guess));
        this.sendAnswer(_plus_1);
        this._magicNumber.cleanNumber();
      } else {
        Integer _number_2 = this._magicNumber.getNumber();
        boolean _lessThan = (guess < (_number_2).intValue());
        if (_lessThan) {
          String _plus_2 = (Integer.valueOf(guess) + " is too small.");
          this.sendAnswer(_plus_2);
        } else {
          Integer _number_3 = this._magicNumber.getNumber();
          boolean _greaterThan = (guess > (_number_3).intValue());
          if (_greaterThan) {
            String _plus_3 = (Integer.valueOf(guess) + " is too high.");
            this.sendAnswer(_plus_3);
          }
        }
      }
    }
  }
  
  public void sendAnswer(final String message) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body onload=\"document.guessTheNumber.theGuess.focus();\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h1>Guess a Number between 1 and 100</h1>");
    _builder.newLine();
    {
      boolean _notEquals = (!Objects.equal(message, null));
      if (_notEquals) {
        _builder.append("\t\t");
        _builder.append("<p>");
        _builder.append(message, "		");
        _builder.append("</p>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("<form name=\"guessTheNumber\" action=\"/guess\"><input name=\"theGuess\" type=\"text\" focus=\"true\"></action>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    this.send(_builder);
  }
  
  private void send(final CharSequence answer) {
    try {
      final Function0<OutputStreamWriter> _function = new Function0<OutputStreamWriter>() {
          public OutputStreamWriter apply() {
            try {
              ServletOutputStream _outputStream = GuessTheNumber.this.response.getOutputStream();
              OutputStreamWriter _outputStreamWriter = new OutputStreamWriter(_outputStream);
              return _outputStreamWriter;
            } catch (Exception _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
      CharStreams.<OutputStreamWriter>write(answer, new OutputSupplier<OutputStreamWriter>() {
          public OutputStreamWriter getOutput() {
            return _function.apply();
          }
      });
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
