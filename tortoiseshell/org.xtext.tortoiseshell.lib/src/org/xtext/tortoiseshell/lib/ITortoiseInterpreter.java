package org.xtext.tortoiseshell.lib;

import org.eclipse.emf.ecore.EObject;

public interface ITortoiseInterpreter {

	void run(Tortoise tortoise, EObject program, int stopAtLine);
}
