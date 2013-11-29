/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.tests;

import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.tortoiseshell.TortoiseShellInjectorProvider;
import org.xtext.tortoiseshell.interpreter.TortoiseShellInterpeter;
import org.xtext.tortoiseshell.lib.ITortoiseEvent;
import org.xtext.tortoiseshell.lib.MoveEvent;
import org.xtext.tortoiseshell.lib.Tortoise;
import org.xtext.tortoiseshell.lib.TurnEvent;
import org.xtext.tortoiseshell.tortoiseShell.Program;

@RunWith(XtextRunner.class)
@InjectWith(TortoiseShellInjectorProvider.class)
@SuppressWarnings("all")
public class InterpreterTest {
  @Inject
  @Extension
  private TortoiseShellInterpeter _tortoiseShellInterpeter;
  
  @Inject
  @Extension
  private ParseHelper<Program> _parseHelper;
  
  @Test
  public void testTortoiseDefaults() {
    Tortoise _tortoise = new Tortoise();
    final Procedure1<Tortoise> _function = new Procedure1<Tortoise>() {
      public void apply(final Tortoise it) {
        boolean _isPaint = it.isPaint();
        Assert.assertTrue(_isPaint);
        double _angle = it.getAngle();
        Assert.assertEquals(0.0, _angle, 0.0);
        Point _point = new Point(0, 0);
        Point _position = it.getPosition();
        Assert.assertEquals(_point, _position);
        int _delay = it.getDelay();
        Assert.assertEquals(200, _delay);
        Color _lineColor = it.getLineColor();
        Assert.assertEquals(ColorConstants.black, _lineColor);
        int _lineWidth = it.getLineWidth();
        Assert.assertEquals(1, _lineWidth);
      }
    };
    ObjectExtensions.<Tortoise>operator_doubleArrow(_tortoise, _function);
  }
  
  @Test
  public void testTortoisProgram() {
    try {
      Tortoise _tortoise = new Tortoise();
      final Procedure1<Tortoise> _function = new Procedure1<Tortoise>() {
        public void apply(final Tortoise it) {
          boolean _isPaint = it.isPaint();
          Assert.assertTrue(_isPaint);
          double _angle = it.getAngle();
          Assert.assertEquals(0.0, _angle, 0.0);
          Point _point = new Point(0, 0);
          Point _position = it.getPosition();
          Assert.assertEquals(_point, _position);
          int _delay = it.getDelay();
          Assert.assertEquals(200, _delay);
          Color _lineColor = it.getLineColor();
          Assert.assertEquals(ColorConstants.black, _lineColor);
          int _lineWidth = it.getLineWidth();
          Assert.assertEquals(1, _lineWidth);
        }
      };
      final Tortoise tortoise = ObjectExtensions.<Tortoise>operator_doubleArrow(_tortoise, _function);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("begin");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("delay = 1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("penUp");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("lineWidth = 2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("lineColor = blue");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("forward(10)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("turnLeft(10)");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final Program program = this._parseHelper.parse(_builder);
      this._tortoiseShellInterpeter.run(tortoise, program, (-10));
      final Procedure1<Tortoise> _function_1 = new Procedure1<Tortoise>() {
        public void apply(final Tortoise it) {
          boolean _isPaint = it.isPaint();
          Assert.assertFalse(_isPaint);
          double _angle = it.getAngle();
          Assert.assertEquals(10.0, _angle, 0.0);
          Point _point = new Point(0, (-10));
          Point _position = it.getPosition();
          Assert.assertEquals(_point, _position);
          int _delay = it.getDelay();
          Assert.assertEquals(1, _delay);
          Color _lineColor = it.getLineColor();
          Assert.assertEquals(ColorConstants.blue, _lineColor);
          int _lineWidth = it.getLineWidth();
          Assert.assertEquals(2, _lineWidth);
        }
      };
      ObjectExtensions.<Tortoise>operator_doubleArrow(tortoise, _function_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSubProgram() {
    try {
      Tortoise _tortoise = new Tortoise();
      final Tortoise tortoise = _tortoise;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("begin");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("delay = 0");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("val angle = 20");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("for(i: (0..360).withStep(angle)) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("turnAndGo(10, angle)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      _builder.newLine();
      _builder.append("sub turnAndGo");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("int dist");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("int angle");
      _builder.newLine();
      _builder.append("begin");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("forward(dist) ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("turnLeft(angle)");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      final Program program = this._parseHelper.parse(_builder);
      final ArrayList<MoveEvent> moveEvents = CollectionLiterals.<MoveEvent>newArrayList();
      final ArrayList<TurnEvent> turnEvents = CollectionLiterals.<TurnEvent>newArrayList();
      final ITortoiseEvent.Listener _function = new ITortoiseEvent.Listener() {
        public void handleTortoiseEvent(final ITortoiseEvent it) {
          boolean _matched = false;
          if (!_matched) {
            if (it instanceof MoveEvent) {
              _matched=true;
              moveEvents.add(((MoveEvent)it));
            }
          }
          if (!_matched) {
            if (it instanceof TurnEvent) {
              _matched=true;
              turnEvents.add(((TurnEvent)it));
            }
          }
        }
      };
      tortoise.addListener(_function);
      this._tortoiseShellInterpeter.run(tortoise, program, (-10));
      int _size = moveEvents.size();
      Assert.assertEquals(19, _size);
      int _size_1 = turnEvents.size();
      Assert.assertEquals(19, _size_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
