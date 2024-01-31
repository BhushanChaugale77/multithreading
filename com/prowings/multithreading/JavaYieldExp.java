package com.prowings.multithreading;

public class JavaYieldExp extends Thread {
	
	public void run() {
		
		for(int i=0; i<3; i++)
	
			System.out.println(Thread.currentThread().getName()+" in control");
	}
	

}
