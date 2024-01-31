package com.prowings.multithreading;

public class MyThreadA implements Runnable {

	@Override
	public void run() {
 
		System.out.println("inside run method");
		
		for(int i=0; i<5; i++)
		{
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
	
	

}
