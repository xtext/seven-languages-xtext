package org.xtext.tortoiseshell.interpreter;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class NullGenerator implements IGenerator {
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
  }
}
