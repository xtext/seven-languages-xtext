/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.tortoiseshell.lib.view;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.FreeformViewport;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.util.DisplayRunHelper;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.tortoiseshell.lib.ITortoiseEvent;
import org.xtext.tortoiseshell.lib.ITortoiseInterpreter;
import org.xtext.tortoiseshell.lib.MoveEvent;
import org.xtext.tortoiseshell.lib.Tortoise;
import org.xtext.tortoiseshell.lib.TurnEvent;
import org.xtext.tortoiseshell.lib.view.Animation;
import org.xtext.tortoiseshell.lib.view.Animator;
import org.xtext.tortoiseshell.lib.view.RootLayer;
import org.xtext.tortoiseshell.lib.view.ToggleStopModeAction;
import org.xtext.tortoiseshell.lib.view.TortoiseFigure;
import org.xtext.tortoiseshell.lib.view.TortoisePartListener;

@Singleton
@SuppressWarnings("all")
public class TortoiseView extends ViewPart implements ITortoiseEvent.Listener {
  private static final Logger LOGGER = Logger.getLogger(TortoiseView.class);
  
  private FigureCanvas canvas;
  
  @Inject
  private ToggleStopModeAction action;
  
  @Inject
  private RootLayer rootFigure;
  
  @Inject
  private TortoiseFigure tortoiseFigure;
  
  @Inject
  private TortoisePartListener listener;
  
  @Inject
  private Animator animator;
  
  @Override
  public void createPartControl(final Composite parent) {
    FigureCanvas _figureCanvas = new FigureCanvas(parent, SWT.DOUBLE_BUFFERED);
    this.canvas = _figureCanvas;
    FreeformViewport _freeformViewport = new FreeformViewport();
    this.canvas.setViewport(_freeformViewport);
    this.canvas.setBackground(ColorConstants.white);
    final FreeformLayeredPane pane = new FreeformLayeredPane();
    pane.setFont(parent.getFont());
    this.canvas.setContents(pane);
    pane.add(this.rootFigure, "primary");
    this.reset();
    this.getSite().getPage().addPartListener(this.listener);
    IWorkbenchPartSite _site = this.getSite();
    ((IViewSite) _site).getActionBars().getToolBarManager().add(this.action);
  }
  
  @Override
  public void setFocus() {
    this.canvas.setFocus();
  }
  
  public TortoiseFigure getTortoiseFigure() {
    return this.tortoiseFigure;
  }
  
  public TortoisePartListener getTortoisePartListener() {
    return this.listener;
  }
  
  public void reset() {
    this.rootFigure.removeAll();
    this.rootFigure.add(this.tortoiseFigure);
    Point _point = new Point(0, 0);
    this.tortoiseFigure.setTortoiseLocation(_point);
    this.tortoiseFigure.setAngle(0);
    final org.eclipse.swt.graphics.Point viewportSize = this.canvas.getSize();
    this.canvas.scrollTo(((-viewportSize.x) / 2), ((-viewportSize.y) / 2));
  }
  
  public void show(final XtextEditor tortoiseEditor, final int stopAtLine) {
    this.animator.setAnimated((stopAtLine < 0));
    final Runnable _function = () -> {
      this.reset();
    };
    DisplayRunHelper.runSyncInDisplayThread(_function);
    final IUnitOfWork<Object, XtextResource> _function_1 = (XtextResource it) -> {
      if (((it != null) && (!this.hasError(tortoiseEditor)))) {
        final Tortoise tortoise = new Tortoise();
        tortoise.addListener(this);
        final ITortoiseInterpreter interpreter = it.getResourceServiceProvider().<ITortoiseInterpreter>get(ITortoiseInterpreter.class);
        if (((interpreter != null) && (!it.getContents().isEmpty()))) {
          try {
            interpreter.run(tortoise, it.getContents().get(0), stopAtLine);
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              final Exception e = (Exception)_t;
              Shell _shell = this.getSite().getShell();
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("Error during execution:");
              _builder.newLine();
              _builder.append("  ");
              String _message = e.getMessage();
              _builder.append(_message, "  ");
              _builder.newLineIfNotEmpty();
              _builder.append("See log for details");
              MessageDialog.openError(_shell, "Error during Execution", _builder.toString());
              TortoiseView.LOGGER.error("Error executing TortoiseScript", e);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
        tortoise.removeListener(this);
      }
      return null;
    };
    tortoiseEditor.getDocument().<Object>readOnly(_function_1);
  }
  
  public boolean hasError(final XtextEditor tortoiseEditor) {
    boolean _xblockexpression = false;
    {
      IDocumentProvider _documentProvider = tortoiseEditor.getDocumentProvider();
      IAnnotationModel _annotationModel = null;
      if (_documentProvider!=null) {
        _annotationModel=_documentProvider.getAnnotationModel(tortoiseEditor.getEditorInput());
      }
      Iterator<Annotation> _annotationIterator = null;
      if (_annotationModel!=null) {
        _annotationIterator=_annotationModel.getAnnotationIterator();
      }
      final Iterator<Annotation> annotations = _annotationIterator;
      while (((annotations != null) && annotations.hasNext())) {
        {
          final Annotation annotation = annotations.next();
          String _type = annotation.getType();
          boolean _equals = Objects.equal(_type, XtextEditor.ERROR_ANNOTATION_TYPE);
          if (_equals) {
            return true;
          }
        }
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  @Override
  public void handleTortoiseEvent(final ITortoiseEvent event) {
    boolean _matched = false;
    if (event instanceof MoveEvent) {
      _matched=true;
      boolean _isPaint = ((MoveEvent)event).getTortoise().isPaint();
      if (_isPaint) {
        final Polyline line = new Polyline();
        line.setForegroundColor(((MoveEvent)event).getTortoise().getLineColor());
        line.setLineWidth(((MoveEvent)event).getTortoise().getLineWidth());
        line.setEndpoints(((MoveEvent)event).getOldPosition(), ((MoveEvent)event).getOldPosition());
        Point _oldPosition = ((MoveEvent)event).getOldPosition();
        Point _position = ((MoveEvent)event).getTortoise().getPosition();
        int _delay = ((MoveEvent)event).getTortoise().getDelay();
        Animation _animation = new Animation(_oldPosition, _position, line, _delay);
        this.animator.addAnimation(_animation);
      } else {
        Point _oldPosition_1 = ((MoveEvent)event).getOldPosition();
        Point _position_1 = ((MoveEvent)event).getTortoise().getPosition();
        int _delay_1 = ((MoveEvent)event).getTortoise().getDelay();
        Animation _animation_1 = new Animation(_oldPosition_1, _position_1, _delay_1);
        this.animator.addAnimation(_animation_1);
      }
    }
    if (!_matched) {
      if (event instanceof TurnEvent) {
        _matched=true;
        double _oldAngle = ((TurnEvent)event).getOldAngle();
        double _angleInRadians = ((TurnEvent)event).getTortoise().getAngleInRadians();
        int _delay = ((TurnEvent)event).getTortoise().getDelay();
        Animation _animation = new Animation(_oldAngle, _angleInRadians, _delay);
        this.animator.addAnimation(_animation);
      }
    }
  }
}
