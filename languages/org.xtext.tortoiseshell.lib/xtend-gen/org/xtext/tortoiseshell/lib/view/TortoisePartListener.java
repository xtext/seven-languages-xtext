package org.xtext.tortoiseshell.lib.view;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
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
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.xtext.tortoiseshell.lib.view.TortoiseView;

@SuppressWarnings("all")
public class TortoisePartListener implements IPartListener, IResourceChangeListener, CaretListener {
  private XtextEditor currentTortoiseEditor;
  
  @Inject
  private TortoiseView view;
  
  private boolean isStopMode;
  
  public boolean isTortoiseEditor(final IWorkbenchPart part) {
    boolean _and = false;
    if (!(part instanceof XtextEditor)) {
      _and = false;
    } else {
      IWorkbenchPartSite _site = part.getSite();
      String _id = _site.getId();
      boolean _equals = Objects.equal(_id, "org.xtext.tortoiseshell.TortoiseShell");
      _and = ((part instanceof XtextEditor) && _equals);
    }
    return _and;
  }
  
  public void partActivated(final IWorkbenchPart part) {
    boolean _isTortoiseEditor = this.isTortoiseEditor(part);
    if (_isTortoiseEditor) {
      IFile _editorFile = this.currentTortoiseEditor==null?(IFile)null:this.getEditorFile(this.currentTortoiseEditor);
      IWorkspace _workspace = _editorFile==null?(IWorkspace)null:_editorFile.getWorkspace();
      if (_workspace!=null) _workspace.removeResourceChangeListener(this);
      ISourceViewer _internalSourceViewer = this.currentTortoiseEditor==null?(ISourceViewer)null:this.currentTortoiseEditor.getInternalSourceViewer();
      StyledText _textWidget = _internalSourceViewer==null?(StyledText)null:_internalSourceViewer.getTextWidget();
      if (_textWidget!=null) _textWidget.removeCaretListener(this);
      this.currentTortoiseEditor = ((XtextEditor) part);
      if (this.isStopMode) {
        ISourceViewer _internalSourceViewer_1 = this.currentTortoiseEditor==null?(ISourceViewer)null:this.currentTortoiseEditor.getInternalSourceViewer();
        StyledText _textWidget_1 = _internalSourceViewer_1==null?(StyledText)null:_internalSourceViewer_1.getTextWidget();
        if (_textWidget_1!=null) _textWidget_1.addCaretListener(this);
      } else {
        int _minus = (-10);
        this.view.show(this.currentTortoiseEditor, _minus);
      }
      IFile _editorFile_1 = this.currentTortoiseEditor==null?(IFile)null:this.getEditorFile(this.currentTortoiseEditor);
      IWorkspace _workspace_1 = _editorFile_1==null?(IWorkspace)null:_editorFile_1.getWorkspace();
      if (_workspace_1!=null) _workspace_1.addResourceChangeListener(this);
    }
  }
  
  public void partBroughtToTop(final IWorkbenchPart part) {
  }
  
  public void partClosed(final IWorkbenchPart part) {
  }
  
  public void partDeactivated(final IWorkbenchPart part) {
    boolean _equals = Objects.equal(part, this.currentTortoiseEditor);
    if (_equals) {
      ISourceViewer _internalSourceViewer = this.currentTortoiseEditor==null?(ISourceViewer)null:this.currentTortoiseEditor.getInternalSourceViewer();
      StyledText _textWidget = _internalSourceViewer==null?(StyledText)null:_internalSourceViewer.getTextWidget();
      if (_textWidget!=null) _textWidget.removeCaretListener(this);
      IFile _editorFile = this.currentTortoiseEditor==null?(IFile)null:this.getEditorFile(this.currentTortoiseEditor);
      IWorkspace _workspace = _editorFile==null?(IWorkspace)null:_editorFile.getWorkspace();
      if (_workspace!=null) _workspace.removeResourceChangeListener(this);
      this.currentTortoiseEditor = null;
    }
  }
  
