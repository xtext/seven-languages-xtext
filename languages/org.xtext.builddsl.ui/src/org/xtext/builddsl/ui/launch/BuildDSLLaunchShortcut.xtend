/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.ui.launch

import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.ui.DebugUITools
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.debug.ui.RefreshTab
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.text.ITextSelection
import org.eclipse.jface.viewers.ISelection
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IFileEditorInput
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.ui.editor.XbaseEditor
import org.xtext.builddsl.build.Task

import static org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants.*
import static org.eclipse.jface.dialogs.MessageDialog.*

import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*
import org.eclipse.xtend.lib.annotations.Data

class BuildDSLLaunchShortcut implements ILaunchShortcut {

	public static val String BUNDLE_ID = "org.xtext.builddsl.ui"

	override launch(ISelection selection, String mode) {
		MessageDialog.openError(null, "Unsupported Launch Selection.", 
			"Please open the file inside an editor to launch a task."
		)
	}
	
	def findTask(XtextResource res, int offset) {
		if (offset < 0)
			return null
		val start = res.parseResult.rootNode.findLeafNodeAtOffset(offset)
		if (start.hidden) {
			val list = res.parseResult.rootNode.leafNodes.toList
			val index = list.indexOf(start)
			val first = (index..0).findFirst[!list.get(it).hidden]
			val last = (index..(list.size-1)).findFirst[!list.get(it).hidden]
			val task1 = list.get(first).semanticElement.getContainerOfType(Task)
			val task2 = list.get(last).semanticElement.getContainerOfType(Task)
			if(task1 == task2) 
				return task1.name
		} else 
			return start.semanticElement.getContainerOfType(Task).name
		return null
	}

	override launch(IEditorPart editor, String mode) {
		if (editor instanceof XbaseEditor) {
			val offset = switch it:editor.selectionProvider.selection { 
				ITextSelection: it.offset 
				default: -1
			}
			if (editor.editorInput instanceof IFileEditorInput) {
				val project = (editor.editorInput as IFileEditorInput).file.project.name
				val info = editor.document.readOnly [
					val file = contents.filter(JvmDeclaredType).head
					new LaunchConfigurationInfo(project, file?.identifier, findTask(offset))
				]
				launch(mode, info)
				return
			}
		} 
		openError(null, "Wrong editor kind.", "")
	}

	def launch(String mode, LaunchConfigurationInfo info) {
		if (info.task.nullOrEmpty)          
			openError(null, "Launch Error", "Could not determine the task that should be executed.")
		else if (info.clazz.nullOrEmpty)    
			openError(null, "Launch Error", "Could not determine the class that should be executed.")
		else if (info.project.nullOrEmpty)  
			openError(null, "Launch Error", "Could not determine the project that should be executed.")
		else try {
			val configs = DebugPlugin.getDefault.launchManager.launchConfigurations
			val config = configs.findFirst[info.configEquals(it)] ?: info.createConfiguration 
			DebugUITools.launch(config, mode)
		} catch (CoreException e) {
			openError(null, "Problem running workflow.", e.message)
		}
	}
}

@Data class LaunchConfigurationInfo {
	String project
	String clazz
	String task
	
	def getName() {
		Strings.lastToken(clazz, ".")
	}
	
	def createConfiguration()  {
		val launchManager = DebugPlugin.getDefault.launchManager
		val configType = launchManager.getLaunchConfigurationType("org.xtext.builddsl.ui.BuildLaunchConfigurationType")
		val wc = configType.newInstance(null, launchManager.generateUniqueLaunchConfigurationNameFrom(name))
		wc.setAttribute(ATTR_PROJECT_NAME, project)
		wc.setAttribute(ATTR_MAIN_TYPE_NAME, clazz)
		wc.setAttribute(ATTR_STOP_IN_MAIN, false)
		wc.setAttribute(ATTR_PROGRAM_ARGUMENTS, task)
		wc.setAttribute(RefreshTab.ATTR_REFRESH_SCOPE, "${workspace}")
		wc.setAttribute(RefreshTab.ATTR_REFRESH_RECURSIVE, true)
		wc.doSave
	}

	def configEquals(ILaunchConfiguration a) {
		a.getAttribute(ATTR_MAIN_TYPE_NAME, "X") == clazz && 
		a.getAttribute(ATTR_MAIN_TYPE_NAME, "X") == project &&
		a.getAttribute(ATTR_PROGRAM_ARGUMENTS, "X").contains(task) && 
		a.type.identifier == "org.xtext.builddsl.ui.BuildLaunchConfigurationType"
	}
	
	def isValid() {
		!clazz.nullOrEmpty && !project.nullOrEmpty && !task.nullOrEmpty
	}
}