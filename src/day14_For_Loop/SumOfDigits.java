package day14_For_Loop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if (c >= '0' && c <= '9') {

                int digit = c - '0';

                sum += digit;

            }
        }
        System.out.println(sum);
    }
}
/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */