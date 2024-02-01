package com.prowings.interthreadcommunication;

public class SharedResource {
	 
	private int item;
	private boolean newItem = false;
	
	synchronized void produce(int newItem) {
		
		while(this.newItem) {
			try {
				wait(); //Release the lock and wait
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.item = newItem;
		System.out.println("Prouduced: " +newItem);
		this.newItem = true;
		notify(); // Notify the waiting consumer
	}
	
	synchronized int consume() {
		while (!this.newItem) {
			try {
				wait(); //Release the lock and wait
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		int consumedItem = this.item;
		System.out.println("Consumed: "+ consumedItem);
		this.newItem = false;
		notify(); //Notify the waiting producer
		return consumedItem;
	}
	

}
