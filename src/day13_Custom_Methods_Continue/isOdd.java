package day13_Custom_Methods_Continue;

public class isOdd {

    public static void main(String[] args) {

    int num  = 99;

    if (isOdd(num)) {
        System.out.println(num + " is odd number");
    }else {
        System.out.println(num + " is even number");
    }

    }

    public static boolean isOdd(int num){

        return (num % 2 != 0)? true : false;

    }



}
