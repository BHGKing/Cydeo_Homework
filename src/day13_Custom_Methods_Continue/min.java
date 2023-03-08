package day13_Custom_Methods_Continue;

public class min {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 99;

        min(n1, n2);

        if (n1 > n2){
            System.out.println(n2 + " is smaller");
        }else {
            System.out.println(n1 + " is smaller");
        }

    }

    public static int min (int n1, int n2){

        int result = n1 > n2 ? n2 : n1;

        return result;

    }


}
