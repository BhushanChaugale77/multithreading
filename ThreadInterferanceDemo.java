package com.prowings.multithreading.interferance;

public class ThreadInterferanceDemo {
	
	public static void main(String[] args) {
		
		Counter obj = new Counter();
		
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		
		t1.start();
		t2.start();
		
	}

}
