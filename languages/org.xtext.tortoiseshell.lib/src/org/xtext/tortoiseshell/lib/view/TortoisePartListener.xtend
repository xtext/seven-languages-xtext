/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.tortoiseshell.lib.view

import com.google.inject.Inject
import org.eclipse.core.resources.IResourceChangeEvent
import org.eclipse.core.resources.IResourceChangeListener
import org.eclipse.core.resources.IResourceDelta
import org.eclipse.swt.custom.CaretEvent
import org.eclipse.swt.custom.CaretListener
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IFileEditorInput
import org.eclipse.ui.IPartListener
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.xtext.ui.editor.XtextEditor

class TortoisePartListener implements IPartListener, IResourceChangeListener, CaretListener {
	
	XtextEditor currentTortoiseEditor
	
	@Inject TortoiseView view
	
	boolean isStopMode
	
	def isTortoiseEditor(IWorkbenchPart part) {
		part instanceof XtextEditor && part.site.id == 'org.xtext.tortoiseshell.TortoiseShell'
	}

	override partActivated(IWorkbenchPart part) {
		if (part.tortoiseEditor) {
			currentTortoiseEditor?.editorFile?.workspace?.removeResourceChangeListener(this)
			currentTortoiseEditor?.internalSourceViewer?.textWidget?.removeCaretListener(this)
			currentTortoiseEditor = part as XtextEditor
			if (isStopMode)
				currentTortoiseEditor?.internalSourceViewer?.textWidget?.addCaretListener(this)
			else
				view.show(currentTortoiseEditor, -10)
			currentTortoiseEditor?.editorFile?.workspace?.addResourceChangeListener(this)
		}
	}
	
	override partBroughtToTop(IWorkbenchPart part) {
	}
	
	override partClosed(IWorkbenchPart part) {
	}
	
	override partDeactivated(IWorkbenchPart part) {
		if (part == currentTortoiseEditor) {
			currentTortoiseEditor?.internalSourceViewer?.textWidget?.removeCaretListener(this)
			currentTortoiseEditor?.editorFile?.workspace?.removeResourceChangeListener(this)
			currentTortoiseEditor = null
		}
	}
	
	override partOpened(IWorkbenchPart part) {
	}

	override resourceChanged(IResourceChangeEvent event) {
		val editorFile = currentTortoiseEditor?.editorFile
		if (editorFile !== null) {
			val editorFilePath = editorFile.fullPath 
			event.delta.accept [
				if (resource == editorFile && kind==IResourceDelta.CHANGED && flags==IResourceDelta.CONTENT) {
					view.show(currentTortoiseEditor, -10)
					false			
				} else {
				    resource.fullPath.isPrefixOf(editorFilePath)
				}
			]
		}
	}	
	
	def protected getEditorFile(IEditorPart editor) {
		if (editor?.editorInput instanceof IFileEditorInput)
			((editor.editorInput) as IFileEditorInput).file
		else 
			null
	}


	def boolean toggleStopMode() {
		currentTortoiseEditor?.internalSourceViewer?.textWidget?.removeCaretListener(this)
		isStopMode = !isStopMode 
		if (isStopMode) 
			currentTortoiseEditor?.internalSourceViewer?.textWidget?.addCaretListener(this)
		isStopMode
	}
	
	override caretMoved(CaretEvent event) {
		val stopAtLine = currentTortoiseEditor.document.getLineOfOffset(event.caretOffset)
		view.show(currentTortoiseEditor, stopAtLine)
	}
	
}