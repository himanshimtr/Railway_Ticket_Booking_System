package com.railway.ticketbooking;

/*
 * Passenger class represents a ticket holder.
 * It stores passenger name, age, and seat number.
 */
public class Passenger {

	// Private variables to achieve encapsulation
	private String name;
	private int age;
	private int seatNumber;

	/*
	 * Parameterized constructor Used to initialize passenger details at the time of
	 * booking
	 */
	public Passenger(String name, int age, int seatNumber) {
		this.name = name;
		this.age = age;
		this.seatNumber = seatNumber;
	}

	// Getter method to return passenger name
	public String getName() {
		return name;
	}

	// Getter method to return passenger age
	public int getAge() {
		return age;
	}

	// Getter method to return seat number
	public int getSeatNumber() {
		return seatNumber;
	}
}
