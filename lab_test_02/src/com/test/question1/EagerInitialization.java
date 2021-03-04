package com.test.question1;

public class EagerInitialization {

	private static final EagerInitialization eagerInit = new EagerInitialization();

	private EagerInitialization(){
    	if( eagerInit != null ) {
            throw new InstantiationError( "Creating of this object is not allowed." );
        }
    }

	public static EagerInitialization getEagerInitialization() {
		return eagerInit;		
	}
}
