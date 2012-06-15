package org.xtext.tortoiseshell.runtime.view

import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.ui.IPartListener
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.xtext.ui.editor.XtextEditor

class TortoisePartListener implements IPartListener, ISelectionChangedListener {
	
	XtextEditor currentTortoiseEditor
	
	TortoiseView view
	
	new(TortoiseView view) {
		this.view = view	
	}
	
	def isTortoiseEditor(IWorkbenchPart part) {
		part instanceof XtextEditor && part.site.id == 'org.xtext.tortoiseshell.TortoiseShell'
	}

	override partActivated(IWorkbenchPart part) {
		if(part.tortoiseEditor) {
			if(currentTortoiseEditor != null) 
				currentTortoiseEditor.editorSite.selectionProvider.removeSelectionChangedListener(this)
			part.site.selectionProvider.addSelectionChangedListener(this)
			currentTortoiseEditor = part as XtextEditor
		}
	}
	
	override partBroughtToTop(IWorkbenchPart part) {
	}
	
	override partClosed(IWorkbenchPart part) {
	}
	
	override partDeactivated(IWorkbenchPart part) {
		if(part == currentTortoiseEditor) {
			currentTortoiseEditor.editorSite.selectionProvider.removeSelectionChangedListener(this)
			currentTortoiseEditor = null
		}
	}
	
	override partOpened(IWorkbenchPart part) {
	}

	override selectionChanged(SelectionChangedEvent event) {
		view.show(currentTortoiseEditor)
	}
	
}