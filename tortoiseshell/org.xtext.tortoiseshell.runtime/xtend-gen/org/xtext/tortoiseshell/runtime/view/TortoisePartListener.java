package org.xtext.tortoiseshell.runtime.view;

import com.google.common.base.Objects;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.xtext.tortoiseshell.runtime.view.TortoiseView;

@SuppressWarnings("all")
public class TortoisePartListener implements IPartListener, ISelectionChangedListener {
  private XtextEditor currentTortoiseEditor;
  
  private TortoiseView view;
  
  public TortoisePartListener(final TortoiseView view) {
    this.view = view;
  }
  
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
      boolean _notEquals = (!Objects.equal(this.currentTortoiseEditor, null));
      if (_notEquals) {
        IEditorSite _editorSite = this.currentTortoiseEditor.getEditorSite();
        ISelectionProvider _selectionProvider = _editorSite.getSelectionProvider();
        _selectionProvider.removeSelectionChangedListener(this);
      }
      IWorkbenchPartSite _site = part.getSite();
      ISelectionProvider _selectionProvider_1 = _site.getSelectionProvider();
      _selectionProvider_1.addSelectionChangedListener(this);
      this.currentTortoiseEditor = ((XtextEditor) part);
    }
  }
  
  public void partBroughtToTop(final IWorkbenchPart part) {
  }
  
  public void partClosed(final IWorkbenchPart part) {
  }
  
  public void partDeactivated(final IWorkbenchPart part) {
    boolean _equals = Objects.equal(part, this.currentTortoiseEditor);
    if (_equals) {
      IEditorSite _editorSite = this.currentTortoiseEditor.getEditorSite();
      ISelectionProvider _selectionProvider = _editorSite.getSelectionProvider();
      _selectionProvider.removeSelectionChangedListener(this);
      this.currentTortoiseEditor = null;
    }
  }
  
  public void partOpened(final IWorkbenchPart part) {
  }
  
  public void selectionChanged(final SelectionChangedEvent event) {
    this.view.show(this.currentTortoiseEditor);
  }
}
