package com.prowings.multithreading;

public class TestSleepMethod {
	
	public static void main(String[] args) {
		
		MyThreadA mt = new MyThreadA();
		
		Thread t1 = new Thread(mt,"T1-thread");
		Thread t2 = new Thread(mt,"T2-thread");
		
		t1.start();
		t2.start();
		
	}

}
