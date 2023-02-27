package day09_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the radius of a circle to calculate the area and perimeter");

        int radius = input.nextInt();

        double perimeter = 2 * (3.14 * radius);
        double area = 3.14 * (radius * radius);

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */