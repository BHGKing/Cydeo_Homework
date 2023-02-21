package day04_Primitive_Casting_Concatenation;

public class SwapTwoVariables2 {
    public static void main(String[] args) {

        int a = 25;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
9. Create a class named SwapTwoVariables2 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10
 */