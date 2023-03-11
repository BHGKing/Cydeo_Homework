package day14_For_Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

       int factorial =  calculateFactorial(num);

        System.out.println(factorial);


    }

    public static int calculateFactorial(int num){

        if (num == 1){
            return 1;
        }else {
            return num * calculateFactorial(num - 1);
        }
    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */