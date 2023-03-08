package day13_Custom_Methods_Continue;

public class isEven {

    public static void main(String[] args) {

        int num = 100;

        if (isEven(num)){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + " is odd number");
        }

    }

    public static boolean isEven(int num){

        return num % 2 == 0 ? true : false;

    }




}
