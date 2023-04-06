package com.multithreading;

public class JavaClasssLock implements Runnable{

	static synchronized void m1()
	{
		System.out.println("m1() method running on thread : "+Thread.currentThread().getName());
	}
	
	static synchronized void m2()
	{
		System.out.println("m2() method running on thread : "+Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaClasssLock classsLock = new JavaClasssLock();
		Thread thread = new Thread(classsLock);
		Thread thread2 = new Thread(classsLock);
		
		thread.start();
		thread2.start();
	}

}
