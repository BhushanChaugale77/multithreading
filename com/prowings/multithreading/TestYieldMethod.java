package com.prowings.multithreading;

public class TestYieldMethod {

	public static void main(String[] args) {
		
		JavaYieldExp t1 = new JavaYieldExp();
		JavaYieldExp t2 = new JavaYieldExp();
		
		t1.setName("AAA");
		t1.setPriority(3);
		t2.setName("BBB");
		t2.setPriority(7);
		//this will call run method
		t1.start();
		t2.start();
		for(int i=0; i<3; i++)
		{
			//control passes to child thread
			t1.yield();
			System.out.println(Thread.currentThread().getName() + " in control");
		}
		
	}
}
