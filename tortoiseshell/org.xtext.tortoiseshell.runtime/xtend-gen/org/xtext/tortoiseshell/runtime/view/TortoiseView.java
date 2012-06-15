package org.xtext.tortoiseshell.runtime.view;

import com.google.common.base.Objects;
import java.util.Iterator;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.FreeformViewport;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.xtext.tortoiseshell.runtime.ITortoiseEvent;
import org.xtext.tortoiseshell.runtime.ITortoiseEvent.Listener;
import org.xtext.tortoiseshell.runtime.ITortoiseInterpreter;
import org.xtext.tortoiseshell.runtime.MoveEvent;
import org.xtext.tortoiseshell.runtime.Tortoise;
import org.xtext.tortoiseshell.runtime.TurnEvent;
import org.xtext.tortoiseshell.runtime.view.Animation;
import org.xtext.tortoiseshell.runtime.view.Animator;
import org.xtext.tortoiseshell.runtime.view.RootLayer;
import org.xtext.tortoiseshell.runtime.view.TortoiseFigure;
import org.xtext.tortoiseshell.runtime.view.TortoisePartListener;

@SuppressWarnings("all")
public class TortoiseView extends ViewPart implements Listener {
  private FigureCanvas canvas;
  
  private Figure rootFigure;
  
  private TortoiseFigure tortoiseFigure;
  
  private TortoisePartListener listener;
  
  private Animator animator;
  
  public void createPartControl(final Composite parent) {
    FigureCanvas _figureCanvas = new FigureCanvas(parent, SWT.DOUBLE_BUFFERED);
    this.canvas = _figureCanvas;
    FreeformViewport _freeformViewport = new FreeformViewport();
    this.canvas.setViewport(_freeformViewport);
    this.canvas.setBackground(ColorConstants.white);
    FreeformLayeredPane _freeformLayeredPane = new FreeformLayeredPane();
    final FreeformLayeredPane pane = _freeformLayeredPane;
    Font _font = parent.getFont();
    pane.setFont(_font);
    this.canvas.setContents(pane);
    RootLayer _rootLayer = new RootLayer();
    this.rootFigure = _rootLayer;
    pane.add(this.rootFigure, "primary");
    TortoiseFigure _tortoiseFigure = new TortoiseFigure();
    this.tortoiseFigure = _tortoiseFigure;
    this.reset();
    TortoisePartListener _tortoisePartListener = new TortoisePartListener(this);
    this.listener = _tortoisePartListener;
    IWorkbenchPartSite _site = this.getSite();
    IWorkbenchPage _page = _site.getPage();
    _page.addPartListener(this.listener);
    Animator _animator = new Animator(this.tortoiseFigure);
    this.animator = _animator;
  }
  
  public void setFocus() {
    this.canvas.setFocus();
  }
  
  public void reset() {
    this.rootFigure.removeAll();
    this.rootFigure.add(this.tortoiseFigure);
    Point _point = new Point(0, 0);
    this.tortoiseFigure.setTortoiseLocation(_point);
    this.tortoiseFigure.setAngle(0);
    Viewport _viewport = this.canvas.getViewport();
    Rectangle _bounds = _viewport.getBounds();
    Point _center = _bounds.getCenter();
    int _minus = (-_center.x);
    Viewport _viewport_1 = this.canvas.getViewport();
    Rectangle _bounds_1 = _viewport_1.getBounds();
    Point _center_1 = _bounds_1.getCenter();
    int _minus_1 = (-_center_1.y);
    this.canvas.scrollTo(_minus, _minus_1);
  }
  
  public Boolean show(final XtextEditor tortoiseEditor) {
    Boolean _xblockexpression = null;
    {
      this.animator.stop();
      this.reset();
      IXtextDocument _document = tortoiseEditor.getDocument();
      final Function1<XtextResource,Boolean> _function = new Function1<XtextResource,Boolean>() {
          public Boolean apply(final XtextResource it) {
            boolean _xifexpression = false;
            boolean _hasError = TortoiseView.this.hasError(tortoiseEditor);
            boolean _not = (!_hasError);
            if (_not) {
              boolean _xblockexpression = false;
              {
                Tortoise _tortoise = new Tortoise();
                final Tortoise tortoise = _tortoise;
                tortoise.addListener(TortoiseView.this);
                IResourceServiceProvider _resourceServiceProvider = it.getResourceServiceProvider();
                final ITortoiseInterpreter interpreter = _resourceServiceProvider.<ITortoiseInterpreter>get(ITortoiseInterpreter.class);
                boolean _notEquals = (!Objects.equal(interpreter, null));
                if (_notEquals) {
                  interpreter.execute(tortoise, it);
                }
                boolean _removeListener = tortoise.removeListener(TortoiseView.this);
                _xblockexpression = (_removeListener);
              }
              _xifexpression = _xblockexpression;
            }
            return Boolean.valueOf(_xifexpression);
          }
        };
      Boolean _readOnly = _document.<Boolean>readOnly(new IUnitOfWork<Boolean,XtextResource>() {
          public Boolean exec(XtextResource state) {
            return _function.apply(state);
          }
      });
      _xblockexpression = (_readOnly);
    }
    return _xblockexpression;
  }
  
