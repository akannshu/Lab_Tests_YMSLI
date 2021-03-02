package com.test.question2;

import java.util.List;

public class MyThread implements Runnable{
	
	private int num;
	
	
	
	public int getNum() {
		return num;
	}

	@Override
	public void run() {
		num = (int) (Math.random()*10);
	}
	
	
	public static void main(String[] args) {
		
		MyThread ob1 = new MyThread();
		MyThread ob2 = new MyThread();
		MyThread ob3 = new MyThread();
		MyThread ob4 = new MyThread();
		MyThread ob5 = new MyThread();
		
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		Thread t3 = new Thread(ob3);
		Thread t4 = new Thread(ob4);
		Thread t5 = new Thread(ob5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("ob1: "+ob1.getNum());
		System.out.println("ob2: "+ob2.getNum());
		System.out.println("ob3: "+ob3.getNum());
		System.out.println("ob4: "+ob4.getNum());
		System.out.println("ob5: "+ob5.getNum());
		
		int sum = ob1.getNum() + ob2.getNum() + ob3.getNum() + ob4.getNum() + ob5.getNum();
		
		System.out.println("--------------Sum of the Numbers----------");
		System.out.println("Sum=: "+sum);
		
		
	}

}
