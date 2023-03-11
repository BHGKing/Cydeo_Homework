package day14_For_Loop;

public class ShapePrinter {

    public static void main(String[] args) {

        int rows = 8;
        int columns = 6;

        printShape(rows, columns);



    }

    public static void printShape(int rows, int columns){

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= columns; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
1. Use a loop to print the following shape:

                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */