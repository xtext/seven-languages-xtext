package org.xtext.cradle.lib.impl;

public class TaskSkippedException extends RuntimeException {

	private static ThreadLocal<Boolean> maySkip = new ThreadLocal<Boolean>();

	private static final long serialVersionUID = -5621894530120687442L;

	public static void setMaySkipTasks(boolean value) {
		maySkip.set(value);
	}

	public static void skipTask(String message) {
		Boolean may = maySkip.get();
		if (may == null || may) {
			maySkip.set(false);
			throw new TaskSkippedException(message);
		}
	}

	protected TaskSkippedException() {
	}

	protected TaskSkippedException(String message) {
		super(message);
	}

}
