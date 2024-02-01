package com.prowings.bookmyseatapp.staticsync;

public class MyThreadOne extends Thread {
	
	Theater theater;
	int seat;
	
	public MyThreadOne(Theater theater, int seat) {
		super();
		this.theater = theater;
		this.seat = seat;
	}
	
	public void run() {
		theater.bookSeats(seat);
	}
}
