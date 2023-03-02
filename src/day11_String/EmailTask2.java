package day11_String;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = input.next();

        int underScoreIndex = email.indexOf('_');
        int atSymbolIndex = email.indexOf("@");
        int beginningDomain = email.indexOf("@") + 1;
        int endingDomain = email.indexOf('.');

        // searches for first name ending at index of "_"
        String firstName = email.substring(0, underScoreIndex);

        // capitalizes first letter of first name and lowercase's everything else
        firstName = email.substring(0, 1).toUpperCase() + email.substring(1, underScoreIndex).toLowerCase();

        // searches for last name starting at "_" and ending at "@"
        String lastName = email.substring(underScoreIndex + 1, atSymbolIndex);

        // capitalizes first letter of last name and lowercase's everything else
        lastName = email.substring( underScoreIndex + 1, atSymbolIndex).toUpperCase() + email.substring(underScoreIndex + 2, atSymbolIndex).toLowerCase();

        String domain = email.substring(beginningDomain, endingDomain);

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: "+ domain);

    }
}
/*
7. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */