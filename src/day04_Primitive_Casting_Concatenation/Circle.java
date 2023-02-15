package day04_Primitive_Casting_Concatenation;

public class Circle {
    public static void main(String[] args) {

        int radius = 5;
        double perimeter = (radius * 3.14) * 2; // perimeter = 2 x (Pi(3.14) x Radius)
        double area = 3.14 * (radius * radius); // area = Pi(3.14) x Radius^2

        System.out.println("Area of the circle is " + area);
        System.out.println("Perimeter of the cicle is " + perimeter);
    }
}
/*
6. Create a class named Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4
 */