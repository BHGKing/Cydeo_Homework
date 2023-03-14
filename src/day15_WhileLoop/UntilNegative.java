package day15_WhileLoop;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter a number:");
        int num = input.nextInt();

        while (num > 0) {
            sum += num;
            System.out.println("Enter a number:");
            num = input.nextInt();
        }

        System.out.println("Sum of numbers entered before negative number: " + sum);






    }
}
/*
5. Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
 */