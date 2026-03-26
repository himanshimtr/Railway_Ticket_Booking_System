package com.railway.ticketbooking;

/*
 * Train class manages all seat operations.
 * It contains an array of Passenger objects.
 */
public class Train {

	// Array where each index represents a seat
	// null -> seat is available
	// object -> seat is booked
	private Passenger[] seats;

	/*
	 * Constructor initializes the total number of seats
	 */
	public Train(int totalSeats) {
		seats = new Passenger[totalSeats];
	}

	/*
	 * Displays all available (free) seats
	 */
	public void showAvailableSeats() {
		System.out.println("\nAvailable Seats:");
		boolean available = false;

		// Loop through seats array
		for (int i = 0; i < seats.length; i++) {

			// If seat is null, it is available
			if (seats[i] == null) {
				System.out.print((i + 1) + " ");
				available = true;
			}
		}

		// If no seat is available
		if (!available) {
			System.out.println("No seats available.");
		}
		System.out.println();
	}

	/*
	 * Books a seat for a passenger Throws custom exception for invalid operations
	 */
	public void bookSeat(String name, int age, int seatNumber) throws SeatNotAvailableException {

		// Check for valid seat number
		if (seatNumber < 1 || seatNumber > seats.length) {
			throw new SeatNotAvailableException("Invalid seat number!");
		}

		// Check if seat is already booked
		if (seats[seatNumber - 1] != null) {
			throw new SeatNotAvailableException("Seat already booked!");
		}

		// Create Passenger object and assign to seat
		seats[seatNumber - 1] = new Passenger(name, age, seatNumber);
		System.out.println("Seat booked successfully!");
	}

	/*
	 * Cancels a booked seat
	 */
	public void cancelSeat(int seatNumber) throws SeatNotAvailableException {

		// Validate seat number
		if (seatNumber < 1 || seatNumber > seats.length) {
			throw new SeatNotAvailableException("Invalid seat number!");
		}

		// Check if seat is already empty
		if (seats[seatNumber - 1] == null) {
			throw new SeatNotAvailableException("Seat is already empty!");
		}

		// Cancel seat by setting it to null
		seats[seatNumber - 1] = null;
		System.out.println("Seat cancelled successfully!");
	}

	/*
	 * Displays details of all booked tickets
	 */
	public void displayBookedTickets() {
		System.out.println("\nBooked Tickets:");
		boolean booked = false;

		// Loop through all seats
		for (Passenger p : seats) {

			// If passenger exists, print details
			if (p != null) {
				System.out.println("Name: " + p.getName() + ", Age: " + p.getAge() + ", Seat No: " + p.getSeatNumber());
				booked = true;
			}
		}

		// If no ticket is booked
		if (!booked) {
			System.out.println("No tickets booked.");
		}
	}
}