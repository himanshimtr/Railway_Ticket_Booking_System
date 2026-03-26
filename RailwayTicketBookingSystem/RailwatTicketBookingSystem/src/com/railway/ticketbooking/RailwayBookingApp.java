package com.railway.ticketbooking;

import java.util.Scanner;

/*
 * Main class of the application
 * Handles user interaction and menu-driven flow
 */
public class RailwayBookingApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Create Train object with 10 seats
		Train train = new Train(10);

		int choice;

		// Menu-driven loop
		do {
			System.out.println("\n====== Railway Ticket Booking System ======");
			System.out.println("1. Show Available Seats");
			System.out.println("2. Book Seat");
			System.out.println("3. Cancel Seat");
			System.out.println("4. Display Booked Tickets");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			try {
				switch (choice) {

				case 1:
					train.showAvailableSeats();
					break;

				case 2:
					System.out.print("Enter Name: ");
					sc.nextLine(); // consume newline
					String name = sc.nextLine();

					System.out.print("Enter Age: ");
					int age = sc.nextInt();

					System.out.print("Enter Seat Number: ");
					int seatNo = sc.nextInt();

					train.bookSeat(name, age, seatNo);
					break;

				case 3:
					System.out.print("Enter Seat Number to Cancel: ");
					int cancelSeat = sc.nextInt();

					train.cancelSeat(cancelSeat);
					break;

				case 4:
					train.displayBookedTickets();
					break;

				case 5:
					System.out.println("Thank you for using the system!");
					break;

				default:
					System.out.println("Invalid choice!");
				}

			} catch (SeatNotAvailableException e) {
				// Handle custom exception
				System.out.println("Error: " + e.getMessage());
			}

		} while (choice != 5);

		sc.close();
	}
}
