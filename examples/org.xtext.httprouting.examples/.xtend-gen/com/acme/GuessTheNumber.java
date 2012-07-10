package com.acme;

import com.google.common.base.Objects;
import com.google.common.io.CharStreams;
import com.google.common.io.OutputSupplier;
import com.google.inject.Inject;
import java.io.OutputStreamWriter;
import java.util.Random;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class GuessTheNumber {
  @Inject
  private HttpServletRequest request;
  
  @Inject
  private HttpServletResponse response;
  
  public Integer getGuess() {
    String _parameter = this.request.getParameter("guess");
    Integer _valueOf = _parameter==null?(Integer)null:Integer.valueOf(_parameter);
    return _valueOf;
  }
  
  public Integer getNumber() {
    HttpSession _session = this.request.getSession();
    Object _attribute = _session.getAttribute("number");
    return ((Integer) _attribute);
  }
  
  public void seedNumber() {
    Random _random = new Random();
    int _nextInt = _random.nextInt();
    int _modulo = (_nextInt % 100);
    final int number = Math.abs(_modulo);
    HttpSession _session = this.request.getSession();
    _session.setAttribute("number", Integer.valueOf(number));
  }
  
  public void cleanNumber() {
    HttpSession _session = this.request.getSession();
    _session.removeAttribute("number");
  }
  
  public void handleGuess(final Integer guess) {
    boolean _or = false;
    boolean _equals = Objects.equal(guess, null);
    if (_equals) {
      _or = true;
    } else {
      Integer _number = this.getNumber();
      boolean _equals_1 = Objects.equal(_number, null);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      this.seedNumber();
      this.sendAnswer(null);
    } else {
      Integer _number_1 = this.getNumber();
      boolean _equals_2 = Objects.equal(guess, _number_1);
      if (_equals_2) {
        String _plus = ("You did it! The correct number is " + guess);
        this.sendAnswer(_plus);
        this.cleanNumber();
      } else {
        Integer _number_2 = this.getNumber();
        boolean _lessThan = (guess.compareTo(_number_2) < 0);
        if (_lessThan) {
          String _plus_1 = (guess + " is too small.");
          this.sendAnswer(_plus_1);
        } else {
          Integer _number_3 = this.getNumber();
          boolean _greaterThan = (guess.compareTo(_number_3) > 0);
          if (_greaterThan) {
            String _plus_2 = (guess + " is too high.");
            this.sendAnswer(_plus_2);
          } else {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("OOOpps");
            this.send(_builder);
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
    _builder.append("<body>");
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
    _builder.append("<form action=\"/guess\"><input name=\"guess\" type=\"text\"></action>");
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
