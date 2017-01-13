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
import org.xtext.tortoiseshell.interpreter.TortoiseShellInterpeter;
import org.xtext.tortoiseshell.lib.ITortoiseEvent;
import org.xtext.tortoiseshell.lib.MoveEvent;
import org.xtext.tortoiseshell.lib.Tortoise;
import org.xtext.tortoiseshell.lib.TurnEvent;
import org.xtext.tortoiseshell.tests.TortoiseShellInjectorProvider;
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
    final Procedure1<Tortoise> _function = (Tortoise it) -> {
      Assert.assertTrue(it.isPaint());
      Assert.assertEquals(0.0, it.getAngle(), 0.0);
      Point _point = new Point(0, 0);
      Assert.assertEquals(_point, it.getPosition());
      Assert.assertEquals(200, it.getDelay());
      Assert.assertEquals(ColorConstants.black, it.getLineColor());
      Assert.assertEquals(1, it.getLineWidth());
    };
    ObjectExtensions.<Tortoise>operator_doubleArrow(_tortoise, _function);
  }
  
  @Test
  public void testTortoisProgram() {
    try {
      Tortoise _tortoise = new Tortoise();
      final Procedure1<Tortoise> _function = (Tortoise it) -> {
        Assert.assertTrue(it.isPaint());
        Assert.assertEquals(0.0, it.getAngle(), 0.0);
        Point _point = new Point(0, 0);
        Assert.assertEquals(_point, it.getPosition());
        Assert.assertEquals(200, it.getDelay());
        Assert.assertEquals(ColorConstants.black, it.getLineColor());
        Assert.assertEquals(1, it.getLineWidth());
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
      final Procedure1<Tortoise> _function_1 = (Tortoise it) -> {
        Assert.assertFalse(it.isPaint());
        Assert.assertEquals(10.0, it.getAngle(), 0.0);
        Point _point = new Point(0, (-10));
        Assert.assertEquals(_point, it.getPosition());
        Assert.assertEquals(1, it.getDelay());
        Assert.assertEquals(ColorConstants.blue, it.getLineColor());
        Assert.assertEquals(2, it.getLineWidth());
      };
      ObjectExtensions.<Tortoise>operator_doubleArrow(tortoise, _function_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSubProgram() {
    try {
      final Tortoise tortoise = new Tortoise();
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
      final ITortoiseEvent.Listener _function = (ITortoiseEvent it) -> {
        boolean _matched = false;
        if (it instanceof MoveEvent) {
          _matched=true;
          moveEvents.add(((MoveEvent)it));
        }
        if (!_matched) {
          if (it instanceof TurnEvent) {
            _matched=true;
            turnEvents.add(((TurnEvent)it));
          }
        }
      };
      tortoise.addListener(_function);
      this._tortoiseShellInterpeter.run(tortoise, program, (-10));
      Assert.assertEquals(19, moveEvents.size());
      Assert.assertEquals(19, turnEvents.size());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
