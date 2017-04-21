/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.acme;

import com.acme.MagicNumber;
import com.google.common.io.CharStreams;
import com.google.common.io.OutputSupplier;
import com.google.inject.Inject;
import java.io.OutputStreamWriter;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GuessTheNumber {
  @Inject
  @Extension
  private MagicNumber _magicNumber;
  
  @Inject
  private HttpServletResponse response;
  
  public void handleGuess(final String theGuess) {
    if (((theGuess == null) || (this._magicNumber.getNumber() == null))) {
      this._magicNumber.seedNumber();
    }
    if ((theGuess == null)) {
      this.sendAnswer(null);
      return;
    }
    int _xtrycatchfinallyexpression = (int) 0;
    try {
      int _parseInt = 0;
      if (theGuess!=null) {
        _parseInt=Integer.parseInt(theGuess);
      }
      _xtrycatchfinallyexpression = _parseInt;
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        final NumberFormatException e = (NumberFormatException)_t;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(theGuess);
        _builder.append(" is not a number.");
        this.sendAnswer(_builder);
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    final int guess = _xtrycatchfinallyexpression;
    Integer _number = this._magicNumber.getNumber();
    boolean _equals = (guess == (_number).intValue());
    if (_equals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("You did it! The correct number is ");
      _builder_1.append(guess);
      _builder_1.append(".");
      this.sendAnswer(_builder_1);
      this._magicNumber.cleanNumber();
    } else {
      Integer _number_1 = this._magicNumber.getNumber();
      boolean _lessThan = (guess < (_number_1).intValue());
      if (_lessThan) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(guess);
        _builder_2.append(" is too small.");
        this.sendAnswer(_builder_2);
      } else {
        Integer _number_2 = this._magicNumber.getNumber();
        boolean _greaterThan = (guess > (_number_2).intValue());
        if (_greaterThan) {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append(guess);
          _builder_3.append(" is too high.");
          this.sendAnswer(_builder_3);
        }
      }
    }
  }
  
  public void handleAnswerToEverything() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("42 is normally the answer to everything ... ");
    {
      Integer _number = this._magicNumber.getNumber();
      boolean _equals = (42 == (_number).intValue());
      if (_equals) {
        _builder.append("and the current number is 42, too!");
      } else {
        _builder.append(" but not in this case! ;-) ");
      }
    }
    this.sendAnswer(_builder);
  }
  
  public void sendAnswer(final CharSequence message) {
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
      if ((message != null)) {
        _builder.append("\t\t");
        _builder.append("<p>");
        _builder.append(message, "\t\t");
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
      final OutputSupplier<OutputStreamWriter> _function = () -> {
        ServletOutputStream _outputStream = this.response.getOutputStream();
        return new OutputStreamWriter(_outputStream);
      };
      CharStreams.<OutputStreamWriter>write(answer, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
