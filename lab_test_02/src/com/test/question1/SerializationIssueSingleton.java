package com.test.question1;

import java.io.Serializable;

public class SerializationIssueSingleton implements Serializable {
	
	private static final long serialVersionUID = -4499655810179123644L;

	private SerializationIssueSingleton() {
	}

	private static class Singleton {
		private static final SerializationIssueSingleton singleton = new SerializationIssueSingleton();
	}

	public static SerializationIssueSingleton getSingleton() {
		return Singleton.singleton;
	}

	protected Object readResolve() {
		return getSingleton();
	}

}