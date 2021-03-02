package com.test.question1;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton threadSafeSingleton;

	private ThreadSafeSingleton() {}

	public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
		if (threadSafeSingleton == null) {
			threadSafeSingleton = new ThreadSafeSingleton();
		}
		return threadSafeSingleton;
	}

}