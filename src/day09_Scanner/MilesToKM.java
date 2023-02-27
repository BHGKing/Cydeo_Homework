package day09_Scanner;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles:");

        int miles = input.nextInt();

        double kilometers = miles * 1.6;

        System.out.println(miles + " miles equals to " + kilometers + " kilometers");







    }
}
/*
6. Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */