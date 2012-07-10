package org.xtext.tortoiseshell.lib;

import org.xtext.tortoiseshell.lib.Tortoise;

public interface ITortoiseEvent {

	Tortoise getTortoise();
	
	interface Listener {
		void handleTortoiseEvent(ITortoiseEvent event);
	}
}
