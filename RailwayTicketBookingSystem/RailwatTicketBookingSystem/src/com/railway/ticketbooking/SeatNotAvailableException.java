package com.railway.ticketbooking;

/*
 * Custom exception class
 * This exception is thrown when:
 * 1. Seat number is invalid
 * 2. Seat is already booked
 * 3. Trying to cancel an empty seat
 */
public class SeatNotAvailableException extends Exception {

	/*
	 * Constructor of custom exception Accepts error message and passes it to
	 * Exception class
	 */
	public SeatNotAvailableException(String message) {
		super(message);
	}
}
