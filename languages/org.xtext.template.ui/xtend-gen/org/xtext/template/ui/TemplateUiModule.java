/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.template.ui;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;
import org.xtext.template.ui.highlighting.TemplateHighlightingCalculator;
import org.xtext.template.ui.highlighting.TemplateHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 */
@SuppressWarnings("all")
public class TemplateUiModule extends AbstractTemplateUiModule {
  public TemplateUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends ISemanticHighlightingCalculator> bindIdeSemanticHighlightingCalculator() {
    return TemplateHighlightingCalculator.class;
  }
  
  @Override
  public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
    return TemplateHighlightingConfiguration.class;
  }
  
  @Override
  public Class<? extends IContentOutlinePage> bindIContentOutlinePage() {
    return null;
  }
  
  @Override
  public Class<? extends ILabelProvider> bindILabelProvider() {
    return XbaseLabelProvider.class;
  }
}
