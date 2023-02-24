package day08_TernarySwitch;

public class BiggerNum {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 6;
        int n3 = 3;

        String result = (n1 <= n2 && n2 >= n3)?  n2 + " is bigger"
                        :(n2 <= n1 && n1 >=n3)?  n1 + " is bigger"
                        :(n1 <= n3 && n3 >= n2)? n3 + " is bigger"  :"Invalid Numbers";

        System.out.println(result);
    }
}
