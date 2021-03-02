package com.test.question1;

public class Singleton implements Cloneable{
	private static volatile Singleton singleton;
	
    private  Singleton(){}
	
	
	public static Singleton getSingleton(){
		if (singleton == null)
        {
        
            synchronized (Singleton.class)
            {
              //create only one instance of class
                if (singleton==null)
                	singleton = new Singleton();
            }
        }
        return singleton;
    }
	
	 @Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

}