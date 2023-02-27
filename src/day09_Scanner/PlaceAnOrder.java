package day09_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a product name:");
        String product = input.nextLine();


        System.out.println("Please enter the price of the product:");
        double price = input.nextDouble();


        System.out.println("Please enter the quantity of said product:");
        int quantity = input.nextInt();
        input.nextLine();


        System.out.println("Please enter your first name:");
        String firstName = input.nextLine();

        System.out.println(firstName + ", you order for "+quantity +" "+ product+ " has been placed. Your total is "+ price+ ".");
        input.close();
    }
}
/*
7. Create a class named PlaceAnOrder:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */