package day06_Intro_If_Statements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 50, b = 51, c = 52;

        if(a > b && a < c || a > c && a < b){
            System.out.println(a + " 1is the median number");
        }

        if(b > a && b < c || b > c && b < c){
            System.out.println(b + " 2is the median number");
        }

        if(c > a && c < b || c > b && c < a){
            System.out.println(c + " 3is the median number");
        }
    }
}
/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */