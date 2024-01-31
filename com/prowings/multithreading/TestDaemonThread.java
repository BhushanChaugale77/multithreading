package com.prowings.multithreading;

public class TestDaemonThread {
	
	
	public static void main(String[] args) {
		

		MyThreadC t1 = new MyThreadC();
		MyThreadC t2 = new MyThreadC();
		MyThreadC t3 = new MyThreadC();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

	
	
}
