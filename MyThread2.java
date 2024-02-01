package com.prowings.multithreading.interferance;

public class MyThread2 extends Thread {

	Counter counter;

	public MyThread2(Counter counter) {

		super();
		this.counter = counter;
	}

	public void run() {

		System.out.println("MT2 running decrement operation!!!");

		System.out.println(Thread.currentThread().getName());

		counter.decrement();

		System.out.println("after decrement c : " + counter.value());

	}
}
