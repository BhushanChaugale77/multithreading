package com.prowings.multithreading.interferance;

public class MyThread1 extends Thread {

	
	Counter counter;
	
	public MyThread1(Counter counter) {
		
		super();
		this.counter = counter;
	}
	
 	public void run() {
 		
 		System.out.println("MT1 running increment operation!!!");
 		
 		System.out.println(Thread.currentThread().getName());
 		
 		counter.increment();
 		
 		System.out.println("after increment c : "+ counter.value());
 		
 	}
}

