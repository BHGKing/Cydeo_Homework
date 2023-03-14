package day15_WhileLoop;

import java.util.Scanner;

public class LoginCydeo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = input.next();

        System.out.println("Enter your password:");
        String password = input.next();

        String mainUser = "Cydeo";
        String mainPass = "Cydeo123";

        if (username.equals(mainUser) && password.equals(mainPass)){

            System.out.println("Logged in.");


        } else {

            for (int i = 3; i > 0; i--) {

                System.err.println("Wrong username or password");
                System.err.println("You have " +i+ " more attempt(s) before you are locked out!");

                System.out.println("Enter your username:");
                username = input.next();

                System.out.println("Enter your password:");
                password = input.next();

                if (username.equals(mainUser) && password.equals(mainPass)){

                    System.out.println("Logged in.");

                    break;
                }

                System.err.println("Your account is locked");

            }
        }
    }
}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */