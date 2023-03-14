package day15_WhileLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean reservationDone = false;
        String roomType = "";

        while (!reservationDone) {
            System.out.println("Do you want to reserve a room? (yes/no): ");
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("yes")) {
                boolean roomSelected = false;
                int price = 0;

                while (!roomSelected) {
                    System.out.print("Which type of room do you want to reserve? (King/Queen/Single): ");
                    roomType = scanner.nextLine().toLowerCase();

                    switch (roomType) {
                        case "king":
                            price = 120;
                            roomSelected = true;
                            break;
                        case "queen":
                            price = 100;
                            roomSelected = true;
                            break;
                        case "single":
                            price = 80;
                            roomSelected = true;
                            break;
                        default:
                            System.out.println("Invalid room type selected.");
                    }
                }

                System.out.println("You have reserved a " + roomType + " bed room for " + price + "$ per night.");
                reservationDone = true;

            } else if (answer.equals("no")) {
                System.out.println("Have a nice day!");
                reservationDone = true;

            } else {
                System.err.println("Invalid input. Please enter yes or no.");
            }
        }

        scanner.close();
    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */