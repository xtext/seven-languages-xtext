package org.xtext.tortoiseshell.runtime;

public interface ITortoiseEvent {

	Tortoise getTortoise();
	
	interface Listener {
		void handleTortoiseEvent(ITortoiseEvent event);
	}
}
