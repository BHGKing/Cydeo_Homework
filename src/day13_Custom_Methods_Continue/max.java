package day13_Custom_Methods_Continue;

public class max {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        max(n1, n2);

        if (n1 > n2){
            System.out.println(n1 + " is greater");
        } else {
            System.out.println(n2 + " is greater");
        }


    }

    public static int max(int num1, int num2){

        return num1 > num2 ? num1 : num2;

    }




}
