package com.test.question1;

public class eagerTest {
	public static void main(String[] args) {
		EagerInitialization ins = EagerInitialization.getEagerInitialization();
		EagerInitialization ins2 = EagerInitialization.getEagerInitialization();
		
		
		if(ins.hashCode() == ins2.hashCode()) {
			System.out.println("Success");
		}
	}
}