  public boolean hasError(final XtextEditor tortoiseEditor) {
    boolean _xblockexpression = false;
    {
      IDocumentProvider _documentProvider = tortoiseEditor.getDocumentProvider();
      IEditorInput _editorInput = tortoiseEditor.getEditorInput();
      IAnnotationModel _annotationModel = _documentProvider==null?(IAnnotationModel)null:_documentProvider.getAnnotationModel(_editorInput);
      final Iterator annotations = _annotationModel==null?(Iterator)null:_annotationModel.getAnnotationIterator();
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(annotations, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _hasNext = annotations.hasNext();
        _and = (_notEquals && _hasNext);
      }
      boolean _while = _and;
      while (_while) {
        {
          final Object annotation = annotations.next();
          boolean _and_1 = false;
          if (!(annotation instanceof Annotation)) {
            _and_1 = false;
          } else {
            String _type = ((Annotation) annotation).getType();
            boolean _equals = Objects.equal(_type, XtextEditor.ERROR_ANNOTATION_TYPE);
            _and_1 = ((annotation instanceof Annotation) && _equals);
          }
          if (_and_1) {
            return true;
          }
        }
        boolean _and_1 = false;
        boolean _notEquals_1 = (!Objects.equal(annotations, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          boolean _hasNext_1 = annotations.hasNext();
          _and_1 = (_notEquals_1 && _hasNext_1);
        }
        _while = _and_1;
      }
      _xblockexpression = (false);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  public void handleTortoiseEvent(final ITortoiseEvent event) {
    boolean _matched = false;
    if (!_matched) {
      if (event instanceof MoveEvent) {
        final MoveEvent _moveEvent = (MoveEvent)event;
        _matched=true;
        Tortoise _tortoise = _moveEvent.getTortoise();
        boolean _isPaint = _tortoise.isPaint();
        if (_isPaint) {
          Polyline _polyline = new Polyline();
          final Polyline line = _polyline;
          Tortoise _tortoise_1 = _moveEvent.getTortoise();
          Color _lineColor = _tortoise_1.getLineColor();
          line.setForegroundColor(_lineColor);
          Tortoise _tortoise_2 = _moveEvent.getTortoise();
          int _lineWidth = _tortoise_2.getLineWidth();
          line.setLineWidth(_lineWidth);
          Point _oldPosition = _moveEvent.getOldPosition();
          Point _oldPosition_1 = _moveEvent.getOldPosition();
          line.setEndpoints(_oldPosition, _oldPosition_1);
          Point _oldPosition_2 = _moveEvent.getOldPosition();
          Tortoise _tortoise_3 = _moveEvent.getTortoise();
          Point _position = _tortoise_3.getPosition();
          Tortoise _tortoise_4 = _moveEvent.getTortoise();
          int _delay = _tortoise_4.getDelay();
          Animation _animation = new Animation(_oldPosition_2, _position, line, _delay);
          this.animator.addAnimation(_animation);
        } else {
          Point _oldPosition_3 = _moveEvent.getOldPosition();
          Tortoise _tortoise_5 = _moveEvent.getTortoise();
          Point _position_1 = _tortoise_5.getPosition();
          Tortoise _tortoise_6 = _moveEvent.getTortoise();
          int _delay_1 = _tortoise_6.getDelay();
          Animation _animation_1 = new Animation(_oldPosition_3, _position_1, _delay_1);
          this.animator.addAnimation(_animation_1);
        }
      }
    }
    if (!_matched) {
      if (event instanceof TurnEvent) {
        final TurnEvent _turnEvent = (TurnEvent)event;
        _matched=true;
        double _oldAngle = _turnEvent.getOldAngle();
        Tortoise _tortoise = _turnEvent.getTortoise();
        double _angleInRadians = _tortoise.getAngleInRadians();
        Tortoise _tortoise_1 = _turnEvent.getTortoise();
        int _delay = _tortoise_1.getDelay();
        Animation _animation = new Animation(_oldAngle, _angleInRadians, _delay);
        this.animator.addAnimation(_animation);
      }
    }
  }
}
