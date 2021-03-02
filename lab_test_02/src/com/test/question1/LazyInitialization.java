package com.test.question1;
public class LazyInitialization {
	
private static LazyInitialization lazyInitialization;
    
    private LazyInitialization(){}
    
    //Lazy Initialization of the instance
    public static LazyInitialization getLazyInitialization(){
        if(lazyInitialization == null){
        	lazyInitialization = new LazyInitialization();
        }
        return lazyInitialization;
    }
	
	

}