package day09_Scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        double num1 = input.nextDouble();

        System.out.println("Please select an operator:");
        char op = input.next().charAt(0);

        System.out.println("Please enter a second number:");
        double num2 = input.nextDouble();

        double num3 = 0;

        if (op == '+' || op == '-' || op == '*' || op == '/'){

                switch (op){
                    case '+':
                        num3 = num1 + num2;
                        break;

                    case '-':
                        num3 = num1 - num2;
                        break;

                    case '*':
                        num3 = num1 * num2;
                        break;

                    case '/':
                        num3 = num1 / num2;
                        break;
                }
            System.out.println("" + num1 +" "+ op +" "+ num2 + " = " + num3);
        }else {
            System.out.println("Invalid Entry");
        }
    }
}
/*
9. Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a valid math operator (+, -, *, /), then print "Invalid entry"
 */