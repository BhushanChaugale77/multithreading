package com.prowings.interthreadcommunication;

public class TestInterThreadCommunication {

	public static void main(String[] args) {

		SharedResource sharedResource = new SharedResource();
		
		Thread producerThread = new Thread(new Producer(sharedResource));
		Thread consumerThread = new Thread(new Consumer(sharedResource));
		
		producerThread.start();
		consumerThread.start();
		
		
		
		
	}
}
