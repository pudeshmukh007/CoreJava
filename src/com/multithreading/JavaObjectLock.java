package com.multithreading;

class Thread1 extends Thread
{
	JavaObjectLock lock = null;
	Thread1(JavaObjectLock lock)
	{
		this.lock = lock;
	}
	
	@Override
	public void run() {
		
		lock.m1();
		lock.m2();
	}
}

class Thread2 extends Thread
{
	JavaObjectLock lock = null;
	Thread2(JavaObjectLock lock)
	{
		this.lock = lock;
	}
	
	@Override
	public void run() {
		
		lock.m1();
		lock.m2();
	}
}

public class JavaObjectLock{

	public synchronized void m1()
	{
		System.out.println("in method m1() thread name is: "+Thread.currentThread().getName());
	}
	
	public synchronized void m2()
	{
		System.out.println("in method m2() thread name is: "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaObjectLock objectLock = new JavaObjectLock();
		
	  Thread1 thread1 = new Thread1(objectLock); 
	  Thread2 thread2 = new Thread2(objectLock);
	  
	  thread1.start(); 
	  thread2.start();
		 
	
		
	}

}
