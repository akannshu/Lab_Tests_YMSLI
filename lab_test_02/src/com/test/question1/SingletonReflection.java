package com.test.question1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflection {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		EagerInitialization single1 = EagerInitialization.getEagerInitialization();
		EagerInitialization signle2 = null;

		@SuppressWarnings("rawtypes")
		Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
		constructors[0].setAccessible(true);

		signle2 = (EagerInitialization) constructors[0].newInstance();
		System.out.println(single1.hashCode());
		System.out.println(signle2.hashCode());
	}

}