package com.prowings.multithreading;

public class TestJoinMethod2 {

	public static void main(String[] args) {

		ThreadJoinExample th1 = new ThreadJoinExample();
		ThreadJoinExample th2 = new ThreadJoinExample();
		ThreadJoinExample th3 = new ThreadJoinExample();
		
		th1.start();
		
		try {
				System.out.println("The current thread name is: "+Thread.currentThread().getName());
				th1.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		
		try {
				System.out.println("The current thread name is: "+Thread.currentThread().getName());
				th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		 th3.start();

	}
	
}
