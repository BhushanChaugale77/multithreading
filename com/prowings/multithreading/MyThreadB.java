package com.prowings.multithreading;

public class MyThreadB implements Runnable{

	@Override
	public void run() {
 
		for(int j=0; j<2; j++) {
			try {
				   //sleeping the thread 300 milli seconds
					Thread.sleep(3000);
					System.out.println("The current thread name is: "+ Thread.currentThread().getName());
					System.out.println("The current thread name is: "+ Thread.currentThread().getPriority());

			}
			 //catch block for catching the raised exception
			catch(Exception e) {
				System.out.println("The exception has been caught: "+e);
			}
			System.out.println(j);
			
		}
			
		
	}

}
