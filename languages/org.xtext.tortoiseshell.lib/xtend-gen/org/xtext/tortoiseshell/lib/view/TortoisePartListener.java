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
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class TortoisePartListener implements IPartListener, IResourceChangeListener, CaretListener {
  private XtextEditor currentTortoiseEditor;
  
  @Inject
  private TortoiseView view;
  
  private boolean isStopMode;
  
  public boolean isTortoiseEditor(final IWorkbenchPart part) {
    return ((part instanceof XtextEditor) && Objects.equal(part.getSite().getId(), "org.xtext.tortoiseshell.TortoiseShell"));
  }
  
  @Override
  public void partActivated(final IWorkbenchPart part) {
    boolean _isTortoiseEditor = this.isTortoiseEditor(part);
    if (_isTortoiseEditor) {
      IFile _editorFile = null;
      if (this.currentTortoiseEditor!=null) {
        _editorFile=this.getEditorFile(this.currentTortoiseEditor);
      }
      IWorkspace _workspace = null;
      if (_editorFile!=null) {
        _workspace=_editorFile.getWorkspace();
      }
      if (_workspace!=null) {
        _workspace.removeResourceChangeListener(this);
      }
      ISourceViewer _internalSourceViewer = null;
      if (this.currentTortoiseEditor!=null) {
        _internalSourceViewer=this.currentTortoiseEditor.getInternalSourceViewer();
      }
      StyledText _textWidget = null;
      if (_internalSourceViewer!=null) {
        _textWidget=_internalSourceViewer.getTextWidget();
      }
      if (_textWidget!=null) {
        _textWidget.removeCaretListener(this);
      }
      this.currentTortoiseEditor = ((XtextEditor) part);
      if (this.isStopMode) {
        ISourceViewer _internalSourceViewer_1 = null;
        if (this.currentTortoiseEditor!=null) {
          _internalSourceViewer_1=this.currentTortoiseEditor.getInternalSourceViewer();
        }
        StyledText _textWidget_1 = null;
        if (_internalSourceViewer_1!=null) {
          _textWidget_1=_internalSourceViewer_1.getTextWidget();
        }
        if (_textWidget_1!=null) {
          _textWidget_1.addCaretListener(this);
        }
      } else {
        this.view.show(this.currentTortoiseEditor, (-10));
      }
      IFile _editorFile_1 = null;
      if (this.currentTortoiseEditor!=null) {
        _editorFile_1=this.getEditorFile(this.currentTortoiseEditor);
      }
      IWorkspace _workspace_1 = null;
      if (_editorFile_1!=null) {
        _workspace_1=_editorFile_1.getWorkspace();
      }
      if (_workspace_1!=null) {
        _workspace_1.addResourceChangeListener(this);
      }
    }
  }
  
  @Override
  public void partBroughtToTop(final IWorkbenchPart part) {
  }
  
  @Override
  public void partClosed(final IWorkbenchPart part) {
  }
  
  @Override
  public void partDeactivated(final IWorkbenchPart part) {
    boolean _equals = Objects.equal(part, this.currentTortoiseEditor);
    if (_equals) {
      ISourceViewer _internalSourceViewer = null;
      if (this.currentTortoiseEditor!=null) {
        _internalSourceViewer=this.currentTortoiseEditor.getInternalSourceViewer();
      }
      StyledText _textWidget = null;
      if (_internalSourceViewer!=null) {
        _textWidget=_internalSourceViewer.getTextWidget();
      }
      if (_textWidget!=null) {
        _textWidget.removeCaretListener(this);
      }
      IFile _editorFile = null;
      if (this.currentTortoiseEditor!=null) {
        _editorFile=this.getEditorFile(this.currentTortoiseEditor);
      }
      IWorkspace _workspace = null;
      if (_editorFile!=null) {
        _workspace=_editorFile.getWorkspace();
      }
      if (_workspace!=null) {
        _workspace.removeResourceChangeListener(this);
      }
      this.currentTortoiseEditor = null;
    }
  }
  
  @Override
  public void partOpened(final IWorkbenchPart part) {
  }
  
  @Override
  public void resourceChanged(final IResourceChangeEvent event) {
    try {
      IFile _editorFile = null;
      if (this.currentTortoiseEditor!=null) {
        _editorFile=this.getEditorFile(this.currentTortoiseEditor);
      }
      final IFile editorFile = _editorFile;
      if ((editorFile != null)) {
        final IPath editorFilePath = editorFile.getFullPath();
        final IResourceDeltaVisitor _function = (IResourceDelta it) -> {
          boolean _xifexpression = false;
          if (((Objects.equal(it.getResource(), editorFile) && (it.getKind() == IResourceDelta.CHANGED)) && (it.getFlags() == IResourceDelta.CONTENT))) {
            boolean _xblockexpression = false;
            {
              this.view.show(this.currentTortoiseEditor, (-10));
              _xblockexpression = false;
            }
            _xifexpression = _xblockexpression;
          } else {
            _xifexpression = it.getResource().getFullPath().isPrefixOf(editorFilePath);
          }
          return _xifexpression;
        };
        event.getDelta().accept(_function);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected IFile getEditorFile(final IEditorPart editor) {
    IFile _xifexpression = null;
    IEditorInput _editorInput = null;
    if (editor!=null) {
      _editorInput=editor.getEditorInput();
    }
    if ((_editorInput instanceof IFileEditorInput)) {
      IEditorInput _editorInput_1 = editor.getEditorInput();
      _xifexpression = ((IFileEditorInput) _editorInput_1).getFile();
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public boolean toggleStopMode() {
    boolean _xblockexpression = false;
    {
      ISourceViewer _internalSourceViewer = null;
      if (this.currentTortoiseEditor!=null) {
        _internalSourceViewer=this.currentTortoiseEditor.getInternalSourceViewer();
      }
      StyledText _textWidget = null;
      if (_internalSourceViewer!=null) {
        _textWidget=_internalSourceViewer.getTextWidget();
      }
      if (_textWidget!=null) {
        _textWidget.removeCaretListener(this);
      }
      this.isStopMode = (!this.isStopMode);
      if (this.isStopMode) {
        ISourceViewer _internalSourceViewer_1 = null;
        if (this.currentTortoiseEditor!=null) {
          _internalSourceViewer_1=this.currentTortoiseEditor.getInternalSourceViewer();
        }
        StyledText _textWidget_1 = null;
        if (_internalSourceViewer_1!=null) {
          _textWidget_1=_internalSourceViewer_1.getTextWidget();
        }
        if (_textWidget_1!=null) {
          _textWidget_1.addCaretListener(this);
        }
      }
      _xblockexpression = this.isStopMode;
    }
    return _xblockexpression;
  }
  
  @Override
  public void caretMoved(final CaretEvent event) {
    try {
      final int stopAtLine = this.currentTortoiseEditor.getDocument().getLineOfOffset(event.caretOffset);
      this.view.show(this.currentTortoiseEditor, stopAtLine);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