  public void partOpened(final IWorkbenchPart part) {
  }
  
  public void resourceChanged(final IResourceChangeEvent event) {
    try {
      final IFile editorFile = this.currentTortoiseEditor==null?(IFile)null:this.getEditorFile(this.currentTortoiseEditor);
      boolean _notEquals = (!Objects.equal(editorFile, null));
      if (_notEquals) {
        final IPath editorFilePath = editorFile.getFullPath();
        IResourceDelta _delta = event.getDelta();
        final Function1<IResourceDelta,Boolean> _function = new Function1<IResourceDelta,Boolean>() {
            public Boolean apply(final IResourceDelta it) {
              boolean _xifexpression = false;
              boolean _and = false;
              boolean _and_1 = false;
              IResource _resource = it.getResource();
              boolean _equals = Objects.equal(_resource, editorFile);
              if (!_equals) {
                _and_1 = false;
              } else {
                int _kind = it.getKind();
                boolean _equals_1 = (_kind == IResourceDelta.CHANGED);
                _and_1 = (_equals && _equals_1);
              }
              if (!_and_1) {
                _and = false;
              } else {
                int _flags = it.getFlags();
                boolean _equals_2 = (_flags == IResourceDelta.CONTENT);
                _and = (_and_1 && _equals_2);
              }
              if (_and) {
                boolean _xblockexpression = false;
                {
                  int _minus = (-10);
                  TortoisePartListener.this.view.show(TortoisePartListener.this.currentTortoiseEditor, _minus);
                  _xblockexpression = (false);
                }
                _xifexpression = _xblockexpression;
              } else {
                IResource _resource_1 = it.getResource();
                IPath _fullPath = _resource_1.getFullPath();
                boolean _isPrefixOf = _fullPath.isPrefixOf(editorFilePath);
                _xifexpression = _isPrefixOf;
              }
              return _xifexpression;
            }
          };
        _delta.accept(new IResourceDeltaVisitor() {
            public boolean visit(IResourceDelta delta) {
              return _function.apply(delta);
            }
        });
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected IFile getEditorFile(final IEditorPart editor) {
    IFile _xifexpression = null;
    IEditorInput _editorInput = editor==null?(IEditorInput)null:editor.getEditorInput();
    if ((_editorInput instanceof IFileEditorInput)) {
      IEditorInput _editorInput_1 = editor.getEditorInput();
      IFile _file = ((IFileEditorInput) _editorInput_1).getFile();
      _xifexpression = _file;
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public boolean toggleStopMode() {
    boolean _xblockexpression = false;
    {
      ISourceViewer _internalSourceViewer = this.currentTortoiseEditor==null?(ISourceViewer)null:this.currentTortoiseEditor.getInternalSourceViewer();
      StyledText _textWidget = _internalSourceViewer==null?(StyledText)null:_internalSourceViewer.getTextWidget();
      if (_textWidget!=null) _textWidget.removeCaretListener(this);
      boolean _not = (!this.isStopMode);
      this.isStopMode = _not;
      if (this.isStopMode) {
        ISourceViewer _internalSourceViewer_1 = this.currentTortoiseEditor==null?(ISourceViewer)null:this.currentTortoiseEditor.getInternalSourceViewer();
        StyledText _textWidget_1 = _internalSourceViewer_1==null?(StyledText)null:_internalSourceViewer_1.getTextWidget();
        if (_textWidget_1!=null) _textWidget_1.addCaretListener(this);
      }
      _xblockexpression = (this.isStopMode);
    }
    return _xblockexpression;
  }
  
  public void caretMoved(final CaretEvent event) {
    try {
      IXtextDocument _document = this.currentTortoiseEditor.getDocument();
      final int stopAtLine = _document.getLineOfOffset(event.caretOffset);
      this.view.show(this.currentTortoiseEditor, stopAtLine);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
