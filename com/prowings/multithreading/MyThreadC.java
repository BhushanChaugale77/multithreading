package com.prowings.multithreading;

public class MyThreadC extends Thread {

	@Override
	public void run() {
 
		if (Thread.currentThread().isDaemon())
		{
			//checking for Demon Thread
			System.out.println("daemon thread work : "+Thread.currentThread().getName());
			
		}
		else
		{
			System.out.println("user thread work : "+Thread.currentThread().getName());
			
		}
	
	}
	
}
