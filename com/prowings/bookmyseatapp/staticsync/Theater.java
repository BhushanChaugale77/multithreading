package com.prowings.bookmyseatapp.staticsync;

public class Theater {

	static int totalSeats = 10;

	public static synchronized void bookSeats(int seats) {

		System.out.println("hii : " + Thread.currentThread().getName());
		System.out.println("hii : " + Thread.currentThread().getName());
		System.out.println("hii : " + Thread.currentThread().getName());

		// synchronized (this)
		// {
		if (seats <= totalSeats) {
			System.out.println(seats + "Seats booked successfully by :" + Thread.currentThread().getName());
			totalSeats = totalSeats - seats;
			System.out.println("Remaining seats after booking : " + totalSeats);
		} else {
			System.out.println("Can not book :" + seats + "seats ..Avaible seats are : " + totalSeats);
		}

		// }
		System.out.println("hello : " + Thread.currentThread().getName());
		System.out.println("hello: " + Thread.currentThread().getName());
		System.out.println("hello : " + Thread.currentThread().getName());

	}

}
