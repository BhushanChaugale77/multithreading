package com.prowings.multithreading;

public class TestJoinMethod {

	public static void main(String[] args) {

		MyThreadB mt1 = new MyThreadB();
		MyThreadB mt2 = new MyThreadB();
		MyThreadB mt3 = new MyThreadB();

		Thread t1 = new Thread(mt1, "Thread-1");
		Thread t2 = new Thread(mt2, "Thread-2");
		Thread t3 = new Thread(mt3, "Thread-3");

		t1.setPriority(3);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.setPriority(9);
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t3.setPriority(4);
		t3.start();

	}
}
