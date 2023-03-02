package day11_String;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = input.next();




        if (email.contains("_")){

            int underscoreIndex = email.indexOf('_');
            int atSymbolIndex = email.indexOf('@');

            String firstName = email.substring(0, underscoreIndex);
            String lastName = email.substring(underscoreIndex + 1, atSymbolIndex);

            String flippedEmail = lastName + "_" + firstName + email.substring(atSymbolIndex);

            System.out.println(flippedEmail);

        }else {

            System.out.println(email);

        }

    }
}
/*
6. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com

 */