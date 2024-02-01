package com.prowings.interthreadcommunication;

public class Producer implements Runnable {

	private SharedResource sharedResource;
	
	public Producer (SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}
	
	public void run() {
		for (int i = 1; i<=5; i++) {
			sharedResource.produce(i);
			try {
				Thread.sleep(1000); //Simulate some production time
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
