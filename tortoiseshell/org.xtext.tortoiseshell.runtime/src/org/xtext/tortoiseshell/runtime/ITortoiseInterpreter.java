package org.xtext.tortoiseshell.runtime;

import org.eclipse.emf.ecore.EObject;


public interface ITortoiseInterpreter {

	void run(Tortoise tortoise, EObject program, int stopAtLine);
}
