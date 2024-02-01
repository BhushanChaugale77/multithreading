package com.prowings.interthreadcommunication;

public class Consumer implements Runnable {

	private SharedResource sharedResource;
	
	public Consumer (SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}

	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			int consumedItem = sharedResource.consume();
			//Process the consumed item if needed
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

	
	
	
}
