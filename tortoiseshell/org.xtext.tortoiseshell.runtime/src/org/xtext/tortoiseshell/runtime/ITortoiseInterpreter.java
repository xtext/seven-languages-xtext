package org.xtext.tortoiseshell.runtime;

import org.eclipse.xtext.resource.XtextResource;

public interface ITortoiseInterpreter {

	void execute(Tortoise tortoise, XtextResource resource);
}
