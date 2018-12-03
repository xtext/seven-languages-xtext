/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.ui.launch;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.ui.editor.XbaseEditor;
import org.xtext.builddsl.build.Task;
import org.xtext.builddsl.ui.launch.LaunchConfigurationInfo;

@SuppressWarnings("all")
public class BuildDSLLaunchShortcut implements ILaunchShortcut {
  public static final String BUNDLE_ID = "org.xtext.builddsl.ui";
  
  @Override
  public void launch(final ISelection selection, final String mode) {
    MessageDialog.openError(null, "Unsupported Launch Selection.", 
      "Please open the file inside an editor to launch a task.");
  }
  
  public String findTask(final XtextResource res, final int offset) {
    if ((offset < 0)) {
      return null;
    }
    final ILeafNode start = NodeModelUtils.findLeafNodeAtOffset(res.getParseResult().getRootNode(), offset);
    boolean _isHidden = start.isHidden();
    if (_isHidden) {
      final List<ILeafNode> list = IterableExtensions.<ILeafNode>toList(res.getParseResult().getRootNode().getLeafNodes());
      final int index = list.indexOf(start);
      final Function1<Integer, Boolean> _function = (Integer it) -> {
        boolean _isHidden_1 = list.get((it).intValue()).isHidden();
        return Boolean.valueOf((!_isHidden_1));
      };
      final Integer first = IterableExtensions.<Integer>findFirst(new IntegerRange(index, 0), _function);
      int _size = list.size();
      int _minus = (_size - 1);
      final Function1<Integer, Boolean> _function_1 = (Integer it) -> {
        boolean _isHidden_1 = list.get((it).intValue()).isHidden();
        return Boolean.valueOf((!_isHidden_1));
      };
      final Integer last = IterableExtensions.<Integer>findFirst(new IntegerRange(index, _minus), _function_1);
      final Task task1 = EcoreUtil2.<Task>getContainerOfType(list.get((first).intValue()).getSemanticElement(), Task.class);
      final Task task2 = EcoreUtil2.<Task>getContainerOfType(list.get((last).intValue()).getSemanticElement(), Task.class);
      boolean _equals = Objects.equal(task1, task2);
      if (_equals) {
        return task1.getName();
      }
    } else {
      return EcoreUtil2.<Task>getContainerOfType(start.getSemanticElement(), Task.class).getName();
    }
    return null;
  }
  
  @Override
  public void launch(final IEditorPart editor, final String mode) {
    if ((editor instanceof XbaseEditor)) {
      int _switchResult = (int) 0;
      ISelection _selection = ((XbaseEditor)editor).getSelectionProvider().getSelection();
      final ISelection it = _selection;
      boolean _matched = false;
      if (it instanceof ITextSelection) {
        _matched=true;
        _switchResult = ((ITextSelection)it).getOffset();
      }
      if (!_matched) {
        _switchResult = (-1);
      }
      final int offset = _switchResult;
      IEditorInput _editorInput = ((XbaseEditor)editor).getEditorInput();
      if ((_editorInput instanceof IFileEditorInput)) {
        IEditorInput _editorInput_1 = ((XbaseEditor)editor).getEditorInput();
        final String project = ((IFileEditorInput) _editorInput_1).getFile().getProject().getName();
        final IUnitOfWork<LaunchConfigurationInfo, XtextResource> _function = (XtextResource it_1) -> {
          LaunchConfigurationInfo _xblockexpression = null;
          {
            final JvmDeclaredType file = IterableExtensions.<JvmDeclaredType>head(Iterables.<JvmDeclaredType>filter(it_1.getContents(), JvmDeclaredType.class));
            String _identifier = null;
            if (file!=null) {
              _identifier=file.getIdentifier();
            }
            String _findTask = this.findTask(it_1, offset);
            _xblockexpression = new LaunchConfigurationInfo(project, _identifier, _findTask);
          }
          return _xblockexpression;
        };
        final LaunchConfigurationInfo info = ((XbaseEditor)editor).getDocument().<LaunchConfigurationInfo>readOnly(_function);
        this.launch(mode, info);
        return;
      }
    }
    MessageDialog.openError(null, "Wrong editor kind.", "");
  }
  
  public void launch(final String mode, final LaunchConfigurationInfo info) {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(info.getTask());
    if (_isNullOrEmpty) {
      MessageDialog.openError(null, "Launch Error", "Could not determine the task that should be executed.");
    } else {
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(info.getClazz());
      if (_isNullOrEmpty_1) {
        MessageDialog.openError(null, "Launch Error", "Could not determine the class that should be executed.");
      } else {
        boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(info.getProject());
        if (_isNullOrEmpty_2) {
          MessageDialog.openError(null, "Launch Error", "Could not determine the project that should be executed.");
        } else {
          try {
            final ILaunchConfiguration[] configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations();
            ILaunchConfiguration _elvis = null;
            final Function1<ILaunchConfiguration, Boolean> _function = (ILaunchConfiguration it) -> {
              return Boolean.valueOf(info.configEquals(it));
            };
            ILaunchConfiguration _findFirst = IterableExtensions.<ILaunchConfiguration>findFirst(((Iterable<ILaunchConfiguration>)Conversions.doWrapArray(configs)), _function);
            if (_findFirst != null) {
              _elvis = _findFirst;
            } else {
              ILaunchConfiguration _createConfiguration = info.createConfiguration();
              _elvis = _createConfiguration;
            }
            final ILaunchConfiguration config = _elvis;
            DebugUITools.launch(config, mode);
          } catch (final Throwable _t) {
            if (_t instanceof CoreException) {
              final CoreException e = (CoreException)_t;
              MessageDialog.openError(null, "Problem running workflow.", e.getMessage());
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
    }
  }
}
